package ar.edu.unlp.info.oo1;

public class WS_TempCelcius extends WS_Decorator{
    public WS_TempCelcius(weatherStation wd) {
        super(wd);
    }
    @Override
    public String displayData() {
        return super.displayData() + "Temperatura C: " + super.getTemperaturaCelcius() + " ";
    }
}
