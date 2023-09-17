package service;

import entity.Staff;
import entity.User;

import static constant.Constants.GET_STAFF_DEPARTMENT_SURGERY;
import static constant.Constants.GET_STAFF_POSITION_SECURITY;
import static service.UserService.users;


public class findSurgeryInDepartment implements IFind {
    @Override
    public void find(String find) {
        for (User user : users) {
            if (user instanceof Staff) {
                if (((Staff) user).getDepartment().equals(GET_STAFF_DEPARTMENT_SURGERY)){
                    System.out.println(user);
                }
            }
        }
    }
}
