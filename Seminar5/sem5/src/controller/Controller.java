package controller;

import module.Student;
import module.Type;
import module.User;
import service.DataService;
import view.StudentView;
import module.Teacher;
import view.StudentGroupView;
import view.TeacherView;
import service.StudentGroupService;


import java.util.ArrayList;
import java.util.List;

public class Controller {

    private final DataService dataService = new DataService();
    private final StudentView studentView = new StudentView();
    private final TeacherView teacherView = new TeacherView();
    private final StudentGroupView studentGroupView = new StudentGroupView();
    private final StudentGroupService studentGroupService = new StudentGroupService();

    public void createStudent(String firstName, String lastName, String meddleName) {
        dataService.createUser(firstName, lastName, meddleName, Type.STUDENT);
    }
    public void createTeacher(String firstName, String lastName, String meddleName) {
        dataService.createUser(firstName, lastName, meddleName, Type.TEACHER);
    }

    public void getAllStudent() {
        List<User> userList = dataService.getAllStudent();
        for (User user : userList) {
            Student student = (Student) user;
            studentView.printToConsole(student);
        }
    }
    public void getAllTeachers(){
        List<User> userList = dataService.getAllTeachers();
        for (User user : userList) {
            Teacher teacher = (Teacher) user;
            teacherView.printToConsole(teacher);
        }
    }
    public void createStudentGroup(Integer teacherId, List<Integer> studentIdList){
        Teacher teacher = (Teacher) dataService.getUserById(Type.TEACHER, teacherId);
        List<Student> studentList = new ArrayList<>();
        for (Integer id:studentIdList) {
            studentList.add((Student) dataService.getUserById(Type.STUDENT, id));
        }
        studentGroupService.createStudentGroup(teacher,studentList);
    }
    public void printStudentGroup(){
        studentGroupView.sendOnConsole(studentGroupService.getStudentGroup());
    }
}
