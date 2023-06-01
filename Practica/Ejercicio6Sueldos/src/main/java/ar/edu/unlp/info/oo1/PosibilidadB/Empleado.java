package ar.edu.unlp.info.oo1.PosibilidadB;

public class Empleado {
    private Sueldo sueldo;
    private boolean casado;
    private int hijos;
    private int añosAntiguedad;
    private int horasTrabajadas;
    private int examenesRendidos;

    public Empleado(Sueldo sueldo, boolean casado, int hijos, int añosAntiguedad, int horasTrabajadas, int examenesRendidos) {
        this.sueldo = sueldo;
        this.casado = casado;
        this.hijos = hijos;
        this.añosAntiguedad = añosAntiguedad;
        this.horasTrabajadas = horasTrabajadas;
        this.examenesRendidos = examenesRendidos;
    }

    ///Getter and Setter
    public void setSueldo(Sueldo sueldo) {
        this.sueldo = sueldo;
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

    public int getAñosAntiguedad() {
        return añosAntiguedad;
    }

    public void setAñosAntiguedad(int añosAntiguedad) {
        this.añosAntiguedad = añosAntiguedad;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getExamenesRendidos() {
        return examenesRendidos;
    }

    public void setExamenesRendidos(int examenesRendidos) {
        this.examenesRendidos = examenesRendidos;
    }
    /// End Getter and Setter

    public double Sueldo() {
        return sueldo.calcSueldo(this);
    }

}
