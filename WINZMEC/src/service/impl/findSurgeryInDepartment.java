package service.impl;

import entity.Staff;
import entity.User;
import service.IFind;

import static constant.Constants.GET_STAFF_DEPARTMENT_SURGERY;
import static service.impl.UserService.getUsers;


public class findSurgeryInDepartment implements IFind {
    @Override
    public void find(String find) {
        for (User user : getUsers()) {
            if (user instanceof Staff) {
                if (((Staff) user).getDepartment().equals(GET_STAFF_DEPARTMENT_SURGERY)){
                    System.out.println(user);
                }
            }
        }
    }
}
