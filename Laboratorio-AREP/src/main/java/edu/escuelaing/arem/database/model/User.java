package edu.escuelaing.arem.database.model;

/**
 *
 * @author Nicolas
 */
public class User {

    private int id;
    private String nombre;
    private String apellido;
    private String email;
    private String pass;    

    public User(){

    }

    public User(int id, String name, String apellido, String email, String pass, int e){
        this.id=id;
        this.nombre=nombre;
        this.apellido=apellido;
        this.email=email;
        this.pass=pass;        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }




}