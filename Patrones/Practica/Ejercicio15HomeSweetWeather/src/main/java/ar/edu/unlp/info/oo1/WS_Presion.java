package ar.edu.unlp.info.oo1;

public class WS_Presion extends WS_Decorator{

    public WS_Presion(weatherStation wd) {
        super(wd);
    }
    @Override
    public String displayData() {
        return super.displayData() + "Presion atmosferica: " + super.getPresion() + " ";
    }
}
