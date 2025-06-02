package Model;

public class Rectangle extends FigureAbs {

    private double base;
    private double height;
    private double side1;
    private double side2;
    private double side3;

    public Rectangle(double base, double height, double side1, double side2, double side3) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double getArea(){
        return (base * height) / 2;
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

}