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
}
