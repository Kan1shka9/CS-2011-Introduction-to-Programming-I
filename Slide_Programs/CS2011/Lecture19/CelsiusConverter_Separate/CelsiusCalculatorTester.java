package CS2011.Lecture19.CelsiusConverter_Separate;

import static org.junit.Assert.*;

import org.junit.Test;

public class CelsiusCalculatorTester {

	@Test
	public void testFreezing() {
		CelsiusCalculator calc = new CelsiusCalculator();		
		double freezingF = 32;
		double freezingC = 0;
		double freezingResult = calc.fToC(freezingF);
		// assertEquals for two doubles takes a delta as the third argument!
		assertEquals(freezingResult, freezingC, 0.1);    
	}
	
	@Test
	public void testBoiling() {
		CelsiusCalculator calc = new CelsiusCalculator();	
		double boilingF = 212;
		double boilingC = 100;
		double boilingResult = calc.fToC(boilingF);
		assertEquals(boilingResult, boilingC, 0.1);    
	}
	
	@Test
	public void testNegForty() {
		CelsiusCalculator calc = new CelsiusCalculator();	
		double negForty = -40;
		double negFortyResult = calc.fToC(negForty);
		assertEquals(negFortyResult, negForty, 0.1);    
	}

}