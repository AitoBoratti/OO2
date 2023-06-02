package ar.edu.unlp.info.oo1;

public class WifiConn implements Connection{

    private String pict;

    public WifiConn(String pict) {
        this.pict = pict;
    }

    @Override
    public String sendData(String data, int crc) {
        return "Sending messege with Wifi Connection";
    }

    @Override
    public String pict() {
        return this.pict;
    }
}
