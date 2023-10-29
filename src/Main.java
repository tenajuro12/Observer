
public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Alice");
        Player player2 = new Player("Bob");

        Game footballGame = GameFactory.createGame("Football", "Football Match");
        Game basketballGame = GameFactory.createGame("Basketball", "Basketball Match");

        footballGame.addObserver(player1);
        footballGame.addObserver(player2);

        basketballGame.addObserver(player1);

        footballGame.play();
        basketballGame.play();
    }
}
