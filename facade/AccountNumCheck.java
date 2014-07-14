package facade;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Abilash on 7/13/2014.
 */
public class AccountNumCheck {
    private static List<Integer> accountNums = new ArrayList<Integer>();

    static{
        accountNums.add(123456);accountNums.add(233456);accountNums.add(145556);
        accountNums.add(654321);
    }

    public boolean isAccountActive(int accountNum){
        if(!accountNums.contains(accountNum)){
            System.out.println("Transaction Failed: Account Number is invalid");
            return false;
        }
        return true;
    }
}
