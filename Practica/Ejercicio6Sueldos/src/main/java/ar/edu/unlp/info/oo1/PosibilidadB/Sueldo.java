package ar.edu.unlp.info.oo1.PosibilidadB;

public abstract class Sueldo {

    abstract double getBase(Empleado empleado);
    abstract double getAdicional(Empleado empleado);
    public double calcSueldo(Empleado empleado){
        return  ((getBase(empleado)*0.87) +  (getAdicional(empleado)*0.95));
    }

}
