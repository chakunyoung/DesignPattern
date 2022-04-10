package decorator;

public class DecoratorCar implements Car{

    private Car car;
    //wheel ������ audio
    //audio ������ concrete

    DecoratorCar(Car car){
        this.car = car;
    }

    @Override
    public void description() {
        car.description(); // audio ȣ�� -> concrete ȣ��
        System.out.println("---------");
        System.out.println("Decorator");
        System.out.println();
    }
}
