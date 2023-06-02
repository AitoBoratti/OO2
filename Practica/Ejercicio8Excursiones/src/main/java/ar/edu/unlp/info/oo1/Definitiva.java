package ar.edu.unlp.info.oo1;

public class Definitiva extends State{
    public Definitiva(Excursion excursion) {
        super(excursion);
    }
    public String ObtenerInformacion() {
        StringBuilder info = new StringBuilder();
        info.append("Nombre: ").append(getExcursion().getNombre()).append("\n");
        info.append("Costo: ").append(getExcursion().getCosto()).append("\n");
        info.append("Fecha Inicio: ").append(getExcursion().getFechaInicio()).append("\n");
        info.append("Fecha Fin: ").append(getExcursion().getFechaFin()).append("\n");
        info.append("Punto de Encuentro: ").append(getExcursion().getPtoEncuentro()).append("\n");
        info.append("Usuarios Inscriptos: \n");
        getExcursion().getInscriptos().forEach(usuario -> info.append("\t").append(usuario.getMail()).append("\n"));
        info.append("Usuarios Faltantes: ").append(getExcursion().getCupoMax()-getExcursion().getInscriptos().size());
        return info.toString();
    }
    @Override
    public void inscribirPersona(Usuario usuario) {
        getExcursion().getInscriptos().add(usuario);
        if (getExcursion().getInscriptos().size() >= getExcursion().getCupoMax()){
            getExcursion().setState(new Completa(getExcursion()));
        }
    }
}
