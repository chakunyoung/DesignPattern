package decorator;

public class Main {
    public static void main(String[] args) {
        Car car = new ConcreteCar();
        car = new Audio(car);
        car = new Wheel(car);
        car.description();

        //description ����
        // ȣ��: wheel -> deco ->   audio -> deco ->    concrete
        // ����: concrete ->    deco -> audio ->    deco -> wheel

    }
}
