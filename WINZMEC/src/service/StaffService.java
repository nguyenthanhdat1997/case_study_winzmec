package service;

import constant.EDepartment;
import constant.EPosition;
import constant.EPosition.*;
import entity.Customer;
import entity.Staff;
import entity.User;

import java.util.Scanner;

import static constant.Constants.*;
import static service.UserService.setId;
import static service.UserService.users;

public class StaffService {
    private static Scanner scanner;

    static {
        scanner = new Scanner(System.in);
    }

    public static void createStaff() {
        User user = new Staff(setId(), "dat", "dat", "dat", 12, "nu", "234786", "23k", 20000, GET_STAFF_POSITION_DOCTOR, GET_STAFF_DEPARTMENT_DERMATOLOGY);
        users.add(user);
        User user1 = new Staff(setId(), "su", "su", "su", 55, "nam", "234786", "23k", 20000, GET_STAFF_POSITION_NURSE, GET_STAFF_DEPARTMENT_CARDIOLOGY);
        users.add(user1);
        User user2 = new Staff(setId(), "nhan", "nhan", "nhan", 44, "nam", "234786", "23k", 20000, GET_STAFF_POSITION_SECURITY, GET_STAFF_DEPARTMENT_SURGERY);
        users.add(user2);
    }


    public static void searchAndShowInfoStaff() {
        System.out.println("Bạn muốn tìm thông tin của nhân viên ở vị trí nào" + "\n" +
                "1. DOCTOR" + "\n" +
                "2. NURSE" + "\n" +
                "3. SECURITY ");
        int inputAnswerStaff = scanner.nextInt();
        scanner.nextLine();
        for (User user : users) {
            if (user instanceof Staff) {
                switch (inputAnswerStaff) {
                    case DOCTOR:
                        checkListDoctor((Staff) user);
                        break;
                    case NURSE:
                        checkListNurse((Staff) user);
                        break;
                    case SECURITY:
                        checkListSecurity((Staff) user);
                        break;
                }
            }
        }
    }


    public static void checkListDoctor(Staff user) {
        if (user.getPosition().equals(GET_STAFF_POSITION_DOCTOR)) {
            System.out.println(user);
        }
    }

    public static void checkListNurse(Staff user) {
        if (user.getPosition().equals(GET_STAFF_POSITION_NURSE)) {
            System.out.println(user);
        }
    }

    public static void checkListSecurity(Staff user) {
        if (user.getPosition().equals(GET_STAFF_POSITION_SECURITY)) {
            System.out.println(user);
        }
    }

    public static void searchAndShowInfoDepartment() {
        System.out.println("Bạn muốn tìm thông tin của nhân viên ở phòng ban nào" + "\n" +
                "1. SURGERY" + "\n" +
                "2. DERMATOLOGY" + "\n" +
                "3. CARDIOLOGY ");
        int inputAnswerDepartment = scanner.nextInt();
        scanner.nextLine();
        for (User user : users) {
            if (user instanceof Staff) {
                switch (inputAnswerDepartment) {
                    case SURGERY:
                        checkListSurgery((Staff) user);
                        break;
                    case DERMATOLOGY:
                        checkLisDermatology((Staff) user);
                        break;
                    case CARDIOLOGY:
                        checkListCardiology((Staff) user);
                        break;
                }
            }
        }

    }

    public static void checkListSurgery(Staff user) {
        if (user.getDepartment().equals(EDepartment.SURGERY.toString())) {
            System.out.println(user);
        }
    }

    public static void checkLisDermatology(Staff user) {
        if (user.getDepartment().equals(EDepartment.DERMATOLOGY.toString())) {
            System.out.println(user);
        }
    }

    public static void checkListCardiology(Staff user) {
        if (user.getDepartment().equals(EDepartment.CARDIOLOGY.toString())) {
            System.out.println(user);
        }
    }
}
