package School.model;

import School.service.CommonFeature;
import School.util.Utils;

import java.util.Optional;
import java.util.Scanner;

import static School.util.Utils.classList;

public class Student extends Person implements CommonFeature {

    private Classroom studentClass ;

    public Classroom getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(Classroom studentClass) {

        this.studentClass = studentClass;
        this.studentClass.getStudentList().add(this);

    }

    public Student(Integer id, String name, String surname, String birthday) {
        super(id, name, surname, birthday);
    }

    public Student() {
    }

    @Override
    public String toString() {
        return this.getId() +" "+ this.getName() +" "+ this.getSurname() + " " + this.getBirthday() ;
    }

    @Override
    public void addItem() {

        Scanner input = new Scanner(System.in);


        System.out.print("Örenci eklenecek sınıfın ID'si: ");
        Integer classId = input.nextInt();

        System.out.println("Yeni Öğrenci id:");
        Integer id = input.nextInt();

        System.out.println("Yeni Öğrenci Adı:");
        String name = input.next();

        System.out.println("Yeni Öğrenci Soyadı:");
        String surname = input.next();

        System.out.println("Yeni Öğrenci Doğum Tarihi:");
        String bday = input.next();

        Classroom foundClassroom = Utils.findClassroom(classId);
        foundClassroom.getStudentList().add(new Student(id,name,surname,bday));

    }

    @Override
    public void removeItem() {

        Scanner input = new Scanner(System.in);


        System.out.println("Silmek istenilen öğrencinin sınıf ID:");
        Integer classIdToRemove = input.nextInt();
        System.out.println("silinecek öğr id");
        Integer idToRemove = input.nextInt();

        Classroom foundClassroom = Utils.findClassroom(classIdToRemove);

        Optional<Student> studentOptional = foundClassroom.getStudentList().stream().filter(student-> student.getId().equals(idToRemove)).findFirst();

        foundClassroom.getStudentList().remove(studentOptional.get());
        System.out.println(foundClassroom.getStudentList());


    }

    @Override
    public void showItems() {

       classList.forEach(element->{
            System.out.println("Sınıf List"+element.getStudentList());
       });
    }

    @Override
    public void updateItems() {

        Scanner input = new Scanner(System.in);

        System.out.println("Güncellemek istenilen öğrencinin sınıf ID:");
        Integer classId = input.nextInt();

        System.out.println("Güncellenecek öğrencinin id: ");
        Integer id = input.nextInt();

        System.out.println("Öğrenci Adı:");
        String nameToUpdate = input.next();

        System.out.println("Öğrenci Soyadı:");
        String surnameToUpdate = input.next();

        System.out.println("Doğum Tarihi:");
        String bdayToUpdate = input.next();

        Classroom foundClassroom = Utils.findClassroom(classId);

        Optional<Student> studentOptional = foundClassroom.getStudentList().stream().filter(student-> student.getId().equals(id)).findFirst();

        studentOptional.get().setName(nameToUpdate);
        studentOptional.get().setSurname(surnameToUpdate);
        studentOptional.get().setBirthday(bdayToUpdate);

        classList.forEach(element->{
            System.out.println("Güncel Sınıf Listesi"+element.getStudentList());
        });



    }

}
