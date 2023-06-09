package ar.edu.unlp.info.oo1;

import ar.edu.unlp.info.oo1.Personajes.Arquero;
import ar.edu.unlp.info.oo1.Personajes.Personaje;

public class CreadorArqueros implements CreadorDePersonajes{
    @Override
    public Personaje crearPersonaje() {
        return new Arquero();
    }
}
