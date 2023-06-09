package ar.edu.unlp.info.oo1.Personajes;

import ar.edu.unlp.info.oo1.Amaduras.Acero;
import ar.edu.unlp.info.oo1.Armas.Espada;

public class Guerrero extends Personaje{
    public Guerrero() {
        super();
        this.setArma(new Espada());
        this.setArmadura(new Acero());
    }
}

