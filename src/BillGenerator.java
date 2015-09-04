import java.text.DecimalFormat;

//Bill generator is which generates the bill for the goods purchased by the customer
public class BillGenerator {

    private BillCalculator billCalculator = new BillCalculator();

    public String bill(String listOfItems) {
        Double totalCost = billCalculator.getTotalCost(listOfItems);

        DecimalFormat df = new DecimalFormat("#.##");

        return listOfItems + "\n" +
                " SalesTax:0.00\n" +
                " Total :" + df.format(totalCost);
    }


}
