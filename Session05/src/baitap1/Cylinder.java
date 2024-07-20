package baitap1;

public class Cylinder extends Circle {
    private double height;

    //construc
    public Cylinder() {
        super();
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;

    }

    //get
    public double getHeight() {
        return height;
    }

    //set
    public void setHeight(double height) {
        this.height = height;
    }

    //get V
    public double getV() {
        return getArea() * height;
    }

    //toString
    public String toString() {
        return "Cylinder [height=" + height + ", Radius()=" +
                getRadius() + ", Color()=" + getColor() + ", Volume= " + getV() + "]";
    }
}
