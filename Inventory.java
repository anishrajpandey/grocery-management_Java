public static void printInventory(String[] names, double[] prices, int[] stocks) {

    for (int i = 0; i < names.length; i++) {

        if (names[i] != null) {
            System.out.println("Item: " + names[i] +
                               " | Price: $" + prices[i] +
                               " | Stock: " + stocks[i]);
        }
    }
}
