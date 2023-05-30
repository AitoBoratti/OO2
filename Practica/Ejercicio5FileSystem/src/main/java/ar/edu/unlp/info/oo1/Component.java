package ar.edu.unlp.info.oo1;

import java.time.LocalDate;

public abstract class Component {
    protected String nombre;
    protected LocalDate fecha;
    protected int tamaño;

    public Component(String nombre, LocalDate fecha, int tamaño) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.tamaño = tamaño;
    }
    public abstract int tamanoTotalOcupado();

    public abstract Archivo archivoMasGrande();

    public abstract Archivo archivoMasNuevo();
}

