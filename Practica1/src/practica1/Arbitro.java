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
public class Arbitro extends Personas {
    
    public String tipo;

    public Arbitro(String tipo, int id, String nombre, String email, String Tlf) {
        super(id, nombre, email, Tlf);
        this.tipo = tipo;
    }

    
}
