package ar.edu.unlp.info.oo2.biblioteca;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.List;

public class JsonExporter extends VoorheesExporter {

    private JSONObject crearSocioJson(Socio socio) {
        JSONObject jsonSocio = new JSONObject();
        jsonSocio.put("nombre", socio.getNombre());
        jsonSocio.put("legajo", socio.getLegajo());
        jsonSocio.put("email", socio.getEmail());
        return jsonSocio;
    }

    @Override
    public String exportar(List<Socio> socios) {
        JSONArray jsonLista = new JSONArray();
        socios.forEach(socio -> {
            jsonLista.add(this.crearSocioJson(socio));
        });
        return jsonLista.toJSONString();
    }
}
