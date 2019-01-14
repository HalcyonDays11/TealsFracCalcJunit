import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FracCalcJunitCheckpoint4 {

    @Test public void testAdditionSimple1() {assertEquals("2/5", FracCalc.calculateResult("1/5 + 1/5"));}
    @Test public void testAdditionSimple2() {assertEquals("4/5", FracCalc.calculateResult("3/5 + 1/5"));}
    @Test public void testAdditionSimple3() {assertEquals("4_3/7", FracCalc.calculateResult("1_1/7 + 3_2/7"));}
    
    @Test public void testAdditionReduce1() {assertEquals("1_1/5", FracCalc.calculateResult("3/5 + 3/5"));}
    @Test public void testAdditionReduce2() {assertEquals("1_1/5", FracCalc.calculateResult("4/5 + 2/5"));}
    @Test public void testAdditionReduce3() {assertEquals("1/4", FracCalc.calculateResult("1/8 + 1/8"));}
    
    @Test public void testAdditionWholeNumbers1() {assertEquals("1", FracCalc.calculateResult("2/5 + 3/5"));}
    @Test public void testAdditionWholeNumbers2() {assertEquals("1", FracCalc.calculateResult("2/3 + 1/3"));}
    
    @Test public void testAdditionWithNegatives1() {assertEquals("2/5", FracCalc.calculateResult("3/5 + -1/5"));}
   
    @Test public void testAdditionWithNegatives4() {assertEquals("-1_1/4", FracCalc.calculateResult("-3_3/4 + 2_2/4"));}
    @Test public void testAdditionWithNegatives5() {assertEquals("-1_1/4", FracCalc.calculateResult("2_2/4 + -3_3/4"));}
    
    @Test public void testAdditionImproperFractionsAndReductions1() {assertEquals("5_5/6", FracCalc.calculateResult("20/8 + 3_1/3"));}
    @Test public void testAdditionImproperFractionsAndReductions2() {assertEquals("1_1/20", FracCalc.calculateResult("4/5 + 2/8"));}
    

    @Test public void testAdditionCombined4() { assertEquals("62_11/19", FracCalc.calculateResult("0 + 34_543/19"));}
    @Test public void testAdditionCombined5() { assertEquals("-44_229/888", FracCalc.calculateResult("-38_3/72 + -4_82/37"));}
    
    
    @Test public void testSubtractionSimple1() {assertEquals("1/5", FracCalc.calculateResult("3/5 - 2/5"));}
    @Test public void testSubtractionSimple2() {assertEquals("0", FracCalc.calculateResult("1/5 - 1/5"));}
    @Test public void testSubtractionSimple3() {assertEquals("0", FracCalc.calculateResult("4_1/2 - 4_1/2"));}
        
    
    
    @Test public void testSubtractionReduce1() {assertEquals("4/5", FracCalc.calculateResult("9/10 - 1/10"));}
    @Test public void testSubtractionReduce2() {assertEquals("1/5", FracCalc.calculateResult("5/10 - 3/10"));}
    
    
    @Test public void testSubtractionWithNegatives1() { assertEquals("-2/5", FracCalc.calculateResult("2/5 - 4/5"));}
    @Test public void testSubtractionWithNegatives2() {assertEquals("-7/8", FracCalc.calculateResult("5_3/4 - 6_5/8"));}
    @Test public void testSubtractionWithNegatives3() {assertEquals("-1_1/4", FracCalc.calculateResult("-3_3/4 - -2_2/4"));}
    @Test public void testSubtractionWithNegatives4() {assertEquals("-1_5/8", FracCalc.calculateResult("4_1/2 - 5_9/8"));}
    @Test public void testSubtractionWithNegatives5() {assertEquals("-1_1/8", FracCalc.calculateResult("3_3/4 - 4_7/8"));}
    @Test public void testSubtractionWithNegatives6() {assertEquals("-6_1/4", FracCalc.calculateResult("-3_3/4 - 2_2/4"));}
    
    @Test public void testSubtractionImproperFractionsAndReductions1() {assertEquals("53/96", FracCalc.calculateResult("75/32 - 43/24"));}
    @Test public void testSubtractionImproperFractionsAndReductions2() {assertEquals("16_23/24", FracCalc.calculateResult("75/4 - 43/24"));}
    
    @Test public void testSubtractionCombined1() {  assertEquals("12_3/8", FracCalc.calculateResult("5_3/4 - -6_5/8"));}
    @Test public void testSubtractionCombined2() {assertEquals("8_5/21", FracCalc.calculateResult("-12_3/7 - -20_2/3"));}
    @Test public void testSubtractionCombined3() {assertEquals("-65_247/336", FracCalc.calculateResult("-32_75/16 - 27_43/21"));}
    
    @Test public void testMultiplicationBasic1() {  assertEquals("3", FracCalc.calculateResult("1_1/2 * 2"));}
    @Test public void testMultiplicationBasic2() {assertEquals("6/25", FracCalc.calculateResult("3/5 * 2/5"));}
    @Test public void testMultiplicationBasic3() {assertEquals("164268", FracCalc.calculateResult("234 * 702"));}
    @Test public void testMultiplicationBasic5() {assertEquals("8", FracCalc.calculateResult("12/3 * 2/1"));}
    @Test public void testMultiplicationBasic6() {assertEquals("2", FracCalc.calculateResult("16 * 1/8"));}
    @Test public void testMultiplicationBasic7() {assertEquals("2", FracCalc.calculateResult("3 * 2/3"));}
    @Test public void testMultiplicationBasic8() {assertEquals("1_1/2", FracCalc.calculateResult("6 * 1/4"));}
    @Test public void testMultiplicationBasic10() {assertEquals("378/943", FracCalc.calculateResult("27/41 * 14/23"));}
    @Test public void testMultiplicationBasic11() {assertEquals("5_929/943", FracCalc.calculateResult("1_27/41 * 3_14/23"));}
    
    @Test public void testMultiplicationByZero1() { assertEquals("0", FracCalc.calculateResult("0 * 4/5"));}
    
    @Test public void testMultiplicationWithNegatives1() {  assertEquals("-8", FracCalc.calculateResult("12/3 * -2/1"));}
    @Test public void testMultiplicationWithNegatives2() {assertEquals("-8", FracCalc.calculateResult("-12/3 * 2/1"));}
    @Test public void testMultiplicationWithNegatives3() {assertEquals("8", FracCalc.calculateResult("-12/3 * -2/1"));}
    @Test public void testMultiplicationWithNegatives4() {assertEquals("-15_5/7", FracCalc.calculateResult("-3_2/3 * 4_2/7"));}
    @Test public void testMultiplicationWithNegatives5() {assertEquals("-15_5/7", FracCalc.calculateResult("3_2/3 * -4_2/7"));}
    @Test public void testMultiplicationWithNegatives6() {assertEquals("15_5/7", FracCalc.calculateResult("-3_2/3 * -4_2/7"));}

    
    @Test public void testMultiplicationByZero6() {assertEquals("0", FracCalc.calculateResult("3_25/26 * 0"));}
    @Test public void testMultiplicationByZero7() {assertEquals("0", FracCalc.calculateResult("-24_1/3 * 0"));}
    
    @Test public void testMultiplicationCombined1() {   assertEquals("1065_115/168", FracCalc.calculateResult("-32_75/16 * -27_43/21"));}
    @Test public void testMultiplicationCombined2() {assertEquals("-15_67/943", FracCalc.calculateResult("1_27/41 * -3_140/23"));}
    @Test public void testMultiplicationCombined3() {assertEquals("4_2/3", FracCalc.calculateResult("3_2/4 * 4/3"));}
    
    @Test public void testDivisionBasic1() {assertEquals("9/16", FracCalc.calculateResult("3/4 / 4/3"));}
    @Test public void testDivisionBasic2() {assertEquals("2_1/4", FracCalc.calculateResult("3/2 / 2/3"));}
    @Test public void testDivisionBasic4() {assertEquals("6/11", FracCalc.calculateResult("6 / 11"));}
    @Test public void testDivisionBasic5() {assertEquals("4/9", FracCalc.calculateResult("4 / 9"));}
    @Test public void testDivisionBasic7() {assertEquals("2_6/7", FracCalc.calculateResult("20 / 7"));}
    @Test public void testDivisionBasic8() {assertEquals("13/24", FracCalc.calculateResult("1_1/12 / 2"));}
    @Test public void testDivisionBasic9() {assertEquals("1", FracCalc.calculateResult("3/4 / 3/4"));}
    
    @Test public void testDivisionWithNegatives1() {    assertEquals("1_5/8", FracCalc.calculateResult("-13 / -8"));}
    @Test public void testDivisionWithNegatives5() {assertEquals("-2_6/7", FracCalc.calculateResult("-20 / 7"));}
    @Test public void testDivisionWithNegatives6() {assertEquals("1_13/32", FracCalc.calculateResult("-3_3/4 / -2_2/3"));}
    @Test public void testDivisionWithNegatives7() {assertEquals("-1_13/32", FracCalc.calculateResult("-3_3/4 / 2_2/3"));}
    @Test public void testDivisionWithNegatives8() {assertEquals("-1_13/32", FracCalc.calculateResult("3_3/4 / -2_2/3"));}
    
    @Test public void testDivisionWithZero5() { assertEquals("0", FracCalc.calculateResult("0 / 46/27"));}
    @Test public void testDivisionWithZero6() {assertEquals("0", FracCalc.calculateResult("0/24 / 1/46"));}
    @Test public void testDivisionWithZero7() {assertEquals("0", FracCalc.calculateResult("0/11 / 6/7"));}
    
    @Test public void testDivisionCombined1() {assertEquals("2_2/3", FracCalc.calculateResult("16/4 / 3/2"));}
    @Test public void testDivisionCombined2() {assertEquals("-2_2/3", FracCalc.calculateResult("16/4 / -3/2"));}
    @Test public void testDivisionCombined3() {assertEquals("6_661/5520", FracCalc.calculateResult("-38_3/72 / -4_82/37"));}
    @Test public void testDivisionCombined4() {assertEquals("-5/21", FracCalc.calculateResult("1_2/3 / -5_6/3"));}