package grades;

import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) {
        Student Jade = new Student("Jade");
        System.out.println(Jade);
        Jade.addGrade(90);
        Jade.addGrade(80);
        Jade.addGrade(50);
        System.out.println(Jade);
        Student Ned = new Student("Ned");
        Ned.addGrade(60);
        System.out.println(Ned +" "+ Jade);
        System.out.println(Jade.getGradeAverage());
//        System.out.println(Ned.getGradeAverage());


    }
}
