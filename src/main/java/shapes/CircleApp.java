package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
//        System.out.println("Enter Radius: ");
        Input circleInput = new Input();
        System.out.println("Enter a radius: ");
        double radius = circleInput.getDouble();
        Circle circle = new Circle(radius);
        System.out.println("Area: " + circle.getArea());
        System.out.println("Circumference: " + circle.getCircumference());

//        notes:
//        prompt user for radius of circle
//        create a circle object using radius
//        display circumference and area

    }
}
