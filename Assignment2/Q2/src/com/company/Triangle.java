package com.company;

public class Triangle extends Shape{
    double base;
    double height;

    public Triangle(String name, String color, double base, double height) {
        super(name, color);
        this.base=base;
        this.height=height;
    }

    public Triangle(String name, String color, double side){
        super(name, color);
        this.height=Math.sqrt(Math.pow(side,2)-Math.pow(side/2,2));
        this.base=side;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea(){
        return base*height/2;
    }

    @Override
    public double getPerimeter(){
        return this.base*3;
    }
}
