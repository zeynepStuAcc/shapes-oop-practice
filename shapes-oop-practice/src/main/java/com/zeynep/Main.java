package com.zeynep;

public class Main {
      public static void main(String[] args) {

        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        Shape triangle = new Triangle(12,5);
        Shape triangle2 = new Triangle(33, 4);

        System.out.println("Circle area: " + circle.area());
        System.out.println("Rectangle area: " + rectangle.area());
        System.out.println("Triangle area" + triangle);
        System.out.println("Triangle2 area" + triangle2);
        
    }
}