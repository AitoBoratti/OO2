package ar.edu.unlp.info.oo1;

import java.time.LocalDate;

public interface FileOO2 {
    public String getNombre();

    public String getExtension();

    public float getTamaño();

    public LocalDate getFechaCreacion();

    public LocalDate getFechaModificacion();

    public String getPermisos();

    public String prettyPrint();
}
