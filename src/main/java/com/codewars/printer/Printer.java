package com.codewars.printer;

import java.util.Arrays;

public class Printer {

    public static String printerError(String s) {
        int errors = Arrays.stream(s.split("")).filter(l -> !l.matches("[a-m]")).toList().size();
        return String.format("%d/%d", errors, s.length());
        //return s.replaceAll("[a-m]", "").length() + "/" + s.length();
    }
}
