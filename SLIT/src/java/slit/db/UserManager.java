package slit.db;

import java.util.List;
import javax.ejb.Local;
import slit.db.Users;


/**
 *
 * @author evenal
 */
@Local
public interface UserManager
{

    boolean usernameCompare(String username);
    
    boolean passwordCompare(String password);
    
    /*
    void insert(User module);

    User find(Object pk);

    List<User> findAll();

    void update(User module);

    void delete(User module);
*/
}
