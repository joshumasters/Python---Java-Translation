import java.util.Random;
import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        System.out.println(
                "In this game the computer chooses a number between 1 and 100, then you try to guess the number. The computer will tell you if your guess is too low or too high and then have you guess until you select the correct number");

        Random random = new Random();
        Scanner input = new Scanner(System.in);

        // Because .nextInt() has a lower inclusive bound of 0 and an exclusive upper
        // bound, I set the bound to 100 and then add one, making the bound 1-100
        // inclusive
        int randNum = random.nextInt(100) + 1;
        boolean correctAnswer = false;
        int guess = 0;

        while (correctAnswer == false) {
            System.out.println("Guess a random number between 1-100");
            guess = input.nextInt();
            if (guess == randNum) {
                System.out.println("Congrats! You guessed the right number!");
                correctAnswer = true;
            } else if (guess > randNum) {
                System.out.println("Too High!");
            } else {
                System.out.println("Too Low!");
            }
        }

        input.close();

    }
}
