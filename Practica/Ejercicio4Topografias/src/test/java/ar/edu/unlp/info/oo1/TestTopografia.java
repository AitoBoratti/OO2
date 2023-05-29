package ar.edu.unlp.info.oo1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestTopografia {

    private Topografia tierra;
    private Topografia agua;
    private Topografia pantano;
    private Topografia topografiaMixta;
    private Topografia topografiaMixta2;

    @BeforeEach
    public void setUp () throws Exception{
        tierra = new Tierra();
        agua = new Agua();
        pantano = new Pantano();
        topografiaMixta2 = new TopografiaMixta(tierra,agua,agua,pantano);
        topografiaMixta = new TopografiaMixta(tierra,agua,pantano,topografiaMixta2);
    }

    @Test
    public void CheckearCalcPropTierra(){
        assertEquals(1.0,tierra.calcProporcionTierra());
        assertEquals(0.0,agua.calcProporcionTierra());
        assertEquals(0.30000000000000004, pantano.calcProporcionTierra()); //Wtf, por que da un numero distinto
        assertEquals(0.40625,topografiaMixta.calcProporcionTierra());
        assertEquals(0.325,topografiaMixta2.calcProporcionTierra());
    }

    @Test
    public void CheckearCalcPropAgua(){
        assertEquals(0.0,tierra.calcProporcionAgua());
        assertEquals(1.0,agua.calcProporcionAgua());
        assertEquals(0.7, pantano.calcProporcionAgua());
        assertEquals(0.59375,topografiaMixta.calcProporcionAgua());
        assertEquals(0.675,topografiaMixta2.calcProporcionAgua());
    }

    @Test
    public void CheckearEquals(){
        Topografia topografiaMixta3 = new TopografiaMixta(pantano,agua,agua,tierra);
        assertFalse(tierra.equals(agua));
        assertFalse(agua.equals(pantano));
        assertFalse(pantano.equals(tierra));
        assertFalse(topografiaMixta.equals(topografiaMixta2));
        assertTrue(topografiaMixta2.equals(topografiaMixta3));
        assertTrue(agua.equals(agua));
        assertTrue(tierra.equals(tierra));
    }

}
