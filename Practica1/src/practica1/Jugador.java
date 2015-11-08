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
public class Jugador extends Personas{
   
    public int salario;
    public String posicion;
    public Boolean titular;
    public int num;

    public Jugador(int salario, String posicion, Boolean titular, int num, int id, String nombre, String email, String Tlf) {
        super(id, nombre, email, Tlf);
        this.salario = salario;
        this.posicion = posicion;
        this.titular = titular;
        this.num = num;
    }
    
    
}
