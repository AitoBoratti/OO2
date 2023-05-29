package ar.edu.unlp.info.oo1;

public interface Topografia {
    public double calcProporcionAgua ();
    public double calcProporcionTierra ();

    public default boolean equals(Topografia topografia){
        if (this.calcProporcionAgua() == topografia.calcProporcionAgua() &&
                this.calcProporcionTierra() == topografia.calcProporcionTierra()){
            return true;
        }
        return false;
    }
}
