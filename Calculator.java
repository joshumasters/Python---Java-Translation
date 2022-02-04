import java.util.Scanner;

// Interface for lambdas
interface Calculate {
    int run(int x, int y);
}

public class Calculator {

    // Can use this for any 2 number operation
    public static void doMath(int x, int y, Calculate calcFunction) {
        int result = calcFunction.run(x, y);
        System.out.println("Your value is " + result);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean done = false;

        // Some math lambdas
        Calculate add = (x, y) -> x + y;
        Calculate sub = (x, y) -> x - y;
        Calculate mult = (x, y) -> x * y;
        Calculate div = (x, y) -> x / y;

        while (done == false) {

            // Moved this inside the while loop for repetition
            System.out.println("Welcome to my calculator! Please enter the first integer you'd like to calculate.");
            int firstVal = scan.nextInt();
            System.out.println("Please enter the next integer you'd like to calculate.");
            int secVal = scan.nextInt();
            System.out.println("What operation would you like to use (add, subtract, multiply, divide)?");
            scan.nextLine();
            String op = scan.nextLine().toLowerCase();

            switch (op) {
                case "add":
                    doMath(firstVal, secVal, add);
                    done = true;
                    break;
                case "subtract":
                    doMath(firstVal, secVal, sub);
                    done = true;
                    break;
                case "multiply":
                    doMath(firstVal, secVal, mult);
                    done = true;
                    break;
                case "divide": // Added divide by 0 check
                    if (secVal != 0) {
                        doMath(firstVal, secVal, div);
                        done = true;
                    } else {
                        System.out.println("Cannot divide by zero. Please try again.");
                    }
                    break;
                default:
                    System.out.println("Sorry! Please enter a valid operation");
                    // Commenting out since it will rerun dialog
                    // op = scan.nextLine().toLowerCase();
            }
        }

        scan.close();

    }

}
