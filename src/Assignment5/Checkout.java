package Assignment5;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Checkout {



    //create an empty linkedList to store dessertItems
    private List<DessertItem> dessertItems = new LinkedList<DessertItem>();

    //entern item to the desserItems list
    public void enterItem(DessertItem item){
        dessertItems.add(item);
    }

    public List<DessertItem> getDessertItems() {
        return dessertItems;
    }

    //number of items method
    public int numberOfItems(){
       return dessertItems.size();
    }

    //clear all the elements from linked list method
    public void clear(){
        dessertItems.clear();
    }

    //total cost method, without tax, in cents
    public int totalCost(){
        int totalCost=0;

        //to get every item's cost and add to the total cost as the final result
        for(DessertItem item : dessertItems){
            if(item.getCost() != 0){
                totalCost = totalCost + item.getCost();
            }
        }
        return totalCost;
    }

    //total tax, in cents
    public int totalTax(){
        return (int) (totalCost() * DessertShoppe.taxRate);
    }

    //a String representing a receipt of the current list of DesserItem's with the name.. etc
    public String toString(){
        StringBuilder sb = new StringBuilder();
        String template = DessertShoppe.s1;
        String tax = String.format(template, "Tax", DessertShoppe.cents2dollars(totalTax()));
        int totalCost = totalCost() + totalTax();
        String total = String.format(template, "Total Cost", DessertShoppe.cents2dollars(totalCost));
        for(DessertItem item: dessertItems){
            sb.append(item.print());
        }
        return "\n" + "       " + DessertShoppe.storeName +  "\n" + "       --------------------" + "\n" + sb
                + "\n" + tax + total;
    }

}
