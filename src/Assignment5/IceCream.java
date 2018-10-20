package Assignment5;

public class IceCream extends DessertItem {

    private int iceCreamcost;

    //IceCream constructor
    public IceCream(String name, int iceCreamcost) {
        super(name);
        this.iceCreamcost = iceCreamcost;
    }

    public int getIceCreamcost() {
        return iceCreamcost;
    }

    /*public void setIceCreamcost(int iceCreamcost) {
        this.iceCreamcost = iceCreamcost;
    }
    */

    @Override
    public int getCost() {
        return iceCreamcost;
    }

    @Override
    public String print() {
        //get the string format template which initialize at DesserShoppe
        // transfer cents to Dollars as well as cost
        String template =  DessertShoppe.s1;
        double toDollars = DessertShoppe.cents2dollars(getCost());
        return String.format(template, getName(), toDollars);
    }
}
