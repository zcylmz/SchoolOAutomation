package School.util;

import School.enums.CommandType;
import School.enums.MenuType;
import School.model.Classroom;
import School.model.Student;
import School.model.Teacher;
import School.service.CommonFeature;
import School.service.Menu.Impl.ClassroomMenu;
import School.service.Menu.Impl.StudentMenu;
import School.service.Menu.Impl.TeacherMenu;
import School.service.Menu.MenuCommand;

import java.util.*;
import java.util.function.Consumer;

public class Utils {

    public static List<Classroom> getClassList() {

        return classList;
    }

    public static void setClassList(List<Classroom> classList) {

        Utils.classList = classList;
    }

    public  static List<Classroom> classList = new ArrayList<>();

    public static List<Teacher>teacherList = new ArrayList<>();

    public static final Student student = new Student();

    public static final Teacher teacher = new Teacher();

    public static final Classroom classroom = new Classroom();

    public static final StudentMenu studentMenu = new StudentMenu();

    public static final TeacherMenu teacherMenu = new TeacherMenu();

    public static final ClassroomMenu classroomMenu = new ClassroomMenu();

    public static Map<CommandType, Consumer<CommonFeature>> commandMap = new HashMap<>();

    public static Map<MenuType, Consumer<MenuCommand>> menuCommandMap = new HashMap<>();

    static {

        commandMap.put(CommandType.ADD, CommonFeature::addItem);

        commandMap.put(CommandType.DELETE, CommonFeature::removeItem);

        commandMap.put(CommandType.LIST, CommonFeature::showItems);

        commandMap.put(CommandType.GUNCELLE, CommonFeature::updateItems);


        menuCommandMap.put(MenuType.STUDENT, MenuCommand::selectMenu);

        menuCommandMap.put(MenuType.TEACHER, MenuCommand::selectMenu);

        menuCommandMap.put(MenuType.CLASSROOM, MenuCommand::selectMenu);

    }

    public static Classroom findClassroom(Integer classroomId) {
        Optional<Classroom> classroomOptional = classList.stream().filter(classroom -> classroom.getClassId().equals(classroomId)).findFirst();
        return classroomOptional.get();
    }



}
