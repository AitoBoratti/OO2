package ar.edu.unlp.info.oo1;

import java.util.ArrayList;
import java.util.List;

public class HomeSweetStation {
    // Retorna la temperatura en grados Fahrenheit
    public double getTemperaturaFahrenheit() {
        return 55.0;
    }

    // Retorna la presión atmosférica en hPa
    public double getPresion() {
        return 1008;
    }

    // Retorna la radiación solar
    public double getRadiacionSolar() {
        return 500;
    }

    // Retorna una lista con todas las temperaturas sensadas hasta el momento, en grados Fahrenheit
    public List<Double> getTemperaturasFahrenheit() {
        List<Double> temperaturas = new ArrayList<>();
        temperaturas.add(54.0);
        temperaturas.add(56.0);
        temperaturas.add(53.5);
        return temperaturas;
    }

}
