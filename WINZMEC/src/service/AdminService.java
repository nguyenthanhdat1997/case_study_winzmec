package service;

import entity.Admin;
import entity.User;

import static service.UserService.users;

public class AdminService {
    public static void createAdmin() {
        User user3 = new Admin(3,"admin","admin","thinh",33,"Nu","652341","21k");
        users.add(user3);
    }
}
