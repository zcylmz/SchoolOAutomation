package School.model;

import School.service.CommonFeature;
import School.util.Utils;

import java.util.*;

public class Classroom extends Utils implements CommonFeature {

    private Integer classId;

    private String className;

    private List<Student> studentList = new ArrayList<>();


    public Classroom(Integer classId, String className) {
        setClassId(classId);
        setClassName(className);
    }

    public Classroom() {
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

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public static List<Classroom> getClassList(){
        return classList;
    }


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


    @Override
    public void addItem() {
        Scanner input = new Scanner(System.in);

        System.out.print("Yeni sınıf id: ");
        Integer classId = input.nextInt();

        System.out.print("Yeni sınıf adı: ");
        String className = input.next();


        Classroom newClassroom = new Classroom(classId, className);
        classList.add(newClassroom);

    }

    @Override
    public void removeItem() {
        Scanner input = new Scanner(System.in);
        System.out.println("Silinecek sınıf ID:");
        Integer idToRemove= input.nextInt();

        classList.remove(idToRemove);

    }

    @Override
    public void showItems() {
        classList.forEach(System.out::println);
    }

    @Override
    public void updateItems() {

        Scanner input = new Scanner(System.in);


        System.out.println("Güncellemek istenilen sınıf ID:");
        Integer classId = input.nextInt();

        System.out.println("Güncellenecek sınıfın Adı: ");
        String classNameToUpdate = input.next();


        Classroom foundClassroom = Utils.findClassroom(classId);

        Optional<Classroom> classroomOptional = foundClassroom.getClassList().stream().filter(classroom-> classroom.getClassId().equals(classId)).findFirst();

        classroomOptional.get().setClassName(classNameToUpdate);

        classList.forEach(System.out::println);

    }


    @Override
    public String toString() {
        return this.classId + " " + this.className;
    }
}
