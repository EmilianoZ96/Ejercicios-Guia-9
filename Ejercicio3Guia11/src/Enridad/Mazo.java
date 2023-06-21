/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enridad;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Mazo {
    
    private ArrayList<Carta> cartasRepartidas;
    private ArrayList<Carta> masoPorRepartir;

    public ArrayList<Carta> getCartasRepartidas() {
        return cartasRepartidas;
    }

    public void setCartasRepartidas(ArrayList<Carta> cartasRepartidas) {
        this.cartasRepartidas = cartasRepartidas;
    }

    public ArrayList<Carta> getMasoPorRepartir() {
        return masoPorRepartir;
    }

    public void setMasoPorRepartir(ArrayList<Carta> masoPorRepartir) {
        this.masoPorRepartir = masoPorRepartir;
    }

    public Mazo(ArrayList<Carta> cartasRepartidas, ArrayList<Carta> masoPorRepartir) {
        this.cartasRepartidas = cartasRepartidas;
        this.masoPorRepartir = masoPorRepartir;
    }

    public Mazo() {
    }

    @Override
    public String toString() {
        return "Mazo{" + "cartasRepartidas=" + cartasRepartidas + ", masoPorRepartir=" + masoPorRepartir + '}';
    }

    
}
