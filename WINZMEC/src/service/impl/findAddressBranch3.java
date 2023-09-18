package service.impl;

import entity.Address;
import service.IFindAddress;

public class findAddressBranch3 implements IFindAddress {

    @Override
    public Address find() {
        Address address;
        address = new Address()
                .streetName("201B Nguyễn Chí Thanh")
                .ward("Phường 8")
                .district("Quận 3");
        return address;
    }
}
