import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {
    Student test = null;
    Student jennie = null;

    @Before
    public void testDataStudentTest(){
        test = new Student(5490385, "test");
        test.addGrade(90);
        test.addGrade(60);
        test.addGrade(60);
        jennie = new Student(43902843, "Jennie");
    }
//The Student class should have a constructor that sets both the name and id property,
// it initializes the grades property as an empty ArrayList.
    @Test
    public void testIfNameMatchesConstructor(){
        assertEquals("Jennie", jennie.getName());
    }
    @Test
    public void testIfIDMatchesConstructor(){
        assertEquals(43902843, jennie.getId());
    }

    @Test
    public void testIfGradesAreAdded(){
        test.addGrade(70);
        System.out.println(test.getGrades());
        assertSame(70, test.getGrades().get(0));
//        assertTrue(test.getGrades().contains(70));
    }

    @Test
    public void testIfDoubleGetGradeAverage(){
        test.getGradeAverage();
//        delta a variance in the number - tolerance
        assertEquals(70, test.getGradeAverage(), 0);
    }


}
