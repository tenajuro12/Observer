public class Game extends GameSubject {
    private String name;

    public Game(String name) {
        this.name = name;
    }

    public void play() {
        System.out.println(name + " is playing.");
        notifyObservers(name + " is playing.");
    }
}