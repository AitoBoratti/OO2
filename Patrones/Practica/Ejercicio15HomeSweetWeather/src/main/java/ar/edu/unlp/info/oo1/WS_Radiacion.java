package ar.edu.unlp.info.oo1;

public class WS_Radiacion extends WS_Decorator{
    public WS_Radiacion(weatherStation wd) {
        super(wd);
    }
    @Override
    public String displayData() {
        return super.displayData() + "Radiacion solar: " + super.getRadiacionSolar() + " ";
    }
}
