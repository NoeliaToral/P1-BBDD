/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Noelia
 */
public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion;
        
        do{
            System.out.println("");
            System.out.println("Eliga una de las siguientes opciones:");
            System.out.println("1:  Alta equipo");
            System.out.println("2:  Baja equipo");
            System.out.println("3:  Alta jugador");
            System.out.println("4:  Baja jugador");
            System.out.println("5:  Alta arbitro");
            System.out.println("6:  Baja arbitro");
            System.out.println("7:  Alta estadio");
            System.out.println("8:  Alta partido");
            System.out.println("9:  Baja partido");
            System.out.println("10: Listar equipo");
            System.out.println("11: Listar estadios");
            System.out.println("12: Listar arbitros");
            System.out.println("14: Devolver total de partidos");
            System.out.println("15: Llistar los partidos hechos por un equipo");
            System.out.println("16: Listar los jugadores que hay por un equipo");
            System.out.println("17: Listar los jugadores de un equipo y sus posiciones");
            System.out.println("18: Cargar Sistema");
            System.out.println("19: Salvar los datos");

            System.out.println("20: Calcular el campeón");
            System.out.println("21: Calcular posiciones");
            System.out.print("Opcion: ");

            Scanner scanf= new Scanner(System.in);
            opcion = scanf.nextInt();

            switch (opcion){

            default: System.out.println("Opcion incorrecta");
                    break;
            }
        
        
        }while(opcion!=21);//fin swhitch
        
    }
    public static void altaPartido(LinkedList<Partido> lpartidos){
    
        Scanner scanf= new Scanner(System.in);
        System.out.println("Dime el id");
        int id=scanf.nextInt();
        
        lpartidos.add(id);
       
        lpartidos.add(lpartidos);
        
    
    
    };
}
