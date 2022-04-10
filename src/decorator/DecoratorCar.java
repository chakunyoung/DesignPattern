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
        car.description(); // audio 호출 -> concrete 호출
        System.out.println("---------");
        System.out.println("Decorator");
        System.out.println();
    }
}
