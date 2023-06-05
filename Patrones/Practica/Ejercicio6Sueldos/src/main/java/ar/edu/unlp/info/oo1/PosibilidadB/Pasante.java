package ar.edu.unlp.info.oo1.PosibilidadB;

public class Pasante extends Sueldo{

    @Override
    double getBase(Empleado empleado) {
        return 20000;
    }
    @Override
    double getAdicional(Empleado empleado) {
        return empleado.getExamenesRendidos()*2000;
    }
}
