package ar.edu.unlp.info.oo1;

public class NoTACCSandwichBuilder extends SandwichBuilder{
//    Sin TACC: consta de pan de chipá (150 pesos), aderezo de salsa tártara (18 pesos),
//    principal de carne de pollo (250 pesos) y adicional de verduras grilladas (200 pesos).
    @Override
    public void addPan() {
        this.getSandwich().setPan(new Ingrediente("pan de chipá",150.0));
    }

    @Override
    public void addAderezo() {
        this.getSandwich().setAderezo(new Ingrediente("aderezo de salsa tártara",18.0));
    }

    @Override
    public void addPrincipal() {
        this.getSandwich().setPrincipal(new Ingrediente("principal de carne de pollo",250.0));
    }

    @Override
    public void addAddicional() {
        this.getSandwich().setAdicional(new Ingrediente("adicional de verduras grilladas",200.0));
    }
}
