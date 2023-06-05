package ar.edu.unlp.info.oo1;

public class WS_PromedioTemp extends WS_Decorator{
    public WS_PromedioTemp(weatherStation wd) {
        super(wd);
    }
    @Override
    public String displayData() {
        return super.displayData() + "Promedio de Temperaturas F: " + super.getPromedioTemperaturasHistoricas() + " ";
    }
}
