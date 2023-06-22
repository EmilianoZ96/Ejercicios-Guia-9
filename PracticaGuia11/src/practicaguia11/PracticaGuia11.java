/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaguia11;

import Entidad.Dni;
import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author BANGHO
 */
public class PracticaGuia11 {

    
    public static void main(String[] args) {
        
    Scanner leer = new Scanner(System.in);
        
        Persona p1 = new Persona();
        System.out.println("Ingrese el nombre de la persona");
        p1.setNombre(leer.next());
        System.out.println("Ingrese apellido");
        p1.setApellido(leer.next());
        
        Dni dni1 = new Dni();
        System.out.println("Ingrese numero de dni");
        dni1.setNumero(leer.nextInt());
        System.out.println("Ingrese la serie");
        dni1.setSerie(leer.next());
        p1.setDni(dni1);
        
        System.out.println(p1);
        
    
    }
    
}
