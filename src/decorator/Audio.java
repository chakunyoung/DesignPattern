package decorator;

public class Audio extends DecoratorCar{
    Audio(Car car){
        super(car);
    }

    @Override
    public void description(){
        super.description();
        System.out.println(this);
        System.out.println("audio");
    }
}
