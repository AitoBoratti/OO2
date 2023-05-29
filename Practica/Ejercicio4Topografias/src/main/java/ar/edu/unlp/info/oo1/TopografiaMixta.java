package ar.edu.unlp.info.oo1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TopografiaMixta implements Topografia{

    private List<Topografia> componentes;

    public TopografiaMixta(Topografia componente1, Topografia componente2,Topografia componente3,Topografia componente4) {
        this.componentes = new ArrayList<Topografia>();
        this.componentes.add(componente1);
        this.componentes.add(componente2);
        this.componentes.add(componente3);
        this.componentes.add(componente4);
    }

    @Override
    public double calcProporcionTierra() {
        double propTierra = this.componentes.stream().mapToDouble(componente -> componente.calcProporcionTierra()).sum();
        return propTierra/4;
    }

    @Override
    public double calcProporcionAgua() {
        double propAgua = this.componentes.stream().mapToDouble(componente -> componente.calcProporcionAgua()).sum();
        return propAgua/4;
    }

}
