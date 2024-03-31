import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student a, Student b) {
        int resOfComparing = a.getFirstName().compareTo(b.getFirstName());
        if (resOfComparing == 0) {
            resOfComparing = a.getLastName().compareTo(b.getLastName());
            } else {
                return resOfComparing;
            }
        return resOfComparing;
    }
}
