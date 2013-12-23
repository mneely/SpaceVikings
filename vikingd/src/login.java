/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marcus
 */

import javax.ejb.*;

@stateless
//return statements in place of
//mode of persistance
public class login {

    public String name(String userName){
        return userName;
    }

    public String password(String pw){
        return pw;
    }


}
