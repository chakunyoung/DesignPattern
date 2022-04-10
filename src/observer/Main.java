package observer;

public class Main {
    public static void main(String[] args) {
        Observer o1 = new Observer1();
        Observer o2 = new Observer2();
        Owner owner = new Owner();

        owner.register(o1);
        owner.register(o2);

        owner.notify1();
    }
}
