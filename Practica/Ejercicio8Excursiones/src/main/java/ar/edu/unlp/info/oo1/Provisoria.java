package ar.edu.unlp.info.oo1;

public class Provisoria extends State{

    public Provisoria(Excursion excursion) {
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
        info.append("Usuarios Faltantes: ").append(getExcursion().getCupoMin()-getExcursion().getEnEspera().size()).append("");
        return info.toString();
    }

    @Override
    public void inscribirPersona(Usuario usuario) {
        getExcursion().getInscriptos().add(usuario);
        if (getExcursion().getCupoMin() <= getExcursion().getInscriptos().size()){
            getExcursion().setState(new Definitiva(getExcursion()));
        }
    }
}
