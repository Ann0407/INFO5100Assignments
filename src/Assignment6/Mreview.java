package Assignment6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Mreview implements Comparable<Mreview> {

    //intance variables
    private String title;

    //list of ratings stored in a Store object
    private ArrayList<Integer> rating;

    //constructor
    public Mreview(){

        this.title = "";
        rating = new ArrayList<Integer>();
    }

    public Mreview(String ttl){

        this.title = ttl;
        rating = new ArrayList<Integer>();

    }

    public Mreview(String ttl, int firstRating){
        this.title =ttl;
        List<Integer> fRating = Arrays.asList(new Integer[1]);
        fRating.set(0, firstRating);
    }

    public String getTitle() {
        return title;
    }

   public void addRating(int r){
        rating.add(r);
   }

   private double avgRating(){
        double totalRating =0.00;
        //int counter=0;
        for(int i=0; i<rating.size(); i++){

            totalRating = totalRating + rating.get(i);

        }
        return totalRating / rating.size();
   }

   private int numRating(){
        return rating.size();
   }


    @Override
    public int compareTo(Mreview obj) {
        return Integer.compare(0, title.compareTo(obj.title));
    }

    public boolean equals(Mreview obj){
        return this.title.equals(obj.title);
    }

    public String toString(){
        return getTitle() + "," +  " average " + avgRating() +  " out of " + numRating() + " ratings.";
    }

    //test for main()
    public static void main(String[] args) {
        //test for the Mreview() constructor
        Mreview mreview = new Mreview();
        mreview.title = "Be yourself";

        //test for the Mreview(string) constructor
        Mreview mreview1 = new Mreview("Be yourself");
        //Mreview mreview2 = new Mreview("Trust yourself");
        //Mreview mreview3 = new Mreview("Boost your confidence");


        // test for addRating
        mreview1.addRating(3);
        mreview1.addRating(4);
        mreview1.addRating(6);

        //test for the getTitle method
        System.out.println(mreview1.getTitle());

        //test for the avgRating
        System.out.println(mreview1.avgRating());

        //test for the numRating
        System.out.println(mreview1.numRating());

        //test for the tostring
        System.out.println(mreview1.toString());

        //test for compareto and equals
        System.out.println(mreview.compareTo(mreview1));
        System.out.println(mreview.equals(mreview1));


    }


}
