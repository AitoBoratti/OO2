package ar.edu.unlp.info.oo1;

public class PrintPermisos extends Printer{
    public PrintPermisos(FileOO2 file) {
        super(file);
    }

    @Override
    public String prettyPrint() {
        return super.prettyPrint() + "\n\t Permisos: " + this.getFile().getPermisos();
    }
}
