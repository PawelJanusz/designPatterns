package a_creational.singleton_game;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    private static GuessNumber instance = new GuessNumber();
    private int score = 0;
    private Random random = new Random();
    private Scanner scanner = new Scanner(System.in);

    private GuessNumber() {
    }

    public static GuessNumber getInstance(){
        return instance;
    }

    protected Object readResolve(){
        return getInstance();
    }

    public int getScore(){
        return score;
    }

    public void play(){
        for (int i=0; i<10; i++){
            int number = random.nextInt(9);
            System.out.print("Guess a number: ");
            int guess = scanner.nextInt();

            if (number == guess){
                System.out.println("Great!");
                score++;
            }else {
                System.out.println("I'm sorry, it is not that number. Properly number: " + number);
            }
        }
        System.out.println("Your score: "+ score);
    }
}
