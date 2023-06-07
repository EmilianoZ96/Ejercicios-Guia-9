

package ejercicio4guia10Main;

import Entidad.Pelicula;
import Servicio.PeliculaServicio;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio4Guia10 {

    public static void main(String[] args) {
        

        Scanner leer = new Scanner(System.in);
        
        PeliculaServicio ps = new PeliculaServicio();
        ArrayList<Pelicula> listaPelis = ps.crearPelicula();
       
        ps.mostrarPelis(listaPelis);
        ps.mostarPeliDuracion(listaPelis);
        ps.ordenarMayMen(listaPelis);
        ps.ordenarMenMay(listaPelis);
        ps.ordenarPorTirulo(listaPelis);
        ps.ordenarPorDirector(listaPelis);
    }

}
