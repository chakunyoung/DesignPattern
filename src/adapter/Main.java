package adapter;

/*
    연관없는 interface 를 연결해준다.
*/
public class Main {
    public static void main(String[] args) {
        JumpPerson jp = new JumpPerson();
        RunPerson rp = new RunPerson();

        act(jp);
        Adapter adapter = new Adapter(rp);
        act(adapter);

    }
    public static void act(JumpInterface ji){
        ji.jump();
    }
}
