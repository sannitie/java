package slit.db;

import java.util.List;
import javax.ejb.Local;
import slit.db.User;


/**
 *
 * @author evenal
 */
@Local
public interface UserManager
{

    void insert(User module);

    User find(Object pk);

    List<User> findAll();

    void update(User module);

    void delete(User module);
}
