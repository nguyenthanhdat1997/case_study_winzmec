package service.impl;

import entity.Staff;
import entity.User;
import service.IFind;

import static constant.Constants.GET_STAFF_POSITION_NURSE;
import static service.impl.UserService.getUsers;


public class findNurseInPosition implements IFind {
    @Override
    public void find(String find) {
        for (User user : getUsers()) {
            if (user instanceof Staff) {
                if (((Staff) user).getPosition().equals(GET_STAFF_POSITION_NURSE)){
                    System.out.println(user);
                }
            }
        }
    }
}
