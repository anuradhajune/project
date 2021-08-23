package org.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Check {
	@Parameters({"green"})
	@Test
	private void tc1(String s) {
		System.out.println(s + "Test1"+Thread.currentThread().getId());

	}





}
