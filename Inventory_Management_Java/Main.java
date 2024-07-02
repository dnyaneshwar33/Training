import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nInventory Management System");
            System.out.println("1. Add Product");
            System.out.println("2. Update Product");
            System.out.println("3. Display Product");
            System.out.println("4. Display All Products");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter product ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Enter product name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter product price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter product quantity: ");
                    int quantity = scanner.nextInt();
                    ProductDetails product = new ProductDetails(id, name, price, quantity);
                    inventory.addProduct(product);
                    break;
                case 2:
                    System.out.print("Enter product ID to update: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Enter new product name: ");
                    String updateName = scanner.nextLine();
                    System.out.print("Enter new product price: ");
                    double updatePrice = scanner.nextDouble();
                    System.out.print("Enter new product quantity: ");
                    int updateQuantity = scanner.nextInt();
                    inventory.updateProduct(updateId, updateName, updatePrice, updateQuantity);
                    break;
                case 3:
                    System.out.print("Enter product ID to display: ");
                    int displayId = scanner.nextInt();
                    inventory.displayProduct(displayId);
                    break;
                case 4:
                    inventory.displayAllProducts();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
