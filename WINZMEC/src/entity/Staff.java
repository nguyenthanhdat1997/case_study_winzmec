package entity;

import entity.User;

import java.io.Serializable;

public class Staff extends User implements Serializable {

    private long salary;
    private String position;
    private String department;

    public Staff(int userId, String username, String password, String name, int age, String sex, String cccd, String address, long salary, String position, String department) {
        super(userId, username, password, name, age, sex, cccd, address);
        this.salary = salary;
        this.position = position;
        this.department = department;
    }

    public Staff() {
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", cccd='" + cccd + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                ", position='" + position + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
    public Staff userId(int userId) {
        this.userId = userId;
        return this;
    }

    public Staff username(String username) {
        this.username = username;
        return this;
    }

    public Staff password(String password) {
        this.password = password;
        return this;
    }

    public Staff name(String name) {
        this.name = name;
        return this;
    }

    public Staff age(int age) {
        this.age = age;
        return this;
    }

    public Staff sex(String sex) {
        this.sex = sex;
        return this;
    }

    public Staff cccd(String cccd) {
        this.cccd = cccd;
        return this;
    }

    public Staff address(String address) {
        this.address = address;
        return this;
    }

    public Staff salary(long salary) {
        this.salary = salary;
        return this;
    }

    public Staff position(String position) {
        this.position = position;
        return this;
    }

    public Staff department(String department) {
        this.department = department;
        return this;
    }

}
