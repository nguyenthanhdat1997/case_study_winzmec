package factory;

import service.*;

import static constant.Constants.*;

public class findStaffFactory {
    public static IFind createIFind(int flag) {
        switch (flag) {
            case FIND_DOCTOR_IN_POSITION:
                return new findDoctorInPosition();
            case FIND_NURSE_IN_POSITION:
                return new findNurseInPosition();
            case FIND_SECURITY_IN_POSITION:
                return new findSecurityInPosition();
            case FIND_SURGERY_IN_DEPARTMENT:
                return new findSurgeryInDepartment();
            case FIND_DERMATOLOGY_IN_DEPARTMENT:
                return new findDermatologyInDepartment();
            case FIND_CARDIOLOGY_IN_DEPARTMENT:
                return new findCardiologyInDepartment();
            default:
                return null;
        }
    }
}
