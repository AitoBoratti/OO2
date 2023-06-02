package ar.edu.unlp.info.oo1;

public class Completa extends State{
    public Completa(Excursion excursion) {
        super(excursion);
    }
    @Override
    public String ObtenerInformacion() {
        StringBuilder info = new StringBuilder();
        info.append("Nombre: ").append(getExcursion().getNombre()).append("\n");
        info.append("Costo: ").append(getExcursion().getCosto()).append("\n");
        info.append("Fecha Inicio: ").append(getExcursion().getFechaInicio()).append("\n");
        info.append("Fecha Fin: ").append(getExcursion().getFechaFin()).append("\n");
        info.append("Punto de Encuentro: ").append(getExcursion().getPtoEncuentro()).append("\n");
        return info.toString();
    }

    @Override
    public void inscribirPersona(Usuario usuario) {
        getExcursion().getEnEspera().add(usuario);
    }
}
