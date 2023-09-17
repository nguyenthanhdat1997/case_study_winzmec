package service;


import entity.Admin;
import entity.User;
import entity.Customer;
import entity.Staff;
import service.impl.AdminService;
import service.impl.CustomerService;
import service.impl.StaffService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static constant.Constants.*;


public class UserService {
    private static final Scanner scanner;
    public static final List<User> users;


    static {
        scanner = new Scanner(System.in);
        users = new ArrayList<>();
    }

    public static void menu() {
        System.out.println("Chào mừng bạn đến với hệ thống WINZMEC" + "\n" +
                "Bạn muốn làm gì? " + "\n" +
                "1. Đăng nhập" + "\n" +
                "2. Đăng ký" + "\n" +
                "3. In ra danh sách user");
        createAllUser();
        int inputAnswer = scanner.nextInt();
        scanner.nextLine();
        switch (inputAnswer) {
            case LOGIN:
                login();
                break;
            case REGISTER_CUSTOMER:
                CustomerService.registerCustomer();
                System.out.println("Bạn đã đăng ký thành công ");
                login();
                break;
            case PRINT_LIST_USER:
                print();
                break;
        }
    }

    public static void login() {
        System.out.println("Bạn đang đăng nhập vào hệ thống WINZMEC: ");
        System.out.println("Vui lòng nhập username ");
        String username = scanner.nextLine();
        System.out.println("Vui lòng nhập password ");
        String password = scanner.nextLine();
        checkLogin(username, password);
    }

    public static void checkLogin(String username, String password) {
        if (users.stream().noneMatch(user -> user.getUsername().equals(username))) {
            System.out.println("Username chưa tồn tại");
            menu();
        } else {
            checkPasswordOfUser(username, password);
        }
    }

    public static void checkPasswordOfUser(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) &&
                    user.getPassword().equals(password)) {
                System.out.println("Welcome " + username);
                checkLoginTypeUser(user);
                break;
            } else if (user.getUsername().equals(username) &&
                    !user.getPassword().equals(password)) {
                System.out.println("Sai password vui lòng đăng nhập lại");
                break;
            }
        }
    }

    public static void checkLoginTypeUser(User user) {
        if (user instanceof Customer) {
            CustomerService.menuCustomer(user);
            //chỉnh sửa thông tin User, đặt lịch khám, tìm thông tin bác sĩ, tìm thông tin các khoa
        } else if (user instanceof Staff) {
            StaffService.searchAndShowInfoCustomer();
            //dậy làm phần này cho ngày chủ nhật
            //sửa password, check lịch khám, chỉnh sửa bệnh án, tìm thông tin bệnh nhân
        } else if (user instanceof Admin) {
            AdminService.menuAdmin();
            //thêm xóa chỉnh sửa thông tin tất cả(cần gì sửa đó)
        }

    }

    //search: tên doctor, nurse, tên bệnh nhân
    public static User createUser(int flag) {
        User newUser;
        switch (flag) {
            case CUSTOMER:
                newUser = new Customer();
                break;
            case STAFF:
                newUser = new Staff();
                break;
            case ADMIN:
                newUser = new Admin();
                break;
            default:
                return null;
        }
        return newUser;
    }

    public static void register() {
        System.out.println("Input type user:" + "\n" +
                "1: CUSTOMER" + "\n" +
                "2: STAFF" + "\n" +
                "3: ADMIN");
        int userType = scanner.nextInt();
        scanner.nextLine();

        users.add(inputInfoUser(userType));
    }

    public static User inputInfoUser(int userType) {
        User user = createUser(userType);
        assert user != null;
        inputInfoSharedUser(user);
//        checkTypeUser(user);
        return user;
    }

    public static int setId() {
        int userId = 1;
        for (User user : users) {
            userId++;
        }
        return userId;
    }

    public static void setPropertyStaff(User user) {
        ((Staff) user).setSalary(setSalary(user));
        choosePosition(user);
        chooseDepartment(user);
    }

    public static long setSalary(User user) {
        long salary = 7000000;
        if (user instanceof Staff) {
            if (((Staff) user).getPosition().equals(GET_STAFF_POSITION_DOCTOR)) {
                salary *= 3;
            } else if (((Staff) user).getPosition().equals(GET_STAFF_POSITION_NURSE)) {
                salary *= 2;
            } else if (((Staff) user).getPosition().equals(GET_STAFF_POSITION_SECURITY)) {
                salary *= 1;
            }
        }
        return salary;
    }

    public static void setPropertyCustomer(User user) {
        System.out.println("Input health record");
        String health_record = scanner.nextLine();
        ((Customer) user).setHealth_record(health_record);
    }

    public static void choosePosition(User user) {
        System.out.println("Choose position" + "\n" +
                "1. DOCTOR,\n" +
                "2. NURSE,\n" +
                "3. SECURITY ");
        int inputPosition = scanner.nextInt();
        scanner.nextLine();
        switch (inputPosition) {
            case DOCTOR:
                ((Staff) user).setPosition(GET_STAFF_POSITION_DOCTOR);
                break;
            case NURSE:
                ((Staff) user).setPosition(GET_STAFF_POSITION_NURSE);
                break;
            case SECURITY:
                ((Staff) user).setPosition(GET_STAFF_POSITION_SECURITY);
                break;
        }
    }

    public static void chooseDepartment(User user) {
        System.out.println("Choose department" + "\n" +
                "1. SURGERY,\n" +
                "2. DERMATOLOGY,\n" +
                "3. CARDIOLOGY ");
        int inputDepartment = scanner.nextInt();
        scanner.nextLine();
        switch (inputDepartment) {
            case SURGERY:
                ((Staff) user).setDepartment(GET_STAFF_DEPARTMENT_SURGERY);
                break;
            case DERMATOLOGY:
                ((Staff) user).setDepartment(GET_STAFF_DEPARTMENT_DERMATOLOGY);
                break;
            case CARDIOLOGY:
                ((Staff) user).setDepartment(GET_STAFF_DEPARTMENT_CARDIOLOGY);
                break;
        }
    }


    public static void inputInfoSharedUser(User user) {
        System.out.println("Input username:");
        String username = scanner.nextLine();

        System.out.println("Input password:");
        String password = scanner.nextLine();

        System.out.println("Input name:");
        String name = scanner.nextLine();

        System.out.println("Input age:");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Input sex:");
        String sex = scanner.nextLine();

        System.out.println("Input CCCD:");
        String cccd = scanner.nextLine();

        System.out.println("Input address");
        String address = scanner.nextLine();

        user.setUsername(username);
        user.setPassword(password);
        user.setName(name);
        user.setAge(age);
        user.setSex(sex);
        user.setCccd(cccd);
        user.setAddress(address);
    }

    public static void createAllUser() {
        CustomerService.createCustomer();
        StaffService.createStaff();
        AdminService.createAdmin();
    }

    public static void print() {
        for (User user : users) {
            System.out.println(user);
        }
    }
}
