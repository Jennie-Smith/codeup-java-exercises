package shapes;
//
public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape = new Rectangle(4, 5);
        System.out.println("Perimeter: " + myShape.getPerimeter());
        System.out.println("Area: " + myShape.getArea());

        Measurable newShape = new Square(5);
        System.out.println("Square Perimeter: " + newShape.getPerimeter());
        System.out.println("Square Area: " + newShape.getArea());

//        System.out.println(myShape.getArea(5, 6));
    }
//    public static void main(String[] args) {
//        Rectangle box1 = new Rectangle(5, 4);
//        System.out.println("Perimeter: " + box1.getPerimeter());
//        System.out.println("Area: " + box1.getArea());
//
//        Rectangle box2 = new Square(5);
//        System.out.println("Perimeter: " + box2.getPerimeter());
//        System.out.println("Area: " + box2.getArea());
//    }
}
