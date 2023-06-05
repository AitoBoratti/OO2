package ar.edu.unlp.info.oo1;

public class FourG_Connection {
    private String symb;

    public FourG_Connection(String symb) {
        this.symb = symb;
    }

    public String getSymb() {
        return symb;
    }

    public void setSymb(String symb) {
        this.symb = symb;
    }



    public String transmit(String data, Integer crc){
        return "Sending messege with 4G Connection";
    }
}
