package ar.edu.unlp.info.oo1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class TestDecodificador {
    Pelicula thor = new Pelicula("Thor", 2007, 7.9f);
    Pelicula capitanAmerica = new Pelicula("Capitan America", 2016, 7.8f);
    Pelicula ironMan = new Pelicula("Iron Man", 2010, 7.9f);
    Pelicula dunkirk = new Pelicula("Dunkirk", 2017, 7.9f);
    Pelicula rocky = new Pelicula("Rocky", 1976, 8.1f);
    Pelicula rambo = new Pelicula("Rambo", 1979, 7.8f);
    List<Pelicula> grilla = new ArrayList<Pelicula>();
    List<Pelicula> reproducidas = new ArrayList<>();
    Decodificador decodificador = new Decodificador(grilla,reproducidas);

    @BeforeEach
    public void SetUp() throws Exception{
        // Establecer relaciones de similitud
        thor.addSimilares(capitanAmerica);
        thor.addSimilares(ironMan);
        capitanAmerica.addSimilares(thor);
        capitanAmerica.addSimilares(ironMan);
        ironMan.addSimilares(thor);
        ironMan.addSimilares(capitanAmerica);
        rocky.addSimilares(rambo);
        rambo.addSimilares(rocky);

        // Crear Grilla y añadir las Peliculas
        grilla.add(thor);
        grilla.add(capitanAmerica);
        grilla.add(ironMan);
        grilla.add(dunkirk);
        grilla.add(rocky);
        grilla.add(rambo);

        // Crear lista de Peliculas reproducidas
        reproducidas.add(rocky);
        reproducidas.add(thor);
    }
    @Test
    public void TestRecientes(){
        decodificador.setSugereitor(new recientes());
        List<Pelicula> testList2 = decodificador.sugeridas();
        List<Pelicula> testList = new ArrayList<>();
        testList.add(dunkirk);
        testList.add(capitanAmerica);
        testList.add(ironMan);
        assertEquals(testList2,testList);
    }
    @Test
    public void TestSimilares(){
        decodificador.setSugereitor(new Similares());
        List<Pelicula> testList2 = decodificador.sugeridas();
        List<Pelicula> testList = new ArrayList<>();
        testList.add(capitanAmerica);
        testList.add(ironMan);
        testList.add(rambo);
        assertEquals(testList2,testList);
    }

    @Test
    public void TestPuntaje(){
        decodificador.setSugereitor(new Puntaje());
        List<Pelicula> testList2 = decodificador.sugeridas();
        List<Pelicula> testList = new ArrayList<>();
        testList.add(rocky);
        testList.add(dunkirk);
        testList.add(ironMan);
        assertEquals(testList2,testList);
    }

}
