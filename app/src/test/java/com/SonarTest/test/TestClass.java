package com.SonarTest.test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import com.SonarTest.SonarTest;

public class TestClass{

@Test
public void palindromeCheck(){
	assertTrue(SonarTest.checkPalindrome("Naran"));
	assertFalse(SonarTest.checkPalindrome("Narine"));
}
@Test
public void largestNumInAStringCheck(){
	assertEquals(11000,SonarTest.largestInAString("Hello 99, I am 10875! You have 11000 tasks to complete within 74 secs!"));
	assertFalse(SonarTest.largestInAString("Hello 99, I am 10875!")==99);
}
@Test
public void arrayCheck(){
	int[] arr=new int[]{1,2,3,5};
	int[] arr1=new int[]{5,3};
	assertTrue(SonarTest.maxSumToALimit(arr,14));
	assertFalse(SonarTest.maxSumToALimit(arr1,7));
}
}
	
