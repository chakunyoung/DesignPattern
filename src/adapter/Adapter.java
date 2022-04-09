package adapter;

// RunInterface 를 JumpInterface 로 바꿔주는 역할

public class Adapter implements JumpInterface{

    private RunInterface runInterface;

    public Adapter(RunInterface runInterface){
        this.runInterface = runInterface;
    }


    //RunInterface 의 해당 부분을 호출
    @Override
    public void jump() {
        runInterface.run();
    }
}
