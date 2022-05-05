package singleton;

public class OneInstance {
    private static OneInstance oneInstance = null;

    private OneInstance(){}

    public static OneInstance getInstance(){
        if(oneInstance == null)
            oneInstance = new OneInstance();
        return oneInstance;
    }
}
