package shapes;

public class Square extends Quadrilateral{
//    public Square(double length, double width) {
//        super(length, width);
//    }
    public Square(double side){
        super(side, side);
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        double perimeter = 4 * side;
        return perimeter;
    }

    @Override
    public double getArea() {
        double area = side * side;
        return area;
    }


//    public Square(int side){
//        super(side, side);
//        this.side = side;
//    }
//
//
//    @Override
//    public int getArea() {
//        int area = side * side;
//        return area;
//    }
//
//    @Override
//    public int getPerimeter() {
//        int perimeter = 4 * side;
//        return perimeter;
////        return super.getPerimeter();
//    }
}
