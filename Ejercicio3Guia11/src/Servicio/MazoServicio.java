package Servicio;

import Enridad.Carta;
import Enridad.Mazo;
import java.util.ArrayList;
import java.util.Collections;
import static java.util.Collections.shuffle;
import java.util.Scanner;

/*
Las operaciones que podrá realizar la baraja son:


• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
luego se llama al método, este no mostrara esa primera carta.
 */
public class MazoServicio {

    private Scanner leer = new Scanner(System.in);
    CartaServicio cs = new CartaServicio();

//    public ArrayList<Carta> llenarMazo(ArrayList<Carta> cartas, Mazo masoCartas) {
//        //Mazo masoCartas = new Mazo();
//
//        cs.crearCarta(cartas);
//        masoCartas.setCartasRepartidas(cartas);
//        return cartas;
//    }
    //• barajar(): cambia de posición todas las cartas aleatoriamente.
    public void barajar(ArrayList<Carta> cartas) {

        Collections.shuffle(cartas);
        System.out.println("MAZO MEZCLADO");
        for (Carta carta : cartas) {
            System.out.println(carta);
        }
    }

    //• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
    //se haya llegado al final, se indica al usuario que no hay más cartas.
    public Mazo siguienteCarta(ArrayList<Carta> cartas, Mazo masoCartas) {
        ArrayList<Carta> mazoRepartido = new ArrayList();
        ArrayList<Carta> mazoPorRepartir = new ArrayList();
        //Mazo masoCartas = new Mazo();
        String continuar = "N";
        Integer indiceActual = 0;
        Carta c = new Carta();
        System.out.println("METODO SIGUIENTE");
        do {
            c = cartas.get(indiceActual);
            System.out.println("CARTA REPARTIDA CON EXITO");
            if (indiceActual < cartas.size()) {
                System.out.println(cartas.size());
                System.out.println(indiceActual);
                mazoRepartido.add(c);
                //cartas.remove(c);
                System.out.println(c);
                indiceActual++;
                System.out.println(indiceActual);

            }
            if (indiceActual == cartas.size()) {
                System.out.println("No quedan mas cartas");
                break;
            }
            System.out.println("Desea repatir otra carta? S/N");
            continuar = leer.next();
            System.out.println("SIGUIENTE CARTA");
        } while (continuar.equalsIgnoreCase("S"));
        cartas.removeAll(mazoRepartido);
        masoCartas.setMasoPorRepartir(cartas);
        masoCartas.setCartasRepartidas(mazoRepartido);
        return masoCartas;
    }

    //Metodo para mostar el array list de cartas repartidas
    public void mostrarRepartidas(Mazo m1) {
        System.out.println("Cartas Repartidas");
        System.out.println(m1.getCartasRepartidas());
        System.out.println("Cartas por repartir");
        System.out.println(m1.getMasoPorRepartir());

    }

}
