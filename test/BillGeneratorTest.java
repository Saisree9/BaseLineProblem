import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BillGeneratorTest {
    @Test
    public void shouldReturnReceiptForBookWhichIsExempted() {
        BillGenerator billGenerator = new BillGenerator();
        String actual = billGenerator.bill("1 book of 12.36");
        assertEquals("1 book of 12.36\n SalesTax:0.00\n Total :12.36", actual);
    }

    @Test
    public void shouldReturnReceiptForChocolateBarWhichIsExempted() {
        BillGenerator billGenerator = new BillGenerator();
        String actual = billGenerator.bill("1 chocolate bar at 0.85");
        assertEquals("1 chocolate bar at 0.85\n SalesTax:0.00\n Total :0.85", actual);
    }

    @Test
    public void shouldReturnReceiptForTwoItemsWhichAreExempted() {
        BillGenerator billGenerator = new BillGenerator();
        String actual = billGenerator.bill("1 book of 12.36\n1 chocolate bar at 0.85");
        assertEquals("1 book of 12.36\n1 chocolate bar at 0.85\n SalesTax:0.00\n Total :13.21", actual);
    }

}
