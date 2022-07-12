package LLDProblems.EcommerceSystem.Entity;

import LLDProblems.EcommerceSystem.Enums.EnumOrderStatus;
import LLDProblems.EcommerceSystem.Enums.EnumPaymentMode;
import java.util.*;


public class Order {
    private String orderId;
    private EnumPaymentMode paymentMode;
    private EnumOrderStatus orderStatus;
    private List<Item>itemList;
    private User user;
    private UserAddress userAddress;
}
