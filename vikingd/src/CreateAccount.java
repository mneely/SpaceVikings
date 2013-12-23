/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marcus
 */

//return statements in place of
//mode of persistance.
import javax.ejb.*;

@stateless
public class CreateAccount {

    public String fName(String first){
        return first;
    }

    public String lName(String last){
        return last;

    }

    public String accountName(String acct){
        return acct;
    }


    public String email(String addy){
        return addy;
    }

    public String civName(String colony){
        return colony;
    }


}
