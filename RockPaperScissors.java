import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    // Rock = 0
    // Paper = 1
    // Scissors = 2
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        HashMap<Integer, String> pairs = new HashMap<>();
        pairs.put(0, "rock");
        pairs.put(1, "paper");
        pairs.put(2, "scissors");
        System.out.println("Please select Rock, Paper, or Scissors");
        String userPick = scan.nextLine().toLowerCase();
        while (pairs.containsValue(userPick) == false) {
            System.out.println("Please select a valid option");
            userPick = scan.nextLine().toLowerCase();
        }
        int compNum = rand.nextInt(3);
        String compPick = pairs.get(compNum);
        if (userPick.equals(compPick)) {
            System.out.println("It's a draw! You both picked " + userPick + ".");
        } else if (userPick.equals("rock") && compPick.equals("paper")
                || userPick.equals("paper") && compPick.equals("scissors")
                || userPick.equals("scissors") && compPick.equals("rock")) {
            System.out.println("You lose! You selected " + userPick + " and the computer selected " + compPick + ".");
        } else {
            System.out.println("You Win! You selected " + userPick + " and the computer selected " + compPick + ".");
        }
        scan.close();
    }
}
