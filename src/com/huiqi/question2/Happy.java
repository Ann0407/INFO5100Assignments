package com.huiqi.question2;

public class Happy extends Moody {

    @Override
    protected String getMood(){
        return "happy";
    }

    @Override
    public void expressFeelings() {
        System.out.println("hehehe...hahahah...HAHAHAHAHA!!!");
    }

    public String toString(){
        return "Subject laughs a lot";
    }

    /*


    public void queryMood(){
        System.out.println("I feel happy today!");
    }



     */

}
