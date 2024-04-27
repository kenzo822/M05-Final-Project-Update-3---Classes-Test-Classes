public class SeatTest {
    public static void main(String[] args) {
        // Create a sample seat object
        Seat seat = new Seat(1, "Section A", 1, 1, 50.0, true);

        // Test seat object methods
        System.out.println("Seat ID: " + seat.getSeatID());
        System.out.println("Section: " + seat.getSection());
        System.out.println("Row: " + seat.getRow());
        System.out.println("Seat Number: " + seat.getSeatNumber());
        System.out.println("Price: " + seat.getPrice());
        System.out.println("Availability Status: " + seat.isAvailabilityStatus());
    }
}