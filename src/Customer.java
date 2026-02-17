public class Customer extends User {

    // TODO: constructor
    public Customer(String name, int id){
        super(name, id);
    }


    @Override
    public void manageService(Service s) {

        // TODO:
        // print that customer cannot manage services
        System.out.println("Customers cannot manage!!!");

    }

    @Override
    public void useService(Service s) {

        // TODO:
        // print customer using message
        // call performService()
        System.out.println("customer is using...");
        s.performService();

    }
}