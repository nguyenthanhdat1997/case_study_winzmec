package service.impl;

import entity.Admin;
import entity.Customer;
import entity.Staff;
import entity.User;

import java.io.Serializable;
import java.util.Scanner;

import static constant.Constants.*;
import static service.impl.UserService.*;
import static service.impl.CustomerService.*;

public class AdminService implements Serializable {
    private static final Scanner scanner;

    static {
        scanner = new Scanner(System.in);
    }

    public static void createAdmin() {
        User user= Admin.getAdmin();
        getUsers().add(user);
    }

    public static void menuAdmin() {
        System.out.println("Chào mừng bạn đến với WINZMEC: " + "\n" +
                "1. Chỉnh sửa thông tin khách hàng" + "\n" +
                "2. Chỉnh sửa thông tin nhân viên");
        int inputAnswer = scanner.nextInt();
        scanner.nextLine();
        switch (inputAnswer) {
            case UPDATE_INFO_CUSTOMER:
                updateInfoCustomer();
                break;
            case UPDATE_INFO_STAFF:
                updateInfoStaff();
                break;

        }
    }

    public static void updateInfoStaff() {
        System.out.println("Bạn muốn chỉnh sửa thông tin của nhân viên gì?" + "\n" +
                "1. Doctor" + "\n" +
                "2. Nurse" + "\n" +
                "3. Security");
        int inputAnswer = scanner.nextInt();
        scanner.nextLine();
        for (User user : getUsers()) {
            if (user instanceof Staff) {
                switch (inputAnswer) {
                    case DOCTOR:
                        updateInfoDoctor((Staff) user);
                        break;
                    case NURSE:
                        updateInfoNurse((Staff) user);
                        break;
                    case SECURITY:
                        updateInfoSecurity((Staff) user);
                        break;
                }
            }
        }
    }

    public static void updateInfoDoctor(Staff user) {
        if (user.getPosition().equals(GET_STAFF_POSITION_DOCTOR)) {
            CustomerService.updateInfo(user);
            UserService.setPropertyStaff(user);
        }
    }

    public static void updateInfoNurse(Staff user) {
        if (user.getPosition().equals(GET_STAFF_POSITION_NURSE)) {
            CustomerService.updateInfo(user);
            UserService.setPropertyStaff(user);
        }
    }

    public static void updateInfoSecurity(Staff user) {
        if (user.getPosition().equals(GET_STAFF_POSITION_SECURITY)) {
            CustomerService.updateInfo(user);
            UserService.setPropertyStaff(user);
        }
    }

    public static void updateInfoCustomer() {
        System.out.println("Tìm theo username. Nhập username để tìm");
        String inputUserName = scanner.nextLine();
        User user = findInfoCustomerByUsername(inputUserName);
        if (user != null){
            updateInfo(user);
            setPropertyCustomer(user);
            print();
        }else {
            System.out.println("username k tồn tại");
        }

    }

    public static User findInfoCustomerByUsername(String username) {
        for (User user : getUsers()) {
            if (user instanceof Customer) {
                if (user.getUsername().equals(username)){
                    return user;
                }
            }
        }
        return null;
    }
}