package entity;

public class Admin extends User{
    public Admin(int userId, String username, String password, String name, int age, String sex, String cccd, String address) {
        super(userId, username, password, name, age, sex, cccd, address);
    }

    public Admin() {
    }

    @Override
    public String toString() {
        return "Admin{" +
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
}
