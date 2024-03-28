import java.util.Iterator;
import java.util.List;

public class TeacherGroup implements Iterable<Student> {

    List<Student> teacherGroup;
    int number;
    String discipline;

    public TeacherGroup(int number, String discipline) {
        this.number = number;
        this.discipline = discipline;
    }

    @Override
    public String toString() {
        return String.format("Группа %s, предмет %s", number, discipline);
    }

    public List<Student> getTeacherGroup() {
        return teacherGroup;
    }

    public void setTeacherGroup(List<Student> teacherGroup) {
        this.teacherGroup = teacherGroup;
    }

    @Override
    public Iterator iterator() {
        return new TeacherGroupIterator(this);
    }
}
