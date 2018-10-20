package Assignment5;

public class Cookie extends DessertItem {
    private int numbers;
    private int pricePerDozen;

    //Cookie's constructor
    public Cookie(String name, int numbers, int pricePerDozen) {
        super(name);
        this.numbers = numbers;
        this.pricePerDozen = pricePerDozen;
    }

    //some getters and setters
    public int getNumbers() {
        return numbers;
    }

    public void setNumbers(int numbers) {
        this.numbers = numbers;
    }

    public int getPricePerDozen() {
        return pricePerDozen;
    }

    public void setPricePerDozen(int pricePerDozen) {
        this.pricePerDozen = pricePerDozen;
    }

    @Override
    public int getCost() {
        return (int) (numbers/12.00 * pricePerDozen);
    }

    @Override
    public String print() {
        //get the string format template which initialize at DesserShoppe
        // transfer cents to Dollars as well as cost
        String template =  DessertShoppe.s1;
        double toDollars = DessertShoppe.cents2dollars(getCost());
        return String.format(
                template, getNumbers() + " @ " + getPricePerDozen() + " /dz." + "\n" + getName(),
                toDollars);
    }
}
