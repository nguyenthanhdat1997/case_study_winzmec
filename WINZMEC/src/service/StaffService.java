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
        User user = new Staff(setId(), "dat", "dat", "dat", 12, "nu", "234786", "23k", 20000, EPosition.SECURITY.toString(), EDepartment.CARDIOLOGY.toString());
        User user1 = new Staff(setId(), "dat", "dat", "dat", 12, "nam", "234786", "23k", 20000, EPosition.NURSE.toString(), EDepartment.SURGERY.toString());
        users.add(user);
        users.add(user1);
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
                        checkListDoctor(user);
                        break;
                    case NURSE:
                        checkListNurse(user);
                        break;
                    case SECURITY:
                        checkListSecurity(user);
                        break;
                }
            }
        }
    }


    public static void checkListDoctor(User user) {
        if (user instanceof Staff) {
            if (((Staff) user).getPosition().equals(EPosition.DOCTOR.toString())) {
                System.out.println(user);
            }
        }
    }
    public static void checkListNurse(User user) {
        if (user instanceof Staff) {

            if (((Staff) user).getPosition().equals(EPosition.NURSE.toString())) {
                System.out.println(user);
            }
        }
    }
    public static void checkListSecurity(User user) {
        if (user instanceof Staff) {
            if (((Staff) user).getPosition().equals(EPosition.SECURITY.toString())) {
                System.out.println(user);
            }
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
                        checkListSurgery(user);
                        break;
                    case DERMATOLOGY:
                        checkLisDermatology(user);
                        break;
                    case CARDIOLOGY:
                        checkListCardiology(user);
                        break;
                }
            }
        }

    }
    public static void checkListSurgery(User user) {
        if (user instanceof Staff) {
            if (((Staff) user).getDepartment().equals(EDepartment.SURGERY.toString())) {
                System.out.println(user);
            }
        }
    }
    public static void checkLisDermatology(User user) {
        if (user instanceof Staff) {
            if (((Staff) user).getDepartment().equals(EDepartment.DERMATOLOGY.toString())) {
                System.out.println(user);
            }
        }
    }
    public static void checkListCardiology(User user) {
        if (user instanceof Staff) {
            if (((Staff) user).getDepartment().equals(EDepartment.CARDIOLOGY.toString())) {
                System.out.println(user);
            }
        }
    }
}
