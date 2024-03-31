import java.util.*;

public class TeachGroupService {
    private TeacherGroup teacherGroup;
    public void removeStudent(String firstName, String lastName) {
        Iterator<Student> iterator = teacherGroup.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                iterator.remove();
            }
        }
    }
    public List<Student> getSortedStudents() {
        List<Student> students = new ArrayList<>(teacherGroup.getTeacherGroup());
        Collections.sort(students);
        return students;
    }
    public List<Student> getSortedStudentByFI() {
        List<Student> students = new ArrayList<>(teacherGroup.getTeacherGroup());
        students.sort(new StudentComparator());
        return students;
    }
}
