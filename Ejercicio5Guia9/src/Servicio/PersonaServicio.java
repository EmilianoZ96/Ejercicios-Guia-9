
package Servicio;

import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Caro
 */
public class PersonaServicio {
    Scanner leer = new Scanner(System.in);
    public Persona crearPersona(){
       
       
        System.out.println("Ingrese su nombre:");
        String nombre=leer.nextLine();
        System.out.println("Ingrese el día de su nacimiento: ");
        int dia=leer.nextInt();
        System.out.println("Ingrese el mes de su nacimiento: ");
        int mes=leer.nextInt();
        System.out.println("Ingrese el año de su nacimiento: ");
        int anio=leer.nextInt();
        Date fecha= new Date(anio-1900, mes-1,dia);
        
        
        return new Persona(nombre, fecha);          
        
    }
    
//    b) Método calcularEdad que calcule la edad del usuario utilizando el
//atributo de fecha de nacimiento y la fecha actual.
    
    public int calcularEdad(Persona p1){
        Date fechaActual= new Date();
        int edad= fechaActual.getYear()-p1.getFechaNacimiento().getYear();
        if (p1.getFechaNacimiento().before(fechaActual)) {
            if (p1.getFechaNacimiento().getMonth()==fechaActual.getMonth()) {
                if (p1.getFechaNacimiento().getDay()<fechaActual.getDay()) {
                    edad-=1;
                    
                }
                
            }else if(p1.getFechaNacimiento().getMonth()>fechaActual.getMonth()){
                edad-=1;
            }
     
        }       
        return edad;
    }
//    Método menorQue recibe como parámetro una Persona y una edad.
//Retorna true si la persona es menor que la edad consultada o false
////en caso contrario.
    public boolean menorQue(Persona p1, int edad){
        Date fechaActual= new Date();
        int edad1= fechaActual.getYear()-p1.getFechaNacimiento().getYear();
        if (p1.getFechaNacimiento().before(fechaActual)) {
            edad1=(edad1)-1; 
        }
        return edad1<edad;

 }   
//    public int prueba(int num){
//        return num>10?num*3:0;
//    }
// Método mostrarPersona que muestra la información de la persona
//deseada.  
    public void mostrarPersona(Persona p1){
        System.out.println("El nombre es: " + p1.getNombre().toUpperCase());
        System.out.println("La fecha de nacimiento es: " + p1.getFechaNacimiento());
        System.out.println("La edad es: "+ calcularEdad(p1));
    }
}