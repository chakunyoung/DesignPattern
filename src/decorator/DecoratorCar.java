package decorator;

public class DecoratorCar implements Car{

    private Car car;
    //wheel 에서는 audio
    //audio 에서는 concrete

    DecoratorCar(Car car){
        this.car = car;
    }

    @Override
    public void description() {
        car.description(); // 1. audio(concreteCar) // 2. concreteCar
        System.out.println("---------");
        System.out.println(this);
        System.out.println("Decorator");
    }
}
