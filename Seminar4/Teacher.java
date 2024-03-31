public class Teacher extends User {

    private Integer teacherId;
    public Teacher(Integer teacherId, String firstName, String lastName, String meddleName) {
        super(firstName, lastName, meddleName);
        this.teacherId = teacherId;
    }
    public Integer getTeacherId() {
        return teacherId;
    }
    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }
}
