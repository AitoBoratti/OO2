package ar.edu.unlp.info.oo2.accesobd;

public class Usuario {
    private String nombre;
    private boolean autenticado;

    public Usuario(String nombre, boolean autenticado) {
        this.nombre = nombre;
        this.autenticado = autenticado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isAutenticado() {
        return autenticado;
    }

    public void setAutenticado(boolean autenticado) {
        this.autenticado = autenticado;
    }
}
