package entity;

import java.io.Serializable;

import static service.impl.UserService.setId;

public class Admin extends User implements Serializable {
    private static final Admin admin;
    static {
        admin =new Admin(99999, "admin", "admin", "thinh", 33, "Nu", "652341", "21k");
    }
    private Admin(int userId, String username, String password, String name, int age, String sex, String cccd, String address) {
        super(userId, username, password, name, age, sex, cccd, address);
    }
    public static Admin getAdmin(){
        return admin;
    }
}
