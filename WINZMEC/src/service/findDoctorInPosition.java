package service;

import entity.Staff;
import entity.User;

import static constant.Constants.*;
import static service.UserService.users;


public class findDoctorInPosition implements IFind {
    @Override
    public void find(String find) {
        for (User user : users) {
            if (user instanceof Staff) {
                if (((Staff) user).getPosition().equals(GET_STAFF_POSITION_DOCTOR)){
                    System.out.println(user);
                }
            }
        }
    }
}
