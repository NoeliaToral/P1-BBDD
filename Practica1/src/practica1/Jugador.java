package practica1;

/**
 *
 * @author Emilio y Noelia
 */
public class Jugador extends Personas{
   
    private int salario;
    private String posicion;
    private Boolean titular;
    private int num;

    public Jugador(int id, String nombre, String posicion) {
        super(id, nombre);
        this.posicion = posicion;
    }
    
    
}
