package School;

import java.util.ArrayList;
import java.util.List;

public class Classroom {

    private Integer classId;

    private String className;

    private Teacher teacher;

    public Classroom(Integer classId, String className) {
        setClassId(classId);
        setClassName(className);
    }

    private List<Student>studentList = new ArrayList<>();



    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
}
