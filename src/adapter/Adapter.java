package adapter;

// RunInterface �� JumpInterface �� �ٲ��ִ� ����

public class Adapter implements JumpInterface{

    private RunInterface runInterface;

    public Adapter(RunInterface runInterface){
        this.runInterface = runInterface;
    }


    //RunInterface �� �ش� �κ��� ȣ��
    @Override
    public void jump() {
        runInterface.run();
    }
}
