package School.service.Menu.Impl;

import School.enums.CommandType;
import School.service.Menu.MenuCommand;
import School.util.Utils;

import java.util.Scanner;

public class TeacherMenu implements MenuCommand {

    private static final Scanner input = new Scanner(System.in);

    @Override
    public void selectMenu() {
        System.out.println("---------------\n1. Öğretmen Ekle\n2. Öğretmen Sil\n3. Öğretmenleri listele\n4. Öğretmen Güncelle\n----------------");

        Integer choose =input.nextInt();
        Utils.commandMap.get(CommandType.findTypeByCode(choose)).accept(Utils.teacher);
    }

}
