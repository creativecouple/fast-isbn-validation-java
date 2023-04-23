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
package de.creativecouple.validation.isbn;

import java.util.HashMap;

/**
 * This file is auto-generated from ISBN range definitions given by the
 * <a href="https://www.isbn-international.org/">international ISBN agency</a>.
 *
 * @source International ISBN Agency
 *
 * @serial 477a8eda-e71c-49f7-b13f-6758bcc84967
 *
 * @version Sun, 23 Apr 2023 20:08:49 BST
 *
 * @author Peter Liske (CreativeCouple)
 */
final class ISBNRanges {
    private static final Range[] RULE_978_0 = new Range[] { new Range(2, 978000000000L, 978019999999L),
            new Range(3, 978020000000L, 978022799999L), new Range(4, 978022800000L, 978022899999L),
            new Range(3, 978022900000L, 978036899999L), new Range(4, 978036900000L, 978036999999L),
            new Range(3, 978037000000L, 978063899999L), new Range(4, 978063900000L, 978063979999L),
            new Range(7, 978063980000L, 978063999999L), new Range(3, 978064000000L, 978064499999L),
            new Range(7, 978064500000L, 978064599999L), new Range(3, 978064600000L, 978064799999L),
            new Range(7, 978064800000L, 978064899999L), new Range(3, 978064900000L, 978065499999L),
            new Range(4, 978065500000L, 978065599999L), new Range(3, 978065600000L, 978069999999L),
            new Range(4, 978070000000L, 978084999999L), new Range(5, 978085000000L, 978089999999L),
            new Range(6, 978090000000L, 978094999999L), new Range(7, 978095000000L, 978099999999L), };
    private static final Range[] RULE_978_1 = new Range[] { new Range(3, 978100000000L, 978100999999L),
            new Range(2, 978101000000L, 978102999999L), new Range(3, 978103000000L, 978103499999L),
            new Range(4, 978103500000L, 978103999999L), new Range(2, 978104000000L, 978106999999L),
            new Range(4, 978107000000L, 978109999999L), new Range(3, 978110000000L, 978139799999L),
            new Range(4, 978139800000L, 978154999999L), new Range(5, 978155000000L, 978164999999L),
            new Range(4, 978165000000L, 978167999999L), new Range(5, 978168000000L, 978168599999L),
            new Range(4, 978168600000L, 978171399999L), new Range(3, 978171400000L, 978171699999L),
            new Range(4, 978171700000L, 978173199999L), new Range(7, 978173200000L, 978173999999L),
            new Range(5, 978174000000L, 978177499999L), new Range(7, 978177500000L, 978177539999L),
            new Range(5, 978177540000L, 978177639999L), new Range(7, 978177640000L, 978177649999L),
            new Range(5, 978177650000L, 978177699999L), new Range(7, 978177700000L, 978177829999L),
            new Range(5, 978177830000L, 978178999999L), new Range(4, 978179000000L, 978179999999L),
            new Range(5, 978180000000L, 978180049999L), new Range(5, 978180050000L, 978180499999L),
            new Range(5, 978180500000L, 978183799999L), new Range(7, 978183800000L, 978183849999L),
            new Range(5, 978183850000L, 978186719999L), new Range(4, 978186720000L, 978186759999L),
            new Range(5, 978186760000L, 978186979999L), new Range(6, 978186980000L, 978191599999L),
            new Range(7, 978191600000L, 978191650599L), new Range(6, 978191650600L, 978191686999L),
            new Range(7, 978191687000L, 978191690799L), new Range(6, 978191690800L, 978191959999L),
            new Range(7, 978191960000L, 978191965499L), new Range(6, 978191965500L, 978197299999L),
            new Range(4, 978197300000L, 978198779999L), new Range(6, 978198780000L, 978199114999L),
            new Range(7, 978199115000L, 978199119999L), new Range(6, 978199120000L, 978199898999L),
            new Range(7, 978199899000L, 978199999999L), };
    private static final Range[] RULE_978_2 = new Range[] { new Range(2, 978200000000L, 978219999999L),
            new Range(3, 978220000000L, 978234999999L), new Range(5, 978235000000L, 978239999999L),
            new Range(3, 978240000000L, 978248999999L), new Range(6, 978249000000L, 978249499999L),
            new Range(3, 978249500000L, 978249599999L), new Range(4, 978249600000L, 978249669999L),
            new Range(5, 978249670000L, 978249699999L), new Range(3, 978249700000L, 978269999999L),
            new Range(4, 978270000000L, 978283999999L), new Range(5, 978284000000L, 978289999999L),
            new Range(6, 978290000000L, 978291979999L), new Range(5, 978291980000L, 978291980999L),
            new Range(6, 978291981000L, 978291994299L), new Range(7, 978291994300L, 978291996899L),
            new Range(6, 978291996900L, 978294999999L), new Range(7, 978295000000L, 978299999999L), };
    private static final Range[] RULE_978_3 = new Range[] { new Range(2, 978300000000L, 978302999999L),
            new Range(3, 978303000000L, 978303399999L), new Range(4, 978303400000L, 978303699999L),
            new Range(5, 978303700000L, 978303999999L), new Range(2, 978304000000L, 978319999999L),
            new Range(3, 978320000000L, 978369999999L), new Range(4, 978370000000L, 978384999999L),
            new Range(5, 978385000000L, 978389999999L), new Range(6, 978390000000L, 978394999999L),
            new Range(7, 978395000000L, 978395399999L), new Range(5, 978395400000L, 978396999999L),
            new Range(7, 978397000000L, 978398499999L), new Range(5, 978398500000L, 978399999999L), };
    private static final Range[] RULE_978_4 = new Range[] { new Range(2, 978400000000L, 978419999999L),
            new Range(3, 978420000000L, 978469999999L), new Range(4, 978470000000L, 978484999999L),
            new Range(5, 978485000000L, 978489999999L), new Range(6, 978490000000L, 978494999999L),
            new Range(7, 978495000000L, 978499999999L), };
    private static final Range[] RULE_978_5 = new Range[] { new Range(5, 978500000000L, 978500499999L),
            new Range(4, 978500500000L, 978500999999L), new Range(2, 978501000000L, 978519999999L),
            new Range(3, 978520000000L, 978536199999L), new Range(4, 978536200000L, 978536239999L),
            new Range(5, 978536240000L, 978536299999L), new Range(3, 978536300000L, 978542099999L),
            new Range(4, 978542100000L, 978542999999L), new Range(3, 978543000000L, 978543099999L),
            new Range(4, 978543100000L, 978543999999L), new Range(3, 978544000000L, 978544099999L),
            new Range(4, 978544100000L, 978544999999L), new Range(3, 978545000000L, 978560399999L),
            new Range(7, 978560400000L, 978560499999L), new Range(3, 978560500000L, 978569999999L),
            new Range(4, 978570000000L, 978584999999L), new Range(5, 978585000000L, 978589999999L),
            new Range(6, 978590000000L, 978590999999L), new Range(5, 978591000000L, 978591999999L),
            new Range(4, 978592000000L, 978592999999L), new Range(5, 978593000000L, 978594999999L),
            new Range(7, 978595000000L, 978595009999L), new Range(4, 978595010000L, 978597999999L),
            new Range(5, 978598000000L, 978598999999L), new Range(7, 978599000000L, 978599099999L),
            new Range(4, 978599100000L, 978599999999L), };
    private static final Range[] RULE_978_600 = new Range[] { new Range(2, 978600000000L, 978600099999L),
            new Range(3, 978600100000L, 978600499999L), new Range(4, 978600500000L, 978600899999L),
            new Range(5, 978600900000L, 978600986799L), new Range(4, 978600986800L, 978600992999L),
            new Range(3, 978600993000L, 978600995999L), new Range(5, 978600996000L, 978600999999L), };
    private static final Range[] RULE_978_601 = new Range[] { new Range(2, 978601000000L, 978601199999L),
            new Range(3, 978601200000L, 978601699999L), new Range(4, 978601700000L, 978601799999L),
            new Range(5, 978601800000L, 978601849999L), new Range(2, 978601850000L, 978601999999L), };
    private static final Range[] RULE_978_602 = new Range[] { new Range(2, 978602000000L, 978602069999L),
            new Range(4, 978602070000L, 978602139999L), new Range(5, 978602140000L, 978602149999L),
            new Range(4, 978602150000L, 978602169999L), new Range(5, 978602170000L, 978602199999L),
            new Range(3, 978602200000L, 978602499999L), new Range(5, 978602500000L, 978602539999L),
            new Range(4, 978602540000L, 978602599999L), new Range(5, 978602600000L, 978602619999L),
            new Range(4, 978602620000L, 978602699999L), new Range(5, 978602700000L, 978602749999L),
            new Range(4, 978602750000L, 978602949999L), new Range(5, 978602950000L, 978602999999L), };
    private static final Range[] RULE_978_603 = new Range[] { new Range(2, 978603000000L, 978603049999L),
            new Range(2, 978603050000L, 978603499999L), new Range(3, 978603500000L, 978603799999L),
            new Range(4, 978603800000L, 978603899999L), new Range(5, 978603900000L, 978603999999L), };
    private static final Range[] RULE_978_604 = new Range[] { new Range(1, 978604000000L, 978604299999L),
            new Range(3, 978604300000L, 978604399999L), new Range(2, 978604400000L, 978604469999L),
            new Range(3, 978604470000L, 978604497999L), new Range(4, 978604498000L, 978604499999L),
            new Range(2, 978604500000L, 978604899999L), new Range(3, 978604900000L, 978604979999L),
            new Range(4, 978604980000L, 978604999999L), };
    private static final Range[] RULE_978_605 = new Range[] { new Range(2, 978605000000L, 978605029999L),
            new Range(3, 978605030000L, 978605039999L), new Range(2, 978605040000L, 978605059999L),
            new Range(5, 978605060000L, 978605069999L), new Range(2, 978605070000L, 978605099999L),
            new Range(3, 978605100000L, 978605199999L), new Range(4, 978605200000L, 978605239999L),
            new Range(3, 978605240000L, 978605399999L), new Range(4, 978605400000L, 978605599999L),
            new Range(5, 978605600000L, 978605749999L), new Range(4, 978605750000L, 978605799999L),
            new Range(5, 978605800000L, 978605899999L), new Range(4, 978605900000L, 978605999999L), };
    private static final Range[] RULE_978_606 = new Range[] { new Range(3, 978606000000L, 978606099999L),
            new Range(2, 978606100000L, 978606499999L), new Range(3, 978606500000L, 978606799999L),
            new Range(4, 978606800000L, 978606909999L), new Range(3, 978606910000L, 978606919999L),
            new Range(5, 978606920000L, 978606959999L), new Range(4, 978606960000L, 978606974999L),
            new Range(3, 978606975000L, 978606999999L), };
    private static final Range[] RULE_978_607 = new Range[] { new Range(2, 978607000000L, 978607399999L),
            new Range(3, 978607400000L, 978607592999L), new Range(5, 978607593000L, 978607599999L),
            new Range(3, 978607600000L, 978607749999L), new Range(4, 978607750000L, 978607949999L),
            new Range(5, 978607950000L, 978607999999L), };
    private static final Range[] RULE_978_608 = new Range[] { new Range(1, 978608000000L, 978608099999L),
            new Range(2, 978608100000L, 978608199999L), new Range(3, 978608200000L, 978608449999L),
            new Range(4, 978608450000L, 978608649999L), new Range(5, 978608650000L, 978608699999L),
            new Range(1, 978608700000L, 978608999999L), };
    private static final Range[] RULE_978_609 = new Range[] { new Range(2, 978609000000L, 978609399999L),
            new Range(3, 978609400000L, 978609799999L), new Range(4, 978609800000L, 978609949999L),
            new Range(5, 978609950000L, 978609999999L), };
    private static final Range[] RULE_978_611 = new Range[] {};
    private static final Range[] RULE_978_612 = new Range[] { new Range(2, 978612000000L, 978612299999L),
            new Range(3, 978612300000L, 978612399999L), new Range(4, 978612400000L, 978612449999L),
            new Range(5, 978612450000L, 978612499999L), new Range(4, 978612500000L, 978612514999L), };
    private static final Range[] RULE_978_613 = new Range[] { new Range(1, 978613000000L, 978613999999L), };
    private static final Range[] RULE_978_614 = new Range[] { new Range(2, 978614000000L, 978614399999L),
            new Range(3, 978614400000L, 978614799999L), new Range(4, 978614800000L, 978614949999L),
            new Range(5, 978614950000L, 978614999999L), };
    private static final Range[] RULE_978_615 = new Range[] { new Range(2, 978615000000L, 978615099999L),
            new Range(3, 978615100000L, 978615499999L), new Range(4, 978615500000L, 978615799999L),
            new Range(5, 978615800000L, 978615899999L), };
    private static final Range[] RULE_978_616 = new Range[] { new Range(2, 978616000000L, 978616199999L),
            new Range(3, 978616200000L, 978616699999L), new Range(4, 978616700000L, 978616899999L),
            new Range(5, 978616900000L, 978616999999L), };
    private static final Range[] RULE_978_617 = new Range[] { new Range(2, 978617000000L, 978617499999L),
            new Range(3, 978617500000L, 978617699999L), new Range(4, 978617700000L, 978617899999L),
            new Range(5, 978617900000L, 978617999999L), };
    private static final Range[] RULE_978_618 = new Range[] { new Range(2, 978618000000L, 978618199999L),
            new Range(3, 978618200000L, 978618499999L), new Range(4, 978618500000L, 978618799999L),
            new Range(5, 978618800000L, 978618999999L), };
    private static final Range[] RULE_978_619 = new Range[] { new Range(2, 978619000000L, 978619149999L),
            new Range(3, 978619150000L, 978619699999L), new Range(4, 978619700000L, 978619899999L),
            new Range(5, 978619900000L, 978619999999L), };
    private static final Range[] RULE_978_620 = new Range[] { new Range(1, 978620000000L, 978620999999L), };
    private static final Range[] RULE_978_621 = new Range[] { new Range(2, 978621000000L, 978621299999L),
            new Range(3, 978621400000L, 978621599999L), new Range(4, 978621800000L, 978621899999L),
            new Range(5, 978621950000L, 978621999999L), };
    private static final Range[] RULE_978_622 = new Range[] { new Range(2, 978622000000L, 978622109999L),
            new Range(3, 978622200000L, 978622374999L), new Range(4, 978622520000L, 978622799999L),
            new Range(5, 978622925000L, 978622999999L), };
    private static final Range[] RULE_978_623 = new Range[] { new Range(2, 978623000000L, 978623099999L),
            new Range(3, 978623130000L, 978623499999L), new Range(4, 978623525000L, 978623879999L),
            new Range(5, 978623880000L, 978623999999L), };
    private static final Range[] RULE_978_624 = new Range[] { new Range(2, 978624000000L, 978624049999L),
            new Range(3, 978624200000L, 978624249999L), new Range(4, 978624500000L, 978624644999L),
            new Range(5, 978624945000L, 978624999999L), };
    private static final Range[] RULE_978_625 = new Range[] { new Range(2, 978625000000L, 978625009999L),
            new Range(3, 978625365000L, 978625442999L), new Range(5, 978625443000L, 978625444999L),
            new Range(3, 978625445000L, 978625449999L), new Range(4, 978625635000L, 978625779399L),
            new Range(5, 978625779400L, 978625779499L), new Range(4, 978625779500L, 978625849999L),
            new Range(5, 978625990000L, 978625999999L), };
    private static final Range[] RULE_978_626 = new Range[] { new Range(2, 978626000000L, 978626049999L),
            new Range(3, 978626300000L, 978626499999L), new Range(4, 978626700000L, 978626799999L),
            new Range(5, 978626950000L, 978626999999L), };
    private static final Range[] RULE_978_627 = new Range[] { new Range(2, 978627300000L, 978627319999L),
            new Range(3, 978627500000L, 978627524999L), new Range(4, 978627750000L, 978627799999L), };
    private static final Range[] RULE_978_628 = new Range[] { new Range(2, 978628000000L, 978628099999L),
            new Range(3, 978628500000L, 978628549999L), new Range(4, 978628750000L, 978628849999L),
            new Range(5, 978628950000L, 978628999999L), };
    private static final Range[] RULE_978_629 = new Range[] { new Range(2, 978629000000L, 978629029999L),
            new Range(3, 978629470000L, 978629499999L), new Range(4, 978629750000L, 978629799999L),
            new Range(5, 978629965000L, 978629999999L), };
    private static final Range[] RULE_978_630 = new Range[] { new Range(3, 978630300000L, 978630349999L),
            new Range(4, 978630650000L, 978630684999L), };
    private static final Range[] RULE_978_631 = new Range[] { new Range(2, 978631000000L, 978631099999L),
            new Range(3, 978631300000L, 978631399999L), new Range(4, 978631650000L, 978631749999L),
            new Range(5, 978631900000L, 978631999999L), };
    private static final Range[] RULE_978_65 = new Range[] { new Range(2, 978650000000L, 978650199999L),
            new Range(3, 978652500000L, 978652999999L), new Range(3, 978653000000L, 978653029999L),
            new Range(4, 978655000000L, 978655129999L), new Range(4, 978655350000L, 978656149999L),
            new Range(5, 978658000000L, 978658182499L), new Range(5, 978658450000L, 978658999999L),
            new Range(6, 978659000000L, 978659024499L), new Range(6, 978659800000L, 978659999999L), };
    private static final Range[] RULE_978_7 = new Range[] { new Range(2, 978700000000L, 978709999999L),
            new Range(3, 978710000000L, 978749999999L), new Range(4, 978750000000L, 978779999999L),
            new Range(5, 978780000000L, 978789999999L), new Range(6, 978790000000L, 978799999999L), };
    private static final Range[] RULE_978_80 = new Range[] { new Range(2, 978800000000L, 978801999999L),
            new Range(3, 978802000000L, 978805299999L), new Range(5, 978805300000L, 978805499999L),
            new Range(3, 978805500000L, 978806899999L), new Range(5, 978806900000L, 978806999999L),
            new Range(4, 978807000000L, 978808499999L), new Range(5, 978808500000L, 978808999999L),
            new Range(6, 978809000000L, 978809989999L), new Range(5, 978809990000L, 978809999999L), };
    private static final Range[] RULE_978_81 = new Range[] { new Range(2, 978810000000L, 978811899999L),
            new Range(5, 978811900000L, 978811999999L), new Range(3, 978812000000L, 978816999999L),
            new Range(4, 978817000000L, 978818499999L), new Range(5, 978818500000L, 978818999999L),
            new Range(6, 978819000000L, 978819999999L), };
    private static final Range[] RULE_978_82 = new Range[] { new Range(2, 978820000000L, 978821999999L),
            new Range(3, 978822000000L, 978826899999L), new Range(6, 978826900000L, 978826999999L),
            new Range(4, 978827000000L, 978828999999L), new Range(5, 978829000000L, 978829899999L),
            new Range(6, 978829900000L, 978829999999L), };
    private static final Range[] RULE_978_83 = new Range[] { new Range(2, 978830000000L, 978831999999L),
            new Range(3, 978832000000L, 978835999999L), new Range(5, 978836000000L, 978836999999L),
            new Range(4, 978837000000L, 978838499999L), new Range(5, 978838500000L, 978838999999L),
            new Range(6, 978839000000L, 978839999999L), };
    private static final Range[] RULE_978_84 = new Range[] { new Range(2, 978840000000L, 978840999999L),
            new Range(5, 978841000000L, 978841049999L), new Range(4, 978841050000L, 978841199999L),
            new Range(6, 978841200000L, 978841299999L), new Range(4, 978841300000L, 978841399999L),
            new Range(3, 978841400000L, 978841499999L), new Range(5, 978841500000L, 978841999999L),
            new Range(3, 978842000000L, 978846999999L), new Range(4, 978847000000L, 978848499999L),
            new Range(5, 978848500000L, 978848999999L), new Range(4, 978849000000L, 978849199999L),
            new Range(6, 978849200000L, 978849239999L), new Range(5, 978849240000L, 978849299999L),
            new Range(6, 978849300000L, 978849499999L), new Range(5, 978849500000L, 978849699999L),
            new Range(4, 978849700000L, 978849999999L), };
    private static final Range[] RULE_978_85 = new Range[] { new Range(2, 978850000000L, 978851999999L),
            new Range(3, 978852000000L, 978854549999L), new Range(6, 978854550000L, 978854552999L),
            new Range(5, 978854553000L, 978854559999L), new Range(3, 978854560000L, 978855289999L),
            new Range(5, 978855290000L, 978855319999L), new Range(4, 978855320000L, 978855339999L),
            new Range(3, 978855340000L, 978855399999L), new Range(5, 978855400000L, 978855402999L),
            new Range(5, 978855403000L, 978855403999L), new Range(6, 978855404000L, 978855404999L),
            new Range(5, 978855405000L, 978855408999L), new Range(6, 978855409000L, 978855409999L),
            new Range(5, 978855410000L, 978855439999L), new Range(4, 978855440000L, 978855479999L),
            new Range(5, 978855480000L, 978855499999L), new Range(4, 978855500000L, 978855999999L),
            new Range(5, 978856000000L, 978856999999L), new Range(4, 978857000000L, 978858499999L),
            new Range(5, 978858500000L, 978858999999L), new Range(6, 978859000000L, 978859249999L),
            new Range(5, 978859250000L, 978859449999L), new Range(4, 978859450000L, 978859599999L),
            new Range(2, 978859600000L, 978859799999L), new Range(5, 978859800000L, 978859999999L), };
    private static final Range[] RULE_978_86 = new Range[] { new Range(2, 978860000000L, 978862999999L),
            new Range(3, 978863000000L, 978865999999L), new Range(4, 978866000000L, 978867999999L),
            new Range(5, 978868000000L, 978868999999L), new Range(6, 978869000000L, 978869999999L), };
    private static final Range[] RULE_978_87 = new Range[] { new Range(2, 978870000000L, 978872999999L),
            new Range(3, 978874000000L, 978876499999L), new Range(4, 978877000000L, 978877999999L),
            new Range(5, 978878500000L, 978879499999L), new Range(6, 978879700000L, 978879999999L), };
    private static final Range[] RULE_978_88 = new Range[] { new Range(2, 978880000000L, 978881999999L),
            new Range(3, 978882000000L, 978883119999L), new Range(5, 978883120000L, 978883149999L),
            new Range(3, 978883150000L, 978883189999L), new Range(5, 978883190000L, 978883229999L),
            new Range(3, 978883230000L, 978883269999L), new Range(4, 978883270000L, 978883389999L),
            new Range(3, 978883390000L, 978883609999L), new Range(4, 978883610000L, 978883629999L),
            new Range(3, 978883630000L, 978885489999L), new Range(4, 978885490000L, 978885549999L),
            new Range(3, 978885550000L, 978885999999L), new Range(4, 978886000000L, 978888499999L),
            new Range(5, 978888500000L, 978888999999L), new Range(6, 978889000000L, 978889099999L),
            new Range(3, 978889100000L, 978889269999L), new Range(4, 978889270000L, 978889399999L),
            new Range(6, 978889400000L, 978889479999L), new Range(5, 978889480000L, 978889999999L), };
    private static final Range[] RULE_978_89 = new Range[] { new Range(2, 978890000000L, 978892499999L),
            new Range(3, 978892500000L, 978895499999L), new Range(4, 978895500000L, 978898499999L),
            new Range(5, 978898500000L, 978899499999L), new Range(6, 978899500000L, 978899699999L),
            new Range(5, 978899700000L, 978899899999L), new Range(3, 978899900000L, 978899999999L), };
    private static final Range[] RULE_978_90 = new Range[] { new Range(2, 978900000000L, 978901999999L),
            new Range(3, 978902000000L, 978904999999L), new Range(4, 978905000000L, 978906999999L),
            new Range(5, 978907000000L, 978907999999L), new Range(6, 978908000000L, 978908499999L),
            new Range(4, 978908500000L, 978908999999L), new Range(2, 978909000000L, 978909099999L),
            new Range(2, 978909400000L, 978909499999L), };
    private static final Range[] RULE_978_91 = new Range[] { new Range(1, 978910000000L, 978911999999L),
            new Range(2, 978912000000L, 978914999999L), new Range(3, 978915000000L, 978916499999L),
            new Range(4, 978917000000L, 978918199999L), new Range(5, 978918500000L, 978919499999L),
            new Range(6, 978919700000L, 978919999999L), };
    private static final Range[] RULE_978_92 = new Range[] { new Range(1, 978920000000L, 978925999999L),
            new Range(2, 978926000000L, 978927999999L), new Range(3, 978928000000L, 978928999999L),
            new Range(4, 978929000000L, 978929499999L), new Range(5, 978929500000L, 978929899999L),
            new Range(6, 978929900000L, 978929999999L), };
    private static final Range[] RULE_978_93 = new Range[] { new Range(2, 978930000000L, 978930999999L),
            new Range(3, 978931000000L, 978934999999L), new Range(4, 978935000000L, 978937999999L),
            new Range(5, 978938000000L, 978939599999L), new Range(6, 978939600000L, 978939999999L), };
    private static final Range[] RULE_978_94 = new Range[] { new Range(3, 978940000000L, 978945999999L),
            new Range(4, 978946000000L, 978948999999L), new Range(5, 978949000000L, 978949999999L), };
    private static final Range[] RULE_978_950 = new Range[] { new Range(2, 978950000000L, 978950499999L),
            new Range(3, 978950500000L, 978950899999L), new Range(4, 978950900000L, 978950989999L),
            new Range(5, 978950990000L, 978950999999L), };
    private static final Range[] RULE_978_951 = new Range[] { new Range(1, 978951000000L, 978951199999L),
            new Range(2, 978951200000L, 978951549999L), new Range(3, 978951550000L, 978951889999L),
            new Range(4, 978951890000L, 978951949999L), new Range(5, 978951950000L, 978951999999L), };
    private static final Range[] RULE_978_952 = new Range[] { new Range(2, 978952000000L, 978952199999L),
            new Range(3, 978952200000L, 978952499999L), new Range(4, 978952500000L, 978952599999L),
            new Range(2, 978952600000L, 978952649999L), new Range(5, 978952650000L, 978952659999L),
            new Range(4, 978952660000L, 978952669999L), new Range(5, 978952670000L, 978952699999L),
            new Range(4, 978952700000L, 978952799999L), new Range(2, 978952800000L, 978952949999L),
            new Range(4, 978952950000L, 978952989999L), new Range(5, 978952990000L, 978952999999L), };
    private static final Range[] RULE_978_953 = new Range[] { new Range(1, 978953000000L, 978953099999L),
            new Range(2, 978953100000L, 978953149999L), new Range(3, 978953150000L, 978953479999L),
            new Range(5, 978953480000L, 978953499999L), new Range(3, 978953500000L, 978953500999L),
            new Range(5, 978953501000L, 978953509999L), new Range(2, 978953510000L, 978953549999L),
            new Range(5, 978953550000L, 978953599999L), new Range(4, 978953600000L, 978953949999L),
            new Range(5, 978953950000L, 978953999999L), };
    private static final Range[] RULE_978_954 = new Range[] { new Range(2, 978954000000L, 978954289999L),
            new Range(4, 978954290000L, 978954299999L), new Range(3, 978954300000L, 978954799999L),
            new Range(4, 978954800000L, 978954899999L), new Range(5, 978954900000L, 978954929999L),
            new Range(4, 978954930000L, 978954999999L), };
    private static final Range[] RULE_978_955 = new Range[] { new Range(4, 978955000000L, 978955199999L),
            new Range(2, 978955200000L, 978955339999L), new Range(4, 978955340000L, 978955354999L),
            new Range(5, 978955355000L, 978955359999L), new Range(4, 978955360000L, 978955379999L),
            new Range(5, 978955380000L, 978955389999L), new Range(4, 978955390000L, 978955409999L),
            new Range(5, 978955410000L, 978955449999L), new Range(4, 978955450000L, 978955499999L),
            new Range(5, 978955500000L, 978955549999L), new Range(3, 978955550000L, 978955710999L),
            new Range(5, 978955711000L, 978955714999L), new Range(4, 978955715000L, 978955949999L),
            new Range(5, 978955950000L, 978955999999L), };
    private static final Range[] RULE_978_956 = new Range[] { new Range(2, 978956000000L, 978956089999L),
            new Range(5, 978956090000L, 978956099999L), new Range(2, 978956100000L, 978956199999L),
            new Range(3, 978956200000L, 978956599999L), new Range(4, 978956600000L, 978956699999L),
            new Range(4, 978956700000L, 978956999999L), };
    private static final Range[] RULE_978_957 = new Range[] { new Range(2, 978957000000L, 978957029999L),
            new Range(4, 978957030000L, 978957049999L), new Range(2, 978957050000L, 978957199999L),
            new Range(4, 978957200000L, 978957209999L), new Range(2, 978957210000L, 978957279999L),
            new Range(5, 978957280000L, 978957309999L), new Range(2, 978957310000L, 978957439999L),
            new Range(3, 978957440000L, 978957819999L), new Range(4, 978957820000L, 978957969999L),
            new Range(5, 978957970000L, 978957999999L), };
    private static final Range[] RULE_978_958 = new Range[] { new Range(2, 978958000000L, 978958499999L),
            new Range(3, 978958500000L, 978958509999L), new Range(4, 978958510000L, 978958519999L),
            new Range(5, 978958520000L, 978958539999L), new Range(4, 978958540000L, 978958559999L),
            new Range(5, 978958560000L, 978958599999L), new Range(3, 978958600000L, 978958799999L),
            new Range(4, 978958800000L, 978958949999L), new Range(5, 978958950000L, 978958999999L), };
    private static final Range[] RULE_978_959 = new Range[] { new Range(2, 978959000000L, 978959199999L),
            new Range(3, 978959200000L, 978959699999L), new Range(4, 978959700000L, 978959849999L),
            new Range(5, 978959850000L, 978959999999L), };
    private static final Range[] RULE_978_960 = new Range[] { new Range(2, 978960000000L, 978960199999L),
            new Range(3, 978960200000L, 978960659999L), new Range(4, 978960660000L, 978960689999L),
            new Range(3, 978960690000L, 978960699999L), new Range(4, 978960700000L, 978960849999L),
            new Range(5, 978960850000L, 978960929999L), new Range(2, 978960930000L, 978960939999L),
            new Range(4, 978960940000L, 978960979999L), new Range(5, 978960980000L, 978960999999L), };
    private static final Range[] RULE_978_961 = new Range[] { new Range(2, 978961000000L, 978961199999L),
            new Range(3, 978961200000L, 978961599999L), new Range(4, 978961600000L, 978961899999L),
            new Range(5, 978961900000L, 978961979999L), };
    private static final Range[] RULE_978_962 = new Range[] { new Range(2, 978962000000L, 978962199999L),
            new Range(3, 978962200000L, 978962699999L), new Range(4, 978962700000L, 978962849999L),
            new Range(5, 978962850000L, 978962869999L), new Range(4, 978962870000L, 978962899999L),
            new Range(3, 978962900000L, 978962999999L), };
    private static final Range[] RULE_978_963 = new Range[] { new Range(2, 978963000000L, 978963199999L),
            new Range(3, 978963200000L, 978963699999L), new Range(4, 978963700000L, 978963849999L),
            new Range(5, 978963850000L, 978963899999L), new Range(4, 978963900000L, 978963999999L), };
    private static final Range[] RULE_978_964 = new Range[] { new Range(2, 978964000000L, 978964149999L),
            new Range(3, 978964150000L, 978964249999L), new Range(4, 978964250000L, 978964299999L),
            new Range(3, 978964300000L, 978964549999L), new Range(4, 978964550000L, 978964899999L),
            new Range(5, 978964900000L, 978964969999L), new Range(3, 978964970000L, 978964989999L),
            new Range(4, 978964990000L, 978964999999L), };
    private static final Range[] RULE_978_965 = new Range[] { new Range(2, 978965000000L, 978965199999L),
            new Range(3, 978965200000L, 978965599999L), new Range(4, 978965700000L, 978965799999L),
            new Range(5, 978965900000L, 978965999999L), };
    private static final Range[] RULE_978_966 = new Range[] { new Range(2, 978966000000L, 978966129999L),
            new Range(3, 978966130000L, 978966139999L), new Range(2, 978966140000L, 978966149999L),
            new Range(4, 978966150000L, 978966169999L), new Range(3, 978966170000L, 978966199999L),
            new Range(4, 978966200000L, 978966278999L), new Range(3, 978966279000L, 978966289999L),
            new Range(4, 978966290000L, 978966299999L), new Range(3, 978966300000L, 978966699999L),
            new Range(4, 978966700000L, 978966899999L), new Range(5, 978966900000L, 978966909999L),
            new Range(3, 978966910000L, 978966949999L), new Range(5, 978966950000L, 978966979999L),
            new Range(3, 978966980000L, 978966999999L), };
    private static final Range[] RULE_978_967 = new Range[] { new Range(4, 978967000000L, 978967099999L),
            new Range(5, 978967100000L, 978967199999L), new Range(4, 978967200000L, 978967249999L),
            new Range(3, 978967250000L, 978967254999L), new Range(5, 978967255000L, 978967269999L),
            new Range(4, 978967270000L, 978967279999L), new Range(4, 978967280000L, 978967299999L),
            new Range(3, 978967300000L, 978967499999L), new Range(4, 978967500000L, 978967599999L),
            new Range(2, 978967600000L, 978967899999L), new Range(3, 978967900000L, 978967989999L),
            new Range(4, 978967990000L, 978967998999L), new Range(5, 978967999000L, 978967999999L), };
    private static final Range[] RULE_978_968 = new Range[] { new Range(2, 978968010000L, 978968399999L),
            new Range(3, 978968400000L, 978968499999L), new Range(4, 978968500000L, 978968799999L),
            new Range(3, 978968800000L, 978968899999L), new Range(4, 978968900000L, 978968999999L), };
    private static final Range[] RULE_978_969 = new Range[] { new Range(1, 978969000000L, 978969199999L),
            new Range(2, 978969200000L, 978969209999L), new Range(3, 978969210000L, 978969219999L),
            new Range(4, 978969220000L, 978969229999L), new Range(5, 978969230000L, 978969239999L),
            new Range(2, 978969240000L, 978969399999L), new Range(3, 978969400000L, 978969749999L),
            new Range(4, 978969750000L, 978969999999L), };
    private static final Range[] RULE_978_970 = new Range[] { new Range(2, 978970010000L, 978970599999L),
            new Range(3, 978970600000L, 978970899999L), new Range(4, 978970900000L, 978970909999L),
            new Range(5, 978970910000L, 978970969999L), new Range(4, 978970970000L, 978970999999L), };
    private static final Range[] RULE_978_971 = new Range[] { new Range(3, 978971000000L, 978971015999L),
            new Range(4, 978971016000L, 978971019999L), new Range(2, 978971020000L, 978971029999L),
            new Range(4, 978971030000L, 978971059999L), new Range(2, 978971060000L, 978971499999L),
            new Range(3, 978971500000L, 978971849999L), new Range(4, 978971850000L, 978971909999L),
            new Range(5, 978971910000L, 978971959999L), new Range(4, 978971960000L, 978971969999L),
            new Range(2, 978971970000L, 978971989999L), new Range(4, 978971990000L, 978971999999L), };
    private static final Range[] RULE_978_972 = new Range[] { new Range(1, 978972000000L, 978972199999L),
            new Range(2, 978972200000L, 978972549999L), new Range(3, 978972550000L, 978972799999L),
            new Range(4, 978972800000L, 978972949999L), new Range(5, 978972950000L, 978972999999L), };
    private static final Range[] RULE_978_973 = new Range[] { new Range(1, 978973000000L, 978973099999L),
            new Range(3, 978973100000L, 978973169999L), new Range(4, 978973170000L, 978973199999L),
            new Range(2, 978973200000L, 978973549999L), new Range(3, 978973550000L, 978973759999L),
            new Range(4, 978973760000L, 978973849999L), new Range(5, 978973850000L, 978973889999L),
            new Range(4, 978973890000L, 978973949999L), new Range(5, 978973950000L, 978973999999L), };
    private static final Range[] RULE_978_974 = new Range[] { new Range(2, 978974000000L, 978974199999L),
            new Range(3, 978974200000L, 978974699999L), new Range(4, 978974700000L, 978974849999L),
            new Range(5, 978974850000L, 978974899999L), new Range(5, 978974900000L, 978974949999L),
            new Range(4, 978974950000L, 978974999999L), };
    private static final Range[] RULE_978_975 = new Range[] { new Range(5, 978975000000L, 978975019999L),
            new Range(2, 978975020000L, 978975239999L), new Range(4, 978975240000L, 978975249999L),
            new Range(3, 978975250000L, 978975599999L), new Range(4, 978975600000L, 978975919999L),
            new Range(5, 978975920000L, 978975989999L), new Range(3, 978975990000L, 978975999999L), };
    private static final Range[] RULE_978_976 = new Range[] { new Range(1, 978976000000L, 978976399999L),
            new Range(2, 978976400000L, 978976599999L), new Range(3, 978976600000L, 978976799999L),
            new Range(4, 978976800000L, 978976949999L), new Range(5, 978976950000L, 978976999999L), };
    private static final Range[] RULE_978_977 = new Range[] { new Range(2, 978977000000L, 978977199999L),
            new Range(3, 978977200000L, 978977499999L), new Range(4, 978977500000L, 978977699999L),
            new Range(3, 978977700000L, 978977849999L), new Range(5, 978977850000L, 978977892999L),
            new Range(3, 978977893000L, 978977894999L), new Range(4, 978977895000L, 978977899999L),
            new Range(2, 978977900000L, 978977989999L), new Range(3, 978977990000L, 978977999999L), };
    private static final Range[] RULE_978_978 = new Range[] { new Range(3, 978978000000L, 978978199999L),
            new Range(4, 978978200000L, 978978299999L), new Range(5, 978978300000L, 978978779999L),
            new Range(3, 978978780000L, 978978799999L), new Range(4, 978978800000L, 978978899999L),
            new Range(3, 978978900000L, 978978999999L), };
    private static final Range[] RULE_978_979 = new Range[] { new Range(3, 978979000000L, 978979099999L),
            new Range(4, 978979100000L, 978979149999L), new Range(5, 978979150000L, 978979199999L),
            new Range(2, 978979200000L, 978979299999L), new Range(4, 978979300000L, 978979399999L),
            new Range(3, 978979400000L, 978979799999L), new Range(4, 978979800000L, 978979949999L),
            new Range(5, 978979950000L, 978979999999L), };
    private static final Range[] RULE_978_980 = new Range[] { new Range(2, 978980000000L, 978980199999L),
            new Range(3, 978980200000L, 978980599999L), new Range(4, 978980600000L, 978980999999L), };
    private static final Range[] RULE_978_981 = new Range[] { new Range(2, 978981000000L, 978981169999L),
            new Range(5, 978981170000L, 978981179999L), new Range(2, 978981180000L, 978981199999L),
            new Range(3, 978981200000L, 978981299999L), new Range(4, 978981300000L, 978981309999L),
            new Range(3, 978981310000L, 978981399999L), new Range(4, 978981400000L, 978981949999L),
            new Range(2, 978981990000L, 978981999999L), };
    private static final Range[] RULE_978_982 = new Range[] { new Range(2, 978982000000L, 978982099999L),
            new Range(3, 978982100000L, 978982699999L), new Range(2, 978982700000L, 978982899999L),
            new Range(4, 978982900000L, 978982979999L), new Range(5, 978982980000L, 978982999999L), };
    private static final Range[] RULE_978_983 = new Range[] { new Range(2, 978983000000L, 978983019999L),
            new Range(3, 978983020000L, 978983199999L), new Range(4, 978983200000L, 978983399999L),
            new Range(5, 978983400000L, 978983449999L), new Range(2, 978983450000L, 978983499999L),
            new Range(2, 978983500000L, 978983799999L), new Range(3, 978983800000L, 978983899999L),
            new Range(4, 978983900000L, 978983989999L), new Range(5, 978983990000L, 978983999999L), };
    private static final Range[] RULE_978_984 = new Range[] { new Range(2, 978984000000L, 978984399999L),
            new Range(3, 978984400000L, 978984799999L), new Range(4, 978984800000L, 978984899999L),
            new Range(5, 978984900000L, 978984999999L), };
    private static final Range[] RULE_978_985 = new Range[] { new Range(2, 978985000000L, 978985399999L),
            new Range(3, 978985400000L, 978985599999L), new Range(4, 978985600000L, 978985879999L),
            new Range(3, 978985880000L, 978985899999L), new Range(5, 978985900000L, 978985999999L), };
    private static final Range[] RULE_978_986 = new Range[] { new Range(2, 978986000000L, 978986059999L),
            new Range(5, 978986060000L, 978986069999L), new Range(4, 978986070000L, 978986079999L),
            new Range(2, 978986080000L, 978986119999L), new Range(3, 978986120000L, 978986539999L),
            new Range(4, 978986540000L, 978986799999L), new Range(5, 978986800000L, 978986999999L), };
    private static final Range[] RULE_978_987 = new Range[] { new Range(2, 978987000000L, 978987099999L),
            new Range(4, 978987100000L, 978987199999L), new Range(5, 978987200000L, 978987299999L),
            new Range(2, 978987300000L, 978987359999L), new Range(4, 978987360000L, 978987419999L),
            new Range(2, 978987420000L, 978987439999L), new Range(4, 978987440000L, 978987449999L),
            new Range(5, 978987450000L, 978987489999L), new Range(4, 978987490000L, 978987499999L),
            new Range(3, 978987500000L, 978987824999L), new Range(4, 978987825000L, 978987827999L),
            new Range(5, 978987828000L, 978987829999L), new Range(4, 978987830000L, 978987849999L),
            new Range(2, 978987850000L, 978987889999L), new Range(4, 978987890000L, 978987949999L),
            new Range(5, 978987950000L, 978987999999L), };
    private static final Range[] RULE_978_988 = new Range[] { new Range(2, 978988000000L, 978988119999L),
            new Range(5, 978988120000L, 978988199999L), new Range(3, 978988200000L, 978988699999L),
            new Range(5, 978988700000L, 978988799999L), new Range(4, 978988800000L, 978988969999L),
            new Range(5, 978988970000L, 978988999999L), };
    private static final Range[] RULE_978_989 = new Range[] { new Range(1, 978989000000L, 978989199999L),
            new Range(2, 978989200000L, 978989349999L), new Range(5, 978989350000L, 978989369999L),
            new Range(2, 978989370000L, 978989529999L), new Range(5, 978989530000L, 978989549999L),
            new Range(3, 978989550000L, 978989799999L), new Range(4, 978989800000L, 978989949999L),
            new Range(5, 978989950000L, 978989999999L), };
    private static final Range[] RULE_978_9911 = new Range[] { new Range(2, 978991120000L, 978991124999L),
            new Range(3, 978991155000L, 978991174999L), };
    private static final Range[] RULE_978_9912 = new Range[] { new Range(2, 978991240000L, 978991244999L),
            new Range(3, 978991275000L, 978991279999L), new Range(4, 978991298000L, 978991299999L), };
    private static final Range[] RULE_978_9913 = new Range[] { new Range(2, 978991300000L, 978991307999L),
            new Range(3, 978991360000L, 978991369999L), new Range(4, 978991395500L, 978991399999L), };
    private static final Range[] RULE_978_9914 = new Range[] { new Range(2, 978991440000L, 978991452999L),
            new Range(3, 978991470000L, 978991477499L), new Range(4, 978991496000L, 978991499999L), };
    private static final Range[] RULE_978_9915 = new Range[] { new Range(2, 978991540000L, 978991559999L),
            new Range(3, 978991565000L, 978991579999L), new Range(4, 978991593000L, 978991599999L), };
    private static final Range[] RULE_978_9916 = new Range[] { new Range(1, 978991600000L, 978991609999L),
            new Range(2, 978991610000L, 978991639999L), new Range(1, 978991640000L, 978991659999L),
            new Range(3, 978991660000L, 978991679999L), new Range(4, 978991695000L, 978991699999L), };
    private static final Range[] RULE_978_9917 = new Range[] { new Range(1, 978991700000L, 978991709999L),
            new Range(2, 978991730000L, 978991734999L), new Range(3, 978991760000L, 978991769999L),
            new Range(4, 978991798000L, 978991799999L), };
    private static final Range[] RULE_978_9918 = new Range[] { new Range(1, 978991800000L, 978991809999L),
            new Range(2, 978991820000L, 978991829999L), new Range(3, 978991860000L, 978991879999L),
            new Range(4, 978991895000L, 978991899999L), };
    private static final Range[] RULE_978_9919 = new Range[] { new Range(1, 978991900000L, 978991909999L),
            new Range(2, 978991920000L, 978991929999L), new Range(3, 978991950000L, 978991959999L),
            new Range(4, 978991990000L, 978991999999L), };
    private static final Range[] RULE_978_9920 = new Range[] { new Range(2, 978992030000L, 978992041999L),
            new Range(3, 978992050000L, 978992079999L), new Range(4, 978992087500L, 978992099999L), };
    private static final Range[] RULE_978_9921 = new Range[] { new Range(1, 978992100000L, 978992109999L),
            new Range(2, 978992130000L, 978992139999L), new Range(3, 978992170000L, 978992189999L),
            new Range(4, 978992197000L, 978992199999L), };
    private static final Range[] RULE_978_9922 = new Range[] { new Range(2, 978992220000L, 978992229999L),
            new Range(3, 978992260000L, 978992279999L), new Range(4, 978992285000L, 978992299999L), };
    private static final Range[] RULE_978_9923 = new Range[] { new Range(1, 978992300000L, 978992309999L),
            new Range(2, 978992310000L, 978992359999L), new Range(3, 978992370000L, 978992389999L),
            new Range(4, 978992394000L, 978992399999L), };
    private static final Range[] RULE_978_9924 = new Range[] { new Range(2, 978992430000L, 978992439999L),
            new Range(3, 978992450000L, 978992464999L), new Range(4, 978992490000L, 978992499999L), };
    private static final Range[] RULE_978_9925 = new Range[] { new Range(1, 978992500000L, 978992529999L),
            new Range(2, 978992530000L, 978992554999L), new Range(3, 978992555000L, 978992573499L),
            new Range(4, 978992573500L, 978992599999L), };
    private static final Range[] RULE_978_9926 = new Range[] { new Range(1, 978992600000L, 978992619999L),
            new Range(2, 978992620000L, 978992639999L), new Range(3, 978992640000L, 978992679999L),
            new Range(4, 978992680000L, 978992699999L), };
    private static final Range[] RULE_978_9927 = new Range[] { new Range(2, 978992700000L, 978992709999L),
            new Range(3, 978992710000L, 978992739999L), new Range(4, 978992740000L, 978992749999L), };
    private static final Range[] RULE_978_9928 = new Range[] { new Range(2, 978992800000L, 978992809999L),
            new Range(3, 978992810000L, 978992839999L), new Range(4, 978992840000L, 978992849999L),
            new Range(3, 978992880000L, 978992889999L), new Range(2, 978992890000L, 978992899999L), };
    private static final Range[] RULE_978_9929 = new Range[] { new Range(1, 978992900000L, 978992939999L),
            new Range(2, 978992940000L, 978992954999L), new Range(3, 978992955000L, 978992979999L),
            new Range(4, 978992980000L, 978992999999L), };
    private static final Range[] RULE_978_9930 = new Range[] { new Range(2, 978993000000L, 978993049999L),
            new Range(3, 978993050000L, 978993093999L), new Range(4, 978993094000L, 978993099999L), };
    private static final Range[] RULE_978_9931 = new Range[] { new Range(2, 978993100000L, 978993123999L),
            new Range(3, 978993124000L, 978993189999L), new Range(4, 978993190000L, 978993199999L), };
    private static final Range[] RULE_978_9932 = new Range[] { new Range(2, 978993200000L, 978993239999L),
            new Range(3, 978993240000L, 978993284999L), new Range(4, 978993285000L, 978993299999L), };
    private static final Range[] RULE_978_9933 = new Range[] { new Range(1, 978993300000L, 978993309999L),
            new Range(2, 978993310000L, 978993339999L), new Range(3, 978993340000L, 978993389999L),
            new Range(4, 978993390000L, 978993399999L), };
    private static final Range[] RULE_978_9934 = new Range[] { new Range(1, 978993400000L, 978993409999L),
            new Range(2, 978993410000L, 978993449999L), new Range(3, 978993450000L, 978993479999L),
            new Range(4, 978993480000L, 978993499999L), };
    private static final Range[] RULE_978_9935 = new Range[] { new Range(1, 978993500000L, 978993509999L),
            new Range(2, 978993510000L, 978993539999L), new Range(3, 978993540000L, 978993589999L),
            new Range(4, 978993590000L, 978993599999L), };
    private static final Range[] RULE_978_9936 = new Range[] { new Range(1, 978993600000L, 978993619999L),
            new Range(2, 978993620000L, 978993639999L), new Range(3, 978993640000L, 978993679999L),
            new Range(4, 978993680000L, 978993699999L), };
    private static final Range[] RULE_978_9937 = new Range[] { new Range(1, 978993700000L, 978993729999L),
            new Range(2, 978993730000L, 978993749999L), new Range(3, 978993750000L, 978993779999L),
            new Range(4, 978993780000L, 978993799999L), };
    private static final Range[] RULE_978_9938 = new Range[] { new Range(2, 978993800000L, 978993879999L),
            new Range(3, 978993880000L, 978993894999L), new Range(4, 978993895000L, 978993897499L),
            new Range(3, 978993897500L, 978993899099L), new Range(4, 978993899100L, 978993899999L), };
    private static final Range[] RULE_978_9939 = new Range[] { new Range(1, 978993900000L, 978993949999L),
            new Range(2, 978993950000L, 978993979999L), new Range(3, 978993980000L, 978993989999L),
            new Range(4, 978993990000L, 978993995999L), new Range(3, 978993996000L, 978993997999L),
            new Range(2, 978993998000L, 978993999999L), };
    private static final Range[] RULE_978_9940 = new Range[] { new Range(1, 978994000000L, 978994019999L),
            new Range(2, 978994020000L, 978994049999L), new Range(3, 978994050000L, 978994083999L),
            new Range(2, 978994084000L, 978994086999L), new Range(4, 978994087000L, 978994099999L), };
    private static final Range[] RULE_978_9941 = new Range[] { new Range(1, 978994100000L, 978994109999L),
            new Range(2, 978994110000L, 978994139999L), new Range(3, 978994140000L, 978994179999L),
            new Range(1, 978994180000L, 978994189999L), new Range(4, 978994190000L, 978994199999L), };
    private static final Range[] RULE_978_9942 = new Range[] { new Range(2, 978994200000L, 978994259999L),
            new Range(3, 978994260000L, 978994269999L), new Range(4, 978994270000L, 978994274999L),
            new Range(3, 978994275000L, 978994284999L), new Range(4, 978994285000L, 978994289999L),
            new Range(3, 978994290000L, 978994298499L), new Range(4, 978994298500L, 978994299999L), };
    private static final Range[] RULE_978_9943 = new Range[] { new Range(2, 978994300000L, 978994329999L),
            new Range(3, 978994330000L, 978994339999L), new Range(4, 978994340000L, 978994397499L),
            new Range(3, 978994397500L, 978994399999L), };
    private static final Range[] RULE_978_9944 = new Range[] { new Range(4, 978994400000L, 978994409999L),
            new Range(3, 978994410000L, 978994449999L), new Range(4, 978994450000L, 978994459999L),
            new Range(2, 978994460000L, 978994469999L), new Range(3, 978994470000L, 978994479999L),
            new Range(2, 978994480000L, 978994489999L), new Range(3, 978994490000L, 978994499999L), };
    private static final Range[] RULE_978_9945 = new Range[] { new Range(2, 978994500000L, 978994500999L),
            new Range(3, 978994501000L, 978994507999L), new Range(2, 978994508000L, 978994539999L),
            new Range(3, 978994540000L, 978994556999L), new Range(2, 978994557000L, 978994557999L),
            new Range(3, 978994558000L, 978994579999L), new Range(2, 978994580000L, 978994580999L),
            new Range(3, 978994581000L, 978994584999L), new Range(4, 978994585000L, 978994599999L), };
    private static final Range[] RULE_978_9946 = new Range[] { new Range(1, 978994600000L, 978994619999L),
            new Range(2, 978994620000L, 978994639999L), new Range(3, 978994640000L, 978994689999L),
            new Range(4, 978994690000L, 978994699999L), };
    private static final Range[] RULE_978_9947 = new Range[] { new Range(1, 978994700000L, 978994719999L),
            new Range(2, 978994720000L, 978994779999L), new Range(3, 978994780000L, 978994799999L), };
    private static final Range[] RULE_978_9948 = new Range[] { new Range(2, 978994800000L, 978994839999L),
            new Range(3, 978994840000L, 978994884999L), new Range(4, 978994885000L, 978994899999L), };
    private static final Range[] RULE_978_9949 = new Range[] { new Range(2, 978994900000L, 978994908999L),
            new Range(3, 978994909000L, 978994909999L), new Range(2, 978994910000L, 978994939999L),
            new Range(3, 978994940000L, 978994969999L), new Range(2, 978994970000L, 978994971999L),
            new Range(4, 978994972000L, 978994974999L), new Range(2, 978994975000L, 978994989999L),
            new Range(4, 978994990000L, 978994999999L), };
    private static final Range[] RULE_978_9950 = new Range[] { new Range(2, 978995000000L, 978995029999L),
            new Range(3, 978995030000L, 978995084999L), new Range(4, 978995085000L, 978995099999L), };
    private static final Range[] RULE_978_9951 = new Range[] { new Range(2, 978995100000L, 978995138999L),
            new Range(3, 978995139000L, 978995184999L), new Range(4, 978995185000L, 978995197999L),
            new Range(3, 978995198000L, 978995199999L), };
    private static final Range[] RULE_978_9952 = new Range[] { new Range(1, 978995200000L, 978995219999L),
            new Range(2, 978995220000L, 978995239999L), new Range(3, 978995240000L, 978995279999L),
            new Range(4, 978995280000L, 978995299999L), };
    private static final Range[] RULE_978_9953 = new Range[] { new Range(1, 978995300000L, 978995309999L),
            new Range(2, 978995310000L, 978995339999L), new Range(3, 978995340000L, 978995359999L),
            new Range(2, 978995360000L, 978995389999L), new Range(4, 978995390000L, 978995392999L),
            new Range(2, 978995393000L, 978995396999L), new Range(3, 978995397000L, 978995399999L), };
    private static final Range[] RULE_978_9954 = new Range[] { new Range(1, 978995400000L, 978995419999L),
            new Range(2, 978995420000L, 978995439999L), new Range(3, 978995440000L, 978995479999L),
            new Range(4, 978995480000L, 978995498999L), new Range(2, 978995499000L, 978995499999L), };
    private static final Range[] RULE_978_9955 = new Range[] { new Range(2, 978995500000L, 978995539999L),
            new Range(3, 978995540000L, 978995592999L), new Range(4, 978995593000L, 978995599999L), };
    private static final Range[] RULE_978_9956 = new Range[] { new Range(1, 978995600000L, 978995609999L),
            new Range(2, 978995610000L, 978995639999L), new Range(3, 978995640000L, 978995689999L),
            new Range(4, 978995690000L, 978995699999L), };
    private static final Range[] RULE_978_9957 = new Range[] { new Range(2, 978995700000L, 978995739999L),
            new Range(3, 978995740000L, 978995764999L), new Range(2, 978995765000L, 978995767999L),
            new Range(3, 978995768000L, 978995769999L), new Range(2, 978995770000L, 978995784999L),
            new Range(4, 978995785000L, 978995787999L), new Range(2, 978995788000L, 978995799999L), };
    private static final Range[] RULE_978_9958 = new Range[] { new Range(2, 978995800000L, 978995801999L),
            new Range(3, 978995802000L, 978995802999L), new Range(4, 978995803000L, 978995803999L),
            new Range(3, 978995804000L, 978995808999L), new Range(4, 978995809000L, 978995809999L),
            new Range(2, 978995810000L, 978995818999L), new Range(4, 978995819000L, 978995819999L),
            new Range(2, 978995820000L, 978995849999L), new Range(3, 978995850000L, 978995889999L),
            new Range(4, 978995890000L, 978995899999L), };
    private static final Range[] RULE_978_9959 = new Range[] { new Range(1, 978995900000L, 978995919999L),
            new Range(2, 978995920000L, 978995979999L), new Range(3, 978995980000L, 978995994999L),
            new Range(4, 978995995000L, 978995996999L), new Range(3, 978995997000L, 978995997999L),
            new Range(2, 978995998000L, 978995999999L), };
    private static final Range[] RULE_978_9960 = new Range[] { new Range(2, 978996000000L, 978996059999L),
            new Range(3, 978996060000L, 978996089999L), new Range(4, 978996090000L, 978996099999L), };
    private static final Range[] RULE_978_9961 = new Range[] { new Range(1, 978996100000L, 978996129999L),
            new Range(2, 978996130000L, 978996169999L), new Range(3, 978996170000L, 978996194999L),
            new Range(4, 978996195000L, 978996199999L), };
    private static final Range[] RULE_978_9962 = new Range[] { new Range(2, 978996200000L, 978996254999L),
            new Range(4, 978996255000L, 978996255999L), new Range(2, 978996256000L, 978996259999L),
            new Range(3, 978996260000L, 978996284999L), new Range(4, 978996285000L, 978996299999L), };
    private static final Range[] RULE_978_9963 = new Range[] { new Range(1, 978996300000L, 978996319999L),
            new Range(4, 978996320000L, 978996324999L), new Range(3, 978996325000L, 978996327999L),
            new Range(4, 978996328000L, 978996329999L), new Range(2, 978996330000L, 978996354999L),
            new Range(3, 978996355000L, 978996373499L), new Range(4, 978996373500L, 978996374999L),
            new Range(4, 978996375000L, 978996399999L), };
    private static final Range[] RULE_978_9964 = new Range[] { new Range(1, 978996400000L, 978996469999L),
            new Range(2, 978996470000L, 978996494999L), new Range(3, 978996495000L, 978996499999L), };
    private static final Range[] RULE_978_9965 = new Range[] { new Range(2, 978996500000L, 978996539999L),
            new Range(3, 978996540000L, 978996589999L), new Range(4, 978996590000L, 978996599999L), };
    private static final Range[] RULE_978_9966 = new Range[] { new Range(3, 978996600000L, 978996613999L),
            new Range(2, 978996614000L, 978996614999L), new Range(4, 978996615000L, 978996619999L),
            new Range(2, 978996620000L, 978996669999L), new Range(4, 978996670000L, 978996674999L),
            new Range(3, 978996675000L, 978996682099L), new Range(4, 978996682100L, 978996682499L),
            new Range(3, 978996682500L, 978996682599L), new Range(4, 978996682600L, 978996682899L),
            new Range(3, 978996682900L, 978996695999L), new Range(4, 978996696000L, 978996699999L), };
    private static final Range[] RULE_978_9967 = new Range[] { new Range(2, 978996700000L, 978996739999L),
            new Range(3, 978996740000L, 978996789999L), new Range(4, 978996790000L, 978996799999L), };
    private static final Range[] RULE_978_9968 = new Range[] { new Range(2, 978996800000L, 978996849999L),
            new Range(3, 978996850000L, 978996893999L), new Range(4, 978996894000L, 978996899999L), };
    private static final Range[] RULE_978_9969 = new Range[] { new Range(2, 978996900000L, 978996906999L),
            new Range(3, 978996950000L, 978996964999L), new Range(4, 978996997000L, 978996999999L), };
    private static final Range[] RULE_978_9970 = new Range[] { new Range(2, 978997000000L, 978997039999L),
            new Range(3, 978997040000L, 978997089999L), new Range(4, 978997090000L, 978997099999L), };
    private static final Range[] RULE_978_9971 = new Range[] { new Range(1, 978997100000L, 978997159999L),
            new Range(2, 978997160000L, 978997189999L), new Range(3, 978997190000L, 978997198999L),
            new Range(4, 978997199000L, 978997199999L), };
    private static final Range[] RULE_978_9972 = new Range[] { new Range(2, 978997200000L, 978997209999L),
            new Range(1, 978997210000L, 978997219999L), new Range(3, 978997220000L, 978997224999L),
            new Range(4, 978997225000L, 978997229999L), new Range(2, 978997230000L, 978997259999L),
            new Range(3, 978997260000L, 978997289999L), new Range(4, 978997290000L, 978997299999L), };
    private static final Range[] RULE_978_9973 = new Range[] { new Range(2, 978997300000L, 978997305999L),
            new Range(3, 978997306000L, 978997308999L), new Range(4, 978997309000L, 978997309999L),
            new Range(2, 978997310000L, 978997369999L), new Range(3, 978997370000L, 978997396999L),
            new Range(4, 978997397000L, 978997399999L), };
    private static final Range[] RULE_978_9974 = new Range[] { new Range(1, 978997400000L, 978997429999L),
            new Range(2, 978997430000L, 978997454999L), new Range(3, 978997455000L, 978997474999L),
            new Range(4, 978997475000L, 978997487999L), new Range(3, 978997488000L, 978997490999L),
            new Range(2, 978997491000L, 978997494999L), new Range(2, 978997495000L, 978997499999L), };
    private static final Range[] RULE_978_9975 = new Range[] { new Range(1, 978997500000L, 978997509999L),
            new Range(3, 978997510000L, 978997529999L), new Range(4, 978997530000L, 978997539999L),
            new Range(4, 978997540000L, 978997544999L), new Range(2, 978997545000L, 978997589999L),
            new Range(3, 978997590000L, 978997594999L), new Range(4, 978997595000L, 978997599999L), };
    private static final Range[] RULE_978_9976 = new Range[] { new Range(1, 978997600000L, 978997649999L),
            new Range(4, 978997650000L, 978997657999L), new Range(3, 978997658000L, 978997658999L),
            new Range(2, 978997659000L, 978997689999L), new Range(3, 978997690000L, 978997698999L),
            new Range(4, 978997699000L, 978997699999L), };
    private static final Range[] RULE_978_9977 = new Range[] { new Range(2, 978997700000L, 978997789999L),
            new Range(3, 978997790000L, 978997798999L), new Range(4, 978997799000L, 978997799999L), };
    private static final Range[] RULE_978_9978 = new Range[] { new Range(2, 978997800000L, 978997829999L),
            new Range(3, 978997830000L, 978997839999L), new Range(2, 978997840000L, 978997894999L),
            new Range(3, 978997895000L, 978997898999L), new Range(4, 978997899000L, 978997899999L), };
    private static final Range[] RULE_978_9979 = new Range[] { new Range(1, 978997900000L, 978997949999L),
            new Range(2, 978997950000L, 978997964999L), new Range(3, 978997965000L, 978997965999L),
            new Range(2, 978997966000L, 978997975999L), new Range(3, 978997976000L, 978997989999L),
            new Range(4, 978997990000L, 978997999999L), };
    private static final Range[] RULE_978_9980 = new Range[] { new Range(1, 978998000000L, 978998039999L),
            new Range(2, 978998040000L, 978998089999L), new Range(3, 978998090000L, 978998098999L),
            new Range(4, 978998099000L, 978998099999L), };
    private static final Range[] RULE_978_9981 = new Range[] { new Range(2, 978998100000L, 978998109999L),
            new Range(3, 978998110000L, 978998115999L), new Range(4, 978998116000L, 978998119999L),
            new Range(2, 978998120000L, 978998179999L), new Range(3, 978998180000L, 978998194999L),
            new Range(4, 978998195000L, 978998199999L), };
    private static final Range[] RULE_978_9982 = new Range[] { new Range(2, 978998200000L, 978998279999L),
            new Range(3, 978998280000L, 978998298999L), new Range(4, 978998299000L, 978998299999L), };
    private static final Range[] RULE_978_9983 = new Range[] { new Range(2, 978998380000L, 978998394999L),
            new Range(3, 978998395000L, 978998398999L), new Range(4, 978998399000L, 978998399999L), };
    private static final Range[] RULE_978_9984 = new Range[] { new Range(2, 978998400000L, 978998449999L),
            new Range(3, 978998450000L, 978998489999L), new Range(4, 978998490000L, 978998499999L), };
    private static final Range[] RULE_978_9985 = new Range[] { new Range(1, 978998500000L, 978998549999L),
            new Range(2, 978998550000L, 978998579999L), new Range(3, 978998580000L, 978998589999L),
            new Range(4, 978998590000L, 978998599999L), };
    private static final Range[] RULE_978_9986 = new Range[] { new Range(2, 978998600000L, 978998639999L),
            new Range(3, 978998640000L, 978998689999L), new Range(4, 978998690000L, 978998693999L),
            new Range(3, 978998694000L, 978998696999L), new Range(2, 978998697000L, 978998699999L), };
    private static final Range[] RULE_978_9987 = new Range[] { new Range(2, 978998700000L, 978998739999L),
            new Range(3, 978998740000L, 978998787999L), new Range(4, 978998788000L, 978998799999L), };
    private static final Range[] RULE_978_9988 = new Range[] { new Range(1, 978998800000L, 978998839999L),
            new Range(2, 978998840000L, 978998854999L), new Range(3, 978998855000L, 978998874999L),
            new Range(4, 978998875000L, 978998899999L), };
    private static final Range[] RULE_978_9989 = new Range[] { new Range(1, 978998900000L, 978998909999L),
            new Range(3, 978998910000L, 978998919999L), new Range(4, 978998920000L, 978998929999L),
            new Range(2, 978998930000L, 978998959999L), new Range(3, 978998960000L, 978998994999L),
            new Range(4, 978998995000L, 978998999999L), };
    private static final Range[] RULE_978_99901 = new Range[] { new Range(2, 978999010000L, 978999014999L),
            new Range(3, 978999015000L, 978999017999L), new Range(2, 978999018000L, 978999019999L), };
    private static final Range[] RULE_978_99902 = new Range[] {};
    private static final Range[] RULE_978_99903 = new Range[] { new Range(1, 978999030000L, 978999031999L),
            new Range(2, 978999032000L, 978999038999L), new Range(3, 978999039000L, 978999039999L), };
    private static final Range[] RULE_978_99904 = new Range[] { new Range(1, 978999040000L, 978999045999L),
            new Range(2, 978999046000L, 978999048999L), new Range(3, 978999049000L, 978999049999L), };
    private static final Range[] RULE_978_99905 = new Range[] { new Range(1, 978999050000L, 978999053999L),
            new Range(2, 978999054000L, 978999057999L), new Range(3, 978999058000L, 978999059999L), };
    private static final Range[] RULE_978_99906 = new Range[] { new Range(1, 978999060000L, 978999062999L),
            new Range(2, 978999063000L, 978999065999L), new Range(3, 978999066000L, 978999066999L),
            new Range(2, 978999067000L, 978999068999L), new Range(2, 978999069000L, 978999069499L),
            new Range(3, 978999069500L, 978999069999L), };
    private static final Range[] RULE_978_99908 = new Range[] { new Range(1, 978999080000L, 978999080999L),
            new Range(2, 978999081000L, 978999088999L), new Range(3, 978999089000L, 978999089999L), };
    private static final Range[] RULE_978_99909 = new Range[] { new Range(1, 978999090000L, 978999093999L),
            new Range(2, 978999094000L, 978999099499L), new Range(3, 978999099500L, 978999099999L), };
    private static final Range[] RULE_978_99910 = new Range[] { new Range(1, 978999100000L, 978999102999L),
            new Range(2, 978999103000L, 978999108999L), new Range(3, 978999109000L, 978999109999L), };
    private static final Range[] RULE_978_99911 = new Range[] { new Range(2, 978999110000L, 978999115999L),
            new Range(3, 978999116000L, 978999119999L), };
    private static final Range[] RULE_978_99912 = new Range[] { new Range(1, 978999120000L, 978999123999L),
            new Range(3, 978999124000L, 978999125999L), new Range(2, 978999126000L, 978999128999L),
            new Range(3, 978999129000L, 978999129999L), };
    private static final Range[] RULE_978_99913 = new Range[] { new Range(1, 978999130000L, 978999132999L),
            new Range(2, 978999133000L, 978999133599L), new Range(3, 978999136000L, 978999136049L), };
    private static final Range[] RULE_978_99914 = new Range[] { new Range(1, 978999140000L, 978999144999L),
            new Range(2, 978999145000L, 978999146999L), new Range(1, 978999147000L, 978999147999L),
            new Range(2, 978999148000L, 978999148999L), new Range(3, 978999149000L, 978999149999L), };
    private static final Range[] RULE_978_99915 = new Range[] { new Range(1, 978999150000L, 978999154999L),
            new Range(2, 978999155000L, 978999157999L), new Range(3, 978999158000L, 978999159999L), };
    private static final Range[] RULE_978_99916 = new Range[] { new Range(1, 978999160000L, 978999162999L),
            new Range(2, 978999163000L, 978999166999L), new Range(3, 978999167000L, 978999169999L), };
    private static final Range[] RULE_978_99917 = new Range[] { new Range(1, 978999170000L, 978999172999L),
            new Range(2, 978999173000L, 978999178899L), new Range(3, 978999178900L, 978999179999L), };
    private static final Range[] RULE_978_99918 = new Range[] { new Range(1, 978999180000L, 978999183999L),
            new Range(2, 978999184000L, 978999187999L), new Range(3, 978999188000L, 978999189999L), };
    private static final Range[] RULE_978_99919 = new Range[] { new Range(1, 978999190000L, 978999192999L),
            new Range(3, 978999193000L, 978999193999L), new Range(2, 978999194000L, 978999197999L),
            new Range(3, 978999198000L, 978999199999L), };
    private static final Range[] RULE_978_99920 = new Range[] { new Range(1, 978999200000L, 978999204999L),
            new Range(2, 978999205000L, 978999208999L), new Range(3, 978999209000L, 978999209999L), };
    private static final Range[] RULE_978_99921 = new Range[] { new Range(1, 978999210000L, 978999211999L),
            new Range(2, 978999212000L, 978999216999L), new Range(3, 978999217000L, 978999217999L),
            new Range(1, 978999218000L, 978999218999L), new Range(2, 978999219000L, 978999219999L), };
    private static final Range[] RULE_978_99922 = new Range[] { new Range(1, 978999220000L, 978999223999L),
            new Range(2, 978999224000L, 978999226999L), new Range(3, 978999227000L, 978999229999L), };
    private static final Range[] RULE_978_99923 = new Range[] { new Range(1, 978999230000L, 978999231999L),
            new Range(2, 978999232000L, 978999237999L), new Range(3, 978999238000L, 978999239999L), };
    private static final Range[] RULE_978_99924 = new Range[] { new Range(1, 978999240000L, 978999241999L),
            new Range(2, 978999242000L, 978999247999L), new Range(3, 978999248000L, 978999249999L), };
    private static final Range[] RULE_978_99925 = new Range[] { new Range(1, 978999250000L, 978999250999L),
            new Range(2, 978999251000L, 978999251999L), new Range(3, 978999252000L, 978999252999L),
            new Range(1, 978999253000L, 978999253999L), new Range(2, 978999254000L, 978999257999L),
            new Range(3, 978999258000L, 978999259999L), };
    private static final Range[] RULE_978_99926 = new Range[] { new Range(1, 978999260000L, 978999260999L),
            new Range(2, 978999261000L, 978999265999L), new Range(3, 978999266000L, 978999268699L),
            new Range(2, 978999268700L, 978999268999L), new Range(2, 978999269000L, 978999269999L), };
    private static final Range[] RULE_978_99927 = new Range[] { new Range(1, 978999270000L, 978999272999L),
            new Range(2, 978999273000L, 978999275999L), new Range(3, 978999276000L, 978999279999L), };
    private static final Range[] RULE_978_99928 = new Range[] { new Range(1, 978999280000L, 978999280999L),
            new Range(2, 978999281000L, 978999287999L), new Range(3, 978999288000L, 978999289999L), };
    private static final Range[] RULE_978_99929 = new Range[] { new Range(1, 978999290000L, 978999294999L),
            new Range(2, 978999295000L, 978999297999L), new Range(3, 978999298000L, 978999299999L), };
    private static final Range[] RULE_978_99930 = new Range[] { new Range(1, 978999300000L, 978999304999L),
            new Range(2, 978999305000L, 978999307999L), new Range(3, 978999308000L, 978999309999L), };
    private static final Range[] RULE_978_99931 = new Range[] { new Range(1, 978999310000L, 978999314999L),
            new Range(2, 978999315000L, 978999317999L), new Range(3, 978999318000L, 978999319999L), };
    private static final Range[] RULE_978_99932 = new Range[] { new Range(1, 978999320000L, 978999320999L),
            new Range(2, 978999321000L, 978999325999L), new Range(3, 978999326000L, 978999326999L),
            new Range(1, 978999327000L, 978999327999L), new Range(2, 978999328000L, 978999329999L), };
    private static final Range[] RULE_978_99933 = new Range[] { new Range(1, 978999330000L, 978999332999L),
            new Range(2, 978999333000L, 978999335999L), new Range(3, 978999336000L, 978999339999L), };
    private static final Range[] RULE_978_99934 = new Range[] { new Range(1, 978999340000L, 978999341999L),
            new Range(2, 978999342000L, 978999347999L), new Range(3, 978999348000L, 978999349999L), };
    private static final Range[] RULE_978_99935 = new Range[] { new Range(1, 978999350000L, 978999352999L),
            new Range(2, 978999353000L, 978999355999L), new Range(3, 978999356000L, 978999356999L),
            new Range(1, 978999357000L, 978999358999L), new Range(2, 978999359000L, 978999359999L), };
    private static final Range[] RULE_978_99936 = new Range[] { new Range(1, 978999360000L, 978999360999L),
            new Range(2, 978999361000L, 978999365999L), new Range(3, 978999366000L, 978999369999L), };
    private static final Range[] RULE_978_99937 = new Range[] { new Range(1, 978999370000L, 978999371999L),
            new Range(2, 978999372000L, 978999375999L), new Range(3, 978999376000L, 978999379999L), };
    private static final Range[] RULE_978_99938 = new Range[] { new Range(1, 978999380000L, 978999381999L),
            new Range(2, 978999382000L, 978999385999L), new Range(3, 978999386000L, 978999388999L),
            new Range(2, 978999389000L, 978999389999L), };
    private static final Range[] RULE_978_99939 = new Range[] { new Range(1, 978999390000L, 978999392999L),
            new Range(2, 978999393000L, 978999395999L), new Range(2, 978999396000L, 978999398999L),
            new Range(3, 978999399000L, 978999399999L), };
    private static final Range[] RULE_978_99940 = new Range[] { new Range(1, 978999400000L, 978999400999L),
            new Range(2, 978999401000L, 978999406999L), new Range(3, 978999407000L, 978999409999L), };
    private static final Range[] RULE_978_99941 = new Range[] { new Range(1, 978999410000L, 978999412999L),
            new Range(2, 978999413000L, 978999417999L), new Range(3, 978999418000L, 978999419999L), };
    private static final Range[] RULE_978_99942 = new Range[] { new Range(1, 978999420000L, 978999424999L),
            new Range(2, 978999425000L, 978999427999L), new Range(3, 978999428000L, 978999429999L), };
    private static final Range[] RULE_978_99943 = new Range[] { new Range(1, 978999430000L, 978999432999L),
            new Range(2, 978999433000L, 978999435999L), new Range(3, 978999436000L, 978999439999L), };
    private static final Range[] RULE_978_99944 = new Range[] { new Range(1, 978999440000L, 978999444999L),
            new Range(2, 978999445000L, 978999447999L), new Range(3, 978999448000L, 978999449999L), };
    private static final Range[] RULE_978_99945 = new Range[] { new Range(1, 978999450000L, 978999454999L),
            new Range(2, 978999455000L, 978999458999L), new Range(3, 978999459000L, 978999459999L), };
    private static final Range[] RULE_978_99946 = new Range[] { new Range(1, 978999460000L, 978999462999L),
            new Range(2, 978999463000L, 978999465999L), new Range(3, 978999466000L, 978999469999L), };
    private static final Range[] RULE_978_99947 = new Range[] { new Range(1, 978999470000L, 978999472999L),
            new Range(2, 978999473000L, 978999476999L), new Range(3, 978999477000L, 978999479999L), };
    private static final Range[] RULE_978_99948 = new Range[] { new Range(1, 978999480000L, 978999484999L),
            new Range(2, 978999485000L, 978999487999L), new Range(3, 978999488000L, 978999489999L), };
    private static final Range[] RULE_978_99949 = new Range[] { new Range(1, 978999490000L, 978999491999L),
            new Range(2, 978999492000L, 978999497999L), new Range(1, 978999498000L, 978999498999L),
            new Range(3, 978999499000L, 978999499899L), new Range(2, 978999499900L, 978999499999L), };
    private static final Range[] RULE_978_99950 = new Range[] { new Range(1, 978999500000L, 978999504999L),
            new Range(2, 978999505000L, 978999507999L), new Range(3, 978999508000L, 978999509999L), };
    private static final Range[] RULE_978_99951 = new Range[] {};
    private static final Range[] RULE_978_99952 = new Range[] { new Range(1, 978999520000L, 978999524999L),
            new Range(2, 978999525000L, 978999527999L), new Range(3, 978999528000L, 978999529999L), };
    private static final Range[] RULE_978_99953 = new Range[] { new Range(1, 978999530000L, 978999532999L),
            new Range(2, 978999533000L, 978999537999L), new Range(3, 978999538000L, 978999539399L),
            new Range(2, 978999539400L, 978999539999L), };
    private static final Range[] RULE_978_99954 = new Range[] { new Range(1, 978999540000L, 978999542999L),
            new Range(2, 978999543000L, 978999546999L), new Range(3, 978999547000L, 978999548799L),
            new Range(2, 978999548800L, 978999549999L), };
    private static final Range[] RULE_978_99955 = new Range[] { new Range(1, 978999550000L, 978999551999L),
            new Range(2, 978999552000L, 978999555999L), new Range(3, 978999556000L, 978999557999L),
            new Range(2, 978999558000L, 978999559999L), };
    private static final Range[] RULE_978_99956 = new Range[] { new Range(2, 978999560000L, 978999565999L),
            new Range(3, 978999566000L, 978999568599L), new Range(2, 978999568600L, 978999569999L), };
    private static final Range[] RULE_978_99957 = new Range[] { new Range(1, 978999570000L, 978999571999L),
            new Range(2, 978999572000L, 978999577999L), new Range(3, 978999578000L, 978999579499L),
            new Range(2, 978999579500L, 978999579999L), };
    private static final Range[] RULE_978_99958 = new Range[] { new Range(1, 978999580000L, 978999584999L),
            new Range(2, 978999585000L, 978999589399L), new Range(3, 978999589400L, 978999589499L),
            new Range(3, 978999589500L, 978999589999L), };
    private static final Range[] RULE_978_99959 = new Range[] { new Range(1, 978999590000L, 978999592999L),
            new Range(2, 978999593000L, 978999595999L), new Range(3, 978999596000L, 978999599999L), };
    private static final Range[] RULE_978_99960 = new Range[] { new Range(3, 978999600700L, 978999600999L),
            new Range(2, 978999601000L, 978999609499L), new Range(3, 978999609500L, 978999609999L), };
    private static final Range[] RULE_978_99961 = new Range[] { new Range(1, 978999610000L, 978999612999L),
            new Range(3, 978999613000L, 978999613699L), new Range(2, 978999613700L, 978999618999L),
            new Range(3, 978999619000L, 978999619999L), };
    private static final Range[] RULE_978_99962 = new Range[] { new Range(1, 978999620000L, 978999624999L),
            new Range(2, 978999625000L, 978999627999L), new Range(3, 978999628000L, 978999629999L), };
    private static final Range[] RULE_978_99963 = new Range[] { new Range(2, 978999630000L, 978999634999L),
            new Range(3, 978999635000L, 978999639199L), new Range(2, 978999639200L, 978999639999L), };
    private static final Range[] RULE_978_99964 = new Range[] { new Range(1, 978999640000L, 978999641999L),
            new Range(2, 978999642000L, 978999647999L), new Range(3, 978999648000L, 978999649999L), };
    private static final Range[] RULE_978_99965 = new Range[] { new Range(1, 978999650000L, 978999652999L),
            new Range(3, 978999653000L, 978999653599L), new Range(2, 978999653600L, 978999656299L),
            new Range(3, 978999656300L, 978999659999L), };
    private static final Range[] RULE_978_99966 = new Range[] { new Range(1, 978999660000L, 978999662999L),
            new Range(2, 978999663000L, 978999666999L), new Range(3, 978999667000L, 978999667999L),
            new Range(2, 978999668000L, 978999669699L), new Range(3, 978999669700L, 978999669999L), };
    private static final Range[] RULE_978_99967 = new Range[] { new Range(1, 978999670000L, 978999670999L),
            new Range(2, 978999671000L, 978999675999L), new Range(3, 978999676000L, 978999679999L), };
    private static final Range[] RULE_978_99968 = new Range[] { new Range(1, 978999680000L, 978999683999L),
            new Range(3, 978999684000L, 978999685999L), new Range(2, 978999686000L, 978999688999L),
            new Range(3, 978999689000L, 978999689999L), };
    private static final Range[] RULE_978_99969 = new Range[] { new Range(1, 978999690000L, 978999694999L),
            new Range(2, 978999695000L, 978999697999L), new Range(3, 978999698000L, 978999699499L),
            new Range(2, 978999699500L, 978999699999L), };
    private static final Range[] RULE_978_99970 = new Range[] { new Range(1, 978999700000L, 978999704999L),
            new Range(2, 978999705000L, 978999708999L), new Range(3, 978999709000L, 978999709999L), };
    private static final Range[] RULE_978_99971 = new Range[] { new Range(1, 978999710000L, 978999713999L),
            new Range(2, 978999714000L, 978999718499L), new Range(3, 978999718500L, 978999719999L), };
    private static final Range[] RULE_978_99972 = new Range[] { new Range(1, 978999720000L, 978999724999L),
            new Range(2, 978999725000L, 978999728999L), new Range(3, 978999729000L, 978999729999L), };
    private static final Range[] RULE_978_99973 = new Range[] { new Range(1, 978999730000L, 978999733999L),
            new Range(2, 978999734000L, 978999737999L), new Range(3, 978999738000L, 978999739999L), };
    private static final Range[] RULE_978_99974 = new Range[] { new Range(1, 978999740000L, 978999740999L),
            new Range(2, 978999741000L, 978999742599L), new Range(3, 978999742600L, 978999743999L),
            new Range(2, 978999744000L, 978999746399L), new Range(3, 978999746400L, 978999746499L),
            new Range(2, 978999746500L, 978999747999L), new Range(3, 978999748000L, 978999749999L), };
    private static final Range[] RULE_978_99975 = new Range[] { new Range(1, 978999750000L, 978999752999L),
            new Range(3, 978999753000L, 978999753999L), new Range(2, 978999754000L, 978999757999L),
            new Range(3, 978999758000L, 978999759999L), };
    private static final Range[] RULE_978_99976 = new Range[] { new Range(1, 978999760000L, 978999760999L),
            new Range(2, 978999761000L, 978999761599L), new Range(3, 978999761600L, 978999761999L),
            new Range(2, 978999762000L, 978999765999L), new Range(3, 978999766000L, 978999767999L),
            new Range(2, 978999768500L, 978999768999L), new Range(3, 978999769000L, 978999769999L), };
    private static final Range[] RULE_978_99977 = new Range[] { new Range(1, 978999770000L, 978999771999L),
            new Range(2, 978999774000L, 978999776999L), new Range(3, 978999777000L, 978999777999L),
            new Range(3, 978999779950L, 978999779999L), };
    private static final Range[] RULE_978_99978 = new Range[] { new Range(1, 978999780000L, 978999784999L),
            new Range(2, 978999785000L, 978999786999L), new Range(3, 978999787000L, 978999789999L), };
    private static final Range[] RULE_978_99979 = new Range[] { new Range(1, 978999790000L, 978999793999L),
            new Range(2, 978999794000L, 978999797999L), new Range(3, 978999798000L, 978999799999L), };
    private static final Range[] RULE_978_99980 = new Range[] { new Range(1, 978999800000L, 978999800999L),
            new Range(2, 978999803000L, 978999805999L), new Range(3, 978999807500L, 978999809999L), };
    private static final Range[] RULE_978_99981 = new Range[] { new Range(1, 978999810000L, 978999811999L),
            new Range(2, 978999812700L, 978999817499L), new Range(3, 978999817500L, 978999819999L), };
    private static final Range[] RULE_978_99982 = new Range[] { new Range(1, 978999820000L, 978999821999L),
            new Range(2, 978999825000L, 978999826899L), new Range(3, 978999829000L, 978999829999L), };
    private static final Range[] RULE_978_99983 = new Range[] { new Range(1, 978999830000L, 978999830999L),
            new Range(2, 978999835000L, 978999836999L), new Range(3, 978999839500L, 978999839999L), };
    private static final Range[] RULE_978_99984 = new Range[] { new Range(1, 978999840000L, 978999840999L),
            new Range(2, 978999845000L, 978999846999L), new Range(3, 978999849500L, 978999849999L), };
    private static final Range[] RULE_978_99985 = new Range[] { new Range(1, 978999850000L, 978999851999L),
            new Range(2, 978999853500L, 978999857999L), new Range(3, 978999858500L, 978999859999L), };
    private static final Range[] RULE_978_99986 = new Range[] { new Range(1, 978999860000L, 978999860999L),
            new Range(2, 978999865000L, 978999866999L), new Range(3, 978999869500L, 978999869999L), };
    private static final Range[] RULE_978_99987 = new Range[] { new Range(3, 978999877000L, 978999879999L), };
    private static final Range[] RULE_978_99988 = new Range[] { new Range(1, 978999880000L, 978999880999L),
            new Range(2, 978999885000L, 978999885499L), new Range(3, 978999888000L, 978999888249L), };
    private static final Range[] RULE_978_99989 = new Range[] { new Range(1, 978999890000L, 978999890999L),
            new Range(2, 978999895000L, 978999896499L), new Range(3, 978999899000L, 978999899999L), };
    private static final Range[] RULE_978_99990 = new Range[] { new Range(1, 978999900000L, 978999900999L),
            new Range(2, 978999905000L, 978999905499L), new Range(3, 978999909750L, 978999909999L), };
    private static final Range[] RULE_978_99992 = new Range[] { new Range(1, 978999920000L, 978999921999L),
            new Range(2, 978999925000L, 978999926499L), new Range(3, 978999929500L, 978999929999L), };
    private static final Range[] RULE_979_10 = new Range[] { new Range(2, 979100000000L, 979101999999L),
            new Range(3, 979102000000L, 979106999999L), new Range(4, 979107000000L, 979108999999L),
            new Range(5, 979109000000L, 979109759999L), new Range(6, 979109760000L, 979109999999L), };
    private static final Range[] RULE_979_11 = new Range[] { new Range(2, 979110000000L, 979112499999L),
            new Range(3, 979112500000L, 979115499999L), new Range(4, 979115500000L, 979118499999L),
            new Range(5, 979118500000L, 979119499999L), new Range(6, 979119500000L, 979119999999L), };
    private static final Range[] RULE_979_12 = new Range[] { new Range(3, 979122000000L, 979122999999L),
            new Range(4, 979125450000L, 979125999999L), new Range(5, 979128000000L, 979128499999L), };
    private static final Range[] RULE_979_8 = new Range[] { new Range(3, 979820000000L, 979822999999L),
            new Range(4, 979835000000L, 979839999999L), new Range(4, 979840000000L, 979884999999L),
            new Range(4, 979885000000L, 979888499999L), new Range(5, 979888500000L, 979889999999L),
            new Range(7, 979898500000L, 979898999999L), };
    private static final Range[] RULE_978 = new Range[] {
            new Range(1, 978000000000L, 978599999999L, RULE_978_0, RULE_978_1, RULE_978_2, RULE_978_3, RULE_978_4,
                    RULE_978_5),
            new Range(3, 978600000000L, 978649999999L, RULE_978_600, RULE_978_601, RULE_978_602, RULE_978_603,
                    RULE_978_604, RULE_978_605, RULE_978_606, RULE_978_607, RULE_978_608, RULE_978_609, null,
                    RULE_978_611, RULE_978_612, RULE_978_613, RULE_978_614, RULE_978_615, RULE_978_616, RULE_978_617,
                    RULE_978_618, RULE_978_619, RULE_978_620, RULE_978_621, RULE_978_622, RULE_978_623, RULE_978_624,
                    RULE_978_625, RULE_978_626, RULE_978_627, RULE_978_628, RULE_978_629, RULE_978_630, RULE_978_631,
                    null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
                    null, null),
            new Range(2, 978650000000L, 978659999999L, RULE_978_65),
            new Range(1, 978700000000L, 978799999999L, RULE_978_7),
            new Range(2, 978800000000L, 978949999999L, RULE_978_80, RULE_978_81, RULE_978_82, RULE_978_83, RULE_978_84,
                    RULE_978_85, RULE_978_86, RULE_978_87, RULE_978_88, RULE_978_89, RULE_978_90, RULE_978_91,
                    RULE_978_92, RULE_978_93, RULE_978_94),
            new Range(3, 978950000000L, 978989999999L, RULE_978_950, RULE_978_951, RULE_978_952, RULE_978_953,
                    RULE_978_954, RULE_978_955, RULE_978_956, RULE_978_957, RULE_978_958, RULE_978_959, RULE_978_960,
                    RULE_978_961, RULE_978_962, RULE_978_963, RULE_978_964, RULE_978_965, RULE_978_966, RULE_978_967,
                    RULE_978_968, RULE_978_969, RULE_978_970, RULE_978_971, RULE_978_972, RULE_978_973, RULE_978_974,
                    RULE_978_975, RULE_978_976, RULE_978_977, RULE_978_978, RULE_978_979, RULE_978_980, RULE_978_981,
                    RULE_978_982, RULE_978_983, RULE_978_984, RULE_978_985, RULE_978_986, RULE_978_987, RULE_978_988,
                    RULE_978_989),
            new Range(4, 978990000000L, 978998999999L, null, null, null, null, null, null, null, null, null, null, null,
                    RULE_978_9911, RULE_978_9912, RULE_978_9913, RULE_978_9914, RULE_978_9915, RULE_978_9916,
                    RULE_978_9917, RULE_978_9918, RULE_978_9919, RULE_978_9920, RULE_978_9921, RULE_978_9922,
                    RULE_978_9923, RULE_978_9924, RULE_978_9925, RULE_978_9926, RULE_978_9927, RULE_978_9928,
                    RULE_978_9929, RULE_978_9930, RULE_978_9931, RULE_978_9932, RULE_978_9933, RULE_978_9934,
                    RULE_978_9935, RULE_978_9936, RULE_978_9937, RULE_978_9938, RULE_978_9939, RULE_978_9940,
                    RULE_978_9941, RULE_978_9942, RULE_978_9943, RULE_978_9944, RULE_978_9945, RULE_978_9946,
                    RULE_978_9947, RULE_978_9948, RULE_978_9949, RULE_978_9950, RULE_978_9951, RULE_978_9952,
                    RULE_978_9953, RULE_978_9954, RULE_978_9955, RULE_978_9956, RULE_978_9957, RULE_978_9958,
                    RULE_978_9959, RULE_978_9960, RULE_978_9961, RULE_978_9962, RULE_978_9963, RULE_978_9964,
                    RULE_978_9965, RULE_978_9966, RULE_978_9967, RULE_978_9968, RULE_978_9969, RULE_978_9970,
                    RULE_978_9971, RULE_978_9972, RULE_978_9973, RULE_978_9974, RULE_978_9975, RULE_978_9976,
                    RULE_978_9977, RULE_978_9978, RULE_978_9979, RULE_978_9980, RULE_978_9981, RULE_978_9982,
                    RULE_978_9983, RULE_978_9984, RULE_978_9985, RULE_978_9986, RULE_978_9987, RULE_978_9988,
                    RULE_978_9989),
            new Range(5, 978999000000L, 978999999999L, null, RULE_978_99901, RULE_978_99902, RULE_978_99903,
                    RULE_978_99904, RULE_978_99905, RULE_978_99906, null, RULE_978_99908, RULE_978_99909,
                    RULE_978_99910, RULE_978_99911, RULE_978_99912, RULE_978_99913, RULE_978_99914, RULE_978_99915,
                    RULE_978_99916, RULE_978_99917, RULE_978_99918, RULE_978_99919, RULE_978_99920, RULE_978_99921,
                    RULE_978_99922, RULE_978_99923, RULE_978_99924, RULE_978_99925, RULE_978_99926, RULE_978_99927,
                    RULE_978_99928, RULE_978_99929, RULE_978_99930, RULE_978_99931, RULE_978_99932, RULE_978_99933,
                    RULE_978_99934, RULE_978_99935, RULE_978_99936, RULE_978_99937, RULE_978_99938, RULE_978_99939,
                    RULE_978_99940, RULE_978_99941, RULE_978_99942, RULE_978_99943, RULE_978_99944, RULE_978_99945,
                    RULE_978_99946, RULE_978_99947, RULE_978_99948, RULE_978_99949, RULE_978_99950, RULE_978_99951,
                    RULE_978_99952, RULE_978_99953, RULE_978_99954, RULE_978_99955, RULE_978_99956, RULE_978_99957,
                    RULE_978_99958, RULE_978_99959, RULE_978_99960, RULE_978_99961, RULE_978_99962, RULE_978_99963,
                    RULE_978_99964, RULE_978_99965, RULE_978_99966, RULE_978_99967, RULE_978_99968, RULE_978_99969,
                    RULE_978_99970, RULE_978_99971, RULE_978_99972, RULE_978_99973, RULE_978_99974, RULE_978_99975,
                    RULE_978_99976, RULE_978_99977, RULE_978_99978, RULE_978_99979, RULE_978_99980, RULE_978_99981,
                    RULE_978_99982, RULE_978_99983, RULE_978_99984, RULE_978_99985, RULE_978_99986, RULE_978_99987,
                    RULE_978_99988, RULE_978_99989, RULE_978_99990, null, RULE_978_99992, null, null, null, null, null,
                    null, null), };
    private static final Range[] RULE_979 = new Range[] {
            new Range(2, 979100000000L, 979129999999L, RULE_979_10, RULE_979_11, RULE_979_12),
            new Range(1, 979800000000L, 979899999999L, RULE_979_8), };
    static final Range[] ROOT = { new Range(3, 978000000000L, 979999999999L, RULE_978, RULE_979), };
    static final HashMap<String, String> AGENCIES = new HashMap<>();
    static {
        AGENCIES.put("978", "International ISBN Agency");
        AGENCIES.put("979", "International ISBN Agency");
        AGENCIES.put("978-0", "English language");
        AGENCIES.put("978-1", "English language");
        AGENCIES.put("978-2", "French language");
        AGENCIES.put("978-3", "German language");
        AGENCIES.put("978-4", "Japan");
        AGENCIES.put("978-5", "former U.S.S.R");
        AGENCIES.put("978-600", "Iran");
        AGENCIES.put("978-601", "Kazakhstan");
        AGENCIES.put("978-602", "Indonesia");
        AGENCIES.put("978-603", "Saudi Arabia");
        AGENCIES.put("978-604", "Vietnam");
        AGENCIES.put("978-605", "Turkey");
        AGENCIES.put("978-606", "Romania");
        AGENCIES.put("978-607", "Mexico");
        AGENCIES.put("978-608", "North Macedonia");
        AGENCIES.put("978-609", "Lithuania");
        AGENCIES.put("978-611", "Thailand");
        AGENCIES.put("978-612", "Peru");
        AGENCIES.put("978-613", "Mauritius");
        AGENCIES.put("978-614", "Lebanon");
        AGENCIES.put("978-615", "Hungary");
        AGENCIES.put("978-616", "Thailand");
        AGENCIES.put("978-617", "Ukraine");
        AGENCIES.put("978-618", "Greece");
        AGENCIES.put("978-619", "Bulgaria");
        AGENCIES.put("978-620", "Mauritius");
        AGENCIES.put("978-621", "Philippines");
        AGENCIES.put("978-622", "Iran");
        AGENCIES.put("978-623", "Indonesia");
        AGENCIES.put("978-624", "Sri Lanka");
        AGENCIES.put("978-625", "Turkey");
        AGENCIES.put("978-626", "Taiwan");
        AGENCIES.put("978-627", "Pakistan");
        AGENCIES.put("978-628", "Colombia");
        AGENCIES.put("978-629", "Malaysia");
        AGENCIES.put("978-630", "Romania");
        AGENCIES.put("978-631", "Argentina");
        AGENCIES.put("978-65", "Brazil");
        AGENCIES.put("978-7", "China, People's Republic");
        AGENCIES.put("978-80", "former Czechoslovakia");
        AGENCIES.put("978-81", "India");
        AGENCIES.put("978-82", "Norway");
        AGENCIES.put("978-83", "Poland");
        AGENCIES.put("978-84", "Spain");
        AGENCIES.put("978-85", "Brazil");
        AGENCIES.put("978-86", "former Yugoslavia");
        AGENCIES.put("978-87", "Denmark");
        AGENCIES.put("978-88", "Italy");
        AGENCIES.put("978-89", "Korea, Republic");
        AGENCIES.put("978-90", "Netherlands");
        AGENCIES.put("978-91", "Sweden");
        AGENCIES.put("978-92", "International NGO Publishers and EU Organizations");
        AGENCIES.put("978-93", "India");
        AGENCIES.put("978-94", "Netherlands");
        AGENCIES.put("978-950", "Argentina");
        AGENCIES.put("978-951", "Finland");
        AGENCIES.put("978-952", "Finland");
        AGENCIES.put("978-953", "Croatia");
        AGENCIES.put("978-954", "Bulgaria");
        AGENCIES.put("978-955", "Sri Lanka");
        AGENCIES.put("978-956", "Chile");
        AGENCIES.put("978-957", "Taiwan");
        AGENCIES.put("978-958", "Colombia");
        AGENCIES.put("978-959", "Cuba");
        AGENCIES.put("978-960", "Greece");
        AGENCIES.put("978-961", "Slovenia");
        AGENCIES.put("978-962", "Hong Kong, China");
        AGENCIES.put("978-963", "Hungary");
        AGENCIES.put("978-964", "Iran");
        AGENCIES.put("978-965", "Israel");
        AGENCIES.put("978-966", "Ukraine");
        AGENCIES.put("978-967", "Malaysia");
        AGENCIES.put("978-968", "Mexico");
        AGENCIES.put("978-969", "Pakistan");
        AGENCIES.put("978-970", "Mexico");
        AGENCIES.put("978-971", "Philippines");
        AGENCIES.put("978-972", "Portugal");
        AGENCIES.put("978-973", "Romania");
        AGENCIES.put("978-974", "Thailand");
        AGENCIES.put("978-975", "Turkey");
        AGENCIES.put("978-976", "Caribbean Community");
        AGENCIES.put("978-977", "Egypt");
        AGENCIES.put("978-978", "Nigeria");
        AGENCIES.put("978-979", "Indonesia");
        AGENCIES.put("978-980", "Venezuela");
        AGENCIES.put("978-981", "Singapore");
        AGENCIES.put("978-982", "South Pacific");
        AGENCIES.put("978-983", "Malaysia");
        AGENCIES.put("978-984", "Bangladesh");
        AGENCIES.put("978-985", "Belarus");
        AGENCIES.put("978-986", "Taiwan");
        AGENCIES.put("978-987", "Argentina");
        AGENCIES.put("978-988", "Hong Kong, China");
        AGENCIES.put("978-989", "Portugal");
        AGENCIES.put("978-9911", "Montenegro");
        AGENCIES.put("978-9912", "Tanzania");
        AGENCIES.put("978-9913", "Uganda");
        AGENCIES.put("978-9914", "Kenya");
        AGENCIES.put("978-9915", "Uruguay");
        AGENCIES.put("978-9916", "Estonia");
        AGENCIES.put("978-9917", "Bolivia");
        AGENCIES.put("978-9918", "Malta");
        AGENCIES.put("978-9919", "Mongolia");
        AGENCIES.put("978-9920", "Morocco");
        AGENCIES.put("978-9921", "Kuwait");
        AGENCIES.put("978-9922", "Iraq");
        AGENCIES.put("978-9923", "Jordan");
        AGENCIES.put("978-9924", "Cambodia");
        AGENCIES.put("978-9925", "Cyprus");
        AGENCIES.put("978-9926", "Bosnia and Herzegovina");
        AGENCIES.put("978-9927", "Qatar");
        AGENCIES.put("978-9928", "Albania");
        AGENCIES.put("978-9929", "Guatemala");
        AGENCIES.put("978-9930", "Costa Rica");
        AGENCIES.put("978-9931", "Algeria");
        AGENCIES.put("978-9932", "Lao People's Democratic Republic");
        AGENCIES.put("978-9933", "Syria");
        AGENCIES.put("978-9934", "Latvia");
        AGENCIES.put("978-9935", "Iceland");
        AGENCIES.put("978-9936", "Afghanistan");
        AGENCIES.put("978-9937", "Nepal");
        AGENCIES.put("978-9938", "Tunisia");
        AGENCIES.put("978-9939", "Armenia");
        AGENCIES.put("978-9940", "Montenegro");
        AGENCIES.put("978-9941", "Georgia");
        AGENCIES.put("978-9942", "Ecuador");
        AGENCIES.put("978-9943", "Uzbekistan");
        AGENCIES.put("978-9944", "Turkey");
        AGENCIES.put("978-9945", "Dominican Republic");
        AGENCIES.put("978-9946", "Korea, P.D.R.");
        AGENCIES.put("978-9947", "Algeria");
        AGENCIES.put("978-9948", "United Arab Emirates");
        AGENCIES.put("978-9949", "Estonia");
        AGENCIES.put("978-9950", "Palestine");
        AGENCIES.put("978-9951", "Kosova");
        AGENCIES.put("978-9952", "Azerbaijan");
        AGENCIES.put("978-9953", "Lebanon");
        AGENCIES.put("978-9954", "Morocco");
        AGENCIES.put("978-9955", "Lithuania");
        AGENCIES.put("978-9956", "Cameroon");
        AGENCIES.put("978-9957", "Jordan");
        AGENCIES.put("978-9958", "Bosnia and Herzegovina");
        AGENCIES.put("978-9959", "Libya");
        AGENCIES.put("978-9960", "Saudi Arabia");
        AGENCIES.put("978-9961", "Algeria");
        AGENCIES.put("978-9962", "Panama");
        AGENCIES.put("978-9963", "Cyprus");
        AGENCIES.put("978-9964", "Ghana");
        AGENCIES.put("978-9965", "Kazakhstan");
        AGENCIES.put("978-9966", "Kenya");
        AGENCIES.put("978-9967", "Kyrgyz Republic");
        AGENCIES.put("978-9968", "Costa Rica");
        AGENCIES.put("978-9969", "Algeria");
        AGENCIES.put("978-9970", "Uganda");
        AGENCIES.put("978-9971", "Singapore");
        AGENCIES.put("978-9972", "Peru");
        AGENCIES.put("978-9973", "Tunisia");
        AGENCIES.put("978-9974", "Uruguay");
        AGENCIES.put("978-9975", "Moldova");
        AGENCIES.put("978-9976", "Tanzania");
        AGENCIES.put("978-9977", "Costa Rica");
        AGENCIES.put("978-9978", "Ecuador");
        AGENCIES.put("978-9979", "Iceland");
        AGENCIES.put("978-9980", "Papua New Guinea");
        AGENCIES.put("978-9981", "Morocco");
        AGENCIES.put("978-9982", "Zambia");
        AGENCIES.put("978-9983", "Gambia");
        AGENCIES.put("978-9984", "Latvia");
        AGENCIES.put("978-9985", "Estonia");
        AGENCIES.put("978-9986", "Lithuania");
        AGENCIES.put("978-9987", "Tanzania");
        AGENCIES.put("978-9988", "Ghana");
        AGENCIES.put("978-9989", "North Macedonia");
        AGENCIES.put("978-99901", "Bahrain");
        AGENCIES.put("978-99902", "Reserved Agency");
        AGENCIES.put("978-99903", "Mauritius");
        AGENCIES.put("978-99904", "Curaçao");
        AGENCIES.put("978-99905", "Bolivia");
        AGENCIES.put("978-99906", "Kuwait");
        AGENCIES.put("978-99908", "Malawi");
        AGENCIES.put("978-99909", "Malta");
        AGENCIES.put("978-99910", "Sierra Leone");
        AGENCIES.put("978-99911", "Lesotho");
        AGENCIES.put("978-99912", "Botswana");
        AGENCIES.put("978-99913", "Andorra");
        AGENCIES.put("978-99914", "International NGO Publishers");
        AGENCIES.put("978-99915", "Maldives");
        AGENCIES.put("978-99916", "Namibia");
        AGENCIES.put("978-99917", "Brunei Darussalam");
        AGENCIES.put("978-99918", "Faroe Islands");
        AGENCIES.put("978-99919", "Benin");
        AGENCIES.put("978-99920", "Andorra");
        AGENCIES.put("978-99921", "Qatar");
        AGENCIES.put("978-99922", "Guatemala");
        AGENCIES.put("978-99923", "El Salvador");
        AGENCIES.put("978-99924", "Nicaragua");
        AGENCIES.put("978-99925", "Paraguay");
        AGENCIES.put("978-99926", "Honduras");
        AGENCIES.put("978-99927", "Albania");
        AGENCIES.put("978-99928", "Georgia");
        AGENCIES.put("978-99929", "Mongolia");
        AGENCIES.put("978-99930", "Armenia");
        AGENCIES.put("978-99931", "Seychelles");
        AGENCIES.put("978-99932", "Malta");
        AGENCIES.put("978-99933", "Nepal");
        AGENCIES.put("978-99934", "Dominican Republic");
        AGENCIES.put("978-99935", "Haiti");
        AGENCIES.put("978-99936", "Bhutan");
        AGENCIES.put("978-99937", "Macau");
        AGENCIES.put("978-99938", "Srpska, Republic of");
        AGENCIES.put("978-99939", "Guatemala");
        AGENCIES.put("978-99940", "Georgia");
        AGENCIES.put("978-99941", "Armenia");
        AGENCIES.put("978-99942", "Sudan");
        AGENCIES.put("978-99943", "Albania");
        AGENCIES.put("978-99944", "Ethiopia");
        AGENCIES.put("978-99945", "Namibia");
        AGENCIES.put("978-99946", "Nepal");
        AGENCIES.put("978-99947", "Tajikistan");
        AGENCIES.put("978-99948", "Eritrea");
        AGENCIES.put("978-99949", "Mauritius");
        AGENCIES.put("978-99950", "Cambodia");
        AGENCIES.put("978-99951", "Reserved Agency");
        AGENCIES.put("978-99952", "Mali");
        AGENCIES.put("978-99953", "Paraguay");
        AGENCIES.put("978-99954", "Bolivia");
        AGENCIES.put("978-99955", "Srpska, Republic of");
        AGENCIES.put("978-99956", "Albania");
        AGENCIES.put("978-99957", "Malta");
        AGENCIES.put("978-99958", "Bahrain");
        AGENCIES.put("978-99959", "Luxembourg");
        AGENCIES.put("978-99960", "Malawi");
        AGENCIES.put("978-99961", "El Salvador");
        AGENCIES.put("978-99962", "Mongolia");
        AGENCIES.put("978-99963", "Cambodia");
        AGENCIES.put("978-99964", "Nicaragua");
        AGENCIES.put("978-99965", "Macau");
        AGENCIES.put("978-99966", "Kuwait");
        AGENCIES.put("978-99967", "Paraguay");
        AGENCIES.put("978-99968", "Botswana");
        AGENCIES.put("978-99969", "Oman");
        AGENCIES.put("978-99970", "Haiti");
        AGENCIES.put("978-99971", "Myanmar");
        AGENCIES.put("978-99972", "Faroe Islands");
        AGENCIES.put("978-99973", "Mongolia");
        AGENCIES.put("978-99974", "Bolivia");
        AGENCIES.put("978-99975", "Tajikistan");
        AGENCIES.put("978-99976", "Srpska, Republic of");
        AGENCIES.put("978-99977", "Rwanda");
        AGENCIES.put("978-99978", "Mongolia");
        AGENCIES.put("978-99979", "Honduras");
        AGENCIES.put("978-99980", "Bhutan");
        AGENCIES.put("978-99981", "Macau");
        AGENCIES.put("978-99982", "Benin");
        AGENCIES.put("978-99983", "El Salvador");
        AGENCIES.put("978-99984", "Brunei Darussalam");
        AGENCIES.put("978-99985", "Tajikistan");
        AGENCIES.put("978-99986", "Myanmar");
        AGENCIES.put("978-99987", "Luxembourg");
        AGENCIES.put("978-99988", "Sudan");
        AGENCIES.put("978-99989", "Paraguay");
        AGENCIES.put("978-99990", "Ethiopia");
        AGENCIES.put("978-99992", "Oman");
        AGENCIES.put("979-10", "France");
        AGENCIES.put("979-11", "Korea, Republic");
        AGENCIES.put("979-12", "Italy");
        AGENCIES.put("979-8", "United States");
    }
}
