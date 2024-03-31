import java.util.Comparator;

public class UserComparator<T extends User> implements Comparator<T> {
    @Override
    public int compare(T a, T b) {
        String nameA = a.getFirstName() + a.getLastName() + a.getMeddleName();
        String nameB = b.getFirstName() + b.getLastName() + b.getMeddleName();
        return nameA.compareToIgnoreCase(nameB);
    }
}
