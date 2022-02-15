package com.company;

public class Main {

    public static void main(String[] args) {

        Triangle tri = new Triangle("triangle", "blue", 8.8);
        Rhombus rh = new Rhombus("rhombus", "yellow", 6.5);

        tri.printShape();
        rh.printShape();
    }
}
