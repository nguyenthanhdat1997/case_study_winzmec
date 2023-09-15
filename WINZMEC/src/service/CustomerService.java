package service;

import entity.Customer;
import entity.User;

import java.util.Scanner;

import static service.UserService.users;

public class CustomerService {
    private static final Scanner scanner;
    static {
        scanner = new Scanner(System.in);
    }
    public static void createCustomer() {
        User user = new Customer(1, "dev", "dev", "dat", 23, "Nam", "329847", "21k", "gan");
        users.add(user);
    }

    public static void registerCustomer() {
        User user = new Customer();
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

        user.setUserId(UserService.setId());
        user.setUsername(username);
        user.setPassword(password);
        user.setName(name);
        user.setAge(age);
        user.setSex(sex);
        user.setCccd(cccd);
        user.setAddress(address);
        users.add(user);
    }
}
