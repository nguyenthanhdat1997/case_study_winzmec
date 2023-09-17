package service;

import entity.Customer;
import entity.User;

import static service.UserService.users;

public class findByCCCD implements IFind{
    @Override
    public void find(String find) {
        for (User user:users) {
            if (user instanceof Customer){
                if (user.getCccd().equals(find)){
                    System.out.println(user);
                }
            }
        }
    }
}
