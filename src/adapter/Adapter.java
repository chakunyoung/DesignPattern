package adapter;

public class Adapter implements A{ // 클라이언트에서 사용하는 인터페이스 A

    private B b; // A로 교체할 B 인터페이스

    public Adapter(B b){ // B 인터페이스를 생성자
        this.b = b;
    }

    @Override
    public void Amethod() { // A 인터페이스의 메서드가 호출되면
        b.Bmethod(); // B 인터페이스의 메서드를 구현으로 만들어주면 된다.
    }
}
