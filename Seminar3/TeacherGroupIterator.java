import java.util.Iterator;
import java.util.List;

public class TeacherGroupIterator implements Iterator<Student> {
    private int count;
    private final List<Student> students;

    public TeacherGroupIterator(TeacherGroup teacherGroup) {
        this.count = 0;
        this.students = teacherGroup.getTeacherGroup();
    }

    @Override
    public boolean hasNext() {
        return count < students.size() - 1;
    }

    @Override
    public Student next() {
        if (hasNext()) {
            return null;
        }
        count++;
        return students.get(count);
    }

    @Override
    public void remove() {
        students.remove(count);
    }
}
