package com.huiqi.question2;

public class Sad extends Moody {

    @Override
    protected String getMood(){
        return "sad";
    }

    @Override
    public void expressFeelings() {
        System.out.println("'wah' 'boo hoo' 'weep' 'sob' 'weep' ");
    }

    public String toString(){
        return "Subject cries a lot";
    }


    /*


    public void queryMood(){
        System.out.println("I feel sad today!");
    }
      


     */
}
