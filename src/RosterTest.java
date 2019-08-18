import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class RosterTest {

    Roster roster = null;
    ArrayList<Student> testStudentsArray = null;

    @Before
    public void setUp() throws Exception {
        roster = new Roster();
        roster.createDictionary();
        roster.createStudentDepartments();
        testStudentsArray = new ArrayList<Student>();
        addListOfStudents();
    }

    @Test
    public void getAllStudents() {
        ArrayList<Student> students;
        students = roster.getAllStudents();
        assertEquals(students.size(),testStudentsArray.size());

        for(int i=0; i< students.size(); i++){
            assertTrue(students.get(i).equals(testStudentsArray.get(i)));
        }
    }

    @Test
    public void getStudentByName() {
        ArrayList<Student> students;
        students = roster.getStudentByName("Peter");
        for(Student student:students){
            assertTrue("Student by name not found",student.getName().equals("Peter"));
        }
    }

    @Test
    public void getStudentByMatriculation() {
        Student enrolledStudent = roster.getStudentByMatriculation("s0189034");
        assertTrue("Matriculation not found",enrolledStudent.getMatriculationNbr().equals("s0189034"));
    }

    @Test
    public void getStudentByDepartment() {
        ArrayList<Student> students;
        boolean found = false;
        students = roster.getStudentByDepartment(Department.CHEMESTRY.getDepartmentName());
        for(Student student:students){
            assertTrue("Department not found",student.getMail().getDomain().equals(Department.CHEMESTRY.getDomain()));
        }
    }

    @Test
    public void getStudentsByAgeAndGender() {
        ArrayList<Student> students;
        boolean found = false;
        students = roster.getStudentsByAgeAndGender(18,Gender.FEMALE);
        for(Student student:students){
            if(student.getAge() == 18 && student.getGender().equals(Gender.FEMALE)){
                found = true;
            }
        }
        assertTrue("Student by age and Gender not found",found);
    }

    /**
     * addListOfStudents()
     *
     * Method used to fill the ArrayList<Student>
     */
    public void addListOfStudents(){
        Student student = new Student("s0189034","Peter",17,new Email("eter","math"),Gender.MALE);
        testStudentsArray.add(student);
        Student student2 = new Student("s0289125","Michael",21, new Email("mike","geo"),Gender.MALE);
        testStudentsArray.add(student2);
        Student student3 = new Student("s0378435","Helen",28, new Email("helen","phys"),Gender.FEMALE);
        testStudentsArray.add(student3);
        Student student4 = new Student("s0412375","Mary",18, new Email("mary","inf"),Gender.FEMALE);
        testStudentsArray.add(student4);
        Student student5 = new Student("s0456782","John",22,new Email("john","inf"),Gender.MALE);
        testStudentsArray.add(student5);
        Student student6 = new Student("s0355689","Dana",33,new Email("dana","ling"),Gender.FEMALE);
        testStudentsArray.add(student6);
        Student student7 = new Student("s0768633","Lee",36,new Email("lee","chem"),Gender.FEMALE);
        testStudentsArray.add(student7);
    }
}