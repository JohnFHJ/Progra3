/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package una.design.practica.service;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import una.design.practica.model.Personas;

/**
 *
 * @author Estudiante
 */
public class PracticaService {

    public PracticaService() {
    }

    public Object[][] loadPersonasObjWrapper() throws JsonGenerationException,
            JsonMappingException, IOException {
        Personas[] personas = loadStudentsFromFile();
        Object[][] data = null;

        if (personas != null && personas.length > 0) {
            data = new Object[personas.length][4]; // filas y columnas
            int i = 0;
            for (Personas persona : personas) {
                data[i][0] = checkIfNull(persona.getName().getFirst());
                data[i][1] = checkIfNull(persona.getName().getLast());
                data[i][2] = checkIfNull(persona.getEmail());
                data[i][3] = checkIfNull(persona.getTags());
                data[i][4] = checkIfNull(persona.getFriend());
                i++;
            }
        }

        return data;
    }

    private Personas[] loadStudentsFromFile() throws JsonGenerationException,
            JsonMappingException, IOException {
        // Library Jackson parse JSon
        // http://wiki.fasterxml.com/JacksonHome
        Personas[] personas = null;
        final String FILENAME = "data.json";

        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        // Convert JSON string from file to Object
        personas = mapper.readValue(new File(FILENAME), Personas[].class);

        return personas;
    }

    private String checkIfNull(Object obj) {
        String text;
        if (obj == null) {
            text = "";
        } else {
            text = obj.toString();
        }
        return text;
    }
}
