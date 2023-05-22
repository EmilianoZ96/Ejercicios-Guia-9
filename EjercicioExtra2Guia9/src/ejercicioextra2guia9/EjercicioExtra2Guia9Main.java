
package ejercicioextra2guia9;

import Entidad.Ahorcado;
import Servicio.AhorcadoServicio;

/*

 */
public class EjercicioExtra2Guia9Main {

    public static void main(String[] args) {
     
        AhorcadoServicio as = new AhorcadoServicio();
        Ahorcado a1 = new Ahorcado();
        as.crearJuego(a1);
        as.longitud(a1);
        as.buscar(a1);
        
    }
    
}
