package com.company;

public class Professor extends Person{
    public Professor(String name, int id, int age) {
        super(name, id, age);
    }

    public void giveQuiz(){
        System.out.println("Please complete this simple quiz in 15 min.");
    }
}
