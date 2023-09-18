package factory;

import service.IFindBooking;
import service.impl.*;

import static constant.Constants.*;

public class findBookingFactory {
    public static IFindBooking createIFind(int flag){
        switch (flag){
            case BOOKING_1:
                return new findBooking1();
            case BOOKING_2:
                return new findBooking2();
            case BOOKING_3:
                return new findBooking3();
            default:
                return null;
        }
    }
}
