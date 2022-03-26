package com.company;

public class Main {

    public static void main(String[] args) {

        Student sample = new Student();
        Student lydia = new Student(sample);
        lydia.setName("Lydia");
        lydia.setID("NU001569817");
        lydia.setGPA(4.0);
        lydia.printStudent();
        sample.printStudent();


        Student example = new Student();
        Student helen = example;
        helen.setName("Helen");
        helen.setID("z5051323");
        helen.setGPA(3.8);
        helen.printStudent();
        example.printStudent();
    }





}
