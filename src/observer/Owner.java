package observer;
import java.util.*;

public class Owner {
    ArrayList<Observer> list = new ArrayList<>();

    public void register(Observer observer) { // 옵저버 등록
        list.add(observer);
    }

    public void notify1() { // notify 실행 시 옵저버 메서드 동작
        for (Observer o : list) {
            o.update();
        }
    }
}
