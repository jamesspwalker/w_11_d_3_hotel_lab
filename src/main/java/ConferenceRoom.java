import java.util.ArrayList;

public class ConferenceRoom {

    private int capacity;
    private String name;
    private ArrayList<Guest> guests;

    public ConferenceRoom(int capacity, String name){
        this.capacity = capacity;
        this.name = name;
        this.guests = new ArrayList<Guest>();
    }

    public int checkCapacity() {
        return this.capacity;
    }

    public String checkName() {
        return this.name;
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
