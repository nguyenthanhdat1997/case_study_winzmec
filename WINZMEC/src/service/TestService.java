package service;

import entity.Customer;
import entity.Staff;
import entity.User;

import java.util.Scanner;

import static service.UserService.users;

public class TestService {
    private static Scanner scanner = new Scanner(System.in);
    public static void createStaff(){
        User user = new Staff();
        user.setUsername("admin");
        user.setPassword("admin");
        user.setUserId(0);
        users.add(user);
    }
    public static void createCustomer(){
        User user = new Customer();
        user.setUsername("customer");
        user.setPassword("customer");
        user.setUserId(1);
        users.add(user);
    }
    public static void login(){
        String username = scanner.nextLine();
        String pass = scanner.nextLine();
        loginCheck(username,pass);
    }
    public static void loginCheck(String username,String pass){
        Staff staff = new Staff();
        User user1 = new Customer();
        if (users.stream().noneMatch(user -> user.getUsername().equals(username))){
            System.out.println("k tồn tại");
        } else {
            for (User user: users) {
                if (user.getUsername().equals(username)){
                    if (user.getClass() == user1.getClass()){
                        System.out.println("welcome");
                    }
                }
            }
        }
    }

}
