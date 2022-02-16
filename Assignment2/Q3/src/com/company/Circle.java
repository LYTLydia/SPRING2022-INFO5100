package com.company;

public class Circle extends Shape {

    double radius;

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle() {
        super();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    public double getArea(){
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public double getPerimeter(){
        return Math.PI*radius*2;
    }

    public void computeArea(){
        System.out.println("Area of this circle: "+getArea());
    }

    public  void computePerimeter(){
        System.out.println("Perimeter of this circle: "+getPerimeter());
    }
}
