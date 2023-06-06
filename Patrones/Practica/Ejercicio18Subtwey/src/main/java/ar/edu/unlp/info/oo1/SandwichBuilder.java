package ar.edu.unlp.info.oo1;

public abstract class SandwichBuilder{
    private Sandwich sandwich;

    public void reset(){
        sandwich = new Sandwich();
    }
    public SandwichBuilder() {
        this.reset();
    }
    public Sandwich getSandwich() {
        return this.sandwich;
    }

    public abstract void addPan();
    public abstract void addAderezo();
    public abstract void addPrincipal();
    public abstract void addAddicional();
}
