import java.util.Random;
import java.util.Scanner;

public class RandomNumGen {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        System.out.println("This program generates a random number between two given numbers");
        System.out.println("Enter a lower limit for your number");
        int low = input.nextInt();
        System.out.println("Enter a higher limit for your number");
        int high = input.nextInt();
        int num = random.ints(low, high + 1)
                .findFirst()
                .getAsInt();

        System.out.println("Your num is " + num);
        input.close();
    }
}