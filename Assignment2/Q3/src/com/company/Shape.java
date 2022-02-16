package com.company;

public class Shape {

    String name;
    double area;
    double perimeter;

    public Shape(String name){
        this.name=name;
    }

    public Shape(String name, double area, double perimeter){
        this.name=name;
        this.area=area;
        this.perimeter=perimeter;
    }

    public Shape() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//The question asks us to initiate a computeArea and computePerimeter without void, so I changed getArea to computeArea
    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
//same with area
    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public void display(){
        System.out.println("This "+this.getName()+" has area: "+this.getArea()+" and perimeter: "+this.getPerimeter());
    }
}
