import java.util.Date;

public class GameTest {
    public static void main(String[] args) {
        // Create a sample game object
        Seat[] seats = new Seat[100]; // Assuming 100 seats
        for (int i = 0; i < 100; i++) {
            seats[i] = new Seat(i + 1, "Section A", 1, i + 1, 50.0, true); // Sample seat initialization
        }

        Game game = new Game(1, new String[]{"Team A", "Team B"}, new Date(), "Stadium A", seats);

        // Test game object methods
        System.out.println("Game ID: " + game.getGameID());
        System.out.println("Teams Playing: " + String.join(", ", game.getTeamsPlaying()));
        System.out.println("Date: " + game.getDate());
        System.out.println("Venue: " + game.getVenue());
        Seat[] availableSeats = game.getAvailableSeats();
        System.out.println("Available Seats: " + availableSeats.length);
    }
}