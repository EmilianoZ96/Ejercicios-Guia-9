package Servicio;

import Entidad.Ahorcado;
import java.util.Scanner;

/*
Definir los siguientes métodos en AhorcadoService:



-Método intentos(): para mostrar cuántas oportunidades le queda al jugador.
-Método juego(): el método juego se encargará de llamar todos los métodos previamente mencionados e informará cuando el usuario descubra
toda la palabra o se quede sin intentos. Este método se llamará en el main.

Un ejemplo de salida puede ser así:
Ingrese una letra:
a
Longitud de la palabra: 6
Mensaje: La letra pertenece a la palabra
Número de letras (encontradas, faltantes): (3,4)
Número de oportunidades restantes: 4
----------------------------------------------
Ingrese una letra:
z
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Número de letras (encontradas, faltantes): (3,4)
Número de oportunidades restantes: 3
---------------------------------------------
Ingrese una letra:
b
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Número de letras (encontradas, faltantes): (4,3)
Número de oportunidades restantes: 2
----------------------------------------------
Ingrese una letra:
u
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Número de letras (encontradas, faltantes): (4,3)
Número de oportunidades restantes: 1
----------------------------------------------
Ingrese una letra:
q
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Mensaje: Lo sentimos, no hay más oportunidades

 */
public class AhorcadoServicio {

    private Scanner leer = new Scanner(System.in);

    /*-Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. Con la palabra del usuario, pone la longitud de 
la palabra, como la longitud del vector. Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la palabra 
en un índice del vector. Y también, guarda la cantidad de jugadas máximas y el valor que ingresó el usuario.*/
    public Ahorcado crearJuego(Ahorcado a1) {
        //Ahorcado a1 = new Ahorcado();

        System.out.println("-------------INICIO DE JUEGO-------------");
        System.out.println("");
        System.out.println("A continuacion ingrese la palabra que se adivinara");
        String palabra = leer.next();
        System.out.println("Ahora ingrese la cantidad de intentos que desea como limite");
        int intentos = leer.nextInt();

        String[] vector = new String[palabra.length()];

        for (int i = 0; i < palabra.length() - 1; i++) {

            vector[i] = palabra.substring(i, i + 1);

        }

        a1.setCantidadJugadasMaximas(intentos);
        a1.setCantidadLetras(vector.length);
        a1.setVector(vector);
        //System.out.println(a1.getCantidadLetras());

        return a1;
    }

    //-Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota: buscar como se usa el vector.length.
    public void longitud(Ahorcado a1) {

        System.out.println("--------------------------------------------");
        System.out.println("");
        System.out.println("La longitud de la palabra a encontrar es de " + a1.getCantidadLetras() + " caracteres.");

    }

    /*-Método buscar(letra):  este método recibe una letra dada por el usuario y busca si la letra ingresada es parte de la palabra o no. 
También informará si la letra estaba o no.*/
    public void buscar(Ahorcado a1) {
        boolean comparar = false;
        System.out.println("--------------------------------------------");
        System.out.println("");
        System.out.println("A continuacion ingrese la letra que desee buscar");
        String caract = leer.next();
        String[] vector = a1.getVector();
        for (int i = 0; i < a1.getCantidadLetras() - 1; i++) {

            if (vector[i].equals(String.valueOf(caract))) {
                comparar = true;
                break;
            }

        }
        if (comparar == true) {
            System.out.println("La letra " + caract + " se encuentra");
        } else {
            System.out.println("La letra " + caract + " no se encuentra");
        }

    }
    
    /*-Método encontradas(letra):  que reciba una letra ingresada por el usuario y muestre cuantas letras han sido encontradas y cuántas le faltan.
Este método además deberá devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se busque una letra que no esté, 
se le restará uno a sus oportunidades.*/
    
    public void encontradas(){
        
        
        
    }

}
