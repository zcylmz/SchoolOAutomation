package School.service.Menu.Impl;

import School.enums.CommandType;
import School.service.Menu.MenuCommand;
import School.util.Utils;

import java.util.Scanner;

public class StudentMenu implements MenuCommand {

    private static final Scanner input = new Scanner(System.in);

    @Override
    public void selectMenu() {
        System.out.println("---------------\n1. Öğrenci Ekle\n2. Öğrenci Sil\n3. Öğrencileri listele\n4. Öğrenci Bilgileri Güncelleme\n----------------");

        Integer choose =input.nextInt();
        Utils.commandMap.get(CommandType.findTypeByCode(choose)).accept(Utils.student);
    }

}
