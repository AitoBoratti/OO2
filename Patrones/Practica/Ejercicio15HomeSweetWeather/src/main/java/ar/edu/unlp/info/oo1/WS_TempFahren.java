package ar.edu.unlp.info.oo1;

public class WS_TempFahren extends WS_Decorator{
    public WS_TempFahren(weatherStation wd) {
        super(wd);
    }

    @Override
    public String displayData() {
        return super.displayData() + "Temperatura F: " + super.getTemperaturaFahrenheit() + " ";
    }
}
