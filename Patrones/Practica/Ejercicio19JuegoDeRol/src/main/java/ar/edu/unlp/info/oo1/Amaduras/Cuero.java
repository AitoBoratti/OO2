package ar.edu.unlp.info.oo1.Amaduras;

import ar.edu.unlp.info.oo1.Amaduras.Armadura;
import ar.edu.unlp.info.oo1.Armas.Arma;
import org.junit.Test;

public class Cuero implements Armadura {

    @Override
    public String getTipo() {
        return "Cuero";
    }
}