package Servicio;

import Entidad.Pais;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/*
Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
 */
public class PaisServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public TreeSet<String> agregarPaises() {
        TreeSet<String> paises = new TreeSet();

        boolean continuar = true;
        String respuesta = "";
        do {
            Pais p1 = new Pais();
            System.out.println("A continuacion ingrese  un pais");
            p1.setPaises(leer.next());
            paises.add(p1.getPaises());

            System.out.println("Desea agregar otro pais? S/N");
            respuesta = leer.next();

            if (respuesta.equalsIgnoreCase("N")) {
                continuar = false;
            }

        } while (continuar);
        
        System.out.println("-----------LISTA DE PAISES-----------");

        for (String paise : paises) {
            System.out.println(paise);
        }
        System.out.println("");
        return paises;

    }

    /*
    Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.
     */
    public void recorrerLista(TreeSet<String> paises) {

        Iterator<String> it = paises.iterator();
        String buscar;
        System.out.println("A continuacion ingrese un pais que desea buscar y borrar");
        buscar = leer.next();
        int cont = 0;
        while (it.hasNext()) {
            if (it.next().equalsIgnoreCase(buscar)) {
                it.remove();
                cont++;
            }
        }
        if (cont == 0) {
            System.out.println("");
            System.out.println("El pais que desea buscar y borrar, no se encuentra");
        }
        System.out.println("--------LISTA ACTUALIZADA DE PAISES--------");
        for (String paise : paises) {
            System.out.println(paise);
        }
    }
}
