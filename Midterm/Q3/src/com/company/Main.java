package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("*******************");
        Psychiatrist p1 = new Psychiatrist("LL", new Happy());
        Psychiatrist p2 = new Psychiatrist("ZY", new Sad());


        p1.examine(p1.moody);
        p1.observe(p1.moody);
        System.out.println("********************");
        p2.examine(p2.moody);
        p2.observe(p2.moody);

    }
}
