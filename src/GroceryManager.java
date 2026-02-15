import java.util.Scanner;

public class GroceryManager {

    public static void main(String[] args) {
        String[] itemNames = new String[10];
        double[] itemPrices = new double[10];
        int[] itemStocks = new int[10];

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter 1 for View, 2 for Restock, 3 to Exit");
            int choice = sc.nextInt();

            if (choice == 3)
                break;
        }
        System.out.println("exited loop");

    }

    /**
     * Task 1: Iterates through arrays and prints non-empty inventory slots.
     * Branch: feature-display
     */
    public static void printInventory(String[] names, double[] prices, int[] stocks) {
    }

    /**
     * Task 2: Searches for an item by name and updates its stock quantity.
     * Branch: feature-restock
     */
    public static void restockitem(String[] names, int[] stocks, String target, int amount) {
    }
}