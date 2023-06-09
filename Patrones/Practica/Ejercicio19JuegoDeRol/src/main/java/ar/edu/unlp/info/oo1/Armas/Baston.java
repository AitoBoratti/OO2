package ar.edu.unlp.info.oo1.Armas;

import ar.edu.unlp.info.oo1.Amaduras.Armadura;

public class Baston implements Arma{
    @Override
    public int calcularDañoSegunLaArmadura(Armadura armor) {
        int daño;
        switch (armor.getTipo()){
            case "Cuero":
                daño = 2;
                break;
            default:
                daño = 1;
                break;
        }
        return daño;
    }
}

