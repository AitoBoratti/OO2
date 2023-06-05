package ar.edu.unlp.info.oo1;

public class PrintExtension extends Printer{

    public PrintExtension(FileOO2 file) {
        super(file);
    }

    @Override
    public String prettyPrint() {
        return super.prettyPrint() + "\n\t Extension: " + this.getFile().getExtension();
    }
}

