package ar.edu.unlp.info.oo1;

public abstract class State {
    private Excursion excursion;

    public State(Excursion excursion) {
        this.excursion = excursion;
    }

    public Excursion getExcursion() {
        return excursion;
    }

    public abstract String ObtenerInformacion();
    public abstract void inscribirPersona(Usuario usuario);
}
