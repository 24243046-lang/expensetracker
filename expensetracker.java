import java.util.Scanner;

public class expensetracker {
    private double totalExpenses;

    public expensetracker() {
        totalExpenses = 0.0;
    }

    public void addExpense(double amount) {
        if (amount > 0) {
            totalExpenses += amount;
            System.out.println("Added expense: $" + amount);
        } else {
            System.out.println("Expense amount must be positive.");
        }
    }

    public void viewTotalExpenses() {
        System.out.println("Total Expenses: $" + totalExpenses);
    }

    public static void main(String[] args) {
        expensetracker tracker = new expensetracker();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nExpense Tracker Menu:");
            System.out.println("1. Add Expense");
            System.out.println("2. View Total Expenses");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter expense amount: ");
                    double amount = sc.nextDouble();
                    tracker.addExpense(amount);
                    break;
                case 2:
                    tracker.viewTotalExpenses();
                    break;
                case 3:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);

        sc.close();
    }
}