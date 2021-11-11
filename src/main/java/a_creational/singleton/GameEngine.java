package a_creational.singleton;

public class GameEngine {

    private int hp = 100;
    private String characterName = "";
    private static GameEngine instance;

    private GameEngine() {
    }

    public void run(){
        while(true){
            //gamer input
            //changing state of the game
            //rendering graphics
        }
    }

    public static GameEngine getInstance(){
        if (instance == null) {

            synchronized (GameEngine.class) {

                if (instance == null) {
                    instance = new GameEngine();
                }
            }
        }
        return instance;
    }
}
