package test;

import com.TDD.practice.*;

import com.modernjava.lambda.Utils1;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;


public class PracticingTestsOnDifferentObjects {
    Donor donor = new Donor();
    EventsPromoter promoter = new EventsPromoter();
    FizzBuzz fb = new FizzBuzz();
    Calculator calculator = new Calculator();
    Calculator calculator1 = null;
    StringUtils swapped = new StringUtils();
    NumeralConverter num = new NumeralConverter();
    Utils StringChecker = new Utils();
    Utils1 ArrayCheck = new Utils1();
    Utils3 Utility =  new Utils3();
    Walk MyWalk = new Walk();
//
//    @Before
//    public void setUp(){
//        calculator1 = new Calculator();
//    }
//
//    @Test
//    public void totalOfEmptyBasket() {
//        ShoppingBasket basket = new ShoppingBasket();
//        assertEquals(0.0, basket.getTotal(), 0.0);
//
//    }
//
//    @Test
//    public void testGiftAidTaxExtra() {
//        assertEquals(0.25, donor.calulateTaxExtra(1.0, 20.0), 0.0);
//        assertEquals(0.5, donor.calulateTaxExtra(2.0, 20.0), 0.0);
//
//    }
//
//    @Test
//    public void roundTheExpectedToTwoDecimalPlaces() {
//        assertEquals(52.61, donor.calulateTaxExtra(210.456, 20.0), 0.0);
//    }
//
//    @Test
//    public void setSupplementFromEvent() {
//        assertEquals(5.0, promoter.getSupplement("running"), 0.0);
//        assertEquals(3.0, promoter.getSupplement("swimming"), 0.0);
//        assertEquals(0.0, promoter.getSupplement(""), 0.0);
//    }
//
//    @Test
//    public void isItDivisibleByThreeOrFive() {
//        assertEquals("Fizz", fb.getShoutOut(3));
//        assertEquals("Fizz", fb.getShoutOut(30));
//        assertEquals("Fizz", fb.getShoutOut(33));
//        assertEquals("Buzz", fb.getShoutOut(5));
//        assertEquals("Buzz", fb.getShoutOut(50));
//        assertEquals("Buzz", fb.getShoutOut(55));
//        assertEquals("1", fb.getShoutOut(1));
//        assertEquals("4", fb.getShoutOut(4));
//    }
//
//    @Test
//    public void IntCalulator() {
//        assertEquals(8.0, calculator.add(4.0, 4.0), 0.0);
//        assertEquals(8.0, calculator.add(4, 4.0), 0.0);
//        assertEquals(8.011, calculator.add(4.011, 4.0), 0.0);
//    }
//
//    @Test
//    public void StringCalulator() {
//        assertEquals(0, calculator1.add("", ""));
//        assertEquals(1, calculator1.add("1", ""));
//        assertEquals(3, calculator1.add("1", "", "2"));
//        assertEquals(5, calculator1.add("1", "2", "2"));
//        assertEquals(3, calculator1.add("1,2"));
//        assertEquals(15, calculator1.add("1\n2,3", "9"));
//        assertEquals(28, calculator1.add("14", "14"));
//        assertEquals(16, calculator1.add("1\n2,3", "10"));
//        assertEquals(3, calculator1.add("//;\n1;2"));
//        assertEquals("negatives not allowed", calculator1.add("-1", "-2"));
//
//    }
//
//    @Rule
//    public ExpectedException thrown = ExpectedException.none();
//
//    @Test
//    public void throwsExceptionWhenNegativeNumbersAreGiven() {
//        // arrange
//        thrown.expect(IllegalArgumentException.class);
//        thrown.expectMessage("negatives not allowed");
//        // act
//        calculator.add("-1,3");
//    }
//
//    public void willitPrint3(){
//        FizzBuzz fizz = new FizzBuzz();
//        assertEquals(0, fizz.getShoutOut(3));
//    }

    @Test
    public void theLastTwoLettersAreSwapped() {
        assertEquals("A", swapped.lastTwo("A"));
        assertEquals("BA", swapped.lastTwo("AB"));
        assertEquals("RANI", swapped.lastTwo("RAIN"));
    }

//    @Test
//    public void addUpcorrectly(){
//        Calulatorclass cals = new Calculatorclass();
//        assertEquals(5, cal.add(1, 4), 0.0);
//    }

//    @Test
//    public void willItReturnTheCorrectRomanNumeral() {
//        assertEquals("I", num.convert(1));
//        assertEquals("V", num.convert(5));
//        assertEquals("X", num.convert(10));
//        assertEquals("L", num.convert(50));
//        assertEquals("C", num.convert(100));
//        assertEquals("D", num.convert(500));
//        assertEquals("M", num.convert(1000));
//
//    }

//    @Test
//    public void ReturnBracketsInOrder() {
//        assertTrue("Correct", StringChecker.validParentheses("(hello)"));
//        assertFalse("Incorrect", StringChecker.validParentheses("(hello("));
//
//
//    }

//    @Test
//    public void ReturnsTheCorrectOutlier(){
//        int[] intArrayOne = {1, 3, 5, 7, 2};
//        int[] intArrayTwo = {2, 3, 6, 8, 6};
//        int[] intArrayThree = {2, 4, 6, 8, 10};
//
//        assertEquals(2, ArrayCheck.getOutLier(intArrayOne));
//        assertEquals(3, ArrayCheck.getOutLier(intArrayTwo));
//        assertEquals("no outlier", ArrayCheck.getOutLier(intArrayThree));
//
//    }

    @Test
    public void MovesFirstLetterToEndAndAddsAY(){
        assertEquals("elloHay", Utility.firstToLast("Hello"));
        assertEquals("amesjay", Utility.firstToLast("james"));
    }

    @Test
    public void TenMinuteWalkReturnsToOrigin(){
        char[] route1 = {'n', 's', 'w', 'e', 'n', 's', 'w', 'e', 'n', 's'};
        char[] route2 = {'n', 'n', 'w', 'w'};

        assertEquals("True", MyWalk.checkRoute(route1));
        assertEquals("False", MyWalk.checkRoute(route2));


    }



}