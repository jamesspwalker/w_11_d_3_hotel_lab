import java.util.ArrayList;

public class Hotel {

    private String name;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;


    public Hotel(String name){
        this.name = name;
        this.bedrooms = new ArrayList<Bedroom>();
        this.conferenceRooms = new ArrayList<ConferenceRoom>();
    }

    public String checkName() {
        return this.name;
    }

    public int countBedrooms() {
        return this.bedrooms.size();
    }

    public void addBedroom(Bedroom bedroom) {
        this.bedrooms.add(bedroom);
    }

    public int countConferenceRooms() {
        return this.conferenceRooms.size();
    }

    public void addConferenceRoom(ConferenceRoom conferenceRoom) {
        this.conferenceRooms.add(conferenceRoom);
    }

    public void checkInGuestToBedroom(Guest guest, Bedroom bedroom) {
        if (this.bedrooms.contains(bedroom)) {
            bedroom.addGuest(guest);
        }
    }

    public void checkInGuestToConferenceRoom(Guest guest, ConferenceRoom conferenceRoom) {
        if (this.conferenceRooms.contains(conferenceRoom))
        conferenceRoom.addGuest(guest);
    }

    public void checkGuestsOut(Bedroom bedroom) {
        if (bedroom.getGuestCount() >= 1);
        bedroom.removeGuests();
    }

    public int bookRoom(int nights, Bedroom bedroom, double price, Guest guest){
        Booking booking = new Booking(nights, bedroom, price);
        return booking.checkNumberOfNights();

    }
}
