package service;

import module.Student;
import module.Teacher;
import module.Type;
import module.User;

import java.util.ArrayList;
import java.util.List;

public class DataService {
    List<User> listUser;
    public void createUser(String firstName, String lastName, String meddleName, Type type) {
        int id = getFreeId(type);
        if (Type.STUDENT == type) {
            Student student = new Student(firstName, lastName, meddleName, id);
            listUser.add(student);
        }
        if (Type.TEACHER == type) {
            Teacher teacher = new Teacher(firstName, lastName, meddleName, id);
            listUser.add(teacher);
        }
    }

    public User getUserById(Type type, int id) {
        boolean itsStudent = Type.STUDENT == type;
        User currentUser = null;
        for (User user : listUser) {
            if (user instanceof Teacher && !itsStudent && ((Teacher) user).getTeacherId() == id) {
                currentUser = user;
            }
            if (user instanceof Student && itsStudent && ((Student) user).getStudentId() == id) {
                currentUser = user;
            }
        }
        return currentUser;
    }

    public List<User> getAllUser() {
        return listUser;
    }

    public List<User> getAllStudent() {
        List<User> students = new ArrayList<>();
        for (User user : listUser) {
            if (user instanceof Student) {
                students.add(user);
            }
        }
        return students;
    }
    public List<User> getAllTeachers() {
        List<User> teachers = new ArrayList<>();
        for (User user : listUser) {
            if (user instanceof Teacher) {
                teachers.add(user);
            }
        }
        return teachers;
    }

    private int getFreeId(Type type) {
        boolean itsStudent = Type.STUDENT == type;
        int lastId = 1;
        for (User user : listUser) {
            if (user instanceof Teacher && !itsStudent) {
                lastId = ((Teacher) user).getTeacherId() + 1;
            }
            if (user instanceof Student && itsStudent) {
                lastId = ((Student) user).getStudentId() + 1;
            }
        }
        return lastId;
    }
}
