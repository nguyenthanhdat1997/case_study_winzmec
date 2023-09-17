package service;

import entity.Staff;
import entity.User;

import static constant.Constants.GET_STAFF_DEPARTMENT_CARDIOLOGY;
import static constant.Constants.GET_STAFF_DEPARTMENT_DERMATOLOGY;
import static service.UserService.users;


public class findCardiologyInDepartment implements IFind {
    @Override
    public void find(String find) {
        for (User user : users) {
            if (user instanceof Staff) {
                if (((Staff) user).getDepartment().equals(GET_STAFF_DEPARTMENT_CARDIOLOGY)){
                    System.out.println(user);
                }
            }
        }
    }
}
