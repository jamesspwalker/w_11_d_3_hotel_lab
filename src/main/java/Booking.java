import java.util.ArrayList;

public class Booking {

    private int numberOfNights;
    private Bedroom bedroom;
    private double roomPrice;
    private ArrayList<Guest> guests;

    public Booking(int numberOfNights, Bedroom bedroom, double roomPrice){
        this.numberOfNights = numberOfNights;
        this.bedroom = bedroom;
        this.roomPrice = roomPrice;
        this.guests = new ArrayList<Guest>();
    }


    public int checkNumberOfNights() {
        return this.numberOfNights;
    }

    public int getGuestCount() {
        return this.guests.size();
    }

    public void addGuest(Guest guest) {
        if (this.getGuestCount() < bedroom.checkCapacity()){
            this.guests.add(guest);
        }
    }

    public double totalPrice() {
        return this.roomPrice * this.numberOfNights;
    }
}
