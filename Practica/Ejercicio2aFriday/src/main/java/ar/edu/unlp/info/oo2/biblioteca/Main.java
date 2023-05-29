package ar.edu.unlp.info.oo2.biblioteca;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de la biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // Crear algunos socios
        Socio socio1 = new Socio("Juan", "juan@example.com", "12345");
        Socio socio2 = new Socio("Maria", "maria@example.com", "67890");

        // Agregar los socios a la biblioteca
        biblioteca.agregarSocio(socio1);
        biblioteca.agregarSocio(socio2);

        // Obtener el exportador actual de la biblioteca
        VoorheesExporter exporter = biblioteca.getExporter();

        // Exportar los socios utilizando el exportador actual
        String exportacionActual = biblioteca.exportarSocios();
        System.out.println("Exportacion con el exportador actual:");
        System.out.println(exportacionActual);

        // Crear un exportador JSON personalizado
        JsonExporter jsonExporter = new JsonExporter();

        // Establecer el nuevo exportador en la biblioteca
        biblioteca.setExporter(jsonExporter);

        // Exportar los socios utilizando el nuevo exportador
        String nuevaExportacion = biblioteca.exportarSocios();
        System.out.println("Nueva exportacion con el exportador JSON:");
        System.out.println(nuevaExportacion);
    }
}

