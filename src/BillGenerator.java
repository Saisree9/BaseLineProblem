import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Bill generator is which generates the bill for the goods purchased by the customer
public class BillGenerator {
    public String bill(String listOfItems) {
        String ch = " ";
        List<Object> splitedItem = getSplitList(listOfItems, ch);
        int size = splitedItem.size();
        String totalCost = (String) splitedItem.get(size - 1);
        return listOfItems + "\n" +
                " SalesTax:0.00\n" +
                " Total :" + totalCost;
    }

    private List<Object> getSplitList(String item, String ch) {
        List<Object> splitedItem = new ArrayList<>();
        Collections.addAll(splitedItem, item.split(ch));
        return splitedItem;
    }

}
