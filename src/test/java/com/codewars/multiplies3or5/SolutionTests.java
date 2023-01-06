package com.codewars.multiplies3or5;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SolutionTests {
    @Test
    public void test10() {
        assertEquals(23, new Solution().solution(10));
    }
    @Test
    public void test11() {
        assertEquals(33, new Solution().solution(11));
    }
    @Test
    public void test0() {
        assertEquals(0, new Solution().solution(0));
    }
    @Test
    public void testMinus100() {
        assertEquals(0, new Solution().solution(-100));
    }

}
