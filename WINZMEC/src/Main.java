import service.*;

public class Main {
    public static void main(String[] args) {
        UserService.createAllUser();
//        StaffService.searchAndShowInfoStaff();
        UserService.menu();
        UserService.print();
//        TestService.createStaff();
//        TestService.createCustomer();
//        TestService.login();
    }
}