package adapter;

/*
    �������� interface �� �������ش�.
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
