package Assignment5;

public class Sundae extends IceCream {

    private int sundaeCost;
    private String sundaeName;

    public Sundae(String name, int iceCreamcost, String sundaeName, int sundaeCost) {
        super(name, iceCreamcost);
        this.sundaeCost = sundaeCost;
        this.sundaeName = sundaeName;
    }

    public int getSundaeCost() {
        return sundaeCost;
    }

    public String getSundaeName(){
        return sundaeName;
    }

    public int getCost() {
        return getIceCreamcost() + getSundaeCost();
    }

    public String print(){
        String template =  DessertShoppe.s1;
        double toDollars = DessertShoppe.cents2dollars(getCost());
        return String.format(template, getName() + " with " + "\n" +
                getSundaeName() , toDollars);
    }


}
