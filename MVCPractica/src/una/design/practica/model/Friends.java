/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package una.design.practica.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author Estudiante
 */
public class Friends {

    @JsonProperty("id")
    String id;
    @JsonProperty("name")
    String name;

    public Friends() {
    }

    public Friends(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Friends{" + "name=" + name + ", id=" + id + '}';
    }

}
