package Phase1_OOP;

class Customer {
    int id;
    String name;
    String email;

    void showCustomer() {
        System.out.println("Customer: " + id + " , " + name + " , " + email);
    }
}

class Product {
    int id;
    String name;
    double price;

    void showProduct() {
        System.out.println("Product: " + id + " , " + name + " , $" + price);
    }
}

public class Main {
    public static void main(String[] args) {
        Customer c = new Customer();
        c.id = 101;
        c.name = "Mahesh Khadka";
        c.email = "mahesh@gmail.com";
        c.showCustomer();

        Product p = new Product();
        p.id = 1;
        p.name = "Laptop";
        p.price = 75000;
        p.showProduct();
    }
}

