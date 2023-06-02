package ar.edu.unlp.info.oo1;

public class EnEvaluacion extends state{

    public EnEvaluacion(Proyecto proyecto) {
        super(proyecto);
    }
    @Override
    void AprobarEtapa() {
        getProyecto().setEtapa(new Confirmada(getProyecto()));
    }
    @Override
    void ModificarMargenGanancia(int margen) {
        if (margen >= 0.11 && margen <= 0.15){
            getProyecto().setMargenGanancia(margen);
        }
    }
}
