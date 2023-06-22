/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Espectador;
import Entidad.Pelicula;
import Entidad.Sala;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

    /*
 Nos piden hacer un programa sobre un Cine, que tiene una sala con un conjunto de asientos
(8 filas por 6 columnas). De Cine nos interesa conocer la película que se está reproduciendo, la
sala con los espectadores y el precio de la entrada. Luego, de las películas nos interesa saber
el título, duración, edad mínima y director. Por último, del espectador, nos interesa saber su
nombre, edad y el dinero que tiene disponible.
Para representar la sala con los espectadores vamos a utilizar una matriz. Los asientos son
etiquetados por una letra y un número la fila A1 empieza al final del mapa como se muestra en
la tabla. También deberemos saber si el asiento está ocupado por un espectador o no, si esta
ocupado se muestra una X, sino un espacio vacío.
    
8 A X | 8 B X | 8 C X | 8 D | 8 E X | 8 F X
7 A X | 7 B X | 7 C X | 7 D X | 7 E | 7 F X
6 A X | 6 B X | 6 C | 6 D X | 6 E X | 6 F
5 A X | 5 B X | 5 C X | 5 D X | 5 E X | 5 F X
4 A X | 4 B X | 4 C X | 4 D X | 4 E X | 4 F X
3 A X | 3 B X | 3 C X | 3 D | 3 E X | 3 F X
2 A X | 2 B | 2 C X | 2 D X | 2 E X | 2 F
1 A X | 1 B X | 1 C X | 1 D X | 1 E X | 1 F X
    
Se debe realizar una pequeña simulación, en la que se generen muchos espectadores y se los
ubique en los asientos aleatoriamente (no se puede ubicar un espectador donde ya este
ocupado el asiento).
Los espectadores serán ubicados de uno en uno y para ubicarlos tener en cuenta que sólo se
podrá sentar a un espectador si tiene el dinero suficiente para pagar la entrada, si hay espacio
libre en la sala y si tiene la edad requerida para ver la película. En caso de que el asiento este
ocupado se le debe buscar uno libre.
Al final del programa deberemos mostrar la tabla, podemos mostrarla con la letra y numero de
cada asiento o solo las X y espacios vacíos.
     */

public class ServicioCine {
    
    Pelicula p1 = new Pelicula();
    Sala s1 = new Sala();
    private final Scanner leer = new Scanner(System.in);
    
    public void crearSalaCine(){
        String[][] matriz = new String[8][6];
        System.out.println("Creando sala");
        for (int i = 7; i >= 0; i--) {
            for (int j = 0; j < 6; j++) {
                if (j==0) {
                    matriz[i][j] = (i+1)+"A";
                }
                if (j==1) {
                    matriz[i][j] = (i+1)+"B";
                }
                if (j==2) {
                    matriz[i][j] = (i+1)+"C";
                }
                if (j==3) {
                    matriz[i][j] = (i+1)+"D";
                }
                if (j==4) {
                    matriz[i][j] = (i+1)+"E";
                }
                if (j==5) {
                    matriz[i][j] = (i+1)+"F";
                }
            }
        }
        
        s1.setMatrizSalaCine(matriz);
        
        System.out.println("Ingrese el precio de la entrada de la pelicula "+p1.getTitulo());
        s1.setPrecioEntrada(leer.nextDouble());
        s1.setPelicula(p1.getTitulo());
        
        for (int i = 7; i >=0; i--) {
            for (int j = 0; j < 6; j++) {
                System.out.print("["+s1.getMatrizSalaCine()[i][j]+"]");
            }
        System.out.println("");
        }
        
    }
    
    public void crearPelicula(){
        
        System.out.println("Ingrese el titulo de la pelicula");
        p1.setTitulo(leer.next());
        System.out.println("ingrese la duracion de la pelicula");
        p1.setDuracion(leer.nextDouble());
        System.out.println("ingrese el director de la pelicula");
        p1.setDirector(leer.next());
        System.out.println("Ingrese la edad minima para ver la pelicula");
        p1.setEdadMinima(leer.nextInt());
        
    }
    
    public ArrayList<Espectador> crearEspectador(){

        ArrayList<Espectador> espectadores = new ArrayList();
        Random r1 = new Random();
        int cantidad;
        
        System.out.println("Ingrese la cantidad de espectadores que quiere crear");
        cantidad = leer.nextInt();
        
        for (int i = 0; i < cantidad; i++) {
            Espectador e1 = new Espectador();
            e1.setNombre("Espectador "+(i+1));
            e1.setEdad(r1.nextInt(80));
            e1.setDinero(r1.nextInt(10000));
            //e1.setDinero((int) (Math.random() * 1000) + 1);
            espectadores.add(e1);
        }
        
        for (Espectador espectadore : espectadores) {
            System.out.println(espectadore);
        }
        return espectadores;
    }
    
    public void asignarAsiento(ArrayList<Espectador> e1){
        
        crearEspectador();
        
        
        for (Espectador aux : e1) {
            
            if (aux.getEdad()>=p1.getEdadMinima() && aux.getDinero()>= s1.getPrecioEntrada()) {
                
            }
            
        }
    
    }
    
}
