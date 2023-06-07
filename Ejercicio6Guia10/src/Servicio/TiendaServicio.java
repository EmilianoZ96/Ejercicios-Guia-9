package Servicio;

import Entidad.Tienda;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
public class TiendaServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public HashMap<String, Double> crearObjeto() {

        int cont = 0;
        HashMap<String, Double> tienda = new HashMap();

        do {
            Tienda t1 = new Tienda();

            System.out.println("A continuacion, ingrese el nombe del producto que desea agregar a la tienda");
            System.out.println("");
            t1.setProducto(leer.next());
            System.out.println("A continuacion ingrese el precio del producto " + t1.getProducto());
            t1.setPrecio(leer.nextDouble());
            tienda.put(t1.getProducto(), t1.getPrecio());
            String continuar = "";
            System.out.println("Desea agregar otro producto a la lista? S/N");
            continuar = leer.next();
            if (continuar.equalsIgnoreCase("N")) {
                cont++;
            }
        } while (cont == 0);
        return tienda;

    }

    //Introducir un elemento
    public HashMap<String, Double> introducionElemento(HashMap<String, Double> tienda) {

        Tienda t1 = new Tienda();

        System.out.println("A continuacion, ingrese el nombe del producto que desea agregar a la tienda");
        System.out.println("");
        t1.setProducto(leer.next());
        System.out.println("A continuacion ingrese el precio del producto " + t1.getProducto());
        t1.setPrecio(leer.nextDouble());
        tienda.put(t1.getProducto(), t1.getPrecio());

        return tienda;
    }

    //Modificar su precio
    public HashMap<String, Double> modificarPrecio(HashMap<String, Double> tienda) {

        System.out.println("PRODUCTO SIN MODIFICAR PRECIO");
        System.out.println(tienda);

        //Tienda t1 = new Tienda();
        String buscar;
        System.out.println("Ingrese el producto que desea buscar y modificar");
        buscar = leer.next();

        if (tienda.containsKey(buscar)) {
            System.out.println("Ingrese el nuevo precio del producto");
            tienda.put(buscar, leer.nextDouble());

        }
        System.out.println("PRODUCTO CON PRECIO NUEVO");
        System.out.println(tienda);

        return tienda;
    }

}
