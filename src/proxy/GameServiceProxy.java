package proxy;

public class GameServiceProxy implements GameInterface {

    private GameService gameService;

    GameServiceProxy(GameService gameService){
        this.gameService = new GameService();
    }

    @Override
    public void start() {
        System.out.println("proxy");
        gameService.start();
        System.out.println("proxy end");
    }
}
