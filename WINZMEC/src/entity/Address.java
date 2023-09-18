package entity;

import java.io.Serializable;

public class Address implements Serializable {
    private String streetName;
    private String ward;
    private String district;

    public Address() {
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetName='" + streetName + '\'' +
                ", ward='" + ward + '\'' +
                ", district='" + district + '\'' +
                '}';
    }
//BUILDER
    public Address streetName(String streetName) {
        this.streetName = streetName;
        return this;
    }

    public Address ward(String ward) {
        this.ward = ward;
        return this;
    }

    public Address district(String district) {
        this.district = district;
        return this;
    }
}
