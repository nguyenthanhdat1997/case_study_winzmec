package service;

import constant.EDepartment;
import constant.EPosition;
import entity.Admin;
import entity.User;
import entity.Customer;
import entity.Staff;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static constant.Constants.*;


public class UserService {
    private static final Scanner scanner;
    protected static final List<User> users;
    private static int userId = 0;

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
        String inputAnswer = scanner.nextLine();
        switch (inputAnswer) {
            case "1":
                login();
                break;
            case "2":
                CustomerService.registerCustomer();
                break;
            case "3":
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
            checkPasswordOfUser(username,password);
        }
    }
    public static void checkPasswordOfUser(String username, String password){
        for (User user : users) {
            if (user.getUsername().equals(username) &&
                    user.getPassword().equals(password)) {
                System.out.println("Welcome " + username);
                checkTypeUser(user);
                break;
            } else if (user.getUsername().equals(username) &&
                    !user.getPassword().equals(password)) {
                System.out.println("Sai password vui lòng đăng nhập lại");
                break;
            }
        }
    }
    public static void checkTypeUser(User user){
        if (user != null) {
            if (user instanceof Customer) {
                CustomerService customerService = new CustomerService();
                System.out.println("customer");
            } else if (user instanceof Staff) {
                StaffService staffService = new StaffService();
                System.out.println("staff");
            } else if (user instanceof Admin) {
                AdminService adminService = new AdminService();
                System.out.println("admin");
            }
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
//        System.out.println("Input username:");
//        String username = scanner.nextLine();
//
//        System.out.println("Input password:");
//        String password = scanner.nextLine();

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

        assert user != null;
        user.setUserId(setId());
//        user.setUsername(username);
//        user.setPassword(password);
        user.setName(name);
        user.setAge(age);
        user.setSex(sex);
        user.setCccd(cccd);
        user.setAddress(address);
        checkTypeUser(user);
        return user;
    }

    public static int setId() {
        for (User user : users) {
            userId++;
        }
        return userId;
    }

    public static void setPropertyStaff(User user) {
        System.out.println("Input salary");
        long salary = Long.parseLong(scanner.nextLine());
        ((Staff) user).setSalary(salary);
        choosePosition(user);
        chooseDepartment(user);
    }

    public static void setPropertyCustomer(User user) {
        System.out.println("Input health record");
        String health_record = scanner.nextLine();
        ((Customer) user).setHealth_record(health_record);
    }

    public static void choosePosition(User user) {
        System.out.println("Choose position" + "\n" +
                "1. DIRECTOR,\n" +
                "2. DEPUTY,\n" +
                "3. SECURITY,\n" +
                "4. DOCTOR,\n" +
                "5. NURSE,\n" +
                "6. ADVISER,\n" +
                "7. CLEANER");
        int inputPosition = scanner.nextInt();
        scanner.nextLine();
        switch (inputPosition) {
            case DIRECTOR:
                ((Staff) user).setPosition(String.valueOf(EPosition.DIRECTOR));
                break;
            case DEPUTY:
                ((Staff) user).setPosition(String.valueOf(EPosition.DEPUTY));
                break;
            case SECURITY:
                ((Staff) user).setPosition(String.valueOf(EPosition.SECURITY));
                break;
            case DOCTOR:
                ((Staff) user).setPosition(String.valueOf(EPosition.DOCTOR));
                break;
            case NURSE:
                ((Staff) user).setPosition(String.valueOf(EPosition.NURSE));
                break;
            case ADVISER:
                ((Staff) user).setPosition(String.valueOf(EPosition.ADVISER));
                break;
            case CLEANER:
                ((Staff) user).setPosition(String.valueOf(EPosition.CLEANER));
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
                ((Staff) user).setDepartment(String.valueOf(EDepartment.SURGERY));
                break;
            case DERMATOLOGY:
                ((Staff) user).setDepartment(String.valueOf(EDepartment.DERMATOLOGY));
                break;
            case CARDIOLOGY:
                ((Staff) user).setDepartment(String.valueOf(EDepartment.CARDIOLOGY));
                break;
        }
    }

//    public static void checkTypeUser(User user) {
//        if (user instanceof Staff) {
//            setPropertyStaff(user);
//        } else if (user instanceof Customer) {
//            setPropertyCustomer(user);
//        } else if (user instanceof Admin) {
//            System.out.println("welcome Admin");
//        }
//    }

    public static void print() {
        for (User user : users) {
            System.out.println(user);
        }
    }
}
