package com.zeynep;

public class Triangle extends Shape {
    public double width;
    public double h;

    public Triangle(double width,double h){
        this.width=width;
        this.h=h;
    }
    @Override
    public double area() {
        return (width * h)/2;
    }




}
