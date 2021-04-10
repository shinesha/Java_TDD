package test;

import com.TDD.practice.*;
import com.modernjava.lambda.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class ShoppingBasketTest {
    Donor donor = new Donor();
    EventsPromoter promoter = new EventsPromoter();
    FizzBuzz fb = new FizzBuzz();
    Calculator calculator= new Calculator();
    Calculator calculator1= new Calculator();

    @Test
    public void totalOfEmptyBasket() {
        ShoppingBasket basket = new ShoppingBasket();
        assertEquals(0.0, basket.getTotal(), 0.0);

    }


    @Test
    public void testGiftAidTaxExtra() {


        assertEquals(0.25, donor.calulateTaxExtra(1.0, 20.0), 0.0);
        assertEquals(0.5, donor.calulateTaxExtra(2.0, 20.0), 0.0);

    }

    @Test
    public void roundTheExpectedToTwoDecimalPlaces() {
        assertEquals(52.61, donor.calulateTaxExtra(210.456, 20.0), 0.0);
    }

    @Test
    public void setSupplementFromEvent() {
        assertEquals(5.0, promoter.getSupplement("running"), 0.0);
        assertEquals(3.0, promoter.getSupplement("swimming"), 0.0);
        assertEquals(0.0, promoter.getSupplement(""), 0.0);
}
    @Test
    public void isItDivisibleByThreeOrFive(){
        assertEquals("Fizz", fb.getShoutOut(3));
        assertEquals("Fizz", fb.getShoutOut(30));
        assertEquals("Fizz", fb.getShoutOut(33));
        assertEquals("Buzz", fb.getShoutOut(5));
        assertEquals("Buzz", fb.getShoutOut(50));
        assertEquals("Buzz", fb.getShoutOut(55));
        assertEquals("1", fb.getShoutOut(1));
        assertEquals("4", fb.getShoutOut(4));
    }

    @Test
    public void IntCalulator(){
     assertEquals(8.0, calculator.add(4.0, 4.0), 0.0);
     assertEquals(8.0, calculator.add(4, 4.0), 0.0);
     assertEquals(8.011, calculator.add(4.011, 4.0), 0.0);
    }

    @Test
    public void StringCalulator(){
        assertEquals(0, calculator1.add("", ""));
        assertEquals(8, calculator1.add("4", "4"));

    }


}
