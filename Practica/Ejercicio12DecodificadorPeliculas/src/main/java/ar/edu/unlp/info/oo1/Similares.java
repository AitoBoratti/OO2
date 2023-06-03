package ar.edu.unlp.info.oo1;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Similares extends Sugereitor{
    @Override
    public List<Pelicula> sugerir(Decodificador decodificador) {
        List<Pelicula> recomendadas = decodificador.getReproducidas().stream().flatMap(pelicula -> pelicula.getSimilares().stream()).collect(Collectors.toList());

        recomendadas = recomendadas.stream().sorted(Comparator.comparing(Pelicula::getAñoEstreno).reversed()).distinct().limit(3)
                       .collect(Collectors.toList());
        return recomendadas;
    }
}
