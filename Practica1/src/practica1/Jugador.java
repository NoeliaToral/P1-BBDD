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

    public Jugador(int id, String nombre, int salario, String posicion, Boolean titular, int num) {
        super(id, nombre);
        this.salario = salario;
        this.posicion = posicion;
        this.titular = titular;
        this.num = num;
    }
    
    
}
