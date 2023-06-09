package ar.edu.unlp.info.oo1.Personajes;

import ar.edu.unlp.info.oo1.Amaduras.Armadura;
import ar.edu.unlp.info.oo1.Armas.Arma;

public abstract class Personaje {
    private String nombre;
    private int vida;
    private Armadura armadura;
    private Arma arma;
    private String habilidades;

    public Personaje(){
        this.vida = 100;
    }

    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
    public Armadura getArmadura() {
        return armadura;
    }
    public void setArmadura(Armadura armadura) {
        this.armadura = armadura;
    }
    public Arma getArma() {
        return arma;
    }
    public void setArma(Arma arma) {
        this.arma = arma;
    }
    public String getHabilidades() {
        return habilidades;
    }
    public void setHabilidades(String habilidades) {
        this.habilidades = habilidades;
    }


    public void getDamage(int damage){
        this.setVida(this.getVida()-damage);
    }
    public void attack(Personaje personaje){
        personaje.getDamage(arma.calcularDañoSegunLaArmadura(personaje.getArmadura()));
    }
}
