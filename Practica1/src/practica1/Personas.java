/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

/**
 *
 * @author Noelia
 */
public class Personas {
    public int id;
    public String nombre;
    public String email;
    public String Tlf;

    public Personas(int id, String nombre, String email, String Tlf) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.Tlf = Tlf;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTlf() {
        return Tlf;
    }

    public void setTlf(String Tlf) {
        this.Tlf = Tlf;
    }
    
    
}
