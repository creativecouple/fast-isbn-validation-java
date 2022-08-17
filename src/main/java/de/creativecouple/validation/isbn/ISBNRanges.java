package de.creativecouple.validation.isbn;

import java.util.HashMap;

/**
 * This file is auto-generated from ISBN range definitions given by the
 * <a href="https://www.isbn-international.org/">international ISBN agency</a>.
 *
 * @author Peter Liske (CreativeCouple)
 */
final class ISBNRanges {
    static final String MESSAGE_SOURCE = "International ISBN Agency";
    static final String MESSAGE_SERIAL_NUMBER = "84ca6c1b-403b-4fd3-8037-50263dcd79d6";
    static final String MESSAGE_DATE = "Tue, 16 Aug 2022 11:47:47 BST";
    private static final Range[] RULE_978_0 = new Range[] { new Range(2, 0, 19), new Range(3, 200, 227),
            new Range(4, 2280, 2289), new Range(3, 229, 368), new Range(4, 3690, 3699), new Range(3, 370, 638),
            new Range(4, 6390, 6397), new Range(7, 6398000, 6399999), new Range(3, 640, 644),
            new Range(7, 6450000, 6459999), new Range(3, 646, 647), new Range(7, 6480000, 6489999),
            new Range(3, 649, 654), new Range(4, 6550, 6559), new Range(3, 656, 699), new Range(4, 7000, 8499),
            new Range(5, 85000, 89999), new Range(6, 900000, 949999), new Range(7, 9500000, 9999999), };
    private static final Range[] RULE_978_1 = new Range[] { new Range(3, 0, 9), new Range(2, 1, 2),
            new Range(3, 30, 34), new Range(4, 350, 399), new Range(2, 4, 6), new Range(4, 700, 999),
            new Range(3, 100, 397), new Range(4, 3980, 5499), new Range(5, 55000, 64999), new Range(4, 6500, 6799),
            new Range(5, 68000, 68599), new Range(4, 6860, 7139), new Range(3, 714, 716), new Range(4, 7170, 7319),
            new Range(7, 7320000, 7399999), new Range(5, 74000, 77499), new Range(7, 7750000, 7753999),
            new Range(5, 77540, 77639), new Range(7, 7764000, 7764999), new Range(5, 77650, 77699),
            new Range(7, 7770000, 7782999), new Range(5, 77830, 78999), new Range(4, 7900, 7999),
            new Range(5, 80000, 80049), new Range(5, 80050, 80499), new Range(5, 80500, 83799),
            new Range(7, 8380000, 8384999), new Range(5, 83850, 86719), new Range(4, 8672, 8675),
            new Range(5, 86760, 86979), new Range(6, 869800, 915999), new Range(7, 9160000, 9165059),
            new Range(6, 916506, 916869), new Range(7, 9168700, 9169079), new Range(6, 916908, 919599),
            new Range(7, 9196000, 9196549), new Range(6, 919655, 972999), new Range(4, 9730, 9877),
            new Range(6, 987800, 991149), new Range(7, 9911500, 9911999), new Range(6, 991200, 998989),
            new Range(7, 9989900, 9999999), };
    private static final Range[] RULE_978_2 = new Range[] { new Range(2, 0, 19), new Range(3, 200, 349),
            new Range(5, 35000, 39999), new Range(3, 400, 489), new Range(6, 490000, 494999), new Range(3, 495, 495),
            new Range(4, 4960, 4966), new Range(5, 49670, 49699), new Range(3, 497, 699), new Range(4, 7000, 8399),
            new Range(5, 84000, 89999), new Range(6, 900000, 919799), new Range(5, 91980, 91980),
            new Range(6, 919810, 919942), new Range(7, 9199430, 9199689), new Range(6, 919969, 949999),
            new Range(7, 9500000, 9999999), };
    private static final Range[] RULE_978_3 = new Range[] { new Range(2, 0, 2), new Range(3, 30, 33),
            new Range(4, 340, 369), new Range(5, 3700, 3999), new Range(2, 4, 19), new Range(3, 200, 699),
            new Range(4, 7000, 8499), new Range(5, 85000, 89999), new Range(6, 900000, 949999),
            new Range(7, 9500000, 9539999), new Range(5, 95400, 96999), new Range(7, 9700000, 9849999),
            new Range(5, 98500, 99999), };
    private static final Range[] RULE_978_4 = new Range[] { new Range(2, 0, 19), new Range(3, 200, 699),
            new Range(4, 7000, 8499), new Range(5, 85000, 89999), new Range(6, 900000, 949999),
            new Range(7, 9500000, 9999999), };
    private static final Range[] RULE_978_5 = new Range[] { new Range(5, 0, 499), new Range(4, 50, 99),
            new Range(2, 1, 19), new Range(3, 200, 420), new Range(4, 4210, 4299), new Range(3, 430, 430),
            new Range(4, 4310, 4399), new Range(3, 440, 440), new Range(4, 4410, 4499), new Range(3, 450, 603),
            new Range(7, 6040000, 6049999), new Range(3, 605, 699), new Range(4, 7000, 8499),
            new Range(5, 85000, 89999), new Range(6, 900000, 909999), new Range(5, 91000, 91999),
            new Range(4, 9200, 9299), new Range(5, 93000, 94999), new Range(7, 9500000, 9500999),
            new Range(4, 9501, 9799), new Range(5, 98000, 98999), new Range(7, 9900000, 9909999),
            new Range(4, 9910, 9999), };
    private static final Range[] RULE_978_600 = new Range[] { new Range(2, 0, 9), new Range(3, 100, 499),
            new Range(4, 5000, 8999), new Range(5, 90000, 98679), new Range(4, 9868, 9929), new Range(3, 993, 995),
            new Range(5, 99600, 99999), };
    private static final Range[] RULE_978_601 = new Range[] { new Range(2, 0, 19), new Range(3, 200, 699),
            new Range(4, 7000, 7999), new Range(5, 80000, 84999), new Range(2, 85, 99), };
    private static final Range[] RULE_978_602 = new Range[] { new Range(2, 0, 6), new Range(4, 700, 1399),
            new Range(5, 14000, 14999), new Range(4, 1500, 1699), new Range(5, 17000, 19999), new Range(3, 200, 499),
            new Range(5, 50000, 53999), new Range(4, 5400, 5999), new Range(5, 60000, 61999), new Range(4, 6200, 6999),
            new Range(5, 70000, 74999), new Range(4, 7500, 9499), new Range(5, 95000, 99999), };
    private static final Range[] RULE_978_603 = new Range[] { new Range(2, 0, 4), new Range(2, 5, 49),
            new Range(3, 500, 799), new Range(4, 8000, 8999), new Range(5, 90000, 99999), };
    private static final Range[] RULE_978_604 = new Range[] { new Range(1, 0, 4), new Range(2, 50, 89),
            new Range(3, 900, 979), new Range(4, 9800, 9999), };
    private static final Range[] RULE_978_605 = new Range[] { new Range(2, 0, 2), new Range(3, 30, 39),
            new Range(2, 4, 5), new Range(5, 6000, 6999), new Range(2, 7, 9), new Range(3, 100, 199),
            new Range(4, 2000, 2399), new Range(3, 240, 399), new Range(4, 4000, 5999), new Range(5, 60000, 74999),
            new Range(4, 7500, 7999), new Range(5, 80000, 89999), new Range(4, 9000, 9999), };
    private static final Range[] RULE_978_606 = new Range[] { new Range(3, 0, 99), new Range(2, 10, 49),
            new Range(3, 500, 799), new Range(4, 8000, 9099), new Range(3, 910, 919), new Range(5, 92000, 95999),
            new Range(4, 9600, 9749), new Range(3, 975, 999), };
    private static final Range[] RULE_978_607 = new Range[] { new Range(2, 0, 39), new Range(3, 400, 749),
            new Range(4, 7500, 9499), new Range(5, 95000, 99999), };
    private static final Range[] RULE_978_608 = new Range[] { new Range(1, 0, 0), new Range(2, 10, 19),
            new Range(3, 200, 449), new Range(4, 4500, 6499), new Range(5, 65000, 69999), new Range(1, 7, 9), };
    private static final Range[] RULE_978_609 = new Range[] { new Range(2, 0, 39), new Range(3, 400, 799),
            new Range(4, 8000, 9499), new Range(5, 95000, 99999), };
    private static final Range[] RULE_978_611 = new Range[] {};
    private static final Range[] RULE_978_612 = new Range[] { new Range(2, 0, 29), new Range(3, 300, 399),
            new Range(4, 4000, 4499), new Range(5, 45000, 49999), new Range(4, 5000, 5149), };
    private static final Range[] RULE_978_613 = new Range[] { new Range(1, 0, 9), };
    private static final Range[] RULE_978_614 = new Range[] { new Range(2, 0, 39), new Range(3, 400, 799),
            new Range(4, 8000, 9499), new Range(5, 95000, 99999), };
    private static final Range[] RULE_978_615 = new Range[] { new Range(2, 0, 9), new Range(3, 100, 499),
            new Range(4, 5000, 7999), new Range(5, 80000, 89999), };
    private static final Range[] RULE_978_616 = new Range[] { new Range(2, 0, 19), new Range(3, 200, 699),
            new Range(4, 7000, 8999), new Range(5, 90000, 99999), };
    private static final Range[] RULE_978_617 = new Range[] { new Range(2, 0, 49), new Range(3, 500, 699),
            new Range(4, 7000, 8999), new Range(5, 90000, 99999), };
    private static final Range[] RULE_978_618 = new Range[] { new Range(2, 0, 19), new Range(3, 200, 499),
            new Range(4, 5000, 7999), new Range(5, 80000, 99999), };
    private static final Range[] RULE_978_619 = new Range[] { new Range(2, 0, 14), new Range(3, 150, 699),
            new Range(4, 7000, 8999), new Range(5, 90000, 99999), };
    private static final Range[] RULE_978_620 = new Range[] { new Range(1, 0, 9), };
    private static final Range[] RULE_978_621 = new Range[] { new Range(2, 0, 29), new Range(3, 400, 599),
            new Range(4, 8000, 8999), new Range(5, 95000, 99999), };
    private static final Range[] RULE_978_622 = new Range[] { new Range(2, 0, 10), new Range(3, 200, 374),
            new Range(4, 5200, 7999), new Range(5, 92500, 99999), };
    private static final Range[] RULE_978_623 = new Range[] { new Range(2, 0, 9), new Range(3, 200, 499),
            new Range(4, 5250, 7999), new Range(5, 88000, 99999), };
    private static final Range[] RULE_978_624 = new Range[] { new Range(2, 0, 4), new Range(3, 200, 249),
            new Range(4, 5000, 6349), new Range(5, 94500, 99999), };
    private static final Range[] RULE_978_625 = new Range[] { new Range(2, 0, 0), new Range(3, 400, 442),
            new Range(5, 44300, 44499), new Range(3, 445, 449), new Range(4, 7000, 7793), new Range(5, 77940, 77949),
            new Range(4, 7795, 8499), };
    private static final Range[] RULE_978_626 = new Range[] { new Range(2, 0, 4), new Range(3, 300, 499),
            new Range(4, 7000, 7999), new Range(5, 95000, 99999), };
    private static final Range[] RULE_978_627 = new Range[] { new Range(2, 30, 31), new Range(3, 500, 524),
            new Range(4, 7500, 7999), };
    private static final Range[] RULE_978_628 = new Range[] { new Range(2, 0, 9), new Range(3, 500, 549),
            new Range(4, 7500, 8499), new Range(5, 95000, 99999), };
    private static final Range[] RULE_978_629 = new Range[] { new Range(2, 0, 2), new Range(3, 470, 499),
            new Range(4, 7500, 7999), new Range(5, 96500, 99999), };
    private static final Range[] RULE_978_630 = new Range[] { new Range(3, 300, 349), new Range(4, 6500, 6849), };
    private static final Range[] RULE_978_65 = new Range[] { new Range(2, 0, 1), new Range(3, 250, 299),
            new Range(3, 300, 302), new Range(4, 5000, 5129), new Range(4, 5350, 5999), new Range(5, 80000, 81824),
            new Range(5, 84500, 89999), new Range(6, 900000, 902449), new Range(6, 990000, 999999), };
    private static final Range[] RULE_978_7 = new Range[] { new Range(2, 0, 9), new Range(3, 100, 499),
            new Range(4, 5000, 7999), new Range(5, 80000, 89999), new Range(6, 900000, 999999), };
    private static final Range[] RULE_978_80 = new Range[] { new Range(2, 0, 19), new Range(3, 200, 699),
            new Range(4, 7000, 8499), new Range(5, 85000, 89999), new Range(6, 900000, 998999),
            new Range(5, 99900, 99999), };
    private static final Range[] RULE_978_81 = new Range[] { new Range(2, 0, 19), new Range(3, 200, 699),
            new Range(4, 7000, 8499), new Range(5, 85000, 89999), new Range(6, 900000, 999999), };
    private static final Range[] RULE_978_82 = new Range[] { new Range(2, 0, 19), new Range(3, 200, 689),
            new Range(6, 690000, 699999), new Range(4, 7000, 8999), new Range(5, 90000, 98999),
            new Range(6, 990000, 999999), };
    private static final Range[] RULE_978_83 = new Range[] { new Range(2, 0, 19), new Range(3, 200, 599),
            new Range(5, 60000, 69999), new Range(4, 7000, 8499), new Range(5, 85000, 89999),
            new Range(6, 900000, 999999), };
    private static final Range[] RULE_978_84 = new Range[] { new Range(2, 0, 10), new Range(4, 1100, 1199),
            new Range(6, 120000, 129999), new Range(4, 1300, 1399), new Range(3, 140, 149), new Range(5, 15000, 19999),
            new Range(3, 200, 699), new Range(4, 7000, 8499), new Range(5, 85000, 89999), new Range(4, 9000, 9199),
            new Range(6, 920000, 923999), new Range(5, 92400, 92999), new Range(6, 930000, 949999),
            new Range(5, 95000, 96999), new Range(4, 9700, 9999), };
    private static final Range[] RULE_978_85 = new Range[] { new Range(2, 0, 19), new Range(3, 200, 454),
            new Range(6, 455000, 455299), new Range(5, 45530, 45599), new Range(3, 456, 528),
            new Range(5, 52900, 53199), new Range(4, 5320, 5339), new Range(3, 534, 539), new Range(5, 54000, 54029),
            new Range(5, 54030, 54039), new Range(6, 540400, 540499), new Range(5, 54050, 54089),
            new Range(6, 540900, 540999), new Range(5, 54100, 54399), new Range(4, 5440, 5479),
            new Range(5, 54800, 54999), new Range(4, 5500, 5999), new Range(5, 60000, 69999), new Range(4, 7000, 8499),
            new Range(5, 85000, 89999), new Range(6, 900000, 924999), new Range(5, 92500, 94499),
            new Range(4, 9450, 9599), new Range(2, 96, 97), new Range(5, 98000, 99999), };
    private static final Range[] RULE_978_86 = new Range[] { new Range(2, 0, 29), new Range(3, 300, 599),
            new Range(4, 6000, 7999), new Range(5, 80000, 89999), new Range(6, 900000, 999999), };
    private static final Range[] RULE_978_87 = new Range[] { new Range(2, 0, 29), new Range(3, 400, 649),
            new Range(4, 7000, 7999), new Range(5, 85000, 94999), new Range(6, 970000, 999999), };
    private static final Range[] RULE_978_88 = new Range[] { new Range(2, 0, 19), new Range(3, 200, 311),
            new Range(5, 31200, 31499), new Range(3, 315, 318), new Range(5, 31900, 32299), new Range(3, 323, 326),
            new Range(4, 3270, 3389), new Range(3, 339, 360), new Range(4, 3610, 3629), new Range(3, 363, 548),
            new Range(4, 5490, 5549), new Range(3, 555, 599), new Range(4, 6000, 8499), new Range(5, 85000, 89999),
            new Range(6, 900000, 909999), new Range(3, 910, 926), new Range(4, 9270, 9399),
            new Range(6, 940000, 947999), new Range(5, 94800, 99999), };
    private static final Range[] RULE_978_89 = new Range[] { new Range(2, 0, 24), new Range(3, 250, 549),
            new Range(4, 5500, 8499), new Range(5, 85000, 94999), new Range(6, 950000, 969999),
            new Range(5, 97000, 98999), new Range(3, 990, 999), };
    private static final Range[] RULE_978_90 = new Range[] { new Range(2, 0, 19), new Range(3, 200, 499),
            new Range(4, 5000, 6999), new Range(5, 70000, 79999), new Range(6, 800000, 849999),
            new Range(4, 8500, 8999), new Range(2, 90, 90), new Range(2, 94, 94), };
    private static final Range[] RULE_978_91 = new Range[] { new Range(1, 0, 1), new Range(2, 20, 49),
            new Range(3, 500, 649), new Range(4, 7000, 8199), new Range(5, 85000, 94999),
            new Range(6, 970000, 999999), };
    private static final Range[] RULE_978_92 = new Range[] { new Range(1, 0, 5), new Range(2, 60, 79),
            new Range(3, 800, 899), new Range(4, 9000, 9499), new Range(5, 95000, 98999),
            new Range(6, 990000, 999999), };
    private static final Range[] RULE_978_93 = new Range[] { new Range(2, 0, 9), new Range(3, 100, 499),
            new Range(4, 5000, 7999), new Range(5, 80000, 94999), new Range(6, 950000, 999999), };
    private static final Range[] RULE_978_94 = new Range[] { new Range(3, 0, 599), new Range(4, 6000, 8999),
            new Range(5, 90000, 99999), };
    private static final Range[] RULE_978_950 = new Range[] { new Range(2, 0, 49), new Range(3, 500, 899),
            new Range(4, 9000, 9899), new Range(5, 99000, 99999), };
    private static final Range[] RULE_978_951 = new Range[] { new Range(1, 0, 1), new Range(2, 20, 54),
            new Range(3, 550, 889), new Range(4, 8900, 9499), new Range(5, 95000, 99999), };
    private static final Range[] RULE_978_952 = new Range[] { new Range(2, 0, 19), new Range(3, 200, 499),
            new Range(4, 5000, 5999), new Range(2, 60, 64), new Range(5, 65000, 65999), new Range(4, 6600, 6699),
            new Range(5, 67000, 69999), new Range(4, 7000, 7999), new Range(2, 80, 94), new Range(4, 9500, 9899),
            new Range(5, 99000, 99999), };
    private static final Range[] RULE_978_953 = new Range[] { new Range(1, 0, 0), new Range(2, 10, 14),
            new Range(3, 150, 479), new Range(5, 48000, 49999), new Range(3, 500, 500), new Range(5, 50100, 50999),
            new Range(2, 51, 54), new Range(5, 55000, 59999), new Range(4, 6000, 9499), new Range(5, 95000, 99999), };
    private static final Range[] RULE_978_954 = new Range[] { new Range(2, 0, 28), new Range(4, 2900, 2999),
            new Range(3, 300, 799), new Range(4, 8000, 8999), new Range(5, 90000, 92999), new Range(4, 9300, 9999), };
    private static final Range[] RULE_978_955 = new Range[] { new Range(4, 0, 1999), new Range(2, 20, 33),
            new Range(4, 3400, 3549), new Range(5, 35500, 35999), new Range(4, 3600, 3799), new Range(5, 38000, 38999),
            new Range(4, 3900, 4099), new Range(5, 41000, 44999), new Range(4, 4500, 4999), new Range(5, 50000, 54999),
            new Range(3, 550, 710), new Range(5, 71100, 71499), new Range(4, 7150, 9499), new Range(5, 95000, 99999), };
    private static final Range[] RULE_978_956 = new Range[] { new Range(2, 0, 8), new Range(5, 9000, 9999),
            new Range(2, 10, 19), new Range(3, 200, 599), new Range(4, 6000, 6999), new Range(4, 7000, 9999), };
    private static final Range[] RULE_978_957 = new Range[] { new Range(2, 0, 2), new Range(4, 300, 499),
            new Range(2, 5, 19), new Range(4, 2000, 2099), new Range(2, 21, 27), new Range(5, 28000, 30999),
            new Range(2, 31, 43), new Range(3, 440, 819), new Range(4, 8200, 9699), new Range(5, 97000, 99999), };
    private static final Range[] RULE_978_958 = new Range[] { new Range(2, 0, 49), new Range(3, 500, 509),
            new Range(4, 5100, 5199), new Range(5, 52000, 53999), new Range(4, 5400, 5599), new Range(5, 56000, 59999),
            new Range(3, 600, 799), new Range(4, 8000, 9499), new Range(5, 95000, 99999), };
    private static final Range[] RULE_978_959 = new Range[] { new Range(2, 0, 19), new Range(3, 200, 699),
            new Range(4, 7000, 8499), new Range(5, 85000, 99999), };
    private static final Range[] RULE_978_960 = new Range[] { new Range(2, 0, 19), new Range(3, 200, 659),
            new Range(4, 6600, 6899), new Range(3, 690, 699), new Range(4, 7000, 8499), new Range(5, 85000, 92999),
            new Range(2, 93, 93), new Range(4, 9400, 9799), new Range(5, 98000, 99999), };
    private static final Range[] RULE_978_961 = new Range[] { new Range(2, 0, 19), new Range(3, 200, 599),
            new Range(4, 6000, 8999), new Range(5, 90000, 95999), };
    private static final Range[] RULE_978_962 = new Range[] { new Range(2, 0, 19), new Range(3, 200, 699),
            new Range(4, 7000, 8499), new Range(5, 85000, 86999), new Range(4, 8700, 8999), new Range(3, 900, 999), };
    private static final Range[] RULE_978_963 = new Range[] { new Range(2, 0, 19), new Range(3, 200, 699),
            new Range(4, 7000, 8499), new Range(5, 85000, 89999), new Range(4, 9000, 9999), };
    private static final Range[] RULE_978_964 = new Range[] { new Range(2, 0, 14), new Range(3, 150, 249),
            new Range(4, 2500, 2999), new Range(3, 300, 549), new Range(4, 5500, 8999), new Range(5, 90000, 96999),
            new Range(3, 970, 989), new Range(4, 9900, 9999), };
    private static final Range[] RULE_978_965 = new Range[] { new Range(2, 0, 19), new Range(3, 200, 599),
            new Range(4, 7000, 7999), new Range(5, 90000, 99999), };
    private static final Range[] RULE_978_966 = new Range[] { new Range(2, 0, 12), new Range(3, 130, 139),
            new Range(2, 14, 14), new Range(4, 1500, 1699), new Range(3, 170, 199), new Range(4, 2000, 2789),
            new Range(3, 279, 289), new Range(4, 2900, 2999), new Range(3, 300, 699), new Range(4, 7000, 8999),
            new Range(5, 90000, 90999), new Range(3, 910, 949), new Range(5, 95000, 97999), new Range(3, 980, 999), };
    private static final Range[] RULE_978_967 = new Range[] { new Range(4, 0, 999), new Range(5, 10000, 19999),
            new Range(4, 2000, 2499), new Range(3, 250, 254), new Range(5, 25500, 26999), new Range(4, 2700, 2799),
            new Range(4, 2800, 2999), new Range(3, 300, 499), new Range(4, 5000, 5999), new Range(2, 60, 89),
            new Range(3, 900, 989), new Range(4, 9900, 9989), new Range(5, 99900, 99999), };
    private static final Range[] RULE_978_968 = new Range[] { new Range(2, 1, 39), new Range(3, 400, 499),
            new Range(4, 5000, 7999), new Range(3, 800, 899), new Range(4, 9000, 9999), };
    private static final Range[] RULE_978_969 = new Range[] { new Range(1, 0, 1), new Range(2, 20, 20),
            new Range(3, 210, 219), new Range(4, 2200, 2299), new Range(5, 23000, 23999), new Range(2, 24, 39),
            new Range(3, 400, 749), new Range(4, 7500, 9999), };
    private static final Range[] RULE_978_970 = new Range[] { new Range(2, 1, 59), new Range(3, 600, 899),
            new Range(4, 9000, 9099), new Range(5, 91000, 96999), new Range(4, 9700, 9999), };
    private static final Range[] RULE_978_971 = new Range[] { new Range(3, 0, 15), new Range(4, 160, 199),
            new Range(2, 2, 2), new Range(4, 300, 599), new Range(2, 6, 49), new Range(3, 500, 849),
            new Range(4, 8500, 9099), new Range(5, 91000, 95999), new Range(4, 9600, 9699), new Range(2, 97, 98),
            new Range(4, 9900, 9999), };
    private static final Range[] RULE_978_972 = new Range[] { new Range(1, 0, 1), new Range(2, 20, 54),
            new Range(3, 550, 799), new Range(4, 8000, 9499), new Range(5, 95000, 99999), };
    private static final Range[] RULE_978_973 = new Range[] { new Range(1, 0, 0), new Range(3, 100, 169),
            new Range(4, 1700, 1999), new Range(2, 20, 54), new Range(3, 550, 759), new Range(4, 7600, 8499),
            new Range(5, 85000, 88999), new Range(4, 8900, 9499), new Range(5, 95000, 99999), };
    private static final Range[] RULE_978_974 = new Range[] { new Range(2, 0, 19), new Range(3, 200, 699),
            new Range(4, 7000, 8499), new Range(5, 85000, 89999), new Range(5, 90000, 94999),
            new Range(4, 9500, 9999), };
    private static final Range[] RULE_978_975 = new Range[] { new Range(5, 0, 1999), new Range(2, 2, 23),
            new Range(4, 2400, 2499), new Range(3, 250, 599), new Range(4, 6000, 9199), new Range(5, 92000, 98999),
            new Range(3, 990, 999), };
    private static final Range[] RULE_978_976 = new Range[] { new Range(1, 0, 3), new Range(2, 40, 59),
            new Range(3, 600, 799), new Range(4, 8000, 9499), new Range(5, 95000, 99999), };
    private static final Range[] RULE_978_977 = new Range[] { new Range(2, 0, 19), new Range(3, 200, 499),
            new Range(4, 5000, 6999), new Range(3, 700, 849), new Range(5, 85000, 89999), new Range(2, 90, 98),
            new Range(3, 990, 999), };
    private static final Range[] RULE_978_978 = new Range[] { new Range(3, 0, 199), new Range(4, 2000, 2999),
            new Range(5, 30000, 78999), new Range(3, 790, 799), new Range(4, 8000, 8999), new Range(3, 900, 999), };
    private static final Range[] RULE_978_979 = new Range[] { new Range(3, 0, 99), new Range(4, 1000, 1499),
            new Range(5, 15000, 19999), new Range(2, 20, 29), new Range(4, 3000, 3999), new Range(3, 400, 799),
            new Range(4, 8000, 9499), new Range(5, 95000, 99999), };
    private static final Range[] RULE_978_980 = new Range[] { new Range(2, 0, 19), new Range(3, 200, 599),
            new Range(4, 6000, 9999), };
    private static final Range[] RULE_978_981 = new Range[] { new Range(2, 0, 16), new Range(5, 17000, 17999),
            new Range(2, 18, 19), new Range(3, 200, 299), new Range(4, 3000, 3099), new Range(3, 310, 399),
            new Range(4, 4000, 9999), };
    private static final Range[] RULE_978_982 = new Range[] { new Range(2, 0, 9), new Range(3, 100, 699),
            new Range(2, 70, 89), new Range(4, 9000, 9799), new Range(5, 98000, 99999), };
    private static final Range[] RULE_978_983 = new Range[] { new Range(2, 0, 1), new Range(3, 20, 199),
            new Range(4, 2000, 3999), new Range(5, 40000, 44999), new Range(2, 45, 49), new Range(2, 50, 79),
            new Range(3, 800, 899), new Range(4, 9000, 9899), new Range(5, 99000, 99999), };
    private static final Range[] RULE_978_984 = new Range[] { new Range(2, 0, 39), new Range(3, 400, 799),
            new Range(4, 8000, 8999), new Range(5, 90000, 99999), };
    private static final Range[] RULE_978_985 = new Range[] { new Range(2, 0, 39), new Range(3, 400, 599),
            new Range(4, 6000, 8799), new Range(3, 880, 899), new Range(5, 90000, 99999), };
    private static final Range[] RULE_978_986 = new Range[] { new Range(2, 0, 5), new Range(5, 6000, 6999),
            new Range(4, 700, 799), new Range(2, 8, 11), new Range(3, 120, 539), new Range(4, 5400, 7999),
            new Range(5, 80000, 99999), };
    private static final Range[] RULE_978_987 = new Range[] { new Range(2, 0, 9), new Range(4, 1000, 1999),
            new Range(5, 20000, 29999), new Range(2, 30, 35), new Range(4, 3600, 4199), new Range(2, 42, 43),
            new Range(4, 4400, 4499), new Range(5, 45000, 48999), new Range(4, 4900, 4999), new Range(3, 500, 829),
            new Range(4, 8300, 8499), new Range(2, 85, 88), new Range(4, 8900, 9499), new Range(5, 95000, 99999), };
    private static final Range[] RULE_978_988 = new Range[] { new Range(2, 0, 11), new Range(5, 12000, 19999),
            new Range(3, 200, 739), new Range(5, 74000, 76999), new Range(5, 77000, 79999), new Range(4, 8000, 9699),
            new Range(5, 97000, 99999), };
    private static final Range[] RULE_978_989 = new Range[] { new Range(1, 0, 1), new Range(2, 20, 34),
            new Range(5, 35000, 36999), new Range(2, 37, 52), new Range(5, 53000, 54999), new Range(3, 550, 799),
            new Range(4, 8000, 9499), new Range(5, 95000, 99999), };
    private static final Range[] RULE_978_9911 = new Range[] { new Range(2, 20, 24), new Range(3, 550, 749), };
    private static final Range[] RULE_978_9912 = new Range[] { new Range(2, 40, 44), new Range(3, 750, 799),
            new Range(4, 9850, 9999), };
    private static final Range[] RULE_978_9913 = new Range[] { new Range(2, 0, 4), new Range(3, 600, 649),
            new Range(4, 9800, 9999), };
    private static final Range[] RULE_978_9914 = new Range[] { new Range(2, 40, 49), new Range(3, 700, 749),
            new Range(4, 9600, 9999), };
    private static final Range[] RULE_978_9915 = new Range[] { new Range(2, 40, 59), new Range(3, 650, 799),
            new Range(4, 9300, 9999), };
    private static final Range[] RULE_978_9916 = new Range[] { new Range(1, 0, 0), new Range(2, 10, 39),
            new Range(1, 4, 5), new Range(3, 600, 749), new Range(4, 9500, 9999), };
    private static final Range[] RULE_978_9917 = new Range[] { new Range(1, 0, 0), new Range(2, 30, 34),
            new Range(3, 600, 699), new Range(4, 9800, 9999), };
    private static final Range[] RULE_978_9918 = new Range[] { new Range(1, 0, 0), new Range(2, 20, 29),
            new Range(3, 600, 799), new Range(4, 9500, 9999), };
    private static final Range[] RULE_978_9919 = new Range[] { new Range(2, 20, 27), new Range(3, 500, 599),
            new Range(4, 9500, 9999), };
    private static final Range[] RULE_978_9920 = new Range[] { new Range(2, 30, 41), new Range(3, 500, 799),
            new Range(4, 8750, 9999), };
    private static final Range[] RULE_978_9921 = new Range[] { new Range(1, 0, 0), new Range(2, 30, 39),
            new Range(3, 700, 899), new Range(4, 9700, 9999), };
    private static final Range[] RULE_978_9922 = new Range[] { new Range(2, 20, 29), new Range(3, 600, 799),
            new Range(4, 9000, 9999), };
    private static final Range[] RULE_978_9923 = new Range[] { new Range(1, 0, 0), new Range(2, 10, 59),
            new Range(3, 700, 899), new Range(4, 9700, 9999), };
    private static final Range[] RULE_978_9924 = new Range[] { new Range(2, 30, 39), new Range(3, 500, 649),
            new Range(4, 9000, 9999), };
    private static final Range[] RULE_978_9925 = new Range[] { new Range(1, 0, 2), new Range(2, 30, 54),
            new Range(3, 550, 734), new Range(4, 7350, 9999), };
    private static final Range[] RULE_978_9926 = new Range[] { new Range(1, 0, 1), new Range(2, 20, 39),
            new Range(3, 400, 799), new Range(4, 8000, 9999), };
    private static final Range[] RULE_978_9927 = new Range[] { new Range(2, 0, 9), new Range(3, 100, 399),
            new Range(4, 4000, 4999), };
    private static final Range[] RULE_978_9928 = new Range[] { new Range(2, 0, 9), new Range(3, 100, 399),
            new Range(4, 4000, 4999), };
    private static final Range[] RULE_978_9929 = new Range[] { new Range(1, 0, 3), new Range(2, 40, 54),
            new Range(3, 550, 799), new Range(4, 8000, 9999), };
    private static final Range[] RULE_978_9930 = new Range[] { new Range(2, 0, 49), new Range(3, 500, 939),
            new Range(4, 9400, 9999), };
    private static final Range[] RULE_978_9931 = new Range[] { new Range(2, 0, 23), new Range(3, 240, 249),
            new Range(4, 2500, 2599), new Range(3, 260, 899), new Range(4, 9000, 9999), };
    private static final Range[] RULE_978_9932 = new Range[] { new Range(2, 0, 39), new Range(3, 400, 849),
            new Range(4, 8500, 9999), };
    private static final Range[] RULE_978_9933 = new Range[] { new Range(1, 0, 0), new Range(2, 10, 39),
            new Range(3, 400, 899), new Range(4, 9000, 9999), };
    private static final Range[] RULE_978_9934 = new Range[] { new Range(1, 0, 0), new Range(2, 10, 49),
            new Range(3, 500, 799), new Range(4, 8000, 9999), };
    private static final Range[] RULE_978_9935 = new Range[] { new Range(1, 0, 0), new Range(2, 10, 39),
            new Range(3, 400, 899), new Range(4, 9000, 9999), };
    private static final Range[] RULE_978_9936 = new Range[] { new Range(1, 0, 1), new Range(2, 20, 39),
            new Range(3, 400, 799), new Range(4, 8000, 9999), };
    private static final Range[] RULE_978_9937 = new Range[] { new Range(1, 0, 2), new Range(2, 30, 49),
            new Range(3, 500, 799), new Range(4, 8000, 9999), };
    private static final Range[] RULE_978_9938 = new Range[] { new Range(2, 0, 79), new Range(3, 800, 949),
            new Range(4, 9500, 9999), };
    private static final Range[] RULE_978_9939 = new Range[] { new Range(1, 0, 4), new Range(2, 50, 79),
            new Range(3, 800, 899), new Range(4, 9000, 9599), new Range(3, 960, 979), new Range(2, 98, 99), };
    private static final Range[] RULE_978_9940 = new Range[] { new Range(1, 0, 1), new Range(2, 20, 49),
            new Range(3, 500, 839), new Range(2, 84, 86), new Range(4, 8700, 9999), };
    private static final Range[] RULE_978_9941 = new Range[] { new Range(1, 0, 0), new Range(2, 10, 39),
            new Range(3, 400, 799), new Range(1, 8, 8), new Range(4, 9000, 9999), };
    private static final Range[] RULE_978_9942 = new Range[] { new Range(2, 0, 59), new Range(3, 600, 699),
            new Range(4, 7000, 7499), new Range(3, 750, 849), new Range(4, 8500, 8999), new Range(3, 900, 984),
            new Range(4, 9850, 9999), };
    private static final Range[] RULE_978_9943 = new Range[] { new Range(2, 0, 29), new Range(3, 300, 399),
            new Range(4, 4000, 9749), new Range(3, 975, 999), };
    private static final Range[] RULE_978_9944 = new Range[] { new Range(4, 0, 999), new Range(3, 100, 499),
            new Range(4, 5000, 5999), new Range(2, 60, 69), new Range(3, 700, 799), new Range(2, 80, 89),
            new Range(3, 900, 999), };
    private static final Range[] RULE_978_9945 = new Range[] { new Range(2, 0, 0), new Range(3, 10, 79),
            new Range(2, 8, 39), new Range(3, 400, 569), new Range(2, 57, 57), new Range(3, 580, 799),
            new Range(2, 80, 80), new Range(3, 810, 849), new Range(4, 8500, 9999), };
    private static final Range[] RULE_978_9946 = new Range[] { new Range(1, 0, 1), new Range(2, 20, 39),
            new Range(3, 400, 899), new Range(4, 9000, 9999), };
    private static final Range[] RULE_978_9947 = new Range[] { new Range(1, 0, 1), new Range(2, 20, 79),
            new Range(3, 800, 999), };
    private static final Range[] RULE_978_9948 = new Range[] { new Range(2, 0, 39), new Range(3, 400, 849),
            new Range(4, 8500, 9999), };
    private static final Range[] RULE_978_9949 = new Range[] { new Range(2, 0, 8), new Range(3, 90, 99),
            new Range(2, 10, 39), new Range(3, 400, 699), new Range(2, 70, 71), new Range(4, 7200, 7499),
            new Range(2, 75, 89), new Range(4, 9000, 9999), };
    private static final Range[] RULE_978_9950 = new Range[] { new Range(2, 0, 29), new Range(3, 300, 849),
            new Range(4, 8500, 9999), };
    private static final Range[] RULE_978_9951 = new Range[] { new Range(2, 0, 39), new Range(3, 400, 849),
            new Range(4, 8500, 9999), };
    private static final Range[] RULE_978_9952 = new Range[] { new Range(1, 0, 1), new Range(2, 20, 39),
            new Range(3, 400, 799), new Range(4, 8000, 9999), };
    private static final Range[] RULE_978_9953 = new Range[] { new Range(1, 0, 0), new Range(2, 10, 39),
            new Range(3, 400, 599), new Range(2, 60, 89), new Range(4, 9000, 9299), new Range(2, 93, 96),
            new Range(3, 970, 999), };
    private static final Range[] RULE_978_9954 = new Range[] { new Range(1, 0, 1), new Range(2, 20, 39),
            new Range(3, 400, 799), new Range(4, 8000, 9899), new Range(2, 99, 99), };
    private static final Range[] RULE_978_9955 = new Range[] { new Range(2, 0, 39), new Range(3, 400, 929),
            new Range(4, 9300, 9999), };
    private static final Range[] RULE_978_9956 = new Range[] { new Range(1, 0, 0), new Range(2, 10, 39),
            new Range(3, 400, 899), new Range(4, 9000, 9999), };
    private static final Range[] RULE_978_9957 = new Range[] { new Range(2, 0, 39), new Range(3, 400, 649),
            new Range(2, 65, 67), new Range(3, 680, 699), new Range(2, 70, 84), new Range(4, 8500, 8799),
            new Range(2, 88, 99), };
    private static final Range[] RULE_978_9958 = new Range[] { new Range(2, 0, 1), new Range(3, 20, 29),
            new Range(4, 300, 399), new Range(3, 40, 89), new Range(4, 900, 999), new Range(2, 10, 18),
            new Range(4, 1900, 1999), new Range(2, 20, 49), new Range(3, 500, 899), new Range(4, 9000, 9999), };
    private static final Range[] RULE_978_9959 = new Range[] { new Range(1, 0, 1), new Range(2, 20, 79),
            new Range(3, 800, 949), new Range(4, 9500, 9699), new Range(3, 970, 979), new Range(2, 98, 99), };
    private static final Range[] RULE_978_9960 = new Range[] { new Range(2, 0, 59), new Range(3, 600, 899),
            new Range(4, 9000, 9999), };
    private static final Range[] RULE_978_9961 = new Range[] { new Range(1, 0, 2), new Range(2, 30, 69),
            new Range(3, 700, 949), new Range(4, 9500, 9999), };
    private static final Range[] RULE_978_9962 = new Range[] { new Range(2, 0, 54), new Range(4, 5500, 5599),
            new Range(2, 56, 59), new Range(3, 600, 849), new Range(4, 8500, 9999), };
    private static final Range[] RULE_978_9963 = new Range[] { new Range(1, 0, 1), new Range(4, 2000, 2499),
            new Range(3, 250, 279), new Range(4, 2800, 2999), new Range(2, 30, 54), new Range(3, 550, 734),
            new Range(4, 7350, 7499), new Range(4, 7500, 9999), };
    private static final Range[] RULE_978_9964 = new Range[] { new Range(1, 0, 6), new Range(2, 70, 94),
            new Range(3, 950, 999), };
    private static final Range[] RULE_978_9965 = new Range[] { new Range(2, 0, 39), new Range(3, 400, 899),
            new Range(4, 9000, 9999), };
    private static final Range[] RULE_978_9966 = new Range[] { new Range(3, 0, 139), new Range(2, 14, 14),
            new Range(4, 1500, 1999), new Range(2, 20, 69), new Range(4, 7000, 7499), new Range(3, 750, 820),
            new Range(4, 8210, 8249), new Range(3, 825, 825), new Range(4, 8260, 8289), new Range(3, 829, 959),
            new Range(4, 9600, 9999), };
    private static final Range[] RULE_978_9967 = new Range[] { new Range(2, 0, 39), new Range(3, 400, 899),
            new Range(4, 9000, 9999), };
    private static final Range[] RULE_978_9968 = new Range[] { new Range(2, 0, 49), new Range(3, 500, 939),
            new Range(4, 9400, 9999), };
    private static final Range[] RULE_978_9970 = new Range[] { new Range(2, 0, 39), new Range(3, 400, 899),
            new Range(4, 9000, 9999), };
    private static final Range[] RULE_978_9971 = new Range[] { new Range(1, 0, 5), new Range(2, 60, 89),
            new Range(3, 900, 989), new Range(4, 9900, 9999), };
    private static final Range[] RULE_978_9972 = new Range[] { new Range(2, 0, 9), new Range(1, 1, 1),
            new Range(3, 200, 249), new Range(4, 2500, 2999), new Range(2, 30, 59), new Range(3, 600, 899),
            new Range(4, 9000, 9999), };
    private static final Range[] RULE_978_9973 = new Range[] { new Range(2, 0, 5), new Range(3, 60, 89),
            new Range(4, 900, 999), new Range(2, 10, 69), new Range(3, 700, 969), new Range(4, 9700, 9999), };
    private static final Range[] RULE_978_9974 = new Range[] { new Range(1, 0, 2), new Range(2, 30, 54),
            new Range(3, 550, 749), new Range(4, 7500, 8799), new Range(3, 880, 909), new Range(2, 91, 94),
            new Range(2, 95, 99), };
    private static final Range[] RULE_978_9975 = new Range[] { new Range(1, 0, 0), new Range(3, 100, 299),
            new Range(4, 3000, 3999), new Range(4, 4000, 4499), new Range(2, 45, 89), new Range(3, 900, 949),
            new Range(4, 9500, 9999), };
    private static final Range[] RULE_978_9976 = new Range[] { new Range(1, 0, 4), new Range(4, 5000, 5799),
            new Range(3, 580, 589), new Range(2, 59, 89), new Range(3, 900, 989), new Range(4, 9900, 9999), };
    private static final Range[] RULE_978_9977 = new Range[] { new Range(2, 0, 89), new Range(3, 900, 989),
            new Range(4, 9900, 9999), };
    private static final Range[] RULE_978_9978 = new Range[] { new Range(2, 0, 29), new Range(3, 300, 399),
            new Range(2, 40, 94), new Range(3, 950, 989), new Range(4, 9900, 9999), };
    private static final Range[] RULE_978_9979 = new Range[] { new Range(1, 0, 4), new Range(2, 50, 64),
            new Range(3, 650, 659), new Range(2, 66, 75), new Range(3, 760, 899), new Range(4, 9000, 9999), };
    private static final Range[] RULE_978_9980 = new Range[] { new Range(1, 0, 3), new Range(2, 40, 89),
            new Range(3, 900, 989), new Range(4, 9900, 9999), };
    private static final Range[] RULE_978_9981 = new Range[] { new Range(2, 0, 9), new Range(3, 100, 159),
            new Range(4, 1600, 1999), new Range(2, 20, 79), new Range(3, 800, 949), new Range(4, 9500, 9999), };
    private static final Range[] RULE_978_9982 = new Range[] { new Range(2, 0, 79), new Range(3, 800, 989),
            new Range(4, 9900, 9999), };
    private static final Range[] RULE_978_9983 = new Range[] { new Range(2, 80, 94), new Range(3, 950, 989),
            new Range(4, 9900, 9999), };
    private static final Range[] RULE_978_9984 = new Range[] { new Range(2, 0, 49), new Range(3, 500, 899),
            new Range(4, 9000, 9999), };
    private static final Range[] RULE_978_9985 = new Range[] { new Range(1, 0, 4), new Range(2, 50, 79),
            new Range(3, 800, 899), new Range(4, 9000, 9999), };
    private static final Range[] RULE_978_9986 = new Range[] { new Range(2, 0, 39), new Range(3, 400, 899),
            new Range(4, 9000, 9399), new Range(3, 940, 969), new Range(2, 97, 99), };
    private static final Range[] RULE_978_9987 = new Range[] { new Range(2, 0, 39), new Range(3, 400, 879),
            new Range(4, 8800, 9999), };
    private static final Range[] RULE_978_9988 = new Range[] { new Range(1, 0, 3), new Range(2, 40, 54),
            new Range(3, 550, 749), new Range(4, 7500, 9999), };
    private static final Range[] RULE_978_9989 = new Range[] { new Range(1, 0, 0), new Range(3, 100, 199),
            new Range(4, 2000, 2999), new Range(2, 30, 59), new Range(3, 600, 949), new Range(4, 9500, 9999), };
    private static final Range[] RULE_978_99901 = new Range[] { new Range(2, 0, 49), new Range(3, 500, 799),
            new Range(2, 80, 99), };
    private static final Range[] RULE_978_99902 = new Range[] {};
    private static final Range[] RULE_978_99903 = new Range[] { new Range(1, 0, 1), new Range(2, 20, 89),
            new Range(3, 900, 999), };
    private static final Range[] RULE_978_99904 = new Range[] { new Range(1, 0, 5), new Range(2, 60, 89),
            new Range(3, 900, 999), };
    private static final Range[] RULE_978_99905 = new Range[] { new Range(1, 0, 3), new Range(2, 40, 79),
            new Range(3, 800, 999), };
    private static final Range[] RULE_978_99906 = new Range[] { new Range(1, 0, 2), new Range(2, 30, 59),
            new Range(3, 600, 699), new Range(2, 70, 89), new Range(2, 90, 94), new Range(3, 950, 999), };
    private static final Range[] RULE_978_99908 = new Range[] { new Range(1, 0, 0), new Range(2, 10, 89),
            new Range(3, 900, 999), };
    private static final Range[] RULE_978_99909 = new Range[] { new Range(1, 0, 3), new Range(2, 40, 94),
            new Range(3, 950, 999), };
    private static final Range[] RULE_978_99910 = new Range[] { new Range(1, 0, 2), new Range(2, 30, 89),
            new Range(3, 900, 999), };
    private static final Range[] RULE_978_99911 = new Range[] { new Range(2, 0, 59), new Range(3, 600, 999), };
    private static final Range[] RULE_978_99912 = new Range[] { new Range(1, 0, 3), new Range(3, 400, 599),
            new Range(2, 60, 89), new Range(3, 900, 999), };
    private static final Range[] RULE_978_99913 = new Range[] { new Range(1, 0, 2), new Range(2, 30, 35),
            new Range(3, 600, 604), };
    private static final Range[] RULE_978_99914 = new Range[] { new Range(1, 0, 4), new Range(2, 50, 69),
            new Range(1, 7, 7), new Range(2, 80, 89), new Range(3, 900, 999), };
    private static final Range[] RULE_978_99915 = new Range[] { new Range(1, 0, 4), new Range(2, 50, 79),
            new Range(3, 800, 999), };
    private static final Range[] RULE_978_99916 = new Range[] { new Range(1, 0, 2), new Range(2, 30, 69),
            new Range(3, 700, 999), };
    private static final Range[] RULE_978_99917 = new Range[] { new Range(1, 0, 2), new Range(2, 30, 88),
            new Range(3, 890, 999), };
    private static final Range[] RULE_978_99918 = new Range[] { new Range(1, 0, 3), new Range(2, 40, 79),
            new Range(3, 800, 999), };
    private static final Range[] RULE_978_99919 = new Range[] { new Range(1, 0, 2), new Range(3, 300, 399),
            new Range(2, 40, 79), new Range(3, 800, 999), };
    private static final Range[] RULE_978_99920 = new Range[] { new Range(1, 0, 4), new Range(2, 50, 89),
            new Range(3, 900, 999), };
    private static final Range[] RULE_978_99921 = new Range[] { new Range(1, 0, 1), new Range(2, 20, 69),
            new Range(3, 700, 799), new Range(1, 8, 8), new Range(2, 90, 99), };
    private static final Range[] RULE_978_99922 = new Range[] { new Range(1, 0, 3), new Range(2, 40, 69),
            new Range(3, 700, 999), };
    private static final Range[] RULE_978_99923 = new Range[] { new Range(1, 0, 1), new Range(2, 20, 79),
            new Range(3, 800, 999), };
    private static final Range[] RULE_978_99924 = new Range[] { new Range(1, 0, 1), new Range(2, 20, 79),
            new Range(3, 800, 999), };
    private static final Range[] RULE_978_99925 = new Range[] { new Range(1, 0, 0), new Range(2, 10, 19),
            new Range(3, 200, 299), new Range(1, 3, 3), new Range(2, 40, 79), new Range(3, 800, 999), };
    private static final Range[] RULE_978_99926 = new Range[] { new Range(1, 0, 0), new Range(2, 10, 59),
            new Range(3, 600, 869), new Range(2, 87, 89), new Range(2, 90, 99), };
    private static final Range[] RULE_978_99927 = new Range[] { new Range(1, 0, 2), new Range(2, 30, 59),
            new Range(3, 600, 999), };
    private static final Range[] RULE_978_99928 = new Range[] { new Range(1, 0, 0), new Range(2, 10, 79),
            new Range(3, 800, 999), };
    private static final Range[] RULE_978_99929 = new Range[] { new Range(1, 0, 4), new Range(2, 50, 79),
            new Range(3, 800, 999), };
    private static final Range[] RULE_978_99930 = new Range[] { new Range(1, 0, 4), new Range(2, 50, 79),
            new Range(3, 800, 999), };
    private static final Range[] RULE_978_99931 = new Range[] { new Range(1, 0, 4), new Range(2, 50, 79),
            new Range(3, 800, 999), };
    private static final Range[] RULE_978_99932 = new Range[] { new Range(1, 0, 0), new Range(2, 10, 59),
            new Range(3, 600, 699), new Range(1, 7, 7), new Range(2, 80, 99), };
    private static final Range[] RULE_978_99933 = new Range[] { new Range(1, 0, 2), new Range(2, 30, 59),
            new Range(3, 600, 999), };
    private static final Range[] RULE_978_99934 = new Range[] { new Range(1, 0, 1), new Range(2, 20, 79),
            new Range(3, 800, 999), };
    private static final Range[] RULE_978_99935 = new Range[] { new Range(1, 0, 2), new Range(2, 30, 59),
            new Range(3, 600, 699), new Range(1, 7, 8), new Range(2, 90, 99), };
    private static final Range[] RULE_978_99936 = new Range[] { new Range(1, 0, 0), new Range(2, 10, 59),
            new Range(3, 600, 999), };
    private static final Range[] RULE_978_99937 = new Range[] { new Range(1, 0, 1), new Range(2, 20, 59),
            new Range(3, 600, 999), };
    private static final Range[] RULE_978_99938 = new Range[] { new Range(1, 0, 1), new Range(2, 20, 59),
            new Range(3, 600, 899), new Range(2, 90, 99), };
    private static final Range[] RULE_978_99939 = new Range[] { new Range(1, 0, 2), new Range(2, 30, 59),
            new Range(2, 60, 89), new Range(3, 900, 999), };
    private static final Range[] RULE_978_99940 = new Range[] { new Range(1, 0, 0), new Range(2, 10, 69),
            new Range(3, 700, 999), };
    private static final Range[] RULE_978_99941 = new Range[] { new Range(1, 0, 2), new Range(2, 30, 79),
            new Range(3, 800, 999), };
    private static final Range[] RULE_978_99942 = new Range[] { new Range(1, 0, 4), new Range(2, 50, 79),
            new Range(3, 800, 999), };
    private static final Range[] RULE_978_99943 = new Range[] { new Range(1, 0, 2), new Range(2, 30, 59),
            new Range(3, 600, 999), };
    private static final Range[] RULE_978_99944 = new Range[] { new Range(1, 0, 4), new Range(2, 50, 79),
            new Range(3, 800, 999), };
    private static final Range[] RULE_978_99945 = new Range[] { new Range(1, 0, 4), new Range(2, 50, 89),
            new Range(3, 900, 999), };
    private static final Range[] RULE_978_99946 = new Range[] { new Range(1, 0, 2), new Range(2, 30, 59),
            new Range(3, 600, 999), };
    private static final Range[] RULE_978_99947 = new Range[] { new Range(1, 0, 2), new Range(2, 30, 69),
            new Range(3, 700, 999), };
    private static final Range[] RULE_978_99948 = new Range[] { new Range(1, 0, 4), new Range(2, 50, 79),
            new Range(3, 800, 999), };
    private static final Range[] RULE_978_99949 = new Range[] { new Range(1, 0, 1), new Range(2, 20, 79),
            new Range(1, 8, 8), new Range(3, 900, 999), };
    private static final Range[] RULE_978_99950 = new Range[] { new Range(1, 0, 4), new Range(2, 50, 79),
            new Range(3, 800, 999), };
    private static final Range[] RULE_978_99951 = new Range[] {};
    private static final Range[] RULE_978_99952 = new Range[] { new Range(1, 0, 4), new Range(2, 50, 79),
            new Range(3, 800, 999), };
    private static final Range[] RULE_978_99953 = new Range[] { new Range(1, 0, 2), new Range(2, 30, 79),
            new Range(3, 800, 939), new Range(2, 94, 99), };
    private static final Range[] RULE_978_99954 = new Range[] { new Range(1, 0, 2), new Range(2, 30, 69),
            new Range(3, 700, 879), new Range(2, 88, 99), };
    private static final Range[] RULE_978_99955 = new Range[] { new Range(1, 0, 1), new Range(2, 20, 59),
            new Range(3, 600, 799), new Range(2, 80, 99), };
    private static final Range[] RULE_978_99956 = new Range[] { new Range(2, 0, 59), new Range(3, 600, 859),
            new Range(2, 86, 99), };
    private static final Range[] RULE_978_99957 = new Range[] { new Range(1, 0, 1), new Range(2, 20, 79),
            new Range(3, 800, 949), new Range(2, 95, 99), };
    private static final Range[] RULE_978_99958 = new Range[] { new Range(1, 0, 4), new Range(2, 50, 93),
            new Range(3, 940, 949), new Range(3, 950, 999), };
    private static final Range[] RULE_978_99959 = new Range[] { new Range(1, 0, 2), new Range(2, 30, 59),
            new Range(3, 600, 999), };
    private static final Range[] RULE_978_99960 = new Range[] { new Range(3, 70, 99), new Range(2, 10, 94),
            new Range(3, 950, 999), };
    private static final Range[] RULE_978_99961 = new Range[] { new Range(1, 0, 2), new Range(3, 300, 369),
            new Range(2, 37, 89), new Range(3, 900, 999), };
    private static final Range[] RULE_978_99962 = new Range[] { new Range(1, 0, 4), new Range(2, 50, 79),
            new Range(3, 800, 999), };
    private static final Range[] RULE_978_99963 = new Range[] { new Range(2, 0, 49), new Range(3, 500, 919),
            new Range(2, 92, 99), };
    private static final Range[] RULE_978_99964 = new Range[] { new Range(1, 0, 1), new Range(2, 20, 79),
            new Range(3, 800, 999), };
    private static final Range[] RULE_978_99965 = new Range[] { new Range(1, 0, 2), new Range(3, 300, 359),
            new Range(2, 36, 62), new Range(3, 630, 999), };
    private static final Range[] RULE_978_99966 = new Range[] { new Range(1, 0, 2), new Range(2, 30, 69),
            new Range(3, 700, 799), new Range(2, 80, 96), new Range(3, 970, 999), };
    private static final Range[] RULE_978_99967 = new Range[] { new Range(1, 0, 0), new Range(2, 10, 59),
            new Range(3, 600, 999), };
    private static final Range[] RULE_978_99968 = new Range[] { new Range(1, 0, 3), new Range(3, 400, 599),
            new Range(2, 60, 89), new Range(3, 900, 999), };
    private static final Range[] RULE_978_99969 = new Range[] { new Range(1, 0, 4), new Range(2, 50, 79),
            new Range(3, 800, 949), new Range(2, 95, 99), };
    private static final Range[] RULE_978_99970 = new Range[] { new Range(1, 0, 4), new Range(2, 50, 89),
            new Range(3, 900, 999), };
    private static final Range[] RULE_978_99971 = new Range[] { new Range(1, 0, 3), new Range(2, 40, 84),
            new Range(3, 850, 999), };
    private static final Range[] RULE_978_99972 = new Range[] { new Range(1, 0, 4), new Range(2, 50, 89),
            new Range(3, 900, 999), };
    private static final Range[] RULE_978_99973 = new Range[] { new Range(1, 0, 3), new Range(2, 40, 79),
            new Range(3, 800, 999), };
    private static final Range[] RULE_978_99974 = new Range[] { new Range(1, 0, 0), new Range(2, 10, 25),
            new Range(3, 260, 399), new Range(2, 40, 63), new Range(3, 640, 649), new Range(2, 65, 79),
            new Range(3, 800, 999), };
    private static final Range[] RULE_978_99975 = new Range[] { new Range(1, 0, 2), new Range(3, 300, 399),
            new Range(2, 40, 79), new Range(3, 800, 999), };
    private static final Range[] RULE_978_99976 = new Range[] { new Range(1, 0, 0), new Range(2, 10, 15),
            new Range(3, 160, 199), new Range(2, 20, 59), new Range(3, 600, 799), new Range(2, 85, 89),
            new Range(3, 900, 999), };
    private static final Range[] RULE_978_99977 = new Range[] { new Range(1, 0, 1), new Range(2, 40, 69),
            new Range(3, 700, 799), new Range(3, 995, 999), };
    private static final Range[] RULE_978_99978 = new Range[] { new Range(1, 0, 4), new Range(2, 50, 69),
            new Range(3, 700, 999), };
    private static final Range[] RULE_978_99979 = new Range[] { new Range(1, 0, 4), new Range(2, 50, 79),
            new Range(3, 800, 999), };
    private static final Range[] RULE_978_99980 = new Range[] { new Range(1, 0, 0), new Range(2, 30, 59),
            new Range(3, 750, 999), };
    private static final Range[] RULE_978_99981 = new Range[] { new Range(1, 0, 1), new Range(2, 30, 74),
            new Range(3, 800, 999), };
    private static final Range[] RULE_978_99982 = new Range[] { new Range(1, 0, 1), new Range(2, 50, 68),
            new Range(3, 900, 999), };
    private static final Range[] RULE_978_99983 = new Range[] { new Range(1, 0, 0), new Range(2, 50, 69),
            new Range(3, 950, 999), };
    private static final Range[] RULE_978_99985 = new Range[] { new Range(1, 0, 1), new Range(2, 50, 79),
            new Range(3, 900, 999), };
    private static final Range[] RULE_978_99986 = new Range[] { new Range(1, 0, 0), new Range(2, 50, 69),
            new Range(3, 950, 999), };
    private static final Range[] RULE_978_99987 = new Range[] { new Range(3, 850, 999), };
    private static final Range[] RULE_978_99988 = new Range[] { new Range(1, 0, 0), new Range(2, 50, 54),
            new Range(3, 800, 824), };
    private static final Range[] RULE_978_99989 = new Range[] { new Range(1, 0, 0), new Range(2, 50, 64),
            new Range(3, 900, 999), };
    private static final Range[] RULE_978_99990 = new Range[] { new Range(1, 0, 0), new Range(2, 50, 54),
            new Range(3, 975, 999), };
    private static final Range[] RULE_979_10 = new Range[] { new Range(2, 0, 19), new Range(3, 200, 699),
            new Range(4, 7000, 8999), new Range(5, 90000, 97599), new Range(6, 976000, 999999), };
    private static final Range[] RULE_979_11 = new Range[] { new Range(2, 0, 24), new Range(3, 250, 549),
            new Range(4, 5500, 8499), new Range(5, 85000, 94999), new Range(6, 950000, 999999), };
    private static final Range[] RULE_979_12 = new Range[] { new Range(3, 200, 299), new Range(4, 5450, 5999),
            new Range(5, 80000, 84999), };
    private static final Range[] RULE_979_8 = new Range[] { new Range(3, 200, 229), new Range(4, 3500, 3999),
            new Range(4, 4000, 8499), new Range(4, 8500, 8849), new Range(5, 88500, 89999),
            new Range(7, 9850000, 9899999), };
    private static final Range[] RULE_978 = new Range[] {
            new Range(1, 0, 5, RULE_978_0, RULE_978_1, RULE_978_2, RULE_978_3, RULE_978_4, RULE_978_5),
            new Range(3, 600, 649, RULE_978_600, RULE_978_601, RULE_978_602, RULE_978_603, RULE_978_604, RULE_978_605,
                    RULE_978_606, RULE_978_607, RULE_978_608, RULE_978_609, null, RULE_978_611, RULE_978_612,
                    RULE_978_613, RULE_978_614, RULE_978_615, RULE_978_616, RULE_978_617, RULE_978_618, RULE_978_619,
                    RULE_978_620, RULE_978_621, RULE_978_622, RULE_978_623, RULE_978_624, RULE_978_625, RULE_978_626,
                    RULE_978_627, RULE_978_628, RULE_978_629, RULE_978_630, null, null, null, null, null, null, null,
                    null, null, null, null, null, null, null, null, null, null, null, null),
            new Range(2, 65, 65, RULE_978_65), new Range(1, 7, 7, RULE_978_7),
            new Range(2, 80, 94, RULE_978_80, RULE_978_81, RULE_978_82, RULE_978_83, RULE_978_84, RULE_978_85,
                    RULE_978_86, RULE_978_87, RULE_978_88, RULE_978_89, RULE_978_90, RULE_978_91, RULE_978_92,
                    RULE_978_93, RULE_978_94),
            new Range(3, 950, 989, RULE_978_950, RULE_978_951, RULE_978_952, RULE_978_953, RULE_978_954, RULE_978_955,
                    RULE_978_956, RULE_978_957, RULE_978_958, RULE_978_959, RULE_978_960, RULE_978_961, RULE_978_962,
                    RULE_978_963, RULE_978_964, RULE_978_965, RULE_978_966, RULE_978_967, RULE_978_968, RULE_978_969,
                    RULE_978_970, RULE_978_971, RULE_978_972, RULE_978_973, RULE_978_974, RULE_978_975, RULE_978_976,
                    RULE_978_977, RULE_978_978, RULE_978_979, RULE_978_980, RULE_978_981, RULE_978_982, RULE_978_983,
                    RULE_978_984, RULE_978_985, RULE_978_986, RULE_978_987, RULE_978_988, RULE_978_989),
            new Range(4, 9900, 9989, null, null, null, null, null, null, null, null, null, null, null, RULE_978_9911,
                    RULE_978_9912, RULE_978_9913, RULE_978_9914, RULE_978_9915, RULE_978_9916, RULE_978_9917,
                    RULE_978_9918, RULE_978_9919, RULE_978_9920, RULE_978_9921, RULE_978_9922, RULE_978_9923,
                    RULE_978_9924, RULE_978_9925, RULE_978_9926, RULE_978_9927, RULE_978_9928, RULE_978_9929,
                    RULE_978_9930, RULE_978_9931, RULE_978_9932, RULE_978_9933, RULE_978_9934, RULE_978_9935,
                    RULE_978_9936, RULE_978_9937, RULE_978_9938, RULE_978_9939, RULE_978_9940, RULE_978_9941,
                    RULE_978_9942, RULE_978_9943, RULE_978_9944, RULE_978_9945, RULE_978_9946, RULE_978_9947,
                    RULE_978_9948, RULE_978_9949, RULE_978_9950, RULE_978_9951, RULE_978_9952, RULE_978_9953,
                    RULE_978_9954, RULE_978_9955, RULE_978_9956, RULE_978_9957, RULE_978_9958, RULE_978_9959,
                    RULE_978_9960, RULE_978_9961, RULE_978_9962, RULE_978_9963, RULE_978_9964, RULE_978_9965,
                    RULE_978_9966, RULE_978_9967, RULE_978_9968, null, RULE_978_9970, RULE_978_9971, RULE_978_9972,
                    RULE_978_9973, RULE_978_9974, RULE_978_9975, RULE_978_9976, RULE_978_9977, RULE_978_9978,
                    RULE_978_9979, RULE_978_9980, RULE_978_9981, RULE_978_9982, RULE_978_9983, RULE_978_9984,
                    RULE_978_9985, RULE_978_9986, RULE_978_9987, RULE_978_9988, RULE_978_9989),
            new Range(5, 99900, 99999, null, RULE_978_99901, RULE_978_99902, RULE_978_99903, RULE_978_99904,
                    RULE_978_99905, RULE_978_99906, null, RULE_978_99908, RULE_978_99909, RULE_978_99910,
                    RULE_978_99911, RULE_978_99912, RULE_978_99913, RULE_978_99914, RULE_978_99915, RULE_978_99916,
                    RULE_978_99917, RULE_978_99918, RULE_978_99919, RULE_978_99920, RULE_978_99921, RULE_978_99922,
                    RULE_978_99923, RULE_978_99924, RULE_978_99925, RULE_978_99926, RULE_978_99927, RULE_978_99928,
                    RULE_978_99929, RULE_978_99930, RULE_978_99931, RULE_978_99932, RULE_978_99933, RULE_978_99934,
                    RULE_978_99935, RULE_978_99936, RULE_978_99937, RULE_978_99938, RULE_978_99939, RULE_978_99940,
                    RULE_978_99941, RULE_978_99942, RULE_978_99943, RULE_978_99944, RULE_978_99945, RULE_978_99946,
                    RULE_978_99947, RULE_978_99948, RULE_978_99949, RULE_978_99950, RULE_978_99951, RULE_978_99952,
                    RULE_978_99953, RULE_978_99954, RULE_978_99955, RULE_978_99956, RULE_978_99957, RULE_978_99958,
                    RULE_978_99959, RULE_978_99960, RULE_978_99961, RULE_978_99962, RULE_978_99963, RULE_978_99964,
                    RULE_978_99965, RULE_978_99966, RULE_978_99967, RULE_978_99968, RULE_978_99969, RULE_978_99970,
                    RULE_978_99971, RULE_978_99972, RULE_978_99973, RULE_978_99974, RULE_978_99975, RULE_978_99976,
                    RULE_978_99977, RULE_978_99978, RULE_978_99979, RULE_978_99980, RULE_978_99981, RULE_978_99982,
                    RULE_978_99983, null, RULE_978_99985, RULE_978_99986, RULE_978_99987, RULE_978_99988,
                    RULE_978_99989, RULE_978_99990, null, null, null, null, null, null, null, null, null), };
    private static final Range[] RULE_979 = new Range[] { new Range(2, 10, 12, RULE_979_10, RULE_979_11, RULE_979_12),
            new Range(1, 8, 8, RULE_979_8), };
    static final Range[] ROOT = { new Range(3, 978, 979, RULE_978, RULE_979), };
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
        AGENCIES.put("978-99985", "Tajikistan");
        AGENCIES.put("978-99986", "Myanmar");
        AGENCIES.put("978-99987", "Luxembourg");
        AGENCIES.put("978-99988", "Sudan");
        AGENCIES.put("978-99989", "Paraguay");
        AGENCIES.put("978-99990", "Ethiopia");
        AGENCIES.put("979-10", "France");
        AGENCIES.put("979-11", "Korea, Republic");
        AGENCIES.put("979-12", "Italy");
        AGENCIES.put("979-8", "United States");
    }
}
