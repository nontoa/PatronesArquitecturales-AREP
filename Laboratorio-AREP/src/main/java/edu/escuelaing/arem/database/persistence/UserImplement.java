package edu.escuelaing.arem.database.persistence;

import edu.escuelaing.arem.database.model.User;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author Nicolas
 */
@Component
public class UserImplement implements UserPersistence {

    @Autowired
    private DataSource dataSource;

    @Override
    public List<User> findAllUsers() throws SQLException{
        String query = "SELECT * FROM User;";
        List<User> actions = new ArrayList<User>();
        Connection conexion = null;
        try{
            conexion = dataSource.getConnection();
            Statement state = conexion.createStatement();
            ResultSet res = state.executeQuery(query);
            while (res.next()){
                User user = new User();
                user.setNombre(res.getString("nombre"));
                user.setApellido(res.getString("apellido"));
                user.setEmail(res.getString("email"));
                user.setPass(res.getString("pass"));                
                actions.add(user);
            }
            conexion.close();
            return actions;

        }catch(Exception e){
            System.out.println(e.getMessage());             
            throw new RuntimeException(e);
        }

    }


}