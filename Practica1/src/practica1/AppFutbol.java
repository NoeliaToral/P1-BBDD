package practica1;

import java.util.Map;
import java.util.Collection;
import java.util.Scanner;
/**
 *
 * @author Emilio y Noelia
 */
public class AppFutbol {
    
    private Map<Integer, Equipo> lEquipos; //el integer será el idequipo
    private Map<Integer, Jugador> lJugadores; //Integer será idjugador
    private Map<Integer, Arbitro> lArbitros ; // ..igual
    private Map<Integer, Estadio> lEstadios ; //..igual
    private Collection<Partido> lpartidos;
    Scanner scanf = new Scanner(System.in);
    public AppFutbol() {
    }
   /* 
    public Equipo altaEquipo(){
        
    }
    public boolean bajaEquipo(){
        
    }*/
    public Jugador altaJugador(){
        int id, salario, num;
        String nombre;
        String posicion;
        boolean titular;
        System.out.println("Id: ");
        id = scanf.nextInt();
        System.out.println("Nombre: ");
        nombre = scanf.nextLine();
        System.out.println("Num: ");
        num = scanf.nextInt();
        System.out.println("Posicion: ");
        posicion = scanf.nextLine();
        System.out.println("Salario: ");
        salario = scanf.nextInt();
        System.out.println("Titular[S/N]: ");
        titular = scanf.nextBoolean();
        
        Jugador j = new Jugador(id, nombre, salario, posicion, titular, num);
        
        return j;
    }
    /*
    public boolean bajaJugador(){
        
    }
    public Arbitro altaArbitro(){
        
    }
    public boolean bajaArbitro(){
        
    }
    public Arbitro altaEstadio(){
        
    }
    public Partido altaPartido(){
        
    }
    public boolean bajaPartido(){
        
    }
    
    public void listarEstadios(){
        
    }
    public void listarEquipos(){
        
    }
    public void listarArbitros(){
        
    }
    public int ContarPartidos(){
       
    }
    void listarPartidos(dada una fecha){
        
    }
    void listarPartidos(dado un equipo){
        
    }
    void listarJugadores(..dada una psicion ene le campo..){
        
    }
    void listarJugadoresEquipo(..dado un equipo){
        
    }
    
    public void Salvar(){
        
    }
    public void CargarDatos(){
        
    }
    public void CalcularCampeonTemporada(){
        
    }
    public void CalcularPosicionesEquipos(lequipos){
        
    }
    */
}   
