package service.impl;

import entity.Staff;
import entity.User;
import service.IFind;

import static constant.Constants.GET_STAFF_POSITION_SECURITY;
import static service.impl.UserService.getUsers;


public class findSecurityInPosition implements IFind {
    @Override
    public void find(String find) {
        for (User user : getUsers()) {
            if (user instanceof Staff) {
                if (((Staff) user).getPosition().equals(GET_STAFF_POSITION_SECURITY)){
                    System.out.println(user);
                }
            }
        }
    }
}
