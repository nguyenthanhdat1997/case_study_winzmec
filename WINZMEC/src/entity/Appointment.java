package entity;

import constant.EDepartment;
import constant.EDoctor;

import java.io.Serializable;

public class Appointment implements Serializable {
    private Address address;
    private EDepartment eDepartment;
    private EDoctor eDoctor;
    private Customer customer;
    private Booking booking;

    public Appointment() {
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public EDepartment geteDepartment() {
        return eDepartment;
    }

    public void seteDepartment(EDepartment eDepartment) {
        this.eDepartment = eDepartment;
    }

    public EDoctor geteDoctor() {
        return eDoctor;
    }

    public void seteDoctor(EDoctor eDoctor) {
        this.eDoctor = eDoctor;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "customer=" + customer +
                ", address hospital=" + address +
                ", Department=" + eDepartment +
                ", Doctor=" + eDoctor +
                ", booking=" + booking +
                '}';
    }
}
