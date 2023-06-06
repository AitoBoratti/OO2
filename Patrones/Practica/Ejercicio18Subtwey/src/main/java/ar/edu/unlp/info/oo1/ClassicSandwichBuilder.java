package ar.edu.unlp.info.oo1;

public class ClassicSandwichBuilder extends SandwichBuilder{


//        Clásico: consta de pan brioche (100 pesos), aderezo a base de mayonesa (20 pesos), principal de carne
//        de ternera(300 pesos) y adicional de tomate (80 pesos).<

        public ClassicSandwichBuilder() {
                super();
        }
        @Override
        public void addPan() {
                this.getSandwich().setPan(new Ingrediente("pan brioche",100.0));
        }
        @Override
        public void addAderezo() {
                this.getSandwich().setAderezo(new Ingrediente("aderezo a base de mayonesa",20.0));
        }
        @Override
        public void addPrincipal() {
                this.getSandwich().setPrincipal(new Ingrediente("Principal de carne de ternera",300.0));
        }
        @Override
        public void addAddicional() {
                this.getSandwich().setAdicional(new Ingrediente("adicional de tomate",80.0));
        }


}
