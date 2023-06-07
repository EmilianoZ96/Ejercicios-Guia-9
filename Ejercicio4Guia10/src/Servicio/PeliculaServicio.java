
package Servicio;

import Entidad.Pelicula;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/*
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:

22

*/

public class PeliculaServicio {
    private Scanner leer = new Scanner(System.in);
    
    public ArrayList<Pelicula> crearPelicula(){
        
        ArrayList<Pelicula> listaPelis = new ArrayList();
        boolean ingresar = true;
        
        do { 
            Pelicula p1 = new Pelicula();
            System.out.println("Ingrese los datos de la pelicula");
            System.out.println("TITULO");
            p1.setTitulo(leer.next());
            System.out.println("DIRECTOR");
            p1.setDirector(leer.next());
            System.out.println("DURACION(h)");
            p1.setDuracion(leer.nextDouble());
            listaPelis.add(p1);
            
            System.out.println("Desea agregar otra pelicula a la lista? S/N");
            String respuesta = leer.next();
            if (respuesta.equalsIgnoreCase("N")) {
                ingresar = false;
            }
            
        } while (ingresar);
        
        return listaPelis;
       
    }
    
    //• Mostrar en pantalla todas las películas.
    public void mostrarPelis(ArrayList<Pelicula> peli){
         System.out.println("La lista de peliculas es la siguiente: ");
        
     for (Pelicula aux : peli) {
            System.out.println(aux);
    }
     
        }
    
    //• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
    
    public void mostarPeliDuracion(ArrayList<Pelicula> peli){
        Iterator<Pelicula> it = peli.iterator();
        System.out.println("");
        System.out.println("PELICULAS MAYORES A 1 H");
        while (it.hasNext()) {
            Pelicula next = it.next();
            if (next.getDuracion()>1) {
                System.out.println(next);
            }
            
            
        }
        
        
    }
    
    //• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en pantalla.
    
    public void ordenarMayMen(ArrayList<Pelicula> peli){
        
        System.out.println("");
        System.out.println("LISTA ORDENADA DE MAYOY A MENOR");
        Collections.sort(peli, Pelicula.compararDuracion);
        Collections.reverse(peli);        
        mostrarPelis(peli);
  
    }
    
   // • Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en pantalla.
    
    public void ordenarMenMay(ArrayList<Pelicula> peli){
        
        System.out.println("");
        System.out.println("LISTA ORDENADA DE MENOR A MAYOR");
        Collections.sort(peli, Pelicula.compararDuracion);   
        mostrarPelis(peli);
        
    }
    
   // • Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
    
     public void ordenarPorTirulo(ArrayList<Pelicula> peli){
         
         System.out.println("");
        System.out.println("LISTA ORDENADA POR TITULO");
        Collections.sort(peli, Pelicula.compararTitulo);   
        mostrarPelis(peli);
      
     }
     
     //• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
     
     public void ordenarPorDirector(ArrayList<Pelicula> peli){
         
         System.out.println("");
        System.out.println("LISTA ORDENADA POR DIRECTOR");
        Collections.sort(peli, Pelicula.compararDirector);   
        mostrarPelis(peli);
      
         
     }
      
}
