package module;

public class Student extends User {
    private int studentId;

    public Student(String firstName, String lastName, String meddleName, int studentId) {
        super(firstName, lastName, meddleName);
        this.studentId = studentId;
    }
    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return String.format("studentId = %s", studentId);
    }
}
