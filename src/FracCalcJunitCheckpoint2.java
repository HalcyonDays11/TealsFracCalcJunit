import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FracCalcJunitCheckpoint2 {

	
	    @Test public void testAdditionWholeNumbers1() {assertEquals("10", FracCalc.calculateResult("3 + 7"));}
	    @Test public void testAdditionWholeNumbers2() {assertEquals("2", FracCalc.calculateResult("1 + 1"));}
	    @Test public void testAdditionWholeNumbers3() {assertEquals("4", FracCalc.calculateResult("1 + 3"));}
	    @Test public void testAdditionWholeNumbers4() {assertEquals("452", FracCalc.calculateResult("452 + 0"));}
	    @Test public void testAdditionWholeNumbers5() {assertEquals("254", FracCalc.calculateResult("0 + 254"));}
	    @Test public void testAdditionWholeNumbers6() {assertEquals("1021778", FracCalc.calculateResult("124543 + 897235"));}
	    
	    @Test public void testAdditionWithNegatives1() {assertEquals("900", FracCalc.calculateResult("978 + -78"));}
	    @Test public void testAdditionWithNegatives2() {assertEquals("900", FracCalc.calculateResult("-78 + 978"));}
	    @Test public void testAdditionWithNegatives3() { assertEquals("-9035", FracCalc.calculateResult("-9035 + 0"));}
	    @Test public void testAdditionWithNegatives4() { assertEquals("-64", FracCalc.calculateResult("64 + -128"));}
	    @Test public void testAdditionWithNegatives5() { assertEquals("-133", FracCalc.calculateResult("-98 + -35"));}
	    
	    @Test public void testSubtractionWholeNumbers1() {  assertEquals("0", FracCalc.calculateResult("68591 - 68591"));}
	    @Test public void testSubtractionWholeNumbers2() {assertEquals("7", FracCalc.calculateResult("42 - 35"));}
	    
	    @Test public void testSubtractionWithNegatives1() {assertEquals("-9284", FracCalc.calculateResult("0 - 9284"));}
	    @Test public void testSubtractionWithNegatives2() {assertEquals("-36891", FracCalc.calculateResult("48623 - 85514"));}
	    @Test public void testSubtractionWithNegatives3() {assertEquals("-333", FracCalc.calculateResult("-222 - 111"));}
	    @Test public void testSubtractionWithNegatives4() {assertEquals("-111", FracCalc.calculateResult("-222 - -111"));}
	    @Test public void testSubtractionWithNegatives5() {assertEquals("333", FracCalc.calculateResult("222 - -111"));}

	    
	    @Test public void testMultiplicationWholeNumbers1() {assertEquals("216", FracCalc.calculateResult("12 * 18"));}
	    @Test public void testMultiplicationWholeNumbers2() {assertEquals("8994872", FracCalc.calculateResult("1 * 8994872"));}
	    
	    @Test public void testMultiplicationWithNegatives1() {assertEquals("-842346", FracCalc.calculateResult("1 * -842346"));}
	    @Test public void testMultiplicationWithNegatives2() {assertEquals("-75421", FracCalc.calculateResult("-1 * 75421"));}
	    @Test public void testMultiplicationWithNegatives3() {assertEquals("37953", FracCalc.calculateResult("-1 * -37953"));}


	    @Test public void testMultiplicationByZero2() {assertEquals("0", FracCalc.calculateResult("0 * 0"));}
	    @Test public void testMultiplicationByZero3() {assertEquals("0", FracCalc.calculateResult("0 * 9321"));}
	    @Test public void testMultiplicationByZero4() {assertEquals("0", FracCalc.calculateResult("0 * -5902"));}
	    @Test public void testMultiplicationByZero5() {assertEquals("0", FracCalc.calculateResult("146 * 0"));}
	    
	    @Test public void testDivisionWholeNumbers1() {assertEquals("11", FracCalc.calculateResult("121 / 11"));}
	    @Test public void testDivisionWholeNumbers2() {assertEquals("9457", FracCalc.calculateResult("9457 / 1"));}
	    @Test public void testDivisionWholeNumbers3() {assertEquals("1", FracCalc.calculateResult("23 / 23"));}
	    
	    @Test public void testDivisionWithNegatives1() {assertEquals("-2803", FracCalc.calculateResult("-2803 / 1"));}
	    @Test public void testDivisionWithNegatives2() {assertEquals("-12457", FracCalc.calculateResult("12457 / -1"));}
	    @Test public void testDivisionWithNegatives3() {assertEquals("45236", FracCalc.calculateResult("-45236 / -1"));}
	    
	    @Test public void testDivisionWithZero1() { assertEquals("0", FracCalc.calculateResult("-0 / 98701"));}
	    @Test public void testDivisionWithZero2() {assertEquals("0", FracCalc.calculateResult("-0 / -98701"));}
	    @Test public void testDivisionWithZero3() {assertEquals("0", FracCalc.calculateResult("0 / -98701"));}
	    @Test public void testDivisionWithZero4() {assertEquals("0", FracCalc.calculateResult("0 / 37569"));}
	    
}

