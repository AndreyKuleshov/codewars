package com.codewars.multiplies3or5;

import java.util.stream.IntStream;

public class Solution {
    public int solution(int number) {
//        if (number < 0 ) return 0;
//        int sum = 0;
//        number -= 1;
//        for (int i = number; i > 0; i--) {
//            if (i % 3 == 0 || i % 5 == 0) {
//                sum += i;
//            }
//        }
//        return sum;
        return IntStream.range(3, number).filter(n -> n % 3 == 0 || n % 5 == 0).sum();
    }
}