package entity;

import entity.User;

public class Staff extends User {

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
}
