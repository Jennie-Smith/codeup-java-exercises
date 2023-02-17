package shapes;


public class Rectangle extends Quadrilateral {
    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public double getPerimeter() {
        double perimeter = (2 * length) + (2 * width);
        return perimeter;
    }

    @Override
    public double getArea() {
        double area = length * width;
        return area;
    }
//    public Rectangle(double length, double width) {
//        super(length, width);
//    }
//    protected static int length;
//    protected static int width;
//
//    public Rectangle(int length, int width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    public int getArea(){
//        int area = length * width;
//        return area;
//    }
//
//    public int getPerimeter(){
//        int perimeter = (2 * length) + (2 * width);
//        return perimeter;
//    }
//
//
//
//    public int getLength() {
//        return length;
//    }
//
//    public void setLength(int length) {
//        this.length = length;
//    }
//
//    public int getWidth() {
//        return width;
//    }
//
//    public void setWidth(int width) {
//        this.width = width;
//    }
}
