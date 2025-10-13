package Phase1_OOP;

class Customer {
    int id;
    String name;
    String email;
    Customer(int id, String name, String email){
        this.id = id;
        this.name = name;
        this.email = email;
    }
    void showCustomer() {
        System.out.println("Customer: " + id + " , " + name + " , " + email);
    }
}

class Product {
    int id;
    String name;
    double price;
    Product(int id, String name, double price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    void showProduct() {
        System.out.println("Product: " + id + " , " + name + " , $" + price);
    }
}

public class Main {
    public static void main(String[] args) {
        Customer c = new Customer(1, "Mahesh Khadka", "mahesh@gmail.com");
        c.showCustomer();

        Product p = new Product(101, "Laptop", 95000);
        p.showProduct();
    }
}

