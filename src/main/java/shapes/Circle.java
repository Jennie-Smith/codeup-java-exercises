package shapes;

import util.Input;
import java.lang.Math;

public class Circle {
    private double radius;

    public Circle(double Radius) {
        this.radius = Radius;
    }

    public double getArea(){
        double pi = Math.PI;
        double area = pi * (radius * radius);
        return area;
    }

    public double getCircumference(){
        double pi = Math.PI;
        double circumference = 2 * pi * radius;
        return circumference;
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


}
