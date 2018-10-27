package Assignment6;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Cat extends Pet implements Boardable {

    private String hairLength;
    private int startDays;
    private int endDays;
    private int boradingDays;

    public Cat(String petName, String ownerName, String color, String hairLength) {
        super(petName, ownerName, color);
        this.hairLength = hairLength;
    }

    public String getHairLength() {
        return hairLength;
    }

    public String toString(){
        return "DOG:" + "\n" + getPetName() + " owned by Mary " + "\n" + "Color: " + getColor() + "\n" +
                "Sex: " + getSex() + "\n" +  "Hair: " + getHairLength() + "\n";
    }

    @Override
    public void setBoardStart(int month, int day, int year){
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
