
package ejercicio5guia9;



import Entidad.Persona;
import Servicio.PersonaServicio;
import java.util.Scanner;

public class Ejercicio5Guia9Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        PersonaServicio p1 = new PersonaServicio();
        Persona persona1 = p1.crearPersona();
        System.out.println(persona1);
        System.out.println("La edad es: " + p1.calcularEdad(persona1));
        System.out.println("Ingrese la edad a comparar");
        int edad = leer.nextInt();
        System.out.println("¿Es menor?" + p1.menorQue(persona1, edad));
//        System.out.println("prueba" + p1.prueba(edad));
        p1.mostrarPersona(persona1);
    }

}