package com.SonarTest.test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import com.SonarTest.SonarTest;

public class Test{

@Test
public void palindromeCheck(){
	assertTrue(SonarTest.checkPalindrome("naran"));
	assertFalse(SonarTest.checkPalindrome("Naran"));
}

@Test
public void arrayCheck(){
	int[] arr=new int[]{1,2,3,5};
	int[] arr1=new int[]{5,3};
	assertTrue(SonarTest.maxSumToALimit(arr,14));
	assertFalse(SonarTest.maxSumToALimit(arr1,7));
}
}
	
