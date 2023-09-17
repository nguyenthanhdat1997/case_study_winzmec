package service;

import entity.Staff;
import entity.User;

import static constant.Constants.GET_STAFF_DEPARTMENT_DERMATOLOGY;
import static constant.Constants.GET_STAFF_DEPARTMENT_SURGERY;
import static service.UserService.users;


public class findDermatologyInDepartment implements IFind {
    @Override
    public void find(String find) {
        for (User user : users) {
            if (user instanceof Staff) {
                if (((Staff) user).getDepartment().equals(GET_STAFF_DEPARTMENT_DERMATOLOGY)){
                    System.out.println(user);
                }
            }
        }
    }
}
