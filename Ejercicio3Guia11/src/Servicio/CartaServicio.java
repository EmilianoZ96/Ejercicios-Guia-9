/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;
import Entidad.Carta;
import Entidad.Palo;
import java.util.ArrayList;
import java.util.Scanner;

/*
Las operaciones que podrá realizar la baraja son:
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
luego se llama al método, este no mostrara esa primera carta.
 */
public class CartaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearCarta(ArrayList<Carta> cartas) {

        for (int i = 1; i < 5; i++) {
            Palo p1 = new Palo();
            System.out.println("Ingrese el " +i+ " palo");
            p1.setPalo(leer.next());
            for (int j = 0; j < 12; j++) {
                
            if (j==7 || j==8) {
                continue;
            }
            Carta c1 = new Carta();
            c1.setNumero(j+1);
            c1.setPalo(p1.getPalo());
            cartas.add(c1);
            }
  
        }

        for (Carta carta : cartas) {
            System.out.println(carta);
        }

    }
}
