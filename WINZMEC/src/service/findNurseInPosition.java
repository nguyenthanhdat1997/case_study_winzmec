package service;

import entity.Staff;
import entity.User;

import static constant.Constants.GET_STAFF_POSITION_DOCTOR;
import static constant.Constants.GET_STAFF_POSITION_NURSE;
import static service.UserService.users;


public class findNurseInPosition implements IFind {
    @Override
    public void find(String find) {
        for (User user : users) {
            if (user instanceof Staff) {
                if (((Staff) user).getPosition().equals(GET_STAFF_POSITION_NURSE)){
                    System.out.println(user);
                }
            }
        }
    }
}
