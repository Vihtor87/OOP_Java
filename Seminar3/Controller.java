import java.util.List;

public class Controller {
    private final TeachGroupService teachGroupService = new TeachGroupService();

    public void removeStudent(String firstName, String lastName) {
        teachGroupService.removeStudent(firstName, lastName);
    }

    public List<Student> getSortedStudents() {
        return teachGroupService.getSortedStudents();
    }
}
