public class Student implements Comparable<Student> {

    private Long iD;
    private String firstName;
    private String lastName;
    //int group;

    public Long getiD() {
        return iD;
    }

    public void setiD(Long iD) {
        this.iD = iD;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public int compareTo(Student o) {
        return this.iD.compareTo(o.iD);
    }


//    public Student(int iD, String firstName, String lastName) {
//        this.iD = iD;
//        this.firstName = firstName;
//        this.lastName = lastName;
//    }
//
//    @Override
//    public String toString() {
//        return String.format("Студент номер %s %s %s", iD, firstName, lastName);
//    }
}
