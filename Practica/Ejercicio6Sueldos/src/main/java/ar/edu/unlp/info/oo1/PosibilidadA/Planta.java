package ar.edu.unlp.info.oo1.PosibilidadA;

public class Planta extends Empleado {
    private int añosAntiguedad;

    public Planta(boolean casado, int hijos, int añosAntiguedad) {
        super(casado, hijos);
        this.añosAntiguedad = añosAntiguedad;
    }

    double getBase() {
        return 50000;
    }

    double getAdicional() {
        double total = 0;
        if (isCasado()) {
            total =+ 5000;
        }
        total+= 2000*getHijos()*añosAntiguedad;
        return total;
    }
}
