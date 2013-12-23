/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marcus
 */
import javax.ejb.Remote;

@Local
public interface CreateAcctInterface {
   String fName();
   String lName();
   String accountName();
   String email();
   String civName();
}
