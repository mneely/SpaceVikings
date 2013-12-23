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
public interface LoginInterface {
    String name();
    String password();
    }



