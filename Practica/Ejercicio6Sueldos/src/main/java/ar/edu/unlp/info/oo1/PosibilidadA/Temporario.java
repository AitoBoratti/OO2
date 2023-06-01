package ar.edu.unlp.info.oo1.PosibilidadA;

public class Temporario extends Empleado {
    private int cantHorasTrabajadas;

    public Temporario(boolean casado, int hijos, int cantHorasTrabajadas) {
        super(casado, hijos);
        this.cantHorasTrabajadas = cantHorasTrabajadas;
    }


    public int getCantHorasTrabajadas() {
        return cantHorasTrabajadas;
    }

    public void setCantHorasTrabajadas(int cantHorasTrabajadas) {
        this.cantHorasTrabajadas = cantHorasTrabajadas;
    }


    private int calcSueldoPorHoras() {
        return cantHorasTrabajadas * 300;
    }

    @Override
    double getBase() {
        return 20000 + calcSueldoPorHoras();
    }

    @Override
    double getAdicional() {
        double total = 0;
        if (isCasado()) {
            total =+ 5000;
        }
        return total+= 2000*getHijos();
    }
}
