package ar.edu.unlp.info.oo1;

public class EnConstruccion extends state{

    public EnConstruccion(Proyecto proyecto) {
        super(proyecto);
    }
    @Override
    void AprobarEtapa() {
        if (getProyecto().PrecioDelProyecto() >= 0){
            getProyecto().setEtapa(new EnEvaluacion(getProyecto()));
        } else {
            throw new RuntimeException("ERROR. No se puede aprobar un proyecto sin precio.");
        }
    }
    @Override
    void ModificarMargenGanancia(int margen) {
        if (margen >= 0.08 && margen <= 0.10){
            getProyecto().setMargenGanancia(margen);
        }
    }
}
