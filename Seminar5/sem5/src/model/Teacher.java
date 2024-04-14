package model;

public class Teacher extends User {
    private int teacherId;

    public Teacher(String firstName, String lastName, String meddleName, int teacherId) {
        super(firstName, lastName, meddleName);
        this.teacherId = teacherId;
    }
    public int getTeacherId() {
        return teacherId;
    }
    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }
}
