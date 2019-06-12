import java.util.ArrayList;

public class Bedroom {

    private int capacity;
    private String type;
    private int roomNumber;
    private ArrayList<Guest> guests;

    public Bedroom(int capacity, String type, int roomNumber){
        this.capacity = capacity;
        this.type = type;
        this.roomNumber = roomNumber;
        this.guests = new ArrayList<Guest>();
    }

    public int checkCapacity() {
        return this.capacity;
    }

    public String checkType() {
        return this.type;
    }

    public int checkRoomNumber() {
        return this.roomNumber;
    }

    public int getGuestCount() {
        return this.guests.size();
    }

    public void addGuest(Guest guest) {
        if (this.getGuestCount() < this.capacity){
            this.guests.add(guest);
        }
    }


}

