package decorator;

public class Wheel extends DecoratorCar{
    Wheel(Car car) {
        super(car);
    }

    @Override
    public void description(){
        super.description();
        System.out.println(this);
        System.out.println("wheel");
    }
}
