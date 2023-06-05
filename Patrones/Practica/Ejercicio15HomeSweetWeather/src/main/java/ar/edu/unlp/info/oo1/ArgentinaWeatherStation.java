package ar.edu.unlp.info.oo1;

import java.util.List;
import java.util.stream.Collectors;

public class ArgentinaWeatherStation extends weatherStation{

    @Override
    public double getTemperaturaCelcius() {
        return (super.getTemperaturaFahrenheit()-32)/1.8;
    }

    @Override
    public double getPromedioTemperaturasHistoricas() {
        return super.getTemperaturasFahrenheit().stream().mapToDouble(value -> value).average().orElse(0);
    }

    @Override
    public String displayData() {
        return "";
    }
}
