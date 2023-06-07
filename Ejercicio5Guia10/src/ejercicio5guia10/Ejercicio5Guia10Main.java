
package ejercicio5guia10;

import Servicio.PaisServicio;
import java.util.TreeSet;

public class Ejercicio5Guia10Main {

    public static void main(String[] args) {
        
        PaisServicio ps = new PaisServicio();
        
        TreeSet<String> paises = ps.agregarPaises();
        
        ps.recorrerLista(paises);
     
    }
    
}
