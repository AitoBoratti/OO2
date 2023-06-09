package ar.edu.unlp.info.oo1.Armas;

import ar.edu.unlp.info.oo1.Amaduras.Armadura;

public class Espada implements Arma{
    @Override
    public int calcularDañoSegunLaArmadura(Armadura armor) {
        int daño;
        switch (armor.getTipo()){
           
            case "Acero":
                daño = 5;
                break;
                
            case "Hierro":
                daño = 3;
                break;
            default:
                daño = 8;
                break;
        }
        return daño;
    }
}
