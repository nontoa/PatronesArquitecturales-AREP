package edu.escuelaing.arem.database.persistence;

import edu.escuelaing.arem.database.model.User;
import java.sql.SQLException;
import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 *
 * @author Nicolas
 */
@Service
public interface UserPersistence {            

    public List<User> findAllUsers() throws SQLException;

}
