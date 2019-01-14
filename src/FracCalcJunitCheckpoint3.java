

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FracCalcJunitCheckpoint3 {
   
    @Test public void testAdditionSimple1() {assertEquivalent("2/5", FracCalc.calculateResult("1/5 + 1/5"));}
    @Test public void testAdditionSimple2() {assertEquivalent("4/5", FracCalc.calculateResult("3/5 + 1/5"));}
    @Test public void testAdditionSimple3() {assertEquivalent("4_3/7", FracCalc.calculateResult("1_1/7 + 3_2/7"));}
    
    @Test public void testAdditionReduce1() {assertEquivalent("1_1/5", FracCalc.calculateResult("3/5 + 3/5"));}
    @Test public void testAdditionReduce2() {assertEquivalent("1_1/5", FracCalc.calculateResult("4/5 + 2/5"));}
    @Test public void testAdditionReduce3() {assertEquivalent("1/4", FracCalc.calculateResult("1/8 + 1/8"));}
    
    @Test public void testAdditionWholeNumbers1() {assertEquivalent("1", FracCalc.calculateResult("2/5 + 3/5"));}
    @Test public void testAdditionWholeNumbers2() {assertEquivalent("1", FracCalc.calculateResult("2/3 + 1/3"));}
    
    @Test public void testAdditionWithNegatives1() {assertEquivalent("2/5", FracCalc.calculateResult("3/5 + -1/5"));}
   
    @Test public void testAdditionWithNegatives4() {assertEquivalent("-1_1/4", FracCalc.calculateResult("-3_3/4 + 2_2/4"));}
    @Test public void testAdditionWithNegatives5() {assertEquivalent("-1_1/4", FracCalc.calculateResult("2_2/4 + -3_3/4"));}
    
    @Test public void testAdditionImproperFractionsAndReductions1() {assertEquivalent("5_5/6", FracCalc.calculateResult("20/8 + 3_1/3"));}
    @Test public void testAdditionImproperFractionsAndReductions2() {assertEquivalent("1_1/20", FracCalc.calculateResult("4/5 + 2/8"));}
    

    @Test public void testAdditionCombined4() { assertEquivalent("62_11/19", FracCalc.calculateResult("0 + 34_543/19"));}
    @Test public void testAdditionCombined5() { assertEquivalent("-44_229/888", FracCalc.calculateResult("-38_3/72 + -4_82/37"));}
    
    
    @Test public void testSubtractionSimple1() {assertEquivalent("1/5", FracCalc.calculateResult("3/5 - 2/5"));}
    @Test public void testSubtractionSimple2() {assertEquivalent("0", FracCalc.calculateResult("1/5 - 1/5"));}
    @Test public void testSubtractionSimple3() {assertEquivalent("0", FracCalc.calculateResult("4_1/2 - 4_1/2"));}
        
    
    
    @Test public void testSubtractionReduce1() {assertEquivalent("4/5", FracCalc.calculateResult("9/10 - 1/10"));}
    @Test public void testSubtractionReduce2() {assertEquivalent("1/5", FracCalc.calculateResult("5/10 - 3/10"));}
    
    
    @Test public void testSubtractionWithNegatives1() { assertEquivalent("-2/5", FracCalc.calculateResult("2/5 - 4/5"));}
    @Test public void testSubtractionWithNegatives2() {assertEquivalent("-7/8", FracCalc.calculateResult("5_3/4 - 6_5/8"));}
    @Test public void testSubtractionWithNegatives3() {assertEquivalent("-1_1/4", FracCalc.calculateResult("-3_3/4 - -2_2/4"));}
    @Test public void testSubtractionWithNegatives4() {assertEquivalent("-1_5/8", FracCalc.calculateResult("4_1/2 - 5_9/8"));}
    @Test public void testSubtractionWithNegatives5() {assertEquivalent("-1_1/8", FracCalc.calculateResult("3_3/4 - 4_7/8"));}
    @Test public void testSubtractionWithNegatives6() {assertEquivalent("-6_1/4", FracCalc.calculateResult("-3_3/4 - 2_2/4"));}
    
    @Test public void testSubtractionImproperFractionsAndReductions1() {assertEquivalent("53/96", FracCalc.calculateResult("75/32 - 43/24"));}
    @Test public void testSubtractionImproperFractionsAndReductions2() {assertEquivalent("16_23/24", FracCalc.calculateResult("75/4 - 43/24"));}
    
    @Test public void testSubtractionCombined1() {  assertEquivalent("12_3/8", FracCalc.calculateResult("5_3/4 - -6_5/8"));}
    @Test public void testSubtractionCombined2() {assertEquivalent("8_5/21", FracCalc.calculateResult("-12_3/7 - -20_2/3"));}
    @Test public void testSubtractionCombined3() {assertEquivalent("-65_247/336", FracCalc.calculateResult("-32_75/16 - 27_43/21"));}
    
    @Test public void testMultiplicationBasic1() {  assertEquivalent("3", FracCalc.calculateResult("1_1/2 * 2"));}
    @Test public void testMultiplicationBasic2() {assertEquivalent("6/25", FracCalc.calculateResult("3/5 * 2/5"));}
    @Test public void testMultiplicationBasic3() {assertEquivalent("164268", FracCalc.calculateResult("234 * 702"));}
    @Test public void testMultiplicationBasic5() {assertEquivalent("8", FracCalc.calculateResult("12/3 * 2/1"));}
    @Test public void testMultiplicationBasic6() {assertEquivalent("2", FracCalc.calculateResult("16 * 1/8"));}
    @Test public void testMultiplicationBasic7() {assertEquivalent("2", FracCalc.calculateResult("3 * 2/3"));}
    @Test public void testMultiplicationBasic8() {assertEquivalent("1_1/2", FracCalc.calculateResult("6 * 1/4"));}
    @Test public void testMultiplicationBasic10() {assertEquivalent("378/943", FracCalc.calculateResult("27/41 * 14/23"));}
    @Test public void testMultiplicationBasic11() {assertEquivalent("5_929/943", FracCalc.calculateResult("1_27/41 * 3_14/23"));}
    
    @Test public void testMultiplicationByZero1() { assertEquivalent("0", FracCalc.calculateResult("0 * 4/5"));}
    
    @Test public void testMultiplicationWithNegatives1() {  assertEquivalent("-8", FracCalc.calculateResult("12/3 * -2/1"));}
    @Test public void testMultiplicationWithNegatives2() {assertEquivalent("-8", FracCalc.calculateResult("-12/3 * 2/1"));}
    @Test public void testMultiplicationWithNegatives3() {assertEquivalent("8", FracCalc.calculateResult("-12/3 * -2/1"));}
    @Test public void testMultiplicationWithNegatives4() {assertEquivalent("-15_5/7", FracCalc.calculateResult("-3_2/3 * 4_2/7"));}
    @Test public void testMultiplicationWithNegatives5() {assertEquivalent("-15_5/7", FracCalc.calculateResult("3_2/3 * -4_2/7"));}
    @Test public void testMultiplicationWithNegatives6() {assertEquivalent("15_5/7", FracCalc.calculateResult("-3_2/3 * -4_2/7"));}

    
    @Test public void testMultiplicationByZero6() {assertEquivalent("0", FracCalc.calculateResult("3_25/26 * 0"));}
    @Test public void testMultiplicationByZero7() {assertEquivalent("0", FracCalc.calculateResult("-24_1/3 * 0"));}
    
    @Test public void testMultiplicationCombined1() {   assertEquivalent("1065_115/168", FracCalc.calculateResult("-32_75/16 * -27_43/21"));}
    @Test public void testMultiplicationCombined2() {assertEquivalent("-15_67/943", FracCalc.calculateResult("1_27/41 * -3_140/23"));}
    @Test public void testMultiplicationCombined3() {assertEquivalent("4_2/3", FracCalc.calculateResult("3_2/4 * 4/3"));}
    
    @Test public void testDivisionBasic1() {assertEquivalent("9/16", FracCalc.calculateResult("3/4 / 4/3"));}
    @Test public void testDivisionBasic2() {assertEquivalent("2_1/4", FracCalc.calculateResult("3/2 / 2/3"));}
    @Test public void testDivisionBasic4() {assertEquivalent("6/11", FracCalc.calculateResult("6 / 11"));}
    @Test public void testDivisionBasic5() {assertEquivalent("4/9", FracCalc.calculateResult("4 / 9"));}
    @Test public void testDivisionBasic7() {assertEquivalent("2_6/7", FracCalc.calculateResult("20 / 7"));}
    @Test public void testDivisionBasic8() {assertEquivalent("13/24", FracCalc.calculateResult("1_1/12 / 2"));}
    @Test public void testDivisionBasic9() {assertEquivalent("1", FracCalc.calculateResult("3/4 / 3/4"));}
    
    @Test public void testDivisionWithNegatives1() {    assertEquivalent("1_5/8", FracCalc.calculateResult("-13 / -8"));}
    @Test public void testDivisionWithNegatives5() {assertEquivalent("-2_6/7", FracCalc.calculateResult("-20 / 7"));}
    @Test public void testDivisionWithNegatives6() {assertEquivalent("1_13/32", FracCalc.calculateResult("-3_3/4 / -2_2/3"));}
    @Test public void testDivisionWithNegatives7() {assertEquivalent("-1_13/32", FracCalc.calculateResult("-3_3/4 / 2_2/3"));}
    @Test public void testDivisionWithNegatives8() {assertEquivalent("-1_13/32", FracCalc.calculateResult("3_3/4 / -2_2/3"));}
    
    @Test public void testDivisionWithZero5() {assertEquivalent("0", FracCalc.calculateResult("0 / 46/27"));}
    @Test public void testDivisionWithZero6() {assertEquivalent("0", FracCalc.calculateResult("0/24 / 1/46"));}
    @Test public void testDivisionWithZero7() {assertEquivalent("0", FracCalc.calculateResult("0/11 / 6/7"));}
    
    @Test public void testDivisionCombined1() {assertEquivalent("2_2/3", FracCalc.calculateResult("16/4 / 3/2"));}
    @Test public void testDivisionCombined2() {assertEquivalent("-2_2/3", FracCalc.calculateResult("16/4 / -3/2"));}
    @Test public void testDivisionCombined3() {assertEquivalent("6_661/5520", FracCalc.calculateResult("-38_3/72 / -4_82/37"));}
    @Test public void testDivisionCombined4() {assertEquivalent("-5/21", FracCalc.calculateResult("1_2/3 / -5_6/3"));}
    
    
    private static void assertEquivalent(String expected, String actual) {
    	assertEquals(parse(expected).toDouble(), parse(actual).toDouble(), 1.0E-6);
    }
    
    private static MixedNumber parse(String s) {
    	int whole, num, denom;
    	String fractional;
    	int underScore = s.indexOf("_");
    	if (underScore > -1) {
			whole = Integer.parseInt(s.substring(0, underScore));
    		fractional = s.substring(underScore + 1);
    	} else {
    		whole = 0;
    		fractional = s;
    	}
    	
    	int slash = fractional.indexOf("/");
    	if (slash > -1) {
    		num = Integer.parseInt(fractional.substring(0, slash));
    		denom = Integer.parseInt(fractional.substring(slash+1));
    	} else {
    		num = 0;
    		denom = 1;
    	}
    	
    	return new MixedNumber(whole, num, denom);
    	
    }
    
    private static class MixedNumber {
    	private final int whole, num, denom;
    	
    	private MixedNumber (int whole, int num, int denom) {
    		this.whole = whole;
    		this.num = num;
    		this.denom = denom;
    	}
    	
    	private double toDouble() {
    		return whole + (double)num / denom;
    	}
    	
    	
    }

//    // Extra credit only
//    @Test public void multipleOps1() {assertEquivalent("-20/21", FracCalc.calculateResult("1_2/3 + 5/4 + 5_5/4 - 2_2/4 / -5_6/3"));}
//    @Test public void multipleOps2() {assertEquivalent("4", FracCalc.calculateResult("1 + 3 + -3 - -3"));}
//    @Test public void multipleOps3() {assertEquivalent("0", FracCalc.calculateResult("12 * 18 * 18 * 0"));}
//    @Test public void multipleOps4() {assertEquivalent("3_47/60", FracCalc.calculateResult("20/8 + 3_1/3 - 4/5 - 5/4"));}
//    @Test public void multipleOps5() {assertEquivalent("1", FracCalc.calculateResult("12345 - 12345 + 12345 - 12345 + 1"));}
//    @Test public void multipleOps6() {assertEquivalent("0", FracCalc.calculateResult("0 * 0 / 1 / 4/6 / 2_3/4"));}
//    @Test public void multipleOps7() {assertEquivalent("-1", FracCalc.calculateResult("1/5 + 1/5 + 1/5 + 1/5 + 1/5 - 2"));}
//    @Test public void multipleOps8() {assertEquivalent("0", FracCalc.calculateResult("-4 + 1 + 1 + 1 + 1"));}
//    @Test public void multipleOps9() {assertEquivalent("4_1/2", FracCalc.calculateResult("16/4 / 3/2 * 3/2 + 1/2"));}
//    @Test public void multipleOps10() {assertEquivalent("0", FracCalc.calculateResult("12457 / -1 + 12457"));}
//    @Test public void multipleOps11() {assertEquivalent("7", FracCalc.calculateResult("5_3/4 - -6_8/8 - 5_3/4"));}
//    @Test public void multipleOps12() {assertEquivalent("4", FracCalc.calculateResult("2 * 3 - 6 + 1_1/2 + 1/2 - 1/2 - 1/2 + 3"));}
//    @Test public void multipleOps13() {assertEquivalent("-4", FracCalc.calculateResult("2 * 3 - 6 + -1_1/2 + -1/2 - -1/2 - -1/2 - 3"));}
//    @Test public void multipleOps14() {assertEquivalent("4", FracCalc.calculateResult("20 / 5 * -1 + 8"));}
//
}
