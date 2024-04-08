package service;

import module.Student;
import module.StudentGroup;
import module.Teacher;

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
