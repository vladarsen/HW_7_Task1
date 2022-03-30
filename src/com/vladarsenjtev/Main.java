package com.vladarsenjtev;

public class Main {

    public static void main(String[] args) {
        Geometric[] geometric = {new Circle(7), new Triangle(10, 7), new Square(80, 150)};
        System.out.println(geometric[0].area());
        System.out.println(geometric[1].area());
        System.out.println(geometric[2].area());
        System.out.println(totalArea(geometric));
    }

    public static double totalArea(Geometric[] geometric) {
        double totalArea = 0;
        for (Geometric value : geometric) {
            totalArea += value.area();
        }
        return totalArea;
    }
}
