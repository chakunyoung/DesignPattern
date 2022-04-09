package singleton;

public class User1 {
    private OneInstance one = OneInstance.getInstance();

    public OneInstance getOne(){
        return one;
    }
}
