package entity;

import java.io.Serializable;

public class Customer extends User implements Serializable {
    private String health_record;

    public Customer(int userId, String username, String password, String name, int age, String sex, String cccd, String address, String health_record) {
        super(userId, username, password, name, age, sex, cccd, address);
        this.health_record = health_record;
    }

    public Customer() {
    }

    public String getHealth_record() {
        return health_record;
    }

    public void setHealth_record(String health_record) {
        this.health_record = health_record;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", cccd='" + cccd + '\'' +
                ", address='" + address + '\'' +
                ", health_record='" + health_record + '\'' +
                '}';
    }

    //BUILDER
    public Customer userId(int userId) {
        this.userId = userId;
        return this;
    }

    public Customer username(String username) {
        this.username = username;
        return this;
    }

    public Customer password(String password) {
        this.password = password;
        return this;
    }

    public Customer name(String name) {
        this.name = name;
        return this;
    }

    public Customer age(int age) {
        this.age = age;
        return this;
    }

    public Customer sex(String sex) {
        this.sex = sex;
        return this;
    }

    public Customer cccd(String cccd) {
        this.cccd = cccd;
        return this;
    }

    public Customer address(String address) {
        this.address = address;
        return this;
    }

    public Customer health_record(String healthRecord) {
        this.health_record = healthRecord;
        return this;
    }
}
