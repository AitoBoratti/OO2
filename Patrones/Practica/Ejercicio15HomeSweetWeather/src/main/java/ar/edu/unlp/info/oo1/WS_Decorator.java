package ar.edu.unlp.info.oo1;

public class WS_Decorator extends weatherStation{
    private weatherStation wd;

    public WS_Decorator(weatherStation wd) {
        this.wd = wd;
    }

    @Override
    public double getTemperaturaCelcius() {
        return wd.getTemperaturaCelcius();
    }

    @Override
    public double getPromedioTemperaturasHistoricas() {
        return wd.getPromedioTemperaturasHistoricas();
    }

    @Override
    public String displayData() {
        return wd.displayData();
    }
}
