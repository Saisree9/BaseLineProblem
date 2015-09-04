import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Bill generator is which generates the bill for the goods purchased by the customer
public class BillGenerator {
    public String bill(String listOfItems) {
        Double totalCost = 0.0;
        List<List<String>> listOfSplitedItems= new ArrayList<>();
        List<String> splitedListOfItems=getSplitList(listOfItems,"\n");
        for (int i = 0; i < splitedListOfItems.size(); i++) {
            List<String> splitedItem=getSplitList(splitedListOfItems.get(i)," ");
            listOfSplitedItems.add(splitedItem);
            int sizeOfSplitedItem1=listOfSplitedItems.get(i).size();
            totalCost+= new Double( listOfSplitedItems.get(i).get(sizeOfSplitedItem1 - 1));
        }

        DecimalFormat df = new DecimalFormat("#.##");

        return listOfItems + "\n" +
                " SalesTax:0.00\n" +
                " Total :" + df.format(totalCost);
    }

    private List<String> getSplitList(String item, String ch) {
        List<String> splitedItem = new ArrayList<>();
        Collections.addAll(splitedItem, item.split(ch));
        return splitedItem;
    }

}
