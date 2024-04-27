import java.util.ArrayList;
import java.util.List;

public abstract class Customer {
    private int customerID;
    private String name;
    private String email;
    private String password;
    private String address;

    public Customer(int customerID, String name, String email, String password, String address) {
        this.customerID = customerID;
        this.name = name;
        this.email = email;
        this.password = password;
        this.address = address;
    }

    // Getters and Setters
    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Abstract method for purchasing tickets
    public abstract void purchaseTicket(Game game, Seat seat);

    // Method to simulate purchasing a ticket
    protected void simulatePurchase(Game game, Seat seat) {
        // Print information about the purchased ticket
        System.out.println("Ticket purchased by customer " + getName() + ":");
        System.out.println("Game: " + game.getGameID());
        System.out.println("Seat: " + seat.getSeatID());
    }
}