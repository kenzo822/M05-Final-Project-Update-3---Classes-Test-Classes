public class Seat {
    private int seatID;
    private String section;
    private int row;
    private int seatNumber;
    private double price;
    private boolean availabilityStatus;

    public Seat(int seatID, String section, int row, int seatNumber, double price, boolean availabilityStatus) {
        this.seatID = seatID;
        this.section = section;
        this.row = row;
        this.seatNumber = seatNumber;
        this.price = price;
        this.availabilityStatus = availabilityStatus;
    }

    // Getters and Setters
    public int getSeatID() {
        return seatID;
    }

    public void setSeatID(int seatID) {
        this.seatID = seatID;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailabilityStatus() {
        return availabilityStatus;
    }

    public void setAvailabilityStatus(boolean availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }
}