import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Roster {

    ArrayList<Student> students = new ArrayList<Student>();
    Map<String,String> studentDepartments = new HashMap<String, String>();


    public void createDictionary(){
        Student student = new Student("s0189034","Peter",17,new Email("eter","math"),Gender.MALE);
        students.add(student);
        Student student2 = new Student("s0289125","Michael",21, new Email("mike","geo"),Gender.MALE);
        students.add(student2);
        Student student3 = new Student("s0378435","Helen",28, new Email("helen","phys"),Gender.FEMALE);
        students.add(student3);
        Student student4 = new Student("s0412375","Mary",18, new Email("mary","inf"),Gender.FEMALE);
        students.add(student4);
        Student student5 = new Student("s0456782","John",22,new Email("john","inf"),Gender.MALE);
        students.add(student5);
        Student student6 = new Student("s0355689","Dana",33,new Email("dana","ling"),Gender.FEMALE);
        students.add(student6);
        Student student7 = new Student("s0768633","Lee",36,new Email("lee","chem"),Gender.FEMALE);
        students.add(student7);
    }

    public void createStudentDepartments(){
        studentDepartments.put(Department.CHEMESTRY.getDomain(),Department.CHEMESTRY.getDepartmentName());
        studentDepartments.put(Department.GEOSCIENCES.getDomain(),Department.GEOSCIENCES.getDepartmentName());
        studentDepartments.put(Department.INFORMATICS.getDomain(),Department.INFORMATICS.getDepartmentName());
        studentDepartments.put(Department.LINGUISTICS.getDomain(),Department.LINGUISTICS.getDepartmentName());
        studentDepartments.put(Department.MATH.getDomain(),Department.MATH.getDepartmentName());
        studentDepartments.put(Department.PHYS.getDomain(),Department.PHYS.getDepartmentName());
    }

    /**
     * getAllStudents
     *
     * Function for return all the students in the Dictionary
     *
     * @return ArrayList of Students
     */
    public ArrayList<Student> getAllStudents(){
       return students;
    }

    /**
     * Search Student by name in the directory
     *
     * @param name = Student name
     * @return ArrayList contains students with the same name
     */
    public ArrayList<Student> getStudentByName(String name){

        ArrayList<Student> studentsByName = new ArrayList<Student>();

        for(Student student:students){
            if(student.getName().equals(name)){
                studentsByName.add(student);
            }
        }

        return studentsByName;
    }

    /**
     * Search Student by matriculation in the directory
     *
     * @param matriculationNbr = matriculation number
     * @return Student object
     */
    public Student getStudentByMatriculation(String matriculationNbr){
        for(Student student:students){
            if(student.getMatriculationNbr().equals(student.getMatriculationNbr())){
                return student;
            }
        }
        return null;
    }

    /**
     * Search Student by department in the hashmap departments
     *
     * @param department
     * @return ArrayList of Students
     */
    public ArrayList<Student> getStudentByDepartment(String departmentParam){

        Department department = validateDepartment(departmentParam);
        ArrayList<Student> studentsByDepartment = new ArrayList<Student>();
        
        for(Student student:students){
            if(student.getMail().getDomain().equals(department.getDomain())){
                studentsByDepartment.add(student);
            }
        }

        return studentsByDepartment;

    }

    /**
     * Search Student by age and gender
     *
     * @param age, Gender enum: Male or Female
     * @return ArrayList of Students filtered by age and gender
     */
    public ArrayList<Student> getStudentsByAgeAndGender(Integer age, Gender gender){
        ArrayList<Student> studentsByAgeAndGender = new ArrayList<Student>();

        for(Student student:students){
            if(student.getAge().equals(age) && student.getGender().equals(gender)){
                studentsByAgeAndGender.add(student);
            }
        }

        return studentsByAgeAndGender;
    }

    /**
     * Validate the type of department
     *
     * @param department
     * @return Department obj
     */
    private Department validateDepartment(String department){
        Department filterByDepartment = null;
        
        if(Department.CHEMESTRY.getDepartmentName().equals(department)){
            filterByDepartment = Department.CHEMESTRY;
        } else if(Department.GEOSCIENCES.getDepartmentName().equals(department)){
            filterByDepartment = Department.GEOSCIENCES;
        } else if(Department.INFORMATICS.getDepartmentName().equals(department)){
            filterByDepartment = Department.INFORMATICS;
        } else if(Department.LINGUISTICS.getDepartmentName().equals(department)){
            filterByDepartment = Department.MATH;
        } else if(Department.MATH.getDepartmentName().equals(department)){
            filterByDepartment = Department.PHYS;
        } else {
            new Exception("department not valid");
        }
        return filterByDepartment;
    }
}
