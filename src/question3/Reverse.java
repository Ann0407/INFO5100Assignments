package question3;


import java.util.LinkedList;
import java.util.List;

public class Reverse {

    public String reverse(String s){

        String[] arr = s.split(" ");
        String result = "";

        for(int i=arr.length;i>=0;i--){

            result += arr[i];

        }

        return result;
    }


}
