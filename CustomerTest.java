import java.util.Date;

public class CustomerTest {
    static class ConcreteCustomer extends Customer {
        public ConcreteCustomer(int customerID, String name, String email, String password, String address) {
            super(customerID, name, email, password, address);
        }

        @Override
        public void purchaseTicket(Game game, Seat seat) {
            // Implementation of purchaseTicket method for testing purposes
        }
    }

    public static void main(String[] args) {
        // Create a sample customer
        Customer customer = new ConcreteCustomer(1, "John Doe", "john@example.com", "password", "123 Street");

        // Test getters and setters
        System.out.println("Customer ID: " + customer.getCustomerID());
        System.out.println("Name: " + customer.getName());
        System.out.println("Email: " + customer.getEmail());
        System.out.println("Password: " + customer.getPassword());
        System.out.println("Address: " + customer.getAddress());

        // Test purchaseTicket method
        Game game = new Game(1, new String[]{"Team A", "Team B"}, new Date(), "Stadium A", new Seat[100]);
        Seat seat = new Seat(1, "Section A", 1, 1, 50.0, true);
        customer.purchaseTicket(game, seat);
    }
}