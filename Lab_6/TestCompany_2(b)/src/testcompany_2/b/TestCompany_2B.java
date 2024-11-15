
package testcompany_2.b;

class Product {
private String name; private int quantity; private double price;

// Constructor
public Product(String name, int quantity, double price) { this.name = name;
this.quantity = quantity; this.price = price;
}
public String getName() { return name;
}

@Override
public String toString() {
return "Product Name: " + name + ", Quantity: " + quantity + ", Price: " + price;
}
}

class Store {
private String name; private String location;
private Product[] productList = new Product[100]; private int nbProduct = 0;

// Constructor
public Store(String name, String location) { this.name = name;
this.location = location;
}

// Add product to the store
public void addProduct(Product p) { if (nbProduct < 100) {
productList[nbProduct++] = p;
} else {
System.out.println("Cannot add more products, storage limit reached.");
}
}

// Search product by name
public boolean searchProduct(String productName) { for (int i = 0; i < nbProduct; i++) {
if (productList[i].getName().equals(productName)) {
return true;
}
}
return false;
}

// Delete product by name and return the deleted product 
public Product deleteProduct(String productName) {
for (int i = 0; i < nbProduct; i++) {
if (productList[i].getName().equals(productName)) { Product deletedProduct = productList[i];
for (int j = i; j < nbProduct - 1; j++) { productList[j] = productList[j + 1];
}
productList[--nbProduct] = null; // Remove last duplicate return deletedProduct;
}
}
return null;
}

// Display all products in the store 
public void displayAll() {
System.out.println("Products in Store " + name + " located at " + location + ":"); for (int i = 0; i < nbProduct; i++) {
System.out.println(productList[i]);
}
}

public String getName() { return name;
}
} class Company {
 
private String name;
private Store[] arrayStore = new Store[10]; private int nbStore = 0;

// Constructor
public Company(String name) { this.name = name;
}

// Add store to the company
public void addStore(Store store) { if (nbStore < 10) {
arrayStore[nbStore++] = store;
} else {
System.out.println("Cannot add more stores, limit reached.");
}
}

// Search number of stores containing a product by name 
public int searchNbofStore(String productName) {
int count = 0;
for (int i = 0; i < nbStore; i++) {
if (arrayStore[i].searchProduct(productName)) { count++;
}
}
return count;
}
public void displayAll() {
System.out.println("Stores in Company " + name + ":"); for (int i = 0; i < nbStore; i++) {
System.out.println(arrayStore[i].getName());
}
 
}
}

public class TestCompany_2B {

    
    public static void main(String[] args) {
        // Creating Products
Product p1 = new Product("TV", 4, 34000); Product p2 = new Product("Bicycle", 4, 5500); Product p3 = new Product("Fridge", 3, 70000);

// Creating Stores
Store s1 = new Store("Makro", "Karachi"); Store s2 = new Store("Hypermart", "Karachi");

// Adding products to stores 
s1.addProduct(p1); s1.addProduct(p2); s1.addProduct(p3); s1.displayAll();

// Deleting a product from store
Product tempProduct = s1.deleteProduct("Bicycle"); if (tempProduct != null) {
System.out.println("Product " + tempProduct.getName() + " is deleted");
} else {
System.out.println("There is no product to delete");
}

// Displaying products after deletion 
s1.displayAll();

// Adding products to another store 
s2.addProduct(p1); s2.addProduct(p2); s2.displayAll();
Company c1 = new Company("Unilever"); c1.addStore(s1);
c1.addStore(s2);

// Display all stores in the company 
c1.displayAll();

// Search for the number of stores that contain a specific product 
int n = c1.searchNbofStore("TV");
System.out.println("Number of stores that have TV: " + n);
}

    }
