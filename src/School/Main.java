package School;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    private static List<Classroom> classList = new ArrayList<>();
    private static List<Student> studentList = new ArrayList<>();

    public static void createStudent(Integer id, String name, String surname, String bday){
        studentList.add(new Student(id,name,surname,bday));

    }



    public static void main(String[] args) {

        classList.add(new Classroom(1,"1/A"));
        classList.add(new Classroom(2,"1/B"));
        classList.add(new Classroom(3,"2/A"));
        classList.add(new Classroom(4,"2/B"));
        classList.add(new Classroom(5,"3/A"));
        classList.add(new Classroom(6,"3/B"));


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

                            System.out.println("Yeni Öğrenci id:");
                            Integer id = input.nextInt();

                            System.out.println("Yeni Öğrenci Adı:");
                            String name = input.next();

                            System.out.println("Yeni Öğrenci Soyadı:");
                            String surname = input.next();

                            System.out.println("Yeni Öğrenci Doğum Tarihi:");
                            String bday = input.next();


                            createStudent(id,name,surname,bday);
                            break;

                        case 2:
                            //TODO: Öğrenci Silme
                        case 3:
                            //TODO: Öğrenci Listeleme

                        default:
                            System.out.println("Please enter a valid number");
                    }
                    break;


                case 2:
                    //TODO: Teacher

                case 3:
                    //TODO: Classroom

                default:
                    System.out.println("Please enter a valid number");



            }



            System.out.println(studentList.size());

        }


    }
}
