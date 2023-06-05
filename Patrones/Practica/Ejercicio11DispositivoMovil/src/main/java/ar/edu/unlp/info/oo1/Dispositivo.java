package ar.edu.unlp.info.oo1;

public class Dispositivo {
    private CRC_Calculator crcCRCCalculator;
    private Connection connection;
    private Ringer ringer;
    private Display display;

    // Constructor
    public Dispositivo(CRC_Calculator crcCRCCalculator, Connection connection, Ringer ringer, Display display) {
        this.crcCRCCalculator = crcCRCCalculator;
        this.connection = connection;
        this.ringer = ringer;
        this.display = display;
    }

    // Getters and Setters
    public CRC_Calculator getCalculator() {
        return crcCRCCalculator;
    }

    public Connection getConnection() {
        return connection;
    }

    public Ringer getRinger() {
        return ringer;
    }

    public void setRinger(Ringer ringer) {
        this.ringer = ringer;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }
    //

    // Solicited Methods
    public String send(String data){
        long crc = this.crcCRCCalculator.crcFor(data);
        return this.connection.sendData(data, (int)crc);
    }
    public void conectarCon(Connection connection) {
        this.connection = connection;
        this.display.showBanner(connection.pict());
        this.ringer.ring();
    }
    public void configurarCRC(){
        this.crcCRCCalculator = crcCRCCalculator;
    }

}
