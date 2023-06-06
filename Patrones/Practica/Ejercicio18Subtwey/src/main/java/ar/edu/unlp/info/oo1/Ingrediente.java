package ar.edu.unlp.info.oo1;

public class Ingrediente {
    private String nombre;
    private Double precio;

    public Ingrediente(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getPrecio() {
        return precio;
    }
}
