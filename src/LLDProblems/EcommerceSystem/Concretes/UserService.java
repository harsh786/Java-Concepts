package LLDProblems.EcommerceSystem.Concretes;

import LLDProblems.EcommerceSystem.Entity.OrderItems;
import LLDProblems.EcommerceSystem.Entity.User;
import LLDProblems.EcommerceSystem.Entity.UserAddress;
import LLDProblems.EcommerceSystem.Enums.EnumAccountStatus;
import LLDProblems.EcommerceSystem.Interfaces.IUserService;
import java.util.*;

public class UserService implements IUserService {

    public UserService(){

    }

    public void signUpUser(User user){

    }
    public User fetchUser(String userId){
        return null;
    }

    public boolean checkUserExist(String userId){
        return false;
    }

    public void addAddress(User user, UserAddress userAddress){

    }
    public void checkUserIsValidForOrder(User user){

    }

    public void updateUserAccountStatus(User user,EnumAccountStatus accountStatus){

    }

    public List<OrderItems>getOrderPlacedByUser(User user){
     return  null;
    }


}
