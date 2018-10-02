package com.huiqi.question2;

public class Psychiatrist {

    public void examine(Moody moody){
        System.out.println("How are you feeling today?");
        moody.queryMood();

    }

    public void observe(Moody moody){
        moody.expressFeelings();
        System.out.println("Observation: " + moody.toString());
    }
}
