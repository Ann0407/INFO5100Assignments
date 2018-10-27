package Assignment6;

public class Pet {

    private String PetName;
    private String Color;
    protected int sex;

    public Pet(String petName, String ownerName, String color){
        this.PetName = petName;
        this.Color = color;

    }

    public String getPetName(){
        return PetName;
    }

    public String getColor() {
        return Color;
    }

    public String getSex() {
        return String.valueOf(Sex.values());
    }

    public void setSex(int sexId){
        this.sex = sexId;
    }

    /*
    Spot owned by Mary
    Color: Black and White
    Sex: Male
     */

    public String toString(){
        return "DOG:" + "\n" + getPetName() + " owned by Mary " + "\n" + "Color: " + getColor() + "\n" +
                "Sex: " + getSex() + "\n";
    }

    public enum Sex{
        MALE(1),
        FEMALE(2),
        SPAYED(3),
        NEUTERED(4);

        private int sex;

        // getter method
        public int getSex()
        {
            return this.sex;
        }

        // enum constructor - cannot be public or protected
        private Sex(int sex)
        {
            this.sex = sex;
        }
        }


}

