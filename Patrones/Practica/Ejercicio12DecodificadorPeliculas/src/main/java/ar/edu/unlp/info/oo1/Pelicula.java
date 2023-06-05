package ar.edu.unlp.info.oo1;

import java.util.ArrayList;
import java.util.List;

public class Pelicula {
//    De cada película se conoce título, año de estreno, películas similares y puntaje.
    private String titulo;
    private int añoEstreno;
    private List<Pelicula> similares;
    private float puntaje;

    public Pelicula(String titulo, int añoEstreno, float puntaje) {
        this.titulo = titulo;
        this.añoEstreno = añoEstreno;
        this.similares = new ArrayList<Pelicula>();
        this.puntaje = puntaje;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAñoEstreno() {
        return añoEstreno;
    }

    public void setAñoEstreno(int añoEstreno) {
        this.añoEstreno = añoEstreno;
    }

    public List<Pelicula> getSimilares() {
        return similares;
    }

    public void setSimilares(List<Pelicula> similares) {
        this.similares = similares;
    }
    public void addSimilares(Pelicula similar){
        this.similares.add(similar);
    }

    public float getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(float puntaje) {
        this.puntaje = puntaje;
    }

}
