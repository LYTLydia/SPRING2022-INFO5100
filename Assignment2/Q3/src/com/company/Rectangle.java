package com.company;

public class Rectangle extends Shape{

    double length;
    double width;

    public Rectangle(double length, double width) {
        super();
        this.length=length;
        this.width=width;
    }

    public Rectangle(){
        super();
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea(){
        return length*width;
    }

    @Override
    public double getPerimeter(){
        return (length+width)*2;
    }

    public void computeArea(){
        System.out.println("Area of this rectangle: "+getArea());
    }

    public void computePerimeter(){
        System.out.println("Perimeter of this rectangle: "+getPerimeter());
    }
}
