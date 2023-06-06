package ar.edu.unlp.info.oo1;

public class VegetarianSandwichBuilder extends SandwichBuilder{

//    Vegetariano: consta de pan con semillas (120 pesos), sin aderezo, principal de provoleta grillada (200 pesos) y
//    adicional de berenjenas al escabeche (100 pesos).
    @Override
    public void addPan() {
        this.getSandwich().setPan(new Ingrediente("pan con semillas",120.0));
    }

    @Override
    public void addAderezo() {
        this.getSandwich().setAderezo(new Ingrediente("sin aderezo",0.0));
    }

    @Override
    public void addPrincipal() {
        this.getSandwich().setPrincipal(new Ingrediente("principal de provoleta grillada",200.0));
    }

    @Override
    public void addAddicional() {
        this.getSandwich().setAdicional(new Ingrediente("adicional de berenjenas al escabeche",100.0));
    }

}
