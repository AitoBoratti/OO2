package ar.edu.unlp.info.oo1;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class recientes extends Sugereitor{
    @Override
    public List<Pelicula> sugerir(Decodificador decodificador) {
        List<Pelicula> recomendadas = decodificador.getGrilla().stream().sorted(Comparator.comparing(Pelicula::getAñoEstreno)
                                      .reversed()).limit(3).collect(Collectors.toList());
        return recomendadas;
    }
//    (i) novedad: las películas más recientes.
}
