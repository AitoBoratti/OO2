package ar.edu.unlp.info.oo1.PosibilidadA;

public abstract class Empleado {
    private boolean casado;
    private int hijos;

    public Empleado(boolean casado, int hijos) {
        this.casado = casado;
        this.hijos = hijos;
    }

    public boolean isCasado() {
        return casado;
    }
    public void setCasado(boolean casado) {
        this.casado = casado;
    }
    public int getHijos() {
        return hijos;
    }
    public void setHijos(int hijos) {
        this.hijos = hijos;
    }



    abstract double getBase();
    abstract double getAdicional();
    public double getDescuento(){
        return  ((getBase()*0.13) +  (getAdicional()*0.05));
    }
    public double Sueldo(){
        return (getBase()+getAdicional()) - getDescuento();
    }
}
