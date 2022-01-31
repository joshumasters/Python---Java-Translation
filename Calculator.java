
import java.util.Scanner;

public class Calculator {

    public static int add(int x, int y) {
        return x + y;
    }

    public static int subtract(int x, int y) {
        return x - y;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static int divide(int x, int y) {
        return x / y;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to my calculator! Please enter the first integer you'd like to calculate.");
        int firstVal = scan.nextInt();
        System.out.println("Please enter the next integer you'd like to calculate.");
        int secVal = scan.nextInt();
        System.out.println("What operation would you like to use (add, subtract, multiply, divide)?");
        scan.nextLine();
        String op = scan.nextLine().toLowerCase();
        boolean done = false;
        while (done == false) {
            switch (op) {
                case "add":
                    System.out.println("Your value is " + add(firstVal, secVal));
                    done = true;
                    break;
                case "subtract":
                    System.out.println("Your value is " + subtract(firstVal, secVal));
                    done = true;
                    break;
                case "multiply":
                    System.out.println("Your value is " + multiply(firstVal, secVal));
                    done = true;
                    break;
                case "divide":
                    System.out.println("Your value is " + divide(firstVal, secVal));
                    done = true;
                    break;
                default:
                    System.out.println("Sorry! Please enter a valid operation");
                    op = scan.nextLine().toLowerCase();
            }
        }

        scan.close();

    }

}
