
package Entidad;

public class Espectador {
    
    private Integer dinero;
    private Integer edad;
    private String nombre;

    public Espectador() {
    }

    public Espectador(Integer dinero, Integer edad, String nombre) {
        this.dinero = dinero;
        this.edad = edad;
        this.nombre = nombre;
    }

    public Integer getDinero() {
        return dinero;
    }

    public void setDinero(Integer dinero) {
        this.dinero = dinero;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Espectador{" + "dinero=" + dinero + ", edad=" + edad + ", nombre=" + nombre + '}';
    }
    
    
    
    
}
