package ar.edu.unlp.info.oo1;

public class TopografiaSimple implements Topografia{
    private double propAgua = 0.0;
    private double propTierra = 0.0;

    public TopografiaSimple(String elemento) {
        switch (elemento){
            case "Tierra":
                this.propTierra = 1.0;
                break;
            case "Agua":
                this.propAgua = 1.0;
                break;
            case "Pantano":
                this.propAgua = 0.7;
                this.propTierra = 0.3;
        }
    }

    @Override
    public double calcProporcionAgua() {
        return propAgua;
    }

    @Override
    public double calcProporcionTierra() {
        return propTierra;
    }
}
