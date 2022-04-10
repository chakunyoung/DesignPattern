package decorator;

public class Main {
    public static void main(String[] args) {
        Car car = new ConcreteCar();
        car = new Audio(car);
        car = new Wheel(car);
        car.description();

        //description 순서
        // 호출: wheel -> deco ->   audio -> deco ->    concrete
        // 실행: concrete ->    deco -> audio ->    deco -> wheel

    }
}
