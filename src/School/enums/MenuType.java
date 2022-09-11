package School.enums;

import School.service.Menu.MenuCommand;
import School.util.Utils;

import java.util.NoSuchElementException;

public enum MenuType {

    STUDENT(1, "Öğrenci Menu", Utils.studentMenu),

    TEACHER(2, "Öğretmen Menu", Utils.teacherMenu),

    CLASSROOM(3, "Sınıf Menu", Utils.classroomMenu);

    private final Integer code;

    private final String name;

    private final MenuCommand menu;

    MenuType(Integer code, String name, MenuCommand menu) {

        this.code = code;
        this.name = name;
        this.menu = menu;

    }

    public static MenuType findMenuType(Integer code) {

        for (MenuType value : values()) {

            if (value.code.equals(code)) {

                return value;
            }
        }
        throw new NoSuchElementException("Insan gibi code gir!");
    }

        public MenuCommand getMenu() {
        return menu;
    }
}
