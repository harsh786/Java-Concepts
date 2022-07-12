package LLDProblems.EcommerceSystem.Entity;

import LLDProblems.EcommerceSystem.Enums.EnumAccountStatus;
import LLDProblems.EcommerceSystem.Enums.EnumUserType;
import java.util.*;

public class User {
    private String name;
    private String mobileNo;
    private String emailId;
    private EnumAccountStatus accountStatus;
    private EnumUserType userType;
    private List<UserAddress> userAddressList;
    private List<OrderItems> orderItems;
}
