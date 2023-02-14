package org.example.interfaceColorable;

public class Square implements Colorable {
    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public String howToColor() {
        return "Cách tô màu: Tô màu tất cả các bề mặt";
    }
}