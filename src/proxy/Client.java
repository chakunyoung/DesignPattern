package proxy;

// Client �� Proxy �� ���ļ� GameService �� ����Ѵ�.

// Proxy ���� GameService �� �޾Ƽ�
// GameService ��,�ķ� ��Ʈ������ �� �ִ�.

public class Client {
    public static void main(String[] args) {
        GameInterface game = new GameServiceProxy(new GameService());
        game.start();

    }
}
