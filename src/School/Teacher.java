package School;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person {
    private String department;

    public Teacher(Integer id, String name, String surname, String birthday, String department) {
        super(id, name, surname, birthday);
        setDepartment(department);
    }

    private List<Teacher> teacherList = new ArrayList<>();



    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    public void setTeacherList(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }

    @Override
    public String toString() {
        return this.getId() + " " + this.getName() + " " + this.getSurname() + " " + this.getBirthday() + " " + this.getDepartment();
    }

}
