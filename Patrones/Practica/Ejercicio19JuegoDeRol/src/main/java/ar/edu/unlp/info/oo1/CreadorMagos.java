package ar.edu.unlp.info.oo1;

import ar.edu.unlp.info.oo1.Personajes.Mago;
import ar.edu.unlp.info.oo1.Personajes.Personaje;

public class CreadorMagos implements CreadorDePersonajes{
    @Override
    public Personaje crearPersonaje() {
        return new Mago();
    }
}
