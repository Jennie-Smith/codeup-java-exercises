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
        test.addGrade(90);
        test.addGrade(60);
        test.addGrade(60);
//        average 70
        jennie = new Student(43902843, "Jennie");
        jennie.addGrade(50);
        jennie.addGrade(30);
        jennie.addGrade(90);
//        56.66667
//        63.3333
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

    @Test
    public void testInstanceCanGetCurrentList(){
        assertEquals(cohortTest.getStudents(), cohortTest.getStudents());
    }

    @Test
    public void testGetAverageOfAllStudents(){
        cohortTest.getCohortAverage();
        assertEquals(63.3, cohortTest.getCohortAverage(), 0.1);
    }



}
