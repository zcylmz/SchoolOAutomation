package School.service.Menu.Impl;

import School.enums.CommandType;
import School.service.Menu.MenuCommand;
import School.util.Utils;

import java.util.Scanner;

public class ClassroomMenu implements MenuCommand {

    private static final Scanner input = new Scanner(System.in);

    @Override
    public void selectMenu() {
        System.out.println("---------------\n1. Sınıf Ekle\n2. Sınıf Sil\n3. Sınıf listele\n4.Sınıf Güncelle\n----------------");

        Integer choose =input.nextInt();
        Utils.commandMap.get(CommandType.findTypeByCode(choose)).accept(Utils.classroom);
    }

}
