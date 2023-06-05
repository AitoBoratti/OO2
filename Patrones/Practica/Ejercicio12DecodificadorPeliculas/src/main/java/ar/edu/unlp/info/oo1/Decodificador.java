package ar.edu.unlp.info.oo1;

import java.util.List;

public class Decodificador {
    private List<Pelicula> grilla;
    private List<Pelicula> reproducidas;
    private Sugereitor sugereitor;

    public Decodificador(List<Pelicula> grilla, List<Pelicula> reproducidas) {
        this.grilla = grilla;
        this.reproducidas = reproducidas;
        sugereitor = new recientes();
    }

    public List<Pelicula> getGrilla() {
        return grilla;
    }

    public void setGrilla(List<Pelicula> grilla) {
        this.grilla = grilla;
    }

    public List<Pelicula> getReproducidas() {
        return reproducidas;
    }

    public void setReproducidas(List<Pelicula> reproducidas) {
        reproducidas = reproducidas;
    }

    public Sugereitor getSugereitor() {
        return sugereitor;
    }

    public void setSugereitor(Sugereitor sugereitor) {
        this.sugereitor = sugereitor;
    }

    public List<Pelicula> sugeridas (){
        return this.sugereitor.sugerir(this);
    }
}
