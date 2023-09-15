package service;

import constant.EDepartment;
import constant.EPosition;
import entity.Customer;
import entity.Staff;
import entity.User;

import static service.UserService.users;

public class StaffService {
    public static void createStaff() {
        User user2 = new Staff(2,"dat","dat","dat",12,"nu","234786","23k",20000, EPosition.DOCTOR.toString(), EDepartment.CARDIOLOGY.toString());
        users.add(user2);
    }
}
