package com.arnab.training.jenkins;

import static org.junit.Assert.*;

import org.testng.annotations.Test;

public class JenkinsCalcTest {

	@Test
	public void addTest() {
		JenkinsCalculator myCalc = new JenkinsCalculator();
		assertEquals(10, myCalc.addNumbers(5, 5));
	}
	
	@Test
	public void subtractTest() {
		JenkinsCalculator myCalc = new JenkinsCalculator();
		assertEquals(5, myCalc.subtractNumbers(10, 5));
	}

}
