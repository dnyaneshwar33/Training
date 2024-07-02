public interface InventoryActions {
    void addProduct(ProductDetails product);
    void updateProduct(int id, String name, double price, int quantity);
    void displayProduct(int id);
    void displayAllProducts();
}
