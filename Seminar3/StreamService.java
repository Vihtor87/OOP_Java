import java.util.Collections;
import java.util.List;

public class StreamService {
    public void sortedStream(List<Stream> streamList) {
        Collections.sort(streamList, new StreamComparator());
    }
}
