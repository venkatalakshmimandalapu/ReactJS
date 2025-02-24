package com.wipro.microservices.liskovprinciple;

public class Test {
    static void getAreaTest(Shape shape) {
        System.out.println("Expected area: " + shape.getArea());
    }

    public static void main(String[] args) {
        Rectangle rc = new Rectangle(2, 3);
        getAreaTest(rc);

        Square sq = new Square(5);
        getAreaTest(sq);
    }
}