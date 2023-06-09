package ar.edu.unlp.info.oo1.Personajes;

import ar.edu.unlp.info.oo1.Amaduras.Hierro;
import ar.edu.unlp.info.oo1.Armas.Arco;

public class Arquero extends Personaje{
    public Arquero() {
        super();
        this.setArma(new Arco());
        this.setArmadura(new Hierro());
    }
}
