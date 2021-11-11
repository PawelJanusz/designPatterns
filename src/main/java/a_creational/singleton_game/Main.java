package a_creational.singleton_game;

public class Main {

    public static void main(String[] args) {
        GuessNumber game = GuessNumber.getInstance();

        game.play();

        int score = game.getScore();

        GuessNumber anotherGameReference = GuessNumber.getInstance();

        if (game == anotherGameReference){
            System.out.println("Singleton!");
            if (score == anotherGameReference.getScore()){
                System.out.println("And the points match");
            }
        }
    }
}
