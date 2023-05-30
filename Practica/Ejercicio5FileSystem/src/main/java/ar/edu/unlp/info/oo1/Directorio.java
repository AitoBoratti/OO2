package ar.edu.unlp.info.oo1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Directorio extends Component{

    private List<Component> contenido;

    public Directorio(String nombre, LocalDate fecha) {
        super(nombre,fecha);
        this.tamaño = 32;
        contenido = new ArrayList<Component>();
    }

    public String getNombre() {
        return nombre;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public void agregar(Archivo archivo) {
        this.contenido.add(archivo);
    }
    /**
     * Retorna el espacio total ocupado, incluyendo su contenido.
     */
    public int tamanoTotalOcupado(){
        return contenido.stream().mapToInt(Comp -> Comp.tamanoTotalOcupado()).sum();
    }
    /**
     * Retorna el archivo con mayor cantidad de bytes en cualquier nivel del
     * filesystem contenido por directorio receptor
     */
    public Archivo archivoMasGrande(){
        return contenido.stream().map(Comp->Comp.archivoMasGrande())
                .max((Comp1,Comp2)-> Integer.compare(Comp1.archivoMasGrande().tamanoTotalOcupado(),Comp2.archivoMasGrande().tamanoTotalOcupado())).orElse(null);
    }
    /**
     * Retorna el archivo con fecha de creación más reciente en cualquier nivel
     * del filesystem contenido por directorio receptor.
     */
    public Archivo archivoMasNuevo(){
        return contenido.stream().map(Comp -> Comp.archivoMasNuevo())
                .max((Comp1,Comp2) -> Comp1.archivoMasNuevo().getFecha().compareTo(Comp2.archivoMasNuevo().getFecha())).orElse(null);
    }

}
