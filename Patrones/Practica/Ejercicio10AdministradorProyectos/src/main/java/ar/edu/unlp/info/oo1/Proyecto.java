package ar.edu.unlp.info.oo1;

import java.time.LocalDate;
import java.util.List;

public class Proyecto {
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private String objetivo;
    private List<Integrante> integrantes;
    private double margenGanancia;
    private state etapa;

    // Constructor
    public Proyecto(LocalDate fechaInicio, LocalDate fechaFin, String objetivo, List<Integrante> integrantes, double margenGanancia) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.objetivo = objetivo;
        this.integrantes = integrantes;
        this.margenGanancia = 0.07;
        this.etapa = new EnConstruccion(this);
    }

    // Getters and Setters
    public LocalDate getFechaInicio() {
        return fechaInicio;
    }
    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    public LocalDate getFechaFin() {
        return fechaFin;
    }
    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }
    public List<Integrante> getIntegrantes() {
        return integrantes;
    }
    public void setIntegrantes(List<Integrante> integrantes) {
        this.integrantes = integrantes;
    }
    public double getMargenGanancia() {
        return margenGanancia;
    }
    public void setMargenGanancia(double margenGanancia) {
        this.margenGanancia = margenGanancia;
    }
    public state getEtapa() {
        return etapa;
    }
    public void setEtapa(state etapa) {
        this.etapa = etapa;
    }
    public String getObjetivo() {
        return objetivo;
    }
    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    // Solicited Methods
    public void AprobarEtapa(){
        this.etapa.AprobarEtapa();
    }
    public void ModificarMargenGanancia(int margen){
        this.etapa.ModificarMargenGanancia(margen);
    }
    public double CostoProyecto(){
        return this.etapa.costoProyecto();
    }
    public double PrecioDelProyecto(){
        return this.etapa.PrecioDelProyecto();
    }
    public void CancelarProyecto(){
        this.etapa.CancelarProyecto();
    }

}
