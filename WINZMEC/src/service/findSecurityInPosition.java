package service;

import entity.Staff;
import entity.User;

import static constant.Constants.GET_STAFF_POSITION_NURSE;
import static constant.Constants.GET_STAFF_POSITION_SECURITY;
import static service.UserService.users;


public class findSecurityInPosition implements IFind {
    @Override
    public void find(String find) {
        for (User user : users) {
            if (user instanceof Staff) {
                if (((Staff) user).getPosition().equals(GET_STAFF_POSITION_SECURITY)){
                    System.out.println(user);
                }
            }
        }
    }
}
