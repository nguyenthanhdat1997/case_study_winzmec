package factory;

import service.IFind;
import service.impl.findByCCCD;
import service.impl.findByName;
import service.impl.findByUsername;

import static constant.Constants.*;

public class findCustomerFactory {
    public static IFind createIFind(int flag){
        switch (flag){
            case FIND_BY_NAME_CUSTOMER:
                return new findByName();
            case FIND_BY_USERNAME_CUSTOMER:
                return new findByUsername();
            case FIND_BY_CCCD_CUSTOMER:
                return new findByCCCD();
            default:
                return null;
        }
    }
}
