/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package una.design.practica.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author John Herrera
 */
public class Friends {

    @JsonProperty("id")
    String id;
    @JsonProperty("name")
    String name;

    /**
     * Constructor vacio
     */
    public Friends() {
    }

    /**
     *
     * @param name el parametro name define el nombre de Friend 
     * @param id el parametro name define la identidad de Friend 
     */
    public Friends(String name, String id) {
        this.name = name;
        this.id = id;
    }

    /**
     *
     * @return retorna el nombre de Friend
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name el parametro name modifica el atributo name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return retorna el atributo id
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @param id el parametro id modifica el atributo id
     */
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {

        return "Friends{" + "name=" + name + ", id=" + id + '}';
    }

}
