package com.company;

public class Sad extends Moody{
    @Override
    String getMood() {
        return "I feel sad Today";
    }

    @Override
    void ExpressFeelings() {
        System.out.println("‘waah’ ‘boo hoo’ ‘weep’ ‘sob‘");
    }


    public String toString() {
        return "Subject cries a lot";
    }
}