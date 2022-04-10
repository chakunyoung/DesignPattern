package observer;
import java.util.*;

public class Owner {
    ArrayList<Observer> list = new ArrayList<>();

    public void register(Observer observer) {
        list.add(observer);
    }

    public void notify1() {
        for (Observer o : list) {
            o.update();
        }

    }
}
