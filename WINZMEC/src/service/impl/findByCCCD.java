package service.impl;

import entity.Customer;
import entity.User;
import service.IFind;

import static service.impl.UserService.getUsers;

public class findByCCCD implements IFind {
    @Override
    public void find(String find) {
        for (User user:getUsers()) {
            if (user instanceof Customer){
                if (user.getCccd().equals(find)){
                    System.out.println(user);
                }
            }
        }
    }
}
