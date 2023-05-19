
package Servicio;


import java.util.Date;
import java.util.Scanner;


public class FechaService {
    
    private Scanner leer = new Scanner(System.in);
    
//    -Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento. Luego los pase por parámetro a un nuevo objeto Date.
//El método debe retornar el objeto Date. Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
    public Date fechaNacimiento(){
        
        System.out.println("Ingrese el dia de nacimiento: ");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes de nacimiento: ");
        int mes = leer.nextInt();
        System.out.println("Ingrese el año de nacimiento: ");
        int anio = leer.nextInt();
         
        return new Date(anio-1900, mes-1, dia);        
        
//        Date(int dia, int mes, int año)
//Constructor que inicializa la fecha sumándole 1900 al año.


    }
    
    //Método fechaActual que cree un objeto fecha con el día actual. Para esto usaremos el constructor vacío de la clase Date. Ejemplo: Date fechaActual = new  Date();
    
    public Date fechaActual(){
        
        Date fechaActual = new  Date();
        
        return fechaActual;
        
    }
    
    //-Método diferencia que reciba las dos fechas por parámetro y retorna la diferencia de años entre una y otra (edad del usuario).
    
    public int diferencia(Date fechaNacimiento, Date fechaActual){
        
        int dif = fechaActual.getYear() - fechaNacimiento.getYear();
        
        return dif;

//        getYear()
//Retorna el año de la fecha.


    }
    
}
