package ar.edu.unlp.info.oo1.PosibilidadB;

public class Temporario extends Sueldo {

    @Override
    double getBase(Empleado empleado) {
        return 20000 + empleado.getHorasTrabajadas()*300;
    }

    @Override
    double getAdicional(Empleado empleado) {
        double total = 0;
        if (empleado.isCasado()) {
            total =+ 5000;
        }
        total =+ 2000*empleado.getHijos();
        return total;
    }
}