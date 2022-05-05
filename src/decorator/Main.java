package decorator;

public class Main {
    public static void main(String[] args) {
        Car car = new ConcreteCar();
        car = new Audio(car); // audio(concreteCar)
        car = new Wheel(car); // wheel(audio(concreteCar) 호출 -> 호출 -> 호출
                                                        //실행 <- 실행 <- 실행
        car.description();

        //description 순서
        // 호출: wheel -> deco ->   audio -> deco ->    concrete
        // 실행: concrete ->    deco -> audio ->    deco -> wheel

        // 구조도
        // interface car
        // concrete car // decorator car // 구현
        //              // audio , wheel // 상속
    }
}
