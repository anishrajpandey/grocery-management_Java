
import java.util.Scanner;

public class GroceryManager {

    public static void main(String[] args) {
        String[] itemNames = new String[10];
        double[] itemPrices = new double[10];
        int[] itemStocks = new int[10];

        // for testing
        itemNames[0] = "Milk";
        itemPrices[0] = 3.50;
        itemStocks[0] = 5;
        itemNames[1] = "Bread";
        itemPrices[1] = 2.00;
        itemStocks[1] = 10;

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter 1 for View, 2 for Restock, 3 to Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();
            if (choice == 1) {
                printInventory(itemNames, itemPrices, itemStocks);
            } else if (choice == 2) {
                System.out.print("Enter item name to restock: ");
                String target = sc.nextLine();
                System.out.print("Enter amount to add: ");
                int amount = sc.nextInt();
                restockItem(itemNames, itemStocks, target, amount);
            } else if (choice == 3)
                break;
            else {
                System.out.println("Invalid choice. Try again.");
            }
        }
        System.out.println("Exited system.");
        sc.close();
    }

    public static void printInventory(String[] names, double[] prices, int[] stocks) {

        for (int i = 0; i < names.length; i++) {

            if (names[i] != null) {
                System.out.println("Item: " + names[i] +
                        " | Price: $" + prices[i] +
                        " | Stock: " + stocks[i]);
            }
        }
    }

    /**
     * Task 2: Searches for an item by name and updates its stock quantity.
     * Branch: feature-restock
     */
    public static void restockItem(String[] names, int[] stocks, String target, int amount) {
        for (int i = 0; i < names.length; i++) {
            if (names[i] != null && names[i].equals(target)) {
                stocks[i] += amount;
                return;
            }
        }
        System.out.println("Item not found");
    }
}
