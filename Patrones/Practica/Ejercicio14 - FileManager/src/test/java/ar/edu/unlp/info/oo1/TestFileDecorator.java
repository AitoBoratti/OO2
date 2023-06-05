package ar.edu.unlp.info.oo1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

public class TestFileDecorator {
    FileOO2 file;

    @BeforeEach
    public void setUp() throws Exception{
        file = new File("archivo.txt", "txt", 1024, LocalDate.now(), LocalDate.now(), "rwx");
    }
    @Test
    public void TestNombre_Extension(){
        file = new PrintExtension(new PrintName(file));
        assertEquals("Datos del archivo: \n" +
                            "\t Nombre: archivo.txt\n" +
                            "\t Extension: txt"
                            ,file.prettyPrint());
    }
    @Test
    public void TestNombre_Extension_Tamaño(){
        file = new PrintTamaño(new PrintExtension(new PrintName(file)));
        assertEquals("Datos del archivo: \n" +
                        "\t Nombre: archivo.txt\n" +
                        "\t Extension: txt\n" +
                        "\t Tamaño: 1024.0"
                ,file.prettyPrint());
    }
    @Test
    public void TestPermisos_Nombre_Extension_Tamaño(){
        file = new PrintTamaño(new PrintExtension(new PrintName(new PrintPermisos(file))));
        assertEquals("Datos del archivo: \n" +
                        "\t Permisos: rwx\n" +
                        "\t Nombre: archivo.txt\n" +
                        "\t Extension: txt\n" +
                        "\t Tamaño: 1024.0"
                ,file.prettyPrint());
    }
}
