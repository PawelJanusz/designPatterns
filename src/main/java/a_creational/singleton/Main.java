package a_creational.singleton;

public class Main {

    public static void main(String[] args) {

        GameEngine engine = GameEngine.getInstance();
        GameEngine engine2 = GameEngine.getInstance();

        System.out.println(engine == engine2);

    }
}
