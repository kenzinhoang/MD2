package baitap1;

public class Circle {
    public final float pi = 3.14f;
    private double radius;
    private String color;

    //constructor
    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    //get
    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    //set
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //dien tich
    public double getArea() {
        return pi * radius * radius;
    }


    //toString
    @Override
    public String toString() {
        return "Circle [radius=" + radius + ", color=" + color + ",S=" + getArea() + "]";
    }
}