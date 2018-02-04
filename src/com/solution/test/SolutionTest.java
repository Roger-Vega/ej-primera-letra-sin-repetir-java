package com.solution.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.solution.main.Solution;

class SolutionTest {

	@Test
	void test1() {
		String result = Solution.First_not_repeating_char("ybcccccccccccccb");
		String expected = "y";
		assertEquals(expected, result);
	}
	
	@Test
	void test2() {
		String result = Solution.First_not_repeating_char("abaabac");
		String expected = "c";
		assertEquals(expected, result);
	}
	
	@Test
	void test3() {
		String result = Solution.First_not_repeating_char("abcdefghijklmnopqrstuvwxyziflskecznslkjfabe");
		String expected = "d";
		assertEquals(expected, result);		
	}	
	
	@Test
	void test4() {
		String result = Solution.First_not_repeating_char("abacabaabacaba");
		String expected = "_";
		assertEquals(expected, result);
	}		

}
