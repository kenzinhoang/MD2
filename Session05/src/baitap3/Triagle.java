package baitap3;

public class Triagle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    //construc
    public Triagle() {
        super();
        this.side1 = 1.0;
        this.side2 = 1.0;
        this.side3 = 1.0;
    }

    public Triagle(double side1, double side2, double side3, String color) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    //get&set


    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    //Perimeter
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    //Area
    public double getArea() {
        return Math.sqrt(getPerimeter() * (getPerimeter() - side1) * (getPerimeter() - side2) * (getPerimeter() - side3));
    }

    //toString

    @Override
    public String toString() {
        return "Triangle: side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                ", perimeter=" + getPerimeter() +
                ", area=" + getArea() +
                " " +
                super.toString();
    }
}
