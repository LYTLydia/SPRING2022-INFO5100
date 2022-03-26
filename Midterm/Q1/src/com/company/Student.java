package com.company;

import java.sql.SQLOutput;

public class Student {
    private String name;
    private String ID;
    private double GPA;

    public Student(){
        name="student name";
        ID=null;
        GPA=0;
    }

    public Student( Student student){
        Student ste = new Student();
        this.name = ste.name;
        this.ID = ste.ID;
        this.GPA= ste.GPA;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public void printStudent(){
        System.out.println("************");
        System.out.println("Name = " + this.name);
        System.out.println("ID = " + this.ID);
        System.out.println("GPA = "+this.GPA);
    }
}






