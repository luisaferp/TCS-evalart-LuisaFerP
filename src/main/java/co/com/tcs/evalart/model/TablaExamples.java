package co.com.tcs.evalart.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Data
public class TablaExamples {
    private String usuario;
    private String contrasena;
    private String imagen1;
    private String fecha1;
    private String imagen2;
    private String fecha2;
    private String imagen3;
    private String fecha3;
    private String imagen4;
    private String fecha4;
    private String imagen5;
    private String fecha5;
    private String imagen6;
    private String fecha6;
    private String imagen7;
    private String fecha7;
    private String imagen8;
    private String fecha8;
    private String imagen9;
    private String fecha9;
    private String imagen10;
    private String fecha10;
    private String hash;

    public static List<TablaExamples> setDatos(DataTable dataTable){
        List<TablaExamples> dates = new ArrayList<>();
        List<Map<String, String>> mapsInfo = dataTable.asMaps();
        for (Map<String, String> map: mapsInfo){
            dates.add(new ObjectMapper().convertValue(map, TablaExamples.class));
        }
        return dates;
    }
    }


