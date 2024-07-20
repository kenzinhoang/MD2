package baitap3;

public class Shape {
    String color;

    //Construc
    public Shape() {
    }

    public Shape(String color) {
        this.color = color;
    }
    //get&set

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //toString


    public String toString() {
        return "Shape [color=" + color + "]";
    }
}

