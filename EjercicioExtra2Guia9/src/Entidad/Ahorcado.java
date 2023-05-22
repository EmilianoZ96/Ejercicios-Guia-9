
package Entidad;

/*
uego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener como atributos, un vector
con la palabra a buscar, la cantidad de letras encontradas y la cantidad jugadas máximas que puede realizar el usuario.
 */
public class Ahorcado {
    
    private String[] vector;
    private int cantidadLetras;
    private int cantidadJugadasMaximas;

    public Ahorcado() {
    }

    public Ahorcado(String[] vector, int cantidadLetras, int cantidadJugadasMaximas) {
        this.vector = vector;
        this.cantidadLetras = cantidadLetras;
        this.cantidadJugadasMaximas = cantidadJugadasMaximas;
    }

    public String[] getVector() {
        return vector;
    }

    public void setVector(String[] vector) {
        this.vector = vector;
    }

    public int getCantidadLetras() {
        return cantidadLetras;
    }

    public void setCantidadLetras(int cantidadLetras) {
        this.cantidadLetras = cantidadLetras;
    }

    public int getCantidadJugadasMaximas() {
        return cantidadJugadasMaximas;
    }

    public void setCantidadJugadasMaximas(int cantidadJugadasMaximas) {
        this.cantidadJugadasMaximas = cantidadJugadasMaximas;
    }
    
    
    
}
