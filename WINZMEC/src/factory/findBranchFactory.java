package factory;

import service.*;
import service.impl.findAddressBranch1;
import service.impl.findAddressBranch2;
import service.impl.findAddressBranch3;

import static constant.Constants.*;

public class findBranchFactory {
    public static IFindAddress createIFind(int flag){
        switch (flag){
            case BRANCH_1:
                return new findAddressBranch1();
            case BRANCH_2:
                return new findAddressBranch2();
            case BRANCH_3:
                return new findAddressBranch3();
            default:
                return null;
        }
    }
}
