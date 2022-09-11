package School.model;

import School.service.CommonFeature;
import School.util.Utils;

import java.util.Optional;
import java.util.Scanner;

import static School.util.Utils.teacherList;

public class Teacher extends Person implements CommonFeature {

    private String department;

    private Classroom classroom;

    public Teacher(Integer id, String name, String surname, String birthday, String department) {
        super(id, name, surname, birthday);
        setDepartment(department);
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return this.getId() + " " + this.getName() + " " + this.getSurname() + " " + this.getBirthday() + " " + this.getDepartment();
    }

    public Teacher() {
    }

    @Override
    public void addItem() {

        Scanner input = new Scanner(System.in);

        System.out.println("Öğretmen eklenecek sınıfın id: ");
        Integer classId= input.nextInt();

        System.out.println("Yeni Öğretmen id:");
        Integer id = input.nextInt();

        System.out.println("Yeni ÖğrentmenAdı:");
        String name = input.next();

        System.out.println("Yeni Öğretmen Soyadı:");
        String surname = input.next();

        System.out.println("Yeni Öğretmen Doğum Tarihi:");
        String bday = input.next();

        System.out.println("Yeni Öğretmen Bölümü:");
        String department = input.next();

        Teacher newTeacher = new Teacher(id,name,surname,bday,department);

        Classroom foundClassroom = Utils.findClassroom(classId);

        newTeacher.setClassroom(foundClassroom);

        teacherList.add(newTeacher);
    }

    @Override
    public void removeItem() {

        Scanner input = new Scanner(System.in);

        System.out.println("Silmek istenilen öğretmen ID:");
        Integer idToRemove= input.nextInt();

        Optional<Teacher> teacherOptional = teacherList.stream().filter(teacher -> teacher.getId().equals(idToRemove)).findFirst();

        teacherList.remove(teacherOptional.get());
    }

    @Override
    public void showItems() {

        teacherList.forEach(System.out::println);

    }

    @Override
    public void updateItems() {

    }
}
