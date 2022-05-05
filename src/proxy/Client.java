package proxy;

// Client 가 Proxy 를 거쳐서 GameService 를 사용한다.

// Proxy 에서 GameService 를 받아서
// GameService 전,후로 컨트롤해줄 수 있다.

public class Client {
    public static void main(String[] args) {
        GameInterface game = new GameServiceProxy(new GameService());
        game.start();

    }
}
