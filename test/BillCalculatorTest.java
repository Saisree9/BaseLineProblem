import org.junit.Test;

import static org.junit.Assert.*;

public class BillCalculatorTest {
    @Test
    public void shouldReturnTheCostOfThePurchasedItem() {
        BillCalculator billCalculator = new BillCalculator();
        Double actual = billCalculator.getTotalCost("1 chocolate bar at 0.85");
        assertEquals(0.85, actual, 0.00);
    }

    @Test
    public void shouldReturnTheCostOfThePurchasedItems() {
        BillCalculator billCalculator = new BillCalculator();
        Double actual = billCalculator.getTotalCost("1 book of 12.36\n" + "1 chocolate bar at 0.85");
        assertEquals(13.21, actual, 0.00);
    }

}