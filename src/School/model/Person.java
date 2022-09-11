package School.model;

public class Person {
    
    private Integer id;

    private String name;

    private String surname;

    private String birthday;

    public Person(Integer id, String name, String surname, String birthday) {

        this.id = id;
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
    }

    public Person() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
