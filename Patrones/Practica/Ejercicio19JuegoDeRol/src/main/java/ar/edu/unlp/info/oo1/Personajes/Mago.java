package ar.edu.unlp.info.oo1.Personajes;

import ar.edu.unlp.info.oo1.Amaduras.Cuero;
import ar.edu.unlp.info.oo1.Armas.Baston;

public class Mago extends Personaje{
    public Mago() {
        super();
        this.setArma(new Baston());
        this.setArmadura(new Cuero());
    }
}
