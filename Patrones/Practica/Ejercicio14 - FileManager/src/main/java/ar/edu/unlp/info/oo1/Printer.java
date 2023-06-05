package ar.edu.unlp.info.oo1;

import java.time.LocalDate;

public class Printer implements FileOO2 {

    private FileOO2 file;

    public Printer(FileOO2 file) {
        this.file = file;
    }

    @Override
    public String getNombre() {
        return file.getNombre();
    }

    @Override
    public String getExtension() {
        return file.getExtension();
    }

    @Override
    public float getTamaño() {
        return file.getTamaño();
    }

    @Override
    public LocalDate getFechaCreacion() {
        return file.getFechaCreacion();
    }

    @Override
    public LocalDate getFechaModificacion() {
        return file.getFechaModificacion();
    }

    @Override
    public String getPermisos() {
        return file.getPermisos();
    }

    public FileOO2 getFile() {
        return file;
    }

    @Override
    public String prettyPrint() {
        return file.prettyPrint();
    }
}
