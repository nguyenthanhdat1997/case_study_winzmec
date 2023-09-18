package service.impl;

import entity.Booking;
import service.IFindBooking;

public class findBooking1 implements IFindBooking {

    @Override
    public Booking find() {
        Booking booking;
        booking = new Booking()
                .days("21")
                .months("11")
                .years("2023");
        return booking;
    }
}
