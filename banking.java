import java.util.*;
public class banking {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        double balance = 0;
        boolean isRunning = true;

        while(isRunning) {
            System.out.println("***************");
            System.out.println("BANKING PROGRAM");
            System.out.println("***************");
            System.out.println("1. Balance Check");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("***************");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch(choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance = depositBalance(balance);
                case 3 -> balance = withdrawBalance(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid Choice!");
            }
        }
    }

    static void showBalance(double balance) {
        System.out.println("Available balance: $" + balance);
        System.out.println();
    }

    static double depositBalance(double balance) {
        System.out.print("Enter amount to deposit: ");
        double deposit = sc.nextDouble();
        System.out.println("************************");

        double newBalance = deposit + balance;
        System.out.println("Your new balance is: $" + newBalance);
        System.out.println();
        return newBalance;
    }

    static double withdrawBalance(double balance) {
        System.out.print("Enter amount to withdraw: ");
        double withdraw = sc.nextDouble();
        System.out.println("************************");

        double newBalance = balance - withdraw;
        System.out.println("Your new balance is: " + newBalance);
        System.out.println();
        return newBalance;
    }
}