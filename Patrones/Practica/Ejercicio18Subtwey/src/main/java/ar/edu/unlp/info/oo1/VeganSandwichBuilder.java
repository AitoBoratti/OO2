package ar.edu.unlp.info.oo1;

public class VeganSandwichBuilder extends SandwichBuilder{
//    Vegano: consta de pan integral (100 pesos), aderezo de salsa criolla (20 pesos), principal de milanesa de girgolas (500 pesos), sin adicional.
    @Override
    public void addPan() {
        this.getSandwich().setPan(new Ingrediente("pan integral",100.0));
    }

    @Override
    public void addAderezo() {
        this.getSandwich().setPan(new Ingrediente("aderezo de salsa criolla",20.0));
    }

    @Override
    public void addPrincipal() {
        this.getSandwich().setPan(new Ingrediente("milanesa de girgolas",500.0));
    }

    @Override
    public void addAddicional() {
        this.getSandwich().setPan(new Ingrediente("sin adicional",0.0));
    }
}
