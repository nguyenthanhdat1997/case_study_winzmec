package service.impl;

import entity.Staff;
import entity.User;
import factory.*;
import service.IFind;

import java.io.Serializable;
import java.util.Scanner;

import static constant.Constants.*;
import static service.impl.UserService.*;


public class StaffService implements Serializable {
    private IFind findCustomer;

    public StaffService(IFind findCustomer) {
        this.findCustomer = findCustomer;
    }

    private static final Scanner scanner;

    static {
        scanner = new Scanner(System.in);
    }

    public static void createStaff() {
        User user = new Staff()
                .userId(setId())
                .username("dat")
                .password("dat")
                .name("dat")
                .age(12)
                .sex("nu")
                .cccd("234786")
                .address("23k")
                .salary(20000)
                .position(GET_STAFF_POSITION_DOCTOR)
                .department(GET_STAFF_DEPARTMENT_DERMATOLOGY);
        getUsers().add(user);

        User user1 = new Staff()
                .userId(setId())
                .username("su")
                .password("su")
                .name("su")
                .age(55)
                .sex("nam")
                .cccd("234786")
                .address("23k")
                .salary(20000)
                .position(GET_STAFF_POSITION_NURSE)
                .department(GET_STAFF_DEPARTMENT_CARDIOLOGY);
        getUsers().add(user1);

        User user2 = new Staff()
                .userId(setId())
                .username("nhan")
                .password("nhan")
                .name("nhan")
                .age(54)
                .sex("nu")
                .cccd("783265")
                .address("23k2")
                .salary(50000)
                .position(GET_STAFF_POSITION_NURSE)
                .department(GET_STAFF_DEPARTMENT_CARDIOLOGY);
        getUsers().add(user2);
    }


    public static void searchAndShowInfoStaff() {
        System.out.println("Bạn muốn tìm thông tin của nhân viên ở vị trí nào" + "\n" +
                "1. DOCTOR" + "\n" +
                "2. NURSE" + "\n" +
                "3. SECURITY ");
        int inputAnswerStaff = scanner.nextInt();
        scanner.nextLine();
        IFind iFind = null;
        switch (inputAnswerStaff) {
            case FIND_DOCTOR_IN_POSITION:
                iFind = findStaffFactory.createIFind(FIND_DOCTOR_IN_POSITION);
                assert iFind != null;
                iFind.find(String.valueOf(inputAnswerStaff));
                break;
            case FIND_NURSE_IN_POSITION:
                iFind = findStaffFactory.createIFind(FIND_NURSE_IN_POSITION);
                assert iFind != null;
                iFind.find(String.valueOf(inputAnswerStaff));
                break;
            case FIND_SECURITY_IN_POSITION:
                iFind = findStaffFactory.createIFind(FIND_SECURITY_IN_POSITION);
                assert iFind != null;
                iFind.find(String.valueOf(inputAnswerStaff));
                break;
        }
    }


    public static void searchAndShowInfoDepartment() {
        System.out.println("Bạn muốn tìm thông tin của nhân viên ở phòng ban nào" + "\n" +
                "1. SURGERY" + "\n" +
                "2. DERMATOLOGY" + "\n" +
                "3. CARDIOLOGY ");
        int inputAnswerDepartment = scanner.nextInt();
        scanner.nextLine();
        IFind iFind;
        switch (inputAnswerDepartment) {
            case SURGERY:
                iFind = findStaffFactory.createIFind(FIND_SURGERY_IN_DEPARTMENT);
                assert iFind != null;
                iFind.find(String.valueOf(inputAnswerDepartment));
                break;
            case DERMATOLOGY:
                iFind = findStaffFactory.createIFind(FIND_DERMATOLOGY_IN_DEPARTMENT);
                assert iFind != null;
                iFind.find(String.valueOf(inputAnswerDepartment));
                break;
            case CARDIOLOGY:
                iFind = findStaffFactory.createIFind(FIND_CARDIOLOGY_IN_DEPARTMENT);
                assert iFind != null;
                iFind.find(String.valueOf(inputAnswerDepartment));
                break;
        }
    }

    public static void searchAndShowInfoCustomer() {
        System.out.println("Bạn muốn tìm thông tin của khách hàng nào? " + "\n" +
                "1. Tìm theo tên" + "\n" +
                "2. Tìm theo username" + "\n" +
                "3. Tìm theo CCCD ");
        int inputAnswerCustomer = scanner.nextInt();
        scanner.nextLine();

        IFind iFind;
        switch (inputAnswerCustomer) {
            case SEARCH_NAME_CUSTOMER:
                iFind = findCustomerFactory.createIFind(SEARCH_NAME_CUSTOMER);
                System.out.println("Nhập vào tên cần tìm");
                String name = scanner.nextLine();
                assert iFind != null;
                iFind.find(name);
                break;
            case SEARCH_USERNAME_CUSTOMER:
                iFind = findCustomerFactory.createIFind(SEARCH_USERNAME_CUSTOMER);
                System.out.println("Nhập vào username cần tìm");
                String username = scanner.nextLine();
                assert iFind != null;
                iFind.find(username);
                break;
            case SEARCH_CCCD_CUSTOMER:
                iFind = findCustomerFactory.createIFind(FIND_BY_CCCD_CUSTOMER);
                System.out.println("Nhập vào cccd cần tìm");
                String cccd = scanner.nextLine();
                assert iFind != null;
                iFind.find(cccd);
                break;
        }
    }
}
