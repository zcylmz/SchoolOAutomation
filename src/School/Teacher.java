package School;

public class Teacher extends Person {
    private String department;

    public Teacher(Integer id, String name, String surname, String birthday, String department) {
        super(id, name, surname, birthday);
        setDepartment(department);
    }



    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
