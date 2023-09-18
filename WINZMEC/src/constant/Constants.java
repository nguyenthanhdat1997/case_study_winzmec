package constant;

import entity.User;

public interface Constants {

    int CUSTOMER = 1;
    int STAFF = 2;
    int ADMIN = 3;


    int DOCTOR = 1;
    int NURSE = 2;
    int SECURITY = 3;


    int SURGERY = 1;
    int DERMATOLOGY = 2;
    int CARDIOLOGY = 3;

    int LOGIN = 1;
    int REGISTER_CUSTOMER = 2;
    int PRINT_LIST_USER = 3;

    int UPDATE_INFO_CUSTOMER = 1;
    int SCHEDULE_AN_APPOINTMENT = 2;
    int SEARCH_AND_SHOW_INFO_STAFF = 3;
    int SEARCH_INFO_AND_SHOW_INFO_DEPARTMENT = 4;

    int UPDATE_INFO_STAFF = 2;

    String GET_STAFF_POSITION_DOCTOR = EPosition.DOCTOR.toString();
    String GET_STAFF_POSITION_NURSE = EPosition.NURSE.toString();
    String GET_STAFF_POSITION_SECURITY = EPosition.SECURITY.toString();

    String GET_STAFF_DEPARTMENT_SURGERY = EDepartment.SURGERY.toString();
    String GET_STAFF_DEPARTMENT_DERMATOLOGY = EDepartment.DERMATOLOGY.toString();
    String GET_STAFF_DEPARTMENT_CARDIOLOGY = EDepartment.CARDIOLOGY.toString();

    int SEARCH_NAME_CUSTOMER = 1;
    int SEARCH_USERNAME_CUSTOMER = 2;
    int SEARCH_CCCD_CUSTOMER = 3;

    int FIND_BY_NAME_CUSTOMER = 1;
    int FIND_BY_USERNAME_CUSTOMER = 2;
    int FIND_BY_CCCD_CUSTOMER = 3;

    int FIND_DOCTOR_IN_POSITION = 1;
    int FIND_NURSE_IN_POSITION = 2;
    int FIND_SECURITY_IN_POSITION = 3;
    int FIND_SURGERY_IN_DEPARTMENT = 4;
    int FIND_DERMATOLOGY_IN_DEPARTMENT = 5;
    int FIND_CARDIOLOGY_IN_DEPARTMENT = 6;

    int BRANCH_1 = 1;
    int BRANCH_2 = 2;
    int BRANCH_3 = 3;

    int DAT = 1;
    int PHUC = 2;
    int KIET = 3;

    int BOOKING_1 = 1;
    int BOOKING_2 = 2;
    int BOOKING_3 = 3;
}
