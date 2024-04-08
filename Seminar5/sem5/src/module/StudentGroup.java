package module;

import java.util.List;

public class StudentGroup {
    private Integer groupId;
    private Teacher teacher;
    private List<Student> students;

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudentList() {
        return students;
    }

    public void setStudentList(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return String.format("StudentGroup: groupId = %s, teacher = %s, students = %s", groupId, teacher, students);
    }
}
