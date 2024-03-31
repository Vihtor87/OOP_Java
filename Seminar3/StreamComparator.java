import java.util.Comparator;

public class StreamComparator implements Comparator<Stream> {
    @Override
    public int compare(Stream a, Stream b) {
        return Integer.compare(a.teacherGroupList.size(), b.teacherGroupList.size());
    }
}
