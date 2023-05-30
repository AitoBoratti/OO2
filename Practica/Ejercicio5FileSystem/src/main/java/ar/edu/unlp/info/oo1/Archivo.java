package ar.edu.unlp.info.oo1;

import java.time.LocalDate;

public class Archivo extends Component{

    public Archivo(String nombre, LocalDate fecha, int tamaño) {
        super(nombre,fecha);
        this.tamaño = tamaño;
    }

    public String getNombre() {
        return nombre;
    }
    public LocalDate getFecha() {
        return fecha;
    }

    @Override
    public int tamanoTotalOcupado() {
        return this.tamaño;
    }
    @Override
    public Archivo archivoMasGrande() {
        return this;
    }
    @Override
    public Archivo archivoMasNuevo() {
        return this;
    }
}
