package view;
import java.util.List;
import module.User;

public interface UserView<T extends User> {
    void sendOnConsole(List<T> list);
}
