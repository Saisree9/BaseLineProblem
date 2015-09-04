import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BillCalculator {
    private List<Object> listOfNonExemptedGoods = new ArrayList<>();
    private List<Object> listOfExemptedGoods = new ArrayList<>();

    public BillCalculator() {
        listOfNonExemptedGoods.add("perfume");
        listOfExemptedGoods.add("chocolate");
        listOfExemptedGoods.add("book");
        listOfExemptedGoods.add("headache pills");
        listOfNonExemptedGoods.add("music CD");
    }

    public Double getTotalCost(String listOfItems) {
        DecimalFormat df = new DecimalFormat("#.##");
        return new Double(df.format(calculateTotalCost(listOfItems)));
    }

    private Double calculateTotalCost(String listOfItems) {
        Double totalCost = 0.0;
        List<List<String>> listOfSplitedItems = new ArrayList<>();
        List<String> splitedListOfItems = getSplitList(listOfItems, "\n");
        for (int i = 0; i < splitedListOfItems.size(); i++) {
            List<String> splitedItem = getSplitList(splitedListOfItems.get(i), " ");
            listOfSplitedItems.add(splitedItem);
            int sizeOfSplitedItem1 = listOfSplitedItems.get(i).size();
            totalCost += new Double(listOfSplitedItems.get(i).get(sizeOfSplitedItem1 - 1));
        }
        return totalCost;
    }

    private List<String> getSplitList(String item, String ch) {
        List<String> splitedItem = new ArrayList<>();
        Collections.addAll(splitedItem, item.split(ch));
        return splitedItem;
    }
}
