package Assignment5;

public class Candy extends DessertItem {


    private double weight;
    private int centsPerLb ;

    //Candy constructor
    public Candy(String name, double weight, int centsPerLb) {
        super(name);
        this.weight = weight;
        this.centsPerLb = centsPerLb;
    }

    //some getters and setters
    public double getWeight() {
        return this.weight;
    }

    public int getCentsPerLb() {
        return this.centsPerLb;
    }

    @Override
    public int getCost() {
        //System.out.println(getWeight() + " lbs." + " @ " + getCentsPerLb() + " /lb" + "\n" + getName());
        return (int) (getWeight() * getCentsPerLb());
    }

    @Override
    public String print() {
        //get the string format template which initialize at DesserShoppe
        // transfer cents to Dollars as well as cost
        String template =  DessertShoppe.s1;
        double toDollars = DessertShoppe.cents2dollars(getCost());
        return String.format(
                template, getWeight() + " lbs." + " @ " + getCentsPerLb() + " /lb." + "\n" + getName(),
                toDollars);
    }

}
