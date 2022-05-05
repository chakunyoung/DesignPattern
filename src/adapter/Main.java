package adapter;

/*
    연관없는 interface 를 연결해준다.
*/
public class Main {
    public static void main(String[] args) {
        A a = new Aimpl();
        B b = new Bimpl();

        act(a);
        Adapter adapter = new Adapter(b);
        act(adapter);

    }
    public static void act(A a){
        a.Amethod();
    }
}
