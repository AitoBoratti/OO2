package ar.edu.unlp.info.oo1;

public class PrintFechaCreacion extends Printer{
    public PrintFechaCreacion(FileOO2 file) {
        super(file);
    }

    @Override
    public String prettyPrint() {
        return super.prettyPrint() + "\n\t Fecha de Creacion: " + this.getFile().getFechaCreacion() ;
    }
}
