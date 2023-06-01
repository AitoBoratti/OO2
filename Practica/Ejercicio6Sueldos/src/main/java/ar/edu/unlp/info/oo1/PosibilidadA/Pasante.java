package ar.edu.unlp.info.oo1.PosibilidadA;

public class Pasante extends Empleado {
    private int examenesRendidos;

    public Pasante(boolean casado, int hijos, int examenesRendidos) {
        super(casado, hijos);
        this.examenesRendidos = examenesRendidos;
    }

    @Override
    double getBase() {
        return 20000;
    }

    @Override
    double getAdicional() {
        return this.examenesRendidos*2000;
    }
}
