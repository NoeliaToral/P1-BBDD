/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Map;


/**
 *
 * @author Noelia
 */
public class AppFutbol {
    
    Map<Integer, Equipo> lEquipos ; //el integer será el idequipo
    Map<Integer, Jugador> lJugadores; //Integer será idjugador
    Map<Integer, Arbitro> lArbitros ; // ..igual
    Map<Integer, Estadio> lEstadios ; //..igual
    LinkedList<Partido> lpartidos;

    public AppFutbol(Map<Integer, Equipo> lEquipos, Map<Integer, Jugador> lJugadores, Map<Integer, Arbitro> lArbitros, Map<Integer, Estadio> lEstadios, LinkedList<Partido> lpartidos) {
        this.lEquipos = lEquipos;
        this.lJugadores = lJugadores;
        this.lArbitros = lArbitros;
        this.lEstadios = lEstadios;
        
        lpartidos = new LinkedList<Partido>();
    }
    
    
    

    
    
    

    
}
