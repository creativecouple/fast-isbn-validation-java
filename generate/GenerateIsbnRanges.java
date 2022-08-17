import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import static java.lang.Integer.parseInt;
import static java.lang.System.in;
import static java.lang.System.out;
import static java.util.stream.Collectors.toList;

public class GenerateIsbnRanges {

    public static void main(String[] args) throws Exception {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = dbf.newDocumentBuilder();
        Document doc = builder.parse(in);

        final String messageSource = first(doc, "MessageSource").getTextContent();
        final String messageSerialNumber = first(doc, "MessageSerialNumber").getTextContent();
        final String messageDate = first(doc, "MessageDate").getTextContent();

        out.println("package de.creativecouple.validation.isbn;\n" + "import java.util.HashMap;\n" + "/**\n"
                + " * This file is auto-generated from ISBN range definitions given by the\n"
                + " * <a href=\"https://www.isbn-international.org/\">international ISBN agency</a>.\n"
                + " * @author Peter Liske (CreativeCouple)\n" + " */\n" + "final class ISBNRanges {");
        out.println("static final String MESSAGE_SOURCE = \"" + messageSource.replaceAll("[\"\n]", "") + "\";");
        out.println("static final String MESSAGE_SERIAL_NUMBER = \"" + messageSerialNumber.replaceAll("[\"\n]", "")
                + "\";");
        out.println("static final String MESSAGE_DATE = \"" + messageDate.replaceAll("[\"\n]", "") + "\";");

        List<PrefixDefinition> rootRanges = byTag(doc, "EAN.UCC").stream().map(PrefixDefinition::of).collect(toList());
        List<PrefixDefinition> groupRanges = byTag(doc, "Group").stream().map(PrefixDefinition::of).collect(toList());

        for (PrefixDefinition def : groupRanges) {
            out.println("private static final Range[] RULE_" + def.prefix.replace('-', '_') + " = new Range[]{");
            for (PrefixRule rule : def.rules) {
                out.println("new Range(" + rule.width + "," + rule.lower + "," + rule.upper + "),");
            }
            out.println("};");
        }

        for (PrefixDefinition def : rootRanges) {
            out.println("private static final Range[] RULE_" + def.prefix.replace('-', '_') + " = new Range[]{");
            for (PrefixRule rule : def.rules) {
                out.print("new Range(" + rule.width + "," + rule.lower + "," + rule.upper);
                for (int entry = rule.lower; entry <= rule.upper; entry++) {
                    String prefix = String.format("%s-%0" + rule.width + "d", def.prefix, entry);
                    if (prefixes.contains(prefix)) {
                        out.print(", RULE_" + prefix.replace('-', '_'));
                    } else {
                        out.print(", null");
                    }
                }
                out.println("),");
            }
            out.println("};");
        }

        out.println("static final Range[] ROOT = {");
        for (PrefixRule rule : groupPrefixes(rootRanges)) {
            out.print("new Range(" + rule.width + "," + rule.lower + "," + rule.upper);
            for (int entry = rule.lower; entry <= rule.upper; entry++) {
                String prefix = String.format("%0" + rule.width + "d", entry);
                if (prefixes.contains(prefix)) {
                    out.print(", RULE_" + prefix.replace('-', '_'));
                } else {
                    out.print(", null");
                }
            }
            out.println("),");
        }
        out.println("};");

        out.println("static final HashMap<String, String> AGENCIES = new HashMap<>();");
        out.println("static {");
        for (PrefixDefinition def : rootRanges) {
            out.println("AGENCIES.put(\"" + def.prefix + "\", \"" + def.name.replaceAll("[\"\n]", "") + "\");");
        }
        for (PrefixDefinition def : groupRanges) {
            out.println("AGENCIES.put(\"" + def.prefix + "\", \"" + def.name.replaceAll("[\"\n]", "") + "\");");
        }
        out.println("}");
        out.println("}");
    }

    static List<Node> byTag(Node node, String name) {
        NodeList nodes = (node instanceof Document) ? ((Document) node).getElementsByTagName(name)
                : ((Element) node).getElementsByTagName(name);
        List<Node> list = new ArrayList<>(nodes.getLength());
        for (int i = 0; i < nodes.getLength(); i++) {
            list.add(nodes.item(i));
        }
        return list;
    }

    static Node first(Node node, String name) {
        NodeList nodes = (node instanceof Document) ? ((Document) node).getElementsByTagName(name)
                : ((Element) node).getElementsByTagName(name);
        return nodes.item(0);
    }

    static Set<String> prefixes = new HashSet<>();

    static class PrefixDefinition {

        String prefix;
        String name;
        int width;
        int value;

        List<PrefixRule> rules;

        public static PrefixDefinition of(Node node) {
            PrefixDefinition def = new PrefixDefinition();
            def.prefix = first(node, "Prefix").getTextContent();
            prefixes.add(def.prefix);
            def.name = first(node, "Agency").getTextContent();
            def.width = def.prefix.indexOf('-') >= 0 ? def.prefix.length() - def.prefix.lastIndexOf('-')
                    : def.prefix.length();
            def.value = parseInt(def.prefix.substring(def.prefix.length() - def.width));
            def.rules = byTag(node, "Rule").stream().map(PrefixRule::of).filter(Objects::nonNull).collect(toList());
            return def;
        }
    }

    static class PrefixRule {

        int lower, upper;
        int width;

        public static PrefixRule of(Node node) {
            PrefixRule def = new PrefixRule();
            def.width = parseInt(first(node, "Length").getTextContent());
            if (def.width == 0) {
                return null;
            }
            String[] bounds = first(node, "Range").getTextContent().split("-");
            def.lower = parseInt(bounds[0].substring(0, def.width));
            def.upper = parseInt(bounds[1].substring(0, def.width));
            return def;
        }
    }

    static List<PrefixRule> groupPrefixes(List<PrefixDefinition> definitions) {
        List<PrefixRule> list = new ArrayList<>();
        if (definitions.isEmpty()) {
            return list;
        }
        PrefixDefinition def = definitions.get(0);
        PrefixRule rule = new PrefixRule();
        list.add(rule);
        rule.width = def.width;
        rule.lower = def.value;
        rule.upper = def.value;
        for (int i = 1; i < definitions.size(); i++) {
            def = definitions.get(i);
            if (def.width == rule.width && def.value <= rule.upper + 2) {
                rule.upper = def.value;
            } else {
                rule = new PrefixRule();
                list.add(rule);
                rule.width = def.width;
                rule.lower = def.value;
                rule.upper = def.value;
            }
        }
        return list;
    }

}
