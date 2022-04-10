package decorator;

public class ConcreteCar implements Car{

    ConcreteCar(){
    }

    public void description(){
        System.out.println("Concrete");
        System.out.println();
    }
}
