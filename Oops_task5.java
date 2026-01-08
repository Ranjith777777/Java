package pratices.index;


class User1 {

    void login() {
        System.out.println("User logged into the e-commerce system");
    }
}


class Admin1 extends User1 {

    void managePlatform() {
        System.out.println("Admin is managing the platform");
    }
}

class Seller1 extends User1 {

    void addProduct() {
        System.out.println("Seller is adding products");
    }
}


class Customer1 extends User1 {

    void placeOrder() {
        System.out.println("Customer is placing an order");
    }
}


public class Oops_task5 {

    public static void main(String[] args) {

        Admin1 admin = new Admin1();
        admin.login();
        admin.managePlatform();

        System.out.println();

        Seller1 seller = new Seller1();
        seller.login();
        seller.addProduct();

        System.out.println();

        Customer1 customer = new Customer1();
        customer.login();
        customer.placeOrder();
    }
}

//Why is hierarchical inheritance used here?
//Because one base class (User) is shared by multiple child classes such as Admin1, Seller, and Customer.

//2How does this design improve code 
//Common functionality like login() is written once in the User class and reused by all subclasses, reducing duplicate code

//3Can each subclass have its own implementation of a common method?
//Yes. Each subclass can override a common method (for example accessLevel()) to define its own behavior.
