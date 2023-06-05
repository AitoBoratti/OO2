package ar.edu.unlp.info.oo1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestWS {
    private weatherStation ws;
    @BeforeEach
    public void setUp() throws Exception{
        ws = new ArgentinaWeatherStation();
    }
    @Test
    public void TestPresionAtmosferica_Radiacion(){
        weatherStation testWs = new WS_Radiacion(new WS_Presion(ws));
        assertEquals("Presion atmosferica: 1008.0 Radiacion solar: 500.0 ",testWs.displayData());
    }
    @Test
    public void TestPresionAtmosferica_Radiacion_Promedio(){
        weatherStation testWs = new WS_PromedioTemp(new WS_Radiacion(new WS_Presion(ws)));
        assertEquals("Presion atmosferica: 1008.0 Radiacion solar: 500.0 Promedio de Temperaturas F: 54.5 ",testWs.displayData());
    }
}
