import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CohortTest {
    Student test = null;
    Student jennie = null;

    Cohort cohortTest;


    @Before
    public void testStudentData(){
        cohortTest = new Cohort();
        test = new Student(5490385, "test");
        jennie = new Student(43902843, "Jennie");
        cohortTest.addStudent(test);
        cohortTest.addStudent(jennie);
    }
//    A Cohort instance can add a Student to the List of students.
//A Cohort instance can get the current List of students.
//A Cohort instance can get the average, and it's being calculated correctly.
    @Test
    public void testToAddStudentToListOfStudents(){
        Student addStudentTest = new Student(843920, "Jamie");
        cohortTest.addStudent(addStudentTest);
        assertSame(addStudentTest, cohortTest.getStudents().get(cohortTest.getStudents().size() - 1));
    }


}
