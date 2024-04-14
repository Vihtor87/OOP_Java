package service;

import model.Student;
import model.StudentGroup;
import model.Teacher;

import java.util.List;

public class StudentGroupService {
    private final StudentGroup studentGroup = new StudentGroup();
    private Integer maxGroupId = 0;
    public void createStudentGroup(Teacher teacher, List<Student> students){
        studentGroup.setGroupId(++maxGroupId);
        studentGroup.setTeacher(teacher);
        studentGroup.setStudentList(students);
    }
    public StudentGroup getStudentGroup() {
        return studentGroup;
    }
}
