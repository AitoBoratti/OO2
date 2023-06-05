package ar.edu.unlp.info.oo1;

import java.time.LocalDate;

public class File implements FileOO2{
    private String nombre;
    private String extension;
    private float tamaño;
    private LocalDate fechaCreacion;
    private LocalDate fechaModificacion;
    private String permisos;

    public File(String nombre, String extension, float tamaño, LocalDate fechaCreacion, LocalDate fechaModificacion, String permisos) {
        this.nombre = nombre;
        this.extension = extension;
        this.tamaño = tamaño;
        this.fechaCreacion = fechaCreacion;
        this.fechaModificacion = fechaModificacion;
        this.permisos = permisos;
    }
    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String getExtension() {
        return extension;
    }

    @Override
    public float getTamaño() {
        return tamaño;
    }

    @Override
    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    @Override
    public LocalDate getFechaModificacion() {
        return fechaModificacion;
    }

    @Override
    public String getPermisos() {
        return permisos;
    }

    @Override
    public String prettyPrint() {
        return "Datos del archivo: ";
    }
}
