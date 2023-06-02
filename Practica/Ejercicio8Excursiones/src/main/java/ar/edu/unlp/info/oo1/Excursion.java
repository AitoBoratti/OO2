package ar.edu.unlp.info.oo1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Excursion {
    private String nombre;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private String ptoEncuentro;
    private double costo;
    private int cupoMin;
    private int cupoMax;
    private List<Usuario> inscriptos;
    private List<Usuario> enEspera;
    private State state;


    public Excursion(String nombre, LocalDate fechaInicio, LocalDate fechaFin, String ptoEncuentro, double costo, int cupoMin, int cupoMax) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.ptoEncuentro = ptoEncuentro;
        this.costo = costo;
        this.cupoMin = cupoMin;
        this.cupoMax = cupoMax;
        this.state = new Provisoria(this);
        this.inscriptos = new ArrayList<Usuario>();
        this.enEspera = new ArrayList<Usuario>();
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
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
    public String getPtoEncuentro() {
        return ptoEncuentro;
    }
    public void setPtoEncuentro(String ptoEncuentro) {
        this.ptoEncuentro = ptoEncuentro;
    }
    public double getCosto() {
        return costo;
    }
    public void setCosto(double costo) {
        this.costo = costo;
    }
    public int getCupoMin() {
        return cupoMin;
    }
    public void setCupoMin(int cupoMin) {
        this.cupoMin = cupoMin;
    }
    public int getCupoMax() {
        return cupoMax;
    }
    public void setCupoMax(int cupoMax) {
        this.cupoMax = cupoMax;
    }
    public State getState() {
        return state;
    }
    public void setState(State state) {
        this.state = state;
    }
    public List<Usuario> getInscriptos() {
        return inscriptos;
    }
    public void setInscriptos(List<Usuario> inscriptos) {
        this.inscriptos = inscriptos;
    }
    public List<Usuario> getEnEspera() {
        return enEspera;
    }
    public void setEnEspera(List<Usuario> enEspera) {
        this.enEspera = enEspera;
    }
    
    
    public String ObtenerInformacion(){
        return state.ObtenerInformacion();
    }
    public void inscribirPersona(Usuario usuario){
        this.state.inscribirPersona(usuario);
    }
}
