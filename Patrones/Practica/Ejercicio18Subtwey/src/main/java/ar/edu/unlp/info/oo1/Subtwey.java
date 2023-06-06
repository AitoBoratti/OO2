package ar.edu.unlp.info.oo1;

public class Subtwey {
    SandwichBuilder builder;

    public Subtwey(SandwichBuilder builder) {
        this.builder = builder;
    }

    public SandwichBuilder getBuilder() {
        return builder;
    }
    public void changeBuilder(SandwichBuilder builder) {
        this.builder = builder;
    }

    public void hacerSandwich(){
        this.builder.reset();
        this.builder.addPan();
        this.builder.addAderezo();
        this.builder.addPrincipal();
        this.builder.addAddicional();
    }
}
