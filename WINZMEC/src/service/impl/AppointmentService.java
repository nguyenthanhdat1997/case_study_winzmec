package service.impl;

import constant.*;
import entity.*;
import factory.*;
import service.IFindAddress;
import service.IFindBooking;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static constant.Constants.*;

public class AppointmentService implements Serializable {
    private static final List<Appointment> appointments;
    private static final Scanner scanner;

    static {
        appointments = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public static Address setAddress() {
        System.out.println("Bạn muốn tìm chi nhánh nào" + "\n" +
                "1. Chi nhánh quận 1" + "\n" +
                "2. Chi nhánh quận 2" + "\n" +
                "3. Chi nhánh quận 3 ");
        int inputAnswer = scanner.nextInt();
        scanner.nextLine();
        IFindAddress iFindAddress;
        Address address = null;
        switch (inputAnswer) {
            case BRANCH_1:
                iFindAddress = findBranchFactory.createIFind(BRANCH_1);
                assert iFindAddress != null;
                address = iFindAddress.find();
                break;
            case BRANCH_2:
                iFindAddress = findBranchFactory.createIFind(BRANCH_2);
                assert iFindAddress != null;
                address = iFindAddress.find();
                break;
            case BRANCH_3:
                iFindAddress = findBranchFactory.createIFind(BRANCH_3);
                assert iFindAddress != null;
                address = iFindAddress.find();
                break;
        }
        return address;
    }

    public static Booking setBooking() {
        System.out.println("Bạn muốn tìm chi nhánh nào" + "\n" +
                "1. Hẹn ngày 21" + "\n" +
                "2. Hẹn ngày 22" + "\n" +
                "3. Hẹn ngày 23");
        int inputAnswer = scanner.nextInt();
        scanner.nextLine();
        IFindBooking iFindBooking;
        Booking booking = null;
        switch (inputAnswer) {
            case BOOKING_1:
                iFindBooking = findBookingFactory.createIFind(BOOKING_1);
                assert iFindBooking != null;
                booking = iFindBooking.find();
                break;
            case BOOKING_2:
                iFindBooking = findBookingFactory.createIFind(BOOKING_2);
                assert iFindBooking != null;
                booking = iFindBooking.find();
                break;
            case BOOKING_3:
                iFindBooking = findBookingFactory.createIFind(BOOKING_3);
                assert iFindBooking != null;
                booking = iFindBooking.find();
                break;
        }
        return booking;
    }

    public static void chooseDoctor(Appointment appointment) {
        System.out.println("Nhập bác sĩ bạn muốn khám:" + "\n" +
                "1: Đạt" + "\n" +
                "2: Phúc" + "\n" +
                "3: Kiệt");
        int inputChoose =  scanner.nextInt();
        scanner.nextLine();
        switch (inputChoose) {
            case DAT:
                appointment.seteDoctor(EDoctor.Dat);
                return;
            case PHUC:
                appointment.seteDoctor(EDoctor.Phuc);
                return;
            case KIET:
                appointment.seteDoctor(EDoctor.Kiet);
        }
    }
    public static void ChooseDepartment(Appointment appointment) {
        System.out.println("Nhập khoa bạn muốn khám:" + "\n" +
                "1: SURGERY" + "\n" +
                "2: DERMATOLOGY" + "\n" +
                "3: CARDIOLOGY");
        int inputChoose =  scanner.nextInt();
        scanner.nextLine();
        switch (inputChoose) {
            case SURGERY:
                appointment.seteDepartment(EDepartment.SURGERY);
                return;
            case DERMATOLOGY:
                appointment.seteDepartment(EDepartment.DERMATOLOGY);
                return;
            case CARDIOLOGY:
                appointment.seteDepartment(EDepartment.CARDIOLOGY);
        }
    }

    public static void createAppointment(Customer customer) {
        Appointment appointment = new Appointment();

        appointment.setCustomer(customer);

        appointment.setAddress(setAddress());

        ChooseDepartment(appointment);

        chooseDoctor(appointment);

        appointment.setBooking(setBooking());

        appointments.add(appointment);
        System.out.println(appointments);
    }

}
