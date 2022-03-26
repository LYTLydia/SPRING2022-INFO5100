package com.company;

public class Main {

    public static void main(String[] args) {
        Context add = new Context(new AddOperation());
        System.out.println(add.execute(20, 30)); // Expects 50
        Context subtract = new Context(new SubtractOperation());
        System.out.println(subtract.execute(18, 4)); // Expects 14
        Context multiply = new Context(new MultiplyOperation());
        System.out.println(multiply.execute(11, 30)); // Expects 330
    }
}
















