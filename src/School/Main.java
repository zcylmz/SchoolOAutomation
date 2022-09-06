package School;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Main {


    private static List<Classroom> classList = new ArrayList<>();

    private static List<Teacher>teacherList = new ArrayList<>();

    Classroom classroom = new Classroom(1,"1/A");


    public static void createStudent(Integer classId,Integer id, String name, String surname, String bday){
        Classroom foundClassroom = findClassroom(classId);
        foundClassroom.getStudentList().add(new Student(id,name,surname,bday));
    }

    public static Classroom findClassroom(Integer classroomId) {
        Optional<Classroom> classroomOptional = classList.stream().filter(classroom -> classroom.getClassId().equals(classroomId)).findFirst();
        return classroomOptional.get();
    }

    public static void addClassList(Integer classId, String className){
        classList.add(new Classroom(classId, className));

    }

    public static void removeStudent(Integer classroomId, Integer id){
        Classroom foundClassroom = findClassroom(classroomId);
        //TODO Delete Student from Classroom
        Optional<Student> studentOptional = foundClassroom.getStudentList().stream().filter(student-> student.getId().equals(id)).findFirst();

        foundClassroom.getStudentList().remove(studentOptional.get());
        System.out.println(foundClassroom.getStudentList());
    }


    public static void addTeacher(Integer classId, Integer id, String name, String surname, String bday, String department){
        Teacher newTeacher = new Teacher(id,name,surname,bday,department);
        teacherList.add(newTeacher);
        Classroom foundClassroom = findClassroom(classId);
        foundClassroom.setTeacher(newTeacher);
    }
    public static void removeTeacher(Integer id){
        //TODO Delete Teacher from teacher list
        Optional<Teacher> teacherOptional = teacherList.stream().filter(teacher -> teacher.getId().equals(id)).findFirst();
        Optional<Classroom> classroomOptional = classList.stream().filter(classroom -> classroom.getTeacher().equals(teacherOptional.get())).findFirst();
        classroomOptional.get().setTeacher(null);
        teacherList.remove(teacherOptional.get());
    }



    public static void main(String[] args) {
        Classroom classroom = new Classroom(1,"1/A");

        classList.add(classroom);


        Integer choose;
        Scanner input = new Scanner(System.in);

        while (true){

            System.out.println("---------------\n1. Öğrenci İşlemleri\n2. Öğretmen İşlemleri\n3. Sınıf işlemleri\n----------------");
            choose = input.nextInt();

            switch (choose){
                case 1:
                    //TODO: Student
                    System.out.println("---------------\n1. Öğrenci Ekle\n2. Öğrenci Sil\n3. Öğrencileri listele\n----------------");

                    choose =input.nextInt();
                    switch (choose){

                        case 1:
                            //TODO: Öğrenci Ekleme
                           //studentList.forEach(System.out::println);
                            //classList.forEach(System.out::println);
                            System.out.print("Örenci eklenecek sınıfın ID'si: ");
                            Integer classId = input.nextInt();
                            /* 1-siniflar() ->listenecek
                            2- sınıfların arasında bir tanesi secilecek.  */


                            System.out.println("Yeni Öğrenci id:");
                            Integer id = input.nextInt();

                            System.out.println("Yeni Öğrenci Adı:");
                            String name = input.next();

                            System.out.println("Yeni Öğrenci Soyadı:");
                            String surname = input.next();

                            System.out.println("Yeni Öğrenci Doğum Tarihi:");
                            String bday = input.next();

                            createStudent(classId,id,name,surname,bday);

                            break;

                        case 2:
                            //TODO: Öğrenci Silme
                            System.out.println("Silmek istenilen sınıf ID:");
                            Integer classIdToRemove = input.nextInt();
                            System.out.println("silinecek öğr id");
                            Integer idToRemove = input.nextInt();
                            removeStudent(classIdToRemove,idToRemove);
                            break;

                        case 3:
                            //TODO: Öğrenci Listeleme
                            classList.forEach(element->{
                                System.out.println("Sınıf List"+element.getStudentList());
                            });
                            break;

                        default:
                            System.out.println("Please enter a valid number");
                    }
                    //System.out.println("Toplam Öğrenci Sayısı: " + studentList.size());
                    break;


                case 2:
                    System.out.println("---------------\n1. Öğretmen Ekle\n2. Öğretmen Sil\n3. Öğretmenleri listele\n----------------");

                    choose =input.nextInt();
                    switch (choose){

                        case 1:
                            //TODO: Öğretmen Ekleme
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


                            addTeacher(classId,id,name,surname,bday,department);
                            System.out.println(teacherList);
                            break;

                        case 2:
                            //TODO: Öğretmen Silme
                            System.out.println("Silmek istenilen öğretmen ID:");
                            //removeTeacher(input.nextInt());
                            break;

                        case 3:
                            //TODO: Öğretmen Listeleme
                            teacherList.forEach(System.out::println);
                            break;

                        default:
                            System.out.println("Please enter a valid number");
                    }
                case 3:
                    //TODO: Classroom
                    break;

                default:
                    System.out.println("Please enter a valid number");



            }





        }


    }
}
