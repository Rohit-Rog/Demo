package com.SonarTest.test;

import org.junit.Assert.assertTrue;
import org.junit.Assert.assertFalse;
import org.junit.Assert.assertEquals;

import org.junit.*;
import com.SonarTest.SonarTest;

public class Test{

@Test
public void palindromeCheck(){
	assertTrue(checkPalindrome("naran"));
	assertFalse(checkPalindrome("Naran"));
}

@Test
public void arrayCheck(){
	int[] arr=new int[]{1,2,3,5};
	int[] arr1=new int[]{5,3};
	assertTrue(maxSumToALimit(arr,14));
	assertFalse(maxSumToALimit(arr1,7));
}
}
	
