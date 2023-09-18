package service.impl;

import entity.Customer;
import entity.User;

import java.io.*;
import java.util.Scanner;

import static constant.Constants.*;
import static service.impl.UserService.*;

public class CustomerService implements Serializable {

    private static final Scanner scanner;

    static {
        scanner = new Scanner(System.in);
    }

    public static void createCustomer() {
        User user = new Customer()
                .userId(setId())
                .username("dev")
                .password("dev")
                .name("dat")
                .age(23)
                .sex("Nam")
                .cccd("329847")
                .address("21k")
                .health_record("gan");
        getUsers().add(user);
        User user1 = new Customer()
                .userId(setId())
                .username("dev1")
                .password("dev1")
                .name("phuc")
                .age(20)
                .sex("Nam")
                .cccd("25342")
                .address("21kk")
                .health_record("tim");
        getUsers().add(user1);
    }

    public static void menuCustomer(User user) {
        System.out.println("Chào mừng bạn đến với WINZMEC: " + "\n" +
                "1. Chỉnh sửa thông tin " + "\n" +
                "2. Đặt lịch khám " + "\n" +
                "3. Tìm thông tin các vị trí trong bệnh viện " + "\n" +
                "4. Tìm thông tin các khoa ");
        int inputAnswer = scanner.nextInt();
        scanner.nextLine();
        switch (inputAnswer) {
            case UPDATE_INFO_CUSTOMER:
                updateInfo(user);
                break;
            case SCHEDULE_AN_APPOINTMENT:
                AppointmentService.createAppointment((Customer) user);
                break;
            case SEARCH_AND_SHOW_INFO_STAFF:
                StaffService.searchAndShowInfoStaff();
                break;
            case SEARCH_INFO_AND_SHOW_INFO_DEPARTMENT:
                StaffService.searchAndShowInfoDepartment();
                break;
        }
    }

    public static void registerCustomer() {
        User user = new Customer();
        inputInfoSharedUser(user);
        getUsers().add(user);


    }

    public static void updateInfo(User user) {
        System.out.println("Nhập thông tin bạn muốn sửa");
        inputInfoSharedUser(user);
    }


}
