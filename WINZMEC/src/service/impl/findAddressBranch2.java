package service.impl;

import entity.Address;
import service.IFindAddress;

public class findAddressBranch2 implements IFindAddress {

    @Override
    public Address find() {
        Address address;
        address = new Address()
                .streetName("192 hàm tử")
                .ward("Phường 1")
                .district("Quận 2");
        return address;
    }
}
