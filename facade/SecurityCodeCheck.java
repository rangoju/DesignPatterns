package facade;


import java.util.HashMap;

/**
 * Created by Abilash on 7/13/2014.
 */
public class SecurityCodeCheck {
    private static HashMap<Integer, Integer> securityCodes;

    static{
        securityCodes = new HashMap<Integer, Integer>();
        securityCodes.put(654321, 1234);
    }

    public boolean isSecurityCodeCorrect(int accountNum, int code){
        if(!(securityCodes.containsKey(accountNum) && securityCodes.get(accountNum) == code)){
            System.out.println("Transaction Failed: Account Number is invalid");
            return false;
        }
        return true;
    }
}
