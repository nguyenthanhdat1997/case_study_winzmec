package service.impl;

import entity.Booking;
import service.IFindBooking;

public class findBooking2 implements IFindBooking {

    public Booking find() {
        Booking booking;
        booking = new Booking()
                .days("22")
                .months("11")
                .years("2023");
        return booking;
    }
}
