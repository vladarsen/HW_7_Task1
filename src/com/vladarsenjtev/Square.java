package com.vladarsenjtev;

public class Square implements Geometric {
    private double longSquare;
    private double widthSquare;

    public Square(double longSquare, double widthSquare) {
        this.longSquare = longSquare;
        this.widthSquare = widthSquare;
    }

    public void setLongSquare(double longSquare) {
        this.longSquare = longSquare;
    }

    public void setWidthSquare(double widthSquare) {
        this.widthSquare = widthSquare;
    }

    @Override
    public double area() {
        return longSquare * widthSquare;
    }

    @Override
    public String toString() {
        return "Square{" +
                "longSquare=" + longSquare +
                ", widthSquare=" + widthSquare +
                '}';
    }
}