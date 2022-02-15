package com.company;

public class Rhombus extends Shape{

    double diagonal1;
    double diagonal2;

    public Rhombus(String name, String color, double diagonal){
        super(name, color);
        this.diagonal1=diagonal;
        this.diagonal2=diagonal;
    }

    public Rhombus(String name, String color,double diagonal1,double diagonal2) {
        super(name, color);
        this.diagonal1=diagonal1;
        this.diagonal2=diagonal2;
    }

    public double getDiagonal1() {
        return diagonal1;
    }

    public void setDiagonal1(float diagonal1) {
        this.diagonal1 = diagonal1;
    }

    public double getDiagonal2() {
        return diagonal2;
    }

    public void setDiagonal2(float diagonal2) {
        this.diagonal2 = diagonal2;
    }

    @Override
    public double getArea(){
        return Math.pow(diagonal1,2)/2;
    }

    @Override
    public double getPerimeter(){
        return Math.sqrt(Math.pow(diagonal1/2,2)*2)*4;
    }


}
