/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2022 CreativeCouple
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
 * the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 * IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

import org.w3c.dom.*;

import javax.xml.parsers.*;
import java.util.*;

import static java.lang.Integer.parseInt;
import static java.lang.System.in;
import static java.lang.System.out;
import static java.util.stream.Collectors.toList;

public class GenerateIsbnRanges {

    private static String DISCLAIMER = "/*\n" +
            " * The MIT License (MIT)\n" +
            " *\n" +
            " * Copyright (c) 2022 CreativeCouple\n" +
            " *\n" +
            " * Permission is hereby granted, free of charge, to any person obtaining a copy of\n" +
            " * this software and associated documentation files (the \"Software\"), to deal in\n" +
            " * the Software without restriction, including without limitation the rights to\n" +
            " * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of\n" +
            " * the Software, and to permit persons to whom the Software is furnished to do so,\n" +
            " * subject to the following conditions:\n" +
            " *\n" +
            " * The above copyright notice and this permission notice shall be included in all\n" +
            " * copies or substantial portions of the Software.\n" +
            " *\n" +
            " * THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n" +
            " * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS\n" +
            " * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR\n" +
            " * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER\n" +
            " * IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN\n" +
            " * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.\n" +
            " */";

    public static void main(String[] args) throws Exception {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = dbf.newDocumentBuilder();
        Document doc = builder.parse(in);

        final String messageSource = first(doc, "MessageSource").getTextContent();
        final String messageSerialNumber = first(doc, "MessageSerialNumber").getTextContent();
        final String messageDate = first(doc, "MessageDate").getTextContent();

        out.println(DISCLAIMER);
        out.println("package de.creativecouple.validation.isbn;");
        out.println("import java.util.HashMap;");
        out.println("/**");
        out.println(" * This file is auto-generated from ISBN range definitions given by the");
        out.println(" * <a href=\"https://www.isbn-international.org/\">international ISBN agency</a>.");
        out.println(" * @source " + messageSource);
        out.println(" * @serial " + messageSerialNumber);
        out.println(" * @version " + messageDate);
        out.println(" * @author Peter Liske (CreativeCouple)");
        out.println(" */");
        out.println("final class ISBNRanges {");

        List<PrefixDefinition> rootRanges = byTag(doc, "EAN.UCC").stream().map(PrefixDefinition::of).collect(toList());
        List<PrefixDefinition> groupRanges = byTag(doc, "Group").stream().map(PrefixDefinition::of).collect(toList());

        for (PrefixDefinition def : groupRanges) {
            out.println("private static final Range[] RULE_" + def.prefix.replace('-', '_') + " = new Range[]{");
            String numPrefix = def.prefix.replace("-", "");
            for (PrefixRule rule : def.rules) {
                int remaining = 12 - numPrefix.length() - rule.width;
                out.println("new Range(" + rule.width + "," + numPrefix + fill(rule.lower, rule.width) + zero(remaining)
                        + "L," + numPrefix + fill(rule.upper, rule.width) + nine(remaining) + "L),");
            }
            out.println("};");
        }

        for (PrefixDefinition def : rootRanges) {
            out.println("private static final Range[] RULE_" + def.prefix + " = new Range[]{");
            String numPrefix = def.prefix;
            for (PrefixRule rule : def.rules) {
                int remaining = 12 - numPrefix.length() - rule.width;
                out.print("new Range(" + rule.width + "," + numPrefix + fill(rule.lower, rule.width) + zero(remaining)
                        + "L," + numPrefix + fill(rule.upper, rule.width) + nine(remaining) + "L");
                for (int entry = rule.lower; entry <= rule.upper; entry++) {
                    String prefix = def.prefix + "-" + fill(entry, rule.width);
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
            int remaining = 12 - rule.width;
            out.print("new Range(" + rule.width + "," + fill(rule.lower, rule.width) + zero(remaining) + "L,"
                    + fill(rule.upper, rule.width) + nine(remaining) + "L");
            for (int entry = rule.lower; entry <= rule.upper; entry++) {
                String prefix = fill(entry, rule.width);
                if (prefixes.contains(prefix)) {
                    out.print(", RULE_" + prefix);
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

    static String fill(long value, int n) {
        return String.format("%0" + n + "d", value);
    }

    static String zero(int n) {
        return "0000000000000".substring(0, n);
    }

    static String nine(int n) {
        return "9999999999999".substring(0, n);
    }

}
