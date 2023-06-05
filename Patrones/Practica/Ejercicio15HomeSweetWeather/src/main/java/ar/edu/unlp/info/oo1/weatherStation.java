package ar.edu.unlp.info.oo1;

import java.util.List;

public abstract class weatherStation extends HomeSweetStation{
    public abstract double getTemperaturaCelcius();
    public abstract double getPromedioTemperaturasHistoricas();
    public abstract String displayData();
}
