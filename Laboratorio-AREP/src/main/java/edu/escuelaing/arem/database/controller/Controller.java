package edu.escuelaing.arem.database.controller;

import edu.escuelaing.arem.database.persistence.UserPersistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Nicolas
 */

@RestController
public class Controller {

    @Autowired
    UserPersistence userPersistence;        

    @RequestMapping(value="/user",method = RequestMethod.GET)
    public ResponseEntity<?> listAllU(){
        try{
            return new ResponseEntity<>(userPersistence.findAllUsers(),HttpStatus.ACCEPTED);
        }catch(Exception e){            
            return new ResponseEntity<>("Error finding recourse",HttpStatus.NOT_FOUND);            
        }
    }

}
