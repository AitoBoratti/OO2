package ar.edu.unlp.info.oo1;

public class Pasajero {
//    De cada pasajero se conoce Nombre y DNI. De cada pasaje se conoce el pasajero, el/los vuelos y el/los asientos.
//    Además de permitir emitir, modificar y cancelar pasajes, la empresa necesita conocer la siguiente información:
//
//    Promedios de ocupación de cada vuelo dado un periodo de tiempo,
//    Horas voladas por cada avión en un periodo de tiempo
//    Horas voladas por cada avión en total
//    Monto total de los descuentos por RoundTrip y por MultiHop
//    Eficiencia de Tarifas = Sumatoria de todo lo facturado/Sumatoria de CostosBasicos de pasajes vendidos

    private String nombre;
    private int DNI;

    public Pasajero(String nombre, int DNI) {
        this.nombre = nombre;
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }
}
