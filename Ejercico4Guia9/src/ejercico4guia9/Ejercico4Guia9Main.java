
package ejercico4guia9;

import Servicio.FechaService;
import java.util.Date;

public class Ejercico4Guia9Main {

   
    public static void main(String[] args) {
      
        FechaService fs = new FechaService();
        Date fecha = fs.fechaNacimiento();
        System.out.println(fecha);
        System.out.println(fs.fechaActual());
        System.out.println("La edad es de "+fs.diferencia(fecha, fs.fechaActual())+" años");
        
    }
    
}
