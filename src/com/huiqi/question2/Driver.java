package com.huiqi.question2;

public class Driver {

    public static void main(String[] args) {
        Moody sad = new Sad();
        Moody happy = new Happy();

        Psychiatrist psychiatrist = new Psychiatrist();
        psychiatrist.examine(sad);
        psychiatrist.observe(sad);

        psychiatrist.examine(happy);
        psychiatrist.observe(happy);
    }
}
