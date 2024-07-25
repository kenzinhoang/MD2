package rikkei.academy;


public class Square extends Rectangle {
    private double side;

    public Square() {
    }

    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    public void setHeight(double height) {
        setSide(height);
    }

    public String toString() {
//        return "A Square with side = "
//                + getSide()
//                + ", which is a subclass of "
//                + super.toString();
        return "A Square with side = " + this.getSide();
    }

    @Override
    public void resize(double percent) {
        this.side = this.side + (this.side * percent / 100);
    }

    @Override
    public void howToColor() {
        getColor();
    }
}
