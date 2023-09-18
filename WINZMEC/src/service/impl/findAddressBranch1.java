package service.impl;

import entity.Address;
import service.IFindAddress;

public class findAddressBranch1 implements IFindAddress {

    @Override
    public Address find() {
        Address address;
        address = new Address()
                .streetName("21k")
                .ward("Phường 10")
                .district("Quận 1");
        return address;
    }
}
