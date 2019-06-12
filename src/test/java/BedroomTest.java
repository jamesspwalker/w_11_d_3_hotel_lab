import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Bedroom bedroom;
    private Guest guest;
    private Guest guest2;

    @Before
    public void before(){
        bedroom = new Bedroom(2, "double", 1);
        guest = new Guest("Kenneth");
        guest2 = new Guest("Mikey");
    }

    @Test
    public void hasCapacity(){
        assertEquals(2, bedroom.checkCapacity());
    }

    @Test
    public void hasType(){
        assertEquals("double", bedroom.checkType());
    }

    @Test
    public void hasRoomNumber(){
        assertEquals(1, bedroom.checkRoomNumber());
    }

    @Test
    public void roomStartsEmpty(){
        assertEquals(0, bedroom.getGuestCount());
    }

    @Test
    public void canAddGuest(){
        bedroom.addGuest(guest);
        assertEquals(1, bedroom.getGuestCount() );
    }

    @Test
    public void cannotAddTooManyGuests(){
        bedroom.addGuest(guest);
        bedroom.addGuest(guest);
        bedroom.addGuest(guest);
        bedroom.addGuest(guest);
        assertEquals(2, bedroom.getGuestCount() );
    }

}
