package ar.edu.unlp.info.oo2.accesobd;

import java.util.Collection;
import java.util.List;

public class DatabaseProxyAccess implements DatabaseAccess{
    private DatabaseAccess realAccess;
    private Usuario usuarioActual;

    public DatabaseProxyAccess(Usuario user) {
        this.realAccess = new DatabaseRealAccess();
        this.usuarioActual = user;
    }

    public DatabaseAccess getRealAccess() {
        return realAccess;
    }

    public void setRealAccess(DatabaseAccess realAccess) {
        this.realAccess = realAccess;
    }

    public void closeSesion() {
        this.usuarioActual = null;
    }
    public void logIn(Usuario usuarioActual) {
        this.usuarioActual = usuarioActual;
    }

    @Override
    public Collection<String> getSearchResults(String queryString) {
        if (usuarioActual.isAutenticado()){
            return this.realAccess.getSearchResults(queryString);
        } else {
            System.out.println("Primero debe registrar un usuario autenticado.");
            return null;
        }
    }

    @Override
    public int insertNewRow(List<String> rowData) {
        if (usuarioActual.isAutenticado()){
            return this.realAccess.insertNewRow(rowData);
        } else {
            System.out.println("Primero debe registrar un usuario autenticado.");
            return -1;
        }
    }
}
