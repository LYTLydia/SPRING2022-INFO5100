package com.company;

public class Student extends Person{
    public Student(String name, int id, int age) {
        super(name, id, age);
    }

    public void takeQuiz(){
        System.out.println("I've done the quiz and submitted it on Canvas.");
    }
}
