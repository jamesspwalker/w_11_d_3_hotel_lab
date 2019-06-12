import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel;
    private Bedroom bedroom;
    private Bedroom bedroom1;
    private ConferenceRoom conferenceRoom;
    private Guest guest;

    @Before
    public void before(){
        hotel = new Hotel("Code Clan Hotel");
        bedroom = new Bedroom(2, "double", 3);
        bedroom1 = new Bedroom(1, "single", 4);
        conferenceRoom = new ConferenceRoom(4, "The Visting Room");
        guest = new Guest("Chris");
        hotel.addBedroom(bedroom);

    }

    @Test
    public void hotelHasName(){
        assertEquals("Code Clan Hotel", hotel.checkName());
    }

    @Test
    public void hotelStartsWithoutBedrooms(){
        assertEquals(0, hotel.countBedrooms());
    }

    @Test
    public void canAddBedroom(){
        hotel.addBedroom(bedroom);
        assertEquals(1, hotel.countBedrooms());
    }

    @Test
    public void hotelStartsWithoutConferenceRooms(){
        assertEquals(0, hotel.countConferenceRooms());
    }

    @Test
    public void canAddConferenceRoom(){
        hotel.addConferenceRoom(conferenceRoom);
        assertEquals(1, hotel.countConferenceRooms());
    }

    @Test
    public void canCheckInGuest(){
        hotel.checkInGuestToBedroom(guest, bedroom);
        hotel.checkInGuestToBedroom(guest, bedroom);
        hotel.checkInGuestToBedroom(guest, bedroom1);
        assertEquals(2, bedroom.getGuestCount());
        assertEquals(0, bedroom1.getGuestCount());

    }

    @Test
    public void canCheckGuestsOut(){
        hotel.checkInGuestToBedroom(guest, bedroom);
        hotel.checkGuestsOut(bedroom);
        assertEquals(0, bedroom.getGuestCount());
    }

}
