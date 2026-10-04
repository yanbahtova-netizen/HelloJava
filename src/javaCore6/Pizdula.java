package javaCore6;

import java.util.*;
import java.util.function.Consumer;

public class Pizdula {
}
interface MailItem<T> {
    String getTo();
    T getContent();
}
class MailMessage implements MailItem<String>{
    private final String from;
    private final String to;
    private final String content;

    public MailMessage(String from, String to, String content) {
        this.from = from;
        this.to = to;
        this.content = content;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getContent() {
        return content;
    }
}
class Salary implements MailItem<Integer> {
    private final String from;
    private final String to;
    private final int content;

    public Salary(String from, String to, int content) {
        this.from = from;
        this.to = to;
        this.content = content;
    }

    public String getFrom() {
        return from;
    }

    @Override
    public String getTo() {
        return to;
    }

    @Override
    public Integer getContent() {
        return content;
    }
}
class MailService<T> implements Consumer<MailItem<T>> {
    private final Map<String, List<T>> mailBox = new HashMap<>();

    @Override
    public void accept(MailItem<T> item) {
//        if(mailBox.containsKey(to)) {
//            mailBox.get(to).add(content);
//        } else {
//            List<T> list = new ArrayList<>();
//        list.add(content);
//        mailBox.put(to, list);
//        }
        mailBox.computeIfAbsent(item.getTo(), k -> new ArrayList<>()).add(item.getContent());
    }

    Map<String, List<T>> getMailBox() {
        return new HashMap<>(mailBox) {
            @Override
            public List<T> get(Object key) {
                if (super.containsKey(key)) {
                    return super.get(key);
                } else {
                    return Collections.emptyList();
                }
            }
        };
    }
}