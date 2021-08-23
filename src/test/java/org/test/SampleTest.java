package org.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SampleTest {
	@BeforeClass
	private void browser() {
		System.out.println("main");

	}
	@Test(groups="Smoke")
	private void tc1() {
		System.out.println("tc1");

	}
	@Test(groups="Regression")
	private void tc2() {
		System.out.println("tc2");

	}
	@Test(groups="Sanity")
	private void tc3() {
		System.out.println("tc3");

	}


}
