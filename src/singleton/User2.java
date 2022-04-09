package singleton;

public class User2 {
    private OneInstance one = OneInstance.getInstance();

    public OneInstance getOne(){
        return one;
    }
}
