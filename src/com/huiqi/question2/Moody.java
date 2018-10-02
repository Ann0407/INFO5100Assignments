package com.huiqi.question2;

abstract public class Moody {

    abstract protected String getMood();

    abstract protected void expressFeelings();

    public void queryMood(){
        System.out.println("I feel " + getMood() + " today!");
    }
}

