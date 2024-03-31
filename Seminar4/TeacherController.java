import java.util.List;

public class TeacherController implements UserController<Teacher> {
    private final TeacherService teacherService = new TeacherService();
    private final TeacherView teacherView = new TeacherView();
    @Override
    public void create(String firstName, String lastName, String middleName) {
        teacherService.create(firstName, lastName, middleName);
    }
    public void editTeacher(Integer teacherId, String firstName, String lastName, String middleName) {
        teacherService.editTeacher(teacherId, firstName, lastName, middleName);
    }
    public void initTeacherList(List<Teacher> list) {
        teacherService.initData(list);
    }
    public void printTeachers() {
        teacherView.sendOnConsole(teacherService.getAll());
    }
}
