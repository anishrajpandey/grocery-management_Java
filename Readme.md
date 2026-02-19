# Grocery Management System - CS3354

A Java-based inventory management system utilizing parallel arrays to track item names, prices, and stock levels. This project was developed as a collaborative assignment to demonstrate proficiency with Git branching, merging, and Javadoc documentation.

## Team Members & Roles

- **Benjamin Chei** - Developer / Collaborator
- **Elizabeth D. Olvera** - Developer / Collaborator
-  **Anish Raj Pandey** - Developer / Collaborator

## Project Architecture

The system manages data across three parallel arrays:

- `String[] itemNames`: Stores the name of each product.
- `double[] itemPrices`: Stores the unit price.
- `int[] itemStocks`: Tracks current inventory quantity.

## Features

1. **Inventory Display**: Iterates through the arrays and prints formatted details for all non-empty slots.
2. **Restock & Search**: Allows users to search for a specific item (case-insensitive) and update its stock quantity.
3. **User Menu**: A command-line interface for navigating system features.

## Git Workflow

Each feature was developed on a dedicated branch before being merged into `main`:

- `feature-display`: Inventory listing logic.
- `feature-restock`: Item search and stock update logic.
- `feature-menu`: Scanner-based menu and main loop integration.

## Documentation

Javadoc documentation is generated and stored in the `docs/` folder. To view the documentation, open `docs/index.html` in any web browser.

## How to Run

1. Compile the program: `javac GroceryManager.java`
2. Run the program: `java GroceryManager`
