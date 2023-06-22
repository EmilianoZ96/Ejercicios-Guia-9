
package Entidad;

public class Sala {
    
    private String pelicula;
    private Double precioEntrada;
    private String[][] matrizSalaCine;

    public Sala() {
    }

    public Sala(String pelicula, Double precioEntrada, String[][] matrizSalaCine) {
        this.pelicula = pelicula;
        this.precioEntrada = precioEntrada;
        this.matrizSalaCine = new String[8][6];
    }

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public Double getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(Double precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    public String[][] getMatrizSalaCine() {
        return matrizSalaCine;
    }

    public void setMatrizSalaCine(String[][] matrizSalaCine) {
        this.matrizSalaCine = matrizSalaCine;
    }

    @Override
    public String toString() {
        return "Sala{" + "pelicula=" + pelicula + ", precioEntrada=" + precioEntrada + ", matrizSalaCine=" + matrizSalaCine + '}';
    }
    
    
}
