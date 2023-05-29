package ar.edu.unlp.info.oo1;

public interface Topografia {
    public double calcProporcionAgua ();
    public default double calcProporcionTierra (){
        return 1.0 - calcProporcionAgua();
    }

    public default boolean equals(Topografia topografia){
        if (this.calcProporcionAgua() == topografia.calcProporcionAgua()){
            return true;
        }
        return false;
    }
}
