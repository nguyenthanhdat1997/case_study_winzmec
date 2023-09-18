package service.impl;

import entity.Staff;
import entity.User;
import service.IFind;

import static constant.Constants.GET_STAFF_DEPARTMENT_CARDIOLOGY;
import static service.impl.UserService.getUsers;


public class findCardiologyInDepartment implements IFind {
    @Override
    public void find(String find) {
        for (User user : getUsers()) {
            if (user instanceof Staff) {
                if (((Staff) user).getDepartment().equals(GET_STAFF_DEPARTMENT_CARDIOLOGY)){
                    System.out.println(user);
                }
            }
        }
    }
}
