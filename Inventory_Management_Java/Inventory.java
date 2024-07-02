import java.util.ArrayList;

public class Inventory implements InventoryActions {
    private ArrayList<ProductDetails> products;

    public Inventory() {
        products = new ArrayList<>();
    }

    @Override
    public void addProduct(ProductDetails product) {
        products.add(product);
        System.out.println("Product added successfully.");
    }

    @Override
    public void updateProduct(int id, String name, double price, int quantity) {
        boolean found = false;
        for (int i = 0; i < products.size(); i++) {
            ProductDetails product = products.get(i);
            if (product.getId() == id) {
                product.setName(name);
                product.setPrice(price);
                product.setQuantity(quantity);
                System.out.println("Product updated successfully.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Product not found.");
        }
    }

  

    @Override
    public void displayProduct(int id) {
        boolean found = false;
        for (int i = 0; i < products.size(); i++) {
            ProductDetails product = products.get(i);
            if (product.getId() == id) {
                System.out.println(product);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Product not found.");
        }
    }

    @Override
    public void displayAllProducts() {
        if (products.isEmpty()) {
            System.out.println("No products in inventory.");
        } else {
            for (int i = 0; i < products.size(); i++) {
                System.out.println(products.get(i));
            }
        }
    }
}
