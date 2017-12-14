package codingfactory.rpgconsole.game;

public class Starter {

    private static Game game;

    public static void main(String[] args) {
        System.out.println("Game Begin!");
        game = new Game();
        game.gameLoop();
        System.out.println("Game End!");
    }

}
