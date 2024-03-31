import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<TeacherGroup> {
    public List<TeacherGroup> teacherGroupList = new ArrayList<>();

    public void addGroup(TeacherGroup group) {
        teacherGroupList.add(group);
    }

    @Override
    public Iterator<TeacherGroup> iterator() {
        return teacherGroupList.iterator();
    }
}
