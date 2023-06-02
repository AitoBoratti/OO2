package ar.edu.unlp.info.oo1;

public class Adapter4G implements Connection{
    private FourG_Connection adaptee;

    public Adapter4G(FourG_Connection adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public String sendData(String data, int crc) {
        return adaptee.transmit(data,crc);
    }

    @Override
    public String pict() {
        return adaptee.getSymb();
    }
}
