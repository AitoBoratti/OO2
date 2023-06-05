package ar.edu.unlp.info.oo1;

public class PrintTamaño extends Printer{
    public PrintTamaño(FileOO2 file) {
        super(file);
    }
    @Override
    public String prettyPrint() {
        return super.prettyPrint() + "\n\t Tamaño: " + this.getFile().getTamaño() ;
    }
}
