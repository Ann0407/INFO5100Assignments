package Assignment6;

public class Dog extends Pet implements Boardable {

    private String size;
    private int startDays;
    private int endDays;
    private int boradingDays;

    public Dog(String petName, String ownerName, String color, String size) {
        super(petName, ownerName, color);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public String toString(){
        return "DOG:" + "\n" + getPetName() + " owned by Mary " + "\n" + "Color: " + getColor() + "\n" +
                "Sex: " + getSex() + "\n" +  "Size: " + getSize() + "\n";
    }

    @Override
    public void setBoardStart(int month, int day, int year) {
        startDays = year*12 + month * 31 + day;

    }

    @Override
    public void setBoardEnd(int month, int day, int year) {
        endDays = year*12 + month * 31 + day;

    }

    @Override
    public boolean boarding(int month, int day, int year) {
        boradingDays = year*12 + month * 31 + day;
        return (boradingDays <= endDays) && (boradingDays>=startDays);
    }
}
