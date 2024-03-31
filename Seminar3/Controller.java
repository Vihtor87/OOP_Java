import java.util.List;

public class Controller {
    private final TeachGroupService teachGroupService = new TeachGroupService();
    private final StreamService streamService  = new StreamService();

    public void removeStudent(String firstName, String lastName) {
        teachGroupService.removeStudent(firstName, lastName);
    }
    public List<Student> getSortedStudents() {
        return teachGroupService.getSortedStudents();
    }
    public List<Student> getSortedStudentByFI() {
        return teachGroupService.getSortedStudentByFI();
    }
    public void sortedStream(List<Stream> streamList) {
        streamService.sortedStream(streamList);
    }
}
