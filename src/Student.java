import java.util.Objects;

public class Student {
    private String matriculationNbr;
    private String name;
    private Integer age;
    private Email mail;
    private Gender gender;

    @Override
    public boolean equals(Object o) {
        Student student = (Student) o;
        return matriculationNbr.equals(student.matriculationNbr) &&
                name.equals(student.name) &&
                age.equals(student.age) &&
                mail.getInEmailFormat().equals(student.getMail().getInEmailFormat()) &&
                gender == student.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(matriculationNbr, name, age, mail, gender);
    }

    public String getMatriculationNbr() {
        return matriculationNbr;
    }

    public Student(String matriculationNbr, String name, Integer age, Email mail, Gender gender) {
        this.matriculationNbr = matriculationNbr;
        this.name = name;
        this.age = age;
        this.mail = mail;
        this.gender = gender;
    }

    public void setMatriculationNbr(String matriculationNbr) {
        this.matriculationNbr = matriculationNbr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Email getMail() {
        return mail;
    }

    public void setMail(Email mail) {
        this.mail = mail;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
