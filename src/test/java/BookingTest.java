import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    private Booking booking;
    private Bedroom bedroom;
    private Guest guest;

    @Before
    public void before(){
        bedroom = new Bedroom(2, "double", 3);
        booking = new Booking(2, bedroom, 100);
        guest = new Guest("Marble");
    }

    @Test
    public void bookingHasNumberofNights(){
        assertEquals(2, booking.checkNumberOfNights());
    }

    @Test
    public void canAddGuestYoBooking(){
        booking.addGuest(guest);
        booking.addGuest(guest);
        assertEquals(2, booking.getGuestCount() );
    }

    @Test
    public void canCheckTotalBill(){
        assertEquals(200, booking.totalPrice(), 0.01);
    }
}
