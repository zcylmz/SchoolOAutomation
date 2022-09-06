package School;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Classroom {

    private Integer classId;

    private String className;

    private Teacher teacher;

    public Classroom(Integer classId, String className) {
        setClassId(classId);
        setClassName(className);
    }


    private List<Student>studentList = new ArrayList<>();


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Classroom classroom = (Classroom) o;
        return classId.equals(classroom.classId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(classId);
    }

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
