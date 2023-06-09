package ar.edu.unlp.info.oo1;

import ar.edu.unlp.info.oo1.Personajes.Guerrero;
import ar.edu.unlp.info.oo1.Personajes.Personaje;

public class CreadorGuerreros implements CreadorDePersonajes{
    @Override
    public Personaje crearPersonaje() {
        return new Guerrero();
    }
}
