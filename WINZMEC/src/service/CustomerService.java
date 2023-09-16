package service;

import constant.EPosition;
import entity.Customer;
import entity.Staff;
import entity.User;

import java.util.Scanner;

import static constant.Constants.*;
import static service.UserService.*;

public class CustomerService {
    private static final Scanner scanner;

    static {
        scanner = new Scanner(System.in);
    }

    public static void createCustomer() {
        User user = new Customer(setId(), "dev", "dev", "dat", 23, "Nam", "329847", "21k", "gan");
        users.add(user);
        User user1 = new Customer(setId(), "dev1", "dev1", "phuc", 20, "Nam", "25342", "21kk", "tim");
        users.add(user1);
    }

    public static void menuCustomer(User user) {
        System.out.println("Chào mừng bạn đến với WINZMEC: " + "\n" +
                "1. Chỉnh sửa thông tin " + "\n" +
                "2. Đặt lịch khám " + "\n" +
                "3. Tìm thông tin các bác sĩ " + "\n" +
                "4. Tìm thông tin các khoa ");
        int inputAnswer = scanner.nextInt();
        scanner.nextLine();
        switch (inputAnswer) {
            case UPDATE_INFO_CUSTOMER:
                updateInfo(user);
                break;
            case SCHEDULE_AN_APPOINTMENT:
//                scheduleAnAppointMent();
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
        users.add(user);
    }

    public static void updateInfo(User user) {
        System.out.println("Nhập thông tin bạn muốn sửa");
        inputInfoSharedUser(user);
    }


}
