package ar.edu.unlp.info.oo1.PosibilidadB;

public class Planta extends Sueldo{

    @Override
    double getBase(Empleado empleado) {
        return 50000;
    }

    @Override
    double getAdicional(Empleado empleado) {
        double total = 0;
        if (empleado.isCasado()) {
            total =+ 5000;
        }
        total =+ 2000*empleado.getHijos();
        total =+ 2000* empleado.getAñosAntiguedad();
        return total;
    }
}

