import java.util.Date;

public class Game {
    private int gameID;
    private String[] teamsPlaying;
    private Date date;
    private String venue;
    private Seat[] availableSeats;

    public Game(int gameID, String[] teamsPlaying, Date date, String venue, Seat[] availableSeats) {
        this.gameID = gameID;
        this.teamsPlaying = teamsPlaying;
        this.date = date;
        this.venue = venue;
        this.availableSeats = availableSeats;
    }

    // Getters and Setters
    public int getGameID() {
        return gameID;
    }

    public void setGameID(int gameID) {
        this.gameID = gameID;
    }

    public String[] getTeamsPlaying() {
        return teamsPlaying;
    }

    public void setTeamsPlaying(String[] teamsPlaying) {
        this.teamsPlaying = teamsPlaying;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public Seat[] getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(Seat[] availableSeats) {
        this.availableSeats = availableSeats;
    }

    // Method to update available seats
    public void updateAvailableSeats(Seat[] seats) {
        this.availableSeats = seats;
    }
}