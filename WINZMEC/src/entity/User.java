package entity;

import java.io.Serializable;

public abstract class User implements Serializable {
    protected int userId;
    protected String username;
    protected String password;
    protected String name;
    protected int age;
    protected String sex;
    protected String cccd;
    protected String address;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public User(int userId, String username, String password, String name, int age, String sex, String cccd, String address) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.cccd = cccd;
        this.address = address;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", cccd='" + cccd + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
    public User userId(int userId) {
        this.userId = userId;
        return this;
    }

    public User username(String username) {
        this.username = username;
        return this;
    }

    public User password(String password) {
        this.password = password;
        return this;
    }

    public User name(String name) {
        this.name = name;
        return this;
    }

    public User age(int age) {
        this.age = age;
        return this;
    }

    public User sex(String sex) {
        this.sex = sex;
        return this;
    }

    public User cccd(String cccd) {
        this.cccd = cccd;
        return this;
    }

    public User address(String address) {
        this.address = address;
        return this;
    }

}
