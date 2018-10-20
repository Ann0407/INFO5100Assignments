package Assignment5;

public abstract class DessertItem  {

    private String name;

    //constructor
    public DessertItem(String name){
        this.name = name;
    }

    //methods for deseerItem Class
    protected String getName() {
        return this.name;
    }

    public abstract int getCost();

    public abstract String print();
}
