import service.*;

public class Main {
    public static void main(String[] args) {
        CustomerService.createCustomer();
        StaffService.createStaff();
        AdminService.createAdmin();

        UserService.menu();
        UserService.print();
//        TestService.createStaff();
//        TestService.createCustomer();
//        TestService.login();
    }
}