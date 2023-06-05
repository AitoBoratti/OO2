package ar.edu.unlp.info.oo1;

public class PrintFechaModificacion extends Printer{

    public PrintFechaModificacion(FileOO2 file) {
        super(file);
    }
    @Override
    public String prettyPrint() {
        return super.prettyPrint() + "\n\t Fecha de modificacion: " + this.getFile().getFechaModificacion();
    }
}
