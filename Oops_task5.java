package pratices.index;


class data {
    void login() {
        System.out.println("User logged into the e-commerce system");
    }
}

class add extends data {
    void managePlatform() {
        System.out.println("Admin is managing the platform");
    }
}


class Seller extends data {
    void addProduct() {
        System.out.println("Seller is adding products");
    }
}

class customer extends data {
    void placeOrder() {
        System.out.println("Customer is placing an order");
    }
}

public class Oops_task5 {
    public static void main(String[] args) {

    
        add admin = new add();
        admin.login();
        admin.managePlatform();

        System.out.println();

     
        Seller seller = new Seller();
        seller.login();
        seller.addProduct();

        System.out.println();

      
        customer cust = new customer();  
        cust.login();                    
        cust.placeOrder();           
    }
}
