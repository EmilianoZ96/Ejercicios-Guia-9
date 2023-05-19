/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3guia9Main;

import Service.ArregloService;
import java.util.Arrays;


/*
Clase Arrays
Crear en el Main dos arreglos. El arreglo A de 50 números reales y el arreglo B de 20 números reales.
 */

public class Ejercicio3Guia9 {

    public static void main(String[] args) {
        
        ArregloService as = new ArregloService();
    
    double[] arregloA = new double [50];
    double[] arregloB = new double [20];

    as.inicializarA(arregloA);
    as.mostrar(arregloA);
    as.ordenar(arregloA);
    as.inicializarB(arregloA,arregloB);
        System.out.println("Arreglo A Ordenado");
    as.mostrar(arregloA);
        System.out.println("Arreglo B");
    as.mostrar(arregloB);
    }
    
}
