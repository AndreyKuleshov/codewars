package com.codewars.printer;

import static org.junit.Assert.*;

import org.junit.Test;


public class PrinterTest {
    @Test
    public void test3of56() {
        System.out.println("printerError Fixed Tests");
        String s="aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz";
        assertEquals("3/56", Printer.printerError(s));
    }
    @Test
    public void test0of9() {
        System.out.println("printerError Fixed Tests");
        String s="abcdefghi";
        assertEquals("0/9", Printer.printerError(s));
    }
    @Test
    public void test10of10() {
        System.out.println("printerError Fixed Tests");
        String s="xyzxyzxyzx";
        assertEquals("10/10", Printer.printerError(s));
    }
    @Test
    public void test0of1() {
        System.out.println("printerError Fixed Tests");
        String s="a";
        assertEquals("0/1", Printer.printerError(s));
    }
    @Test
    public void test0of14() {
        System.out.println("printerError Fixed Tests");
        String s="aaabbbbhaijjjm";
        assertEquals("0/14", Printer.printerError(s));
    }
    @Test
    public void test8of22() {
        System.out.println("printerError Fixed Tests");
        String s="aaaxbbbbyyhwawiwjjjwwm";
        assertEquals("8/22", Printer.printerError(s));
    }
}
