package com.company;

public class Student {

    int rollNumber;
    String name;

    public Student(int rollNumber, String name){
        this.rollNumber=rollNumber;
        this.name=name;
    }

    public Student(Student students){
        this.rollNumber=students.rollNumber;
        this.name=students.name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int printRoll(){
        return this.rollNumber;
    }

    public String printName(){
        return  this.name;
    }



}
