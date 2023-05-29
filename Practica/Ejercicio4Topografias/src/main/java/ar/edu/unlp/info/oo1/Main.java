package ar.edu.unlp.info.oo1;

public class Main {
    public static void main(String[] args) {
        // Crear topografias simples
        Topografia tierra = new TopografiaSimple("Tierra");
        Topografia agua = new TopografiaSimple("Agua");
        Topografia pantano = new TopografiaSimple("Pantano");

        // Calcular proporciones de topografias simples
        System.out.println("Proporcion de agua en tierra: " + tierra.calcProporcionAgua());
        System.out.println("Proporcion de tierra en tierra: " + tierra.calcProporcionTierra());
        System.out.println("Proporcion de agua en agua: " + agua.calcProporcionAgua());
        System.out.println("Proporcion de tierra en agua: " + agua.calcProporcionTierra());
        System.out.println("Proporcion de agua en pantano: " + pantano.calcProporcionAgua());
        System.out.println("Proporcion de tierra en pantano: " + pantano.calcProporcionTierra());

        // Crear topografia mixta
        TopografiaMixta topografiaMixta = new TopografiaMixta(tierra, agua, pantano, tierra);

        // Calcular proporciones de topografia mixta
        System.out.println("Proporcion de agua en topografia mixta: " + topografiaMixta.calcProporcionAgua());
        System.out.println("Proporcion de tierra en topografia mixta: " + topografiaMixta.calcProporcionTierra());

        // Comparar igualdad de topografias
        TopografiaMixta topografiaMixta2 = new TopografiaMixta(tierra, agua, pantano, tierra);
        System.out.println("Las topografias mixtas son iguales: " + topografiaMixta.equals(topografiaMixta2));
    }
}