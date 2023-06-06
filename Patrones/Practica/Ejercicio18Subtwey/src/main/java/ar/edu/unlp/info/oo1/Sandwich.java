package ar.edu.unlp.info.oo1;

import java.util.ArrayList;
import java.util.List;

public class Sandwich {
//    Una cadena de comidas rápidas especializada en sándwiches necesita resolver el cálculo de precios de éstos.
//    El cálculo es simple: el precio de un sándwich equivale a la suma del precio de cada uno de sus componentes; el
//    problema es la dificultad para representar y crear cada uno de los sándwiches distintos.
//
//    Existen cuatro sandwiches distintos, pero podrían aparecer nuevos en el futuro.
//
//    Clásico: consta de pan brioche (100 pesos), aderezo a base de mayonesa (20 pesos), principal de carne de
//    ternera(300 pesos) y adicional de tomate (80 pesos).
//
//    Vegetariano: consta de pan con semillas (120 pesos), sin aderezo, principal de provoleta grillada (200 pesos) y
//    adicional de berenjenas al escabeche (100 pesos).
//
//    Vegano: consta de pan integral (100 pesos), aderezo de salsa criolla (20 pesos), principal de milanesa de girgolas
//    (500 pesos), sin adicional.
//
//    Sin TACC: consta de pan de chipá (150 pesos), aderezo de salsa tártara (18 pesos), principal de carne de pollo
//    (250 pesos) y adicional de verduras grilladas (200 pesos).
//
//    Tareas:
//    Proponga un diseño e implementación para la creación y cálculo de precios de estas alternativas de sándwiches.
//    Si en su solución aplicó algún(os) patrón(es) de diseño, indique cuál(es) y sus roles.
    private Ingrediente pan;
    private Ingrediente aderezo;
    private Ingrediente principal;
    private Ingrediente adicional;

    public Sandwich() {
    }

    public void setPan(Ingrediente pan) {
        this.pan = pan;
    }
    public void setAderezo(Ingrediente aderezo) {
        this.aderezo = aderezo;
    }
    public void setPrincipal(Ingrediente principal) {
        this.principal = principal;
    }
    public void setAdicional(Ingrediente adicional) {
        this.adicional = adicional;
    }
    public Ingrediente getPan() {
        return pan;
    }
    public Ingrediente getPrincipal() {
        return principal;
    }
    public Ingrediente getAderezo() {
        return aderezo;
    }
    public Ingrediente getAdicional() {
        return adicional;
    }

    public Double precioTotal(){
        return  getPan().getPrecio() + 
                getAderezo().getPrecio() + 
                getPrincipal().getPrecio() + 
                getAdicional().getPrecio();
    }

}
