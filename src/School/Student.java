package School;

public class Student extends Person {
    private Classroom studentClass ;

    public Classroom getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(Classroom studentClass) {
        this.studentClass = studentClass;
        studentClass.getStudentList().add(this);
    }

    public Student(Integer id, String name, String surname, String birthday) {
        super(id, name, surname, birthday);
    }
}
