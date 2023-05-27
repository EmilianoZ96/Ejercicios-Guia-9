
package guia10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.TreeSet;


public class GUIA10 {

    public static void main(String[] args) {
        
        //EJEMPLO DE ARRAYLIST DE NUMEROS:
        
        ArrayList<Integer> numerosA = new ArrayList();
        
        // EJEMPLO DE UNA LINKEDLIST DE NUMEROS:
        
        LinkedList<Integer> numerosB = new LinkedList();
        
         // EJEMPLO DE UN HASHSET DE CADENAS:
        
        HashSet<String> nombres = new HashSet();
        
         // EJEMPLO DE UN TRISET DE NUMEOS:
        
        TreeSet<Integer> numeros = new TreeSet();
        
         // EJEMPLO DE UN LINKEDHASSET DE CADENAS:
        
        LinkedHashSet<String> frase = new LinkedHashSet();
        
        //EJEMPLO DE UN HASMAP DE PERSONAS:
        
        //       LLAVE    VALOR
        HashMap<Integer, String> personasA = new HashMap();
        
        //EJEMPLO DE UN TREEMAP DE PERSONAS:
        
        TreeMap<Integer, String> personasB = new TreeMap();
        
        //EJEMPLO DE UN LINKEDHASMAP DE PERSONAS:
        
        LinkedHashMap<Integer, String> personasC = new LinkedHashMap();
        
        //EN LAS LISTAS PARA AGREGAR UN ELEMENTO A UNA LISTA O A UN CONJUNTO UTILIZO LA SIGUIENTE FUNCION:
        
        ArrayList<Integer> lista1 = new ArrayList();
        int x = 20;
        lista1.add(x); //AGREGAMOS EL NUMERO X = 20 EN LA LISTA EN LA POSICION 0.
                       //PARA AGRAGAR UN NUMERO A UN CONJUNTO UTILIZO LA MISMA FUNCION .ADD
                       
        //EN UN MAPA, PARA AGREGAR UN ELEMENTO UTILIZO LA SIGUIENTE FUNCION:
        
         HashMap<Integer, String> alumno = new HashMap();
         int dni = 39630306;
         String nombre = "Emiliano Zeiter";
         alumno.put(dni, nombre); //AGREGAMOS LA LLAVE PRIMERO, SEGUNDO EL VALOR.
         
         //EJERCICIO:
         ArrayList<Integer> listaEjemplo = new ArrayList();
         int a, b, c, d, e;
         a=1;
         b=2;
         c=3;
         d=4;
         e=5;       
         //LO MISMO HAGO PARA AGREGAR ELEMENTOS A UN CONJUNTO
         lista1.add(a);
         lista1.add(b);
         lista1.add(c);
         lista1.add(d);
         lista1.add(e);
         //ELIMINAR POR INDICE
         lista1.remove(0);//ELIMINAMOS EL NUMERO QUE ESTE EN EL INDICE 0 CON REMOVE(INT I).
         lista1.remove(4);//ELIMINAMOS EL NUERMO QUE ESTE EN EL INDICE 4 CON REMOVE(INT I).
         //ELIMIAR POR ELEMENTO
         lista1.remove(2);//ELIMINAMOS EL NUMERO 2 CON REMOVE(OBJET O).
         lista1.remove(4);//ELIMINAMOS EL NUMERO 4 CON REMOVE(OBJET O).
         
         //PARA AGREGAR A UN MAPA HACEMOS LO SGUIENTE:
         
         HashMap<Integer, String> ejemplo = new HashMap();
         int dni1, dni2, dni3;
         String nombre1, nombre2, nombre3;
         dni1 = 1111111;
         dni2 = 2222222;
         dni3 = 3333333;
         nombre1 = "PEPE";
         nombre2 = "TETE";
         nombre3 = "FEFE";
         ejemplo.put(dni1, nombre1);
         ejemplo.put(dni2, nombre2);
         ejemplo.put(dni3, nombre3);
         
         
    
         
    }
    
    
}
