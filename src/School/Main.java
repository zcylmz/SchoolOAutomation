package School;

import School.enums.MenuType;
import School.model.Classroom;
import School.util.Utils;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Classroom classroom = new Classroom(1,"1/A");

        Utils.classList.add(classroom);


        Classroom classroom1 = Utils.findClassroom(1);
        classroom1.getStudentList().forEach(System.out::println);


        Integer choose;
        Scanner input = new Scanner(System.in);

        while (true){

            System.out.println("---------------\n1. Öğrenci İşlemleri\n2. Öğretmen İşlemleri\n3. Sınıf işlemleri\n----------------");
            choose = input.nextInt();
            MenuType foundMenuType = MenuType.findMenuType(choose);
            Utils.menuCommandMap.get(foundMenuType).accept(foundMenuType.getMenu());

        }


    }
}
