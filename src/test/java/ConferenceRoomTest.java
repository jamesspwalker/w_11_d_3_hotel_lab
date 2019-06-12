import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    private ConferenceRoom conferenceRoom;
    private Guest guest;

    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom(4, "The Meeting Room");
        guest  = new Guest("Bob");
    }

    @Test
    public void hasCapacity(){
        assertEquals(4, conferenceRoom.checkCapacity());
    }

    @Test
    public void hasName(){
        assertEquals("The Meeting Room", conferenceRoom.checkName());
    }

    @Test
    public void roomStartsEmpty(){
        assertEquals(0, conferenceRoom.getGuestCount());
    }

    @Test
    public void canAddGuest(){
        conferenceRoom.addGuest(guest);
        assertEquals(1, conferenceRoom.getGuestCount() );
    }

    @Test
    public void cannotAddTooManyGuests(){
        conferenceRoom.addGuest(guest);
        conferenceRoom.addGuest(guest);
        conferenceRoom.addGuest(guest);
        conferenceRoom.addGuest(guest);
        conferenceRoom.addGuest(guest);
        assertEquals(4, conferenceRoom.getGuestCount() );
    }

}
