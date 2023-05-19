/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import java.util.Arrays;
import java.util.Random;

/*Crear la clase ArregloService, en el paquete servicio, con los siguientes métodos:


-Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B. Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B, mostrar A y B.
*/

public class ArregloService {
    
//-Método inicializarA recibe un arreglo por parámetro y lo inicializa con números aleatorios.
    
public void inicializarA(double[] arreglo){
    
    Random rdm = new Random();
    System.out.println("LLenar A");
    for (int i = 0; i < arreglo.length; i++) { 
            arreglo[i] = rdm.nextDouble()*100;    
        }  
}
    
//-Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.

public void mostrar(double[] arreglo){
    System.out.println("MOSTRAR");
    for (int i = 0; i < arreglo.length; i++) {
        System.out.printf(" | %.2f | ", arreglo[i]);
    }

}
//-Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.


public void ordenar(double[] arreglo){
    System.out.println("ORDENAR");
      
        Arrays.sort(arreglo);
         double aux[] = Arrays.copyOf(arreglo, arreglo.length);
        for (int i = arreglo.length-1; i >= 0; i--) {
            arreglo[i]=aux[(arreglo.length-1)-i];
        }
    }
       
    //this.mostrar(arreglo);
    
//Arrays.sort(arreglo)                          = Este método sirve para ordenar un arreglo de manera ascendente. 
//Arrays.sort(arreglo, int desde, int hasta)    = A este método también le podemos decir desde y hasta que índice queremos que ordene.


//-Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B. 
//Luego llenar las últimas 10 posiciones del arreglo B con 0.5.

public void inicializarB(double[] arregloA, double[] arregloB){
    System.out.println("INICIO B");
    
    System.arraycopy(arregloA, 0, arregloB, 0, 10);
    Arrays.fill(arregloB, 10, 20, 0.5);

//    double[] arregloCopia10 = new double[10];
//    
//    System.arraycopy(arreglo, 0, arregloCopia10, 0, 10);    
//    this.mostrar(arregloCopia10);
}
      
}