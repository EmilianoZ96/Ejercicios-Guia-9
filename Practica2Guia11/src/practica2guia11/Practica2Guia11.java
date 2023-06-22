/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2guia11;

import Entidad.Equipo;
import Entidad.Jugador;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author BANGHO
 */
public class Practica2Guia11 {

    public static void main(String[] args) {
Scanner leer = new Scanner(System.in);

        ArrayList<Jugador> lista1 = new ArrayList();

        Jugador j1 = new Jugador();
        System.out.println("Nombre");
        j1.setNombre(leer.next());
        System.out.println("Apellido");
        j1.setApellido(leer.next());
        System.out.println("Posicion");
        j1.setPosicion(leer.next());
        System.out.println("Numero");
        j1.setNumero(leer.nextInt());
        
        lista1.add(j1);
        
        Jugador j2 = new Jugador();
        System.out.println("Nombre");
        j2.setNombre(leer.next());
        System.out.println("Apellido");
        j2.setApellido(leer.next());
        System.out.println("Posicion");
        j2.setPosicion(leer.next());
        System.out.println("Numero");
        j2.setNumero(leer.nextInt());
        
        lista1.add(j2);
        
        Jugador j3 = new Jugador();
        System.out.println("Nombre");
        j3.setNombre(leer.next());
        System.out.println("Apellido");
        j3.setApellido(leer.next());
        System.out.println("Posicion");
        j3.setPosicion(leer.next());
        System.out.println("Numero");
        j3.setNumero(leer.nextInt());
        
        lista1.add(j3);
        
        Equipo e1 = new Equipo();
        
        e1.setListaJugadores(lista1);
        
        for (Jugador jugador : lista1) {
            
            System.out.println(jugador);
        }
        
        
        

    }
    
}
