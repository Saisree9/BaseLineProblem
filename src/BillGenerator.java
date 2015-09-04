import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

//Bill generator is which generates the bill for the goods purchased by the customer
public class BillGenerator {
    private List<Object> listOfNonExemptedGoods=new ArrayList<>();
    private List<Object> listOfExemptedGoods=new ArrayList<>();
    private BillCalculator billCalculator =new BillCalculator() ;
    public BillGenerator(){
        listOfNonExemptedGoods.add("perfume");
        listOfExemptedGoods.add("chocolate");
        listOfExemptedGoods.add("book");
        listOfExemptedGoods.add("headache pills");
        listOfNonExemptedGoods.add("music CD");
    }
    public String bill(String listOfItems) {
        Double totalCost = billCalculator.getTotalCost(listOfItems);

        DecimalFormat df = new DecimalFormat("#.##");

        return listOfItems + "\n" +
                " SalesTax:0.00\n" +
                " Total :" + df.format(totalCost);
    }





}
