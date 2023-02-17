package shapes;

abstract class Quadrilateral extends Shape implements Measurable{
    protected double length;
    protected double width;
    protected double side;

//    double getPerimeter(); implements measurable
    public abstract double getPerimeter();

//        double perimeter = (2 * length) + (2 * width);
//        return perimeter;

//    double getArea(); implements measurable
    public abstract double getArea();
//    {
//        double area = length * width;
//        return area;
//    }

    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Quadrilateral(double side) {
        this.side = side;
    }

    //extends shape
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
//extends shape
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

}
