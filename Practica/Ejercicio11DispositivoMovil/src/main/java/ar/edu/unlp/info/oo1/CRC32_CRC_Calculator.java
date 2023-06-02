package ar.edu.unlp.info.oo1;

import java.util.zip.CRC32;

public class CRC32_CRC_Calculator extends CRC_Calculator {

    @Override
    public long crcFor(String data) {
        CRC32 crc = new CRC32();
        String datos = "un mensaje";
        crc.update(datos.getBytes());
        long result = crc.getValue();
        return result;
    }
}
