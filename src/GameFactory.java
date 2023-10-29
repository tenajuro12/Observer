public class GameFactory {
    public static Game createGame(String gameType, String name) {
        if ("Football".equals(gameType)) {
            return new FootballGame(name);
        } else if ("Basketball".equals(gameType)) {
            return new BasketballGame(name);
        } else {
            throw new IllegalArgumentException("Invalid game type");
        }
    }
}
