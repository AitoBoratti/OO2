package ar.edu.unlp.info.oo1;

public class PrintName extends Printer{

    public PrintName(FileOO2 file) {
        super(file);
    }

    @Override
    public String prettyPrint() {
        return super.prettyPrint() + "\n\t Nombre: " + this.getFile().getNombre() ;
    }
}
