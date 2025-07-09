package academy.prog;

import java.util.ArrayList;
import java.util.List;

public class JsonMessages {
    private final List<Message> list = new ArrayList<>();

    public JsonMessages(List<Message> sourceList, int fromIndex, String login) {
        for (int i = fromIndex; i < sourceList.size(); i++) {
            Message m = sourceList.get(i);
            if (m.getTo() == null || m.getTo().isEmpty() ||
                    login.equals(m.getTo()) || login.equals(m.getFrom())) {
                list.add(m);
            }
        }
    }
}
