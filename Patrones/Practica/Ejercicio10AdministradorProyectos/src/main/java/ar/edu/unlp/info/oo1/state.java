package ar.edu.unlp.info.oo1;

public abstract class state {
    private Proyecto proyecto;
    public state(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    abstract void AprobarEtapa();
    abstract void ModificarMargenGanancia(int margen);
    public double costoProyecto(){
        return getProyecto().getIntegrantes().stream().mapToDouble(integrante -> integrante.getSueldoDiario()).sum();
    }
    public double PrecioDelProyecto(){
        return this.costoProyecto() + (getProyecto().getMargenGanancia()*costoProyecto());
    }
    public void CancelarProyecto(){
        getProyecto().setObjetivo(getProyecto().getObjetivo() +"Cancelado");
    }
}
