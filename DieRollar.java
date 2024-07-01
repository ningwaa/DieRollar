import java.util.Random;
import java.util.Scanner;

public class DieRollar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rnd = new Random();
        boolean keepRolling = true;

        while (keepRolling) {
            int throwCount = 0;
            boolean isTriple = false;

            System.out.printf("%-10s %-10s %-10s %-10s %-10s%n", "Throw", "Die1", "Die2", "Die3", "Sum");



            while (!isTriple) {
                int die1 = rnd.nextInt(6) + 1;
                int die2 = rnd.nextInt(6) + 1;
                int die3 = rnd.nextInt(6) + 1;
                int sum = die1 + die2 + die3;



                System.out.printf("%-10d %-10d %-10d %-10d %-10d%n", throwCount, die1, die2, die3, sum);




                if (die1 == die2 && die2 == die3) {
                    isTriple = true;
                }
            }


            System.out.print("Do you want to roll again? (yes/no): ");
            String userResponse = scanner.nextLine().trim().toLowerCase();
            if (!userResponse.equals("yes")) {
                keepRolling = false;
            }
        }

        scanner.close();
        System.out.println("Thanks for playing!");
    }
}