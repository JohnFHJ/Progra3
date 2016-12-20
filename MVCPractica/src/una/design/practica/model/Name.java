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
public class Name {

    @JsonProperty("first")
    String first;
    @JsonProperty("last")
    String last;

    /**
     *Constructo Vacio
     */
    public Name() {
    }

    /**
     *
     * @param first el parametro first define el primer nombre
     * @param last el parametri last define el apellido
     */
    public Name(String first, String last) {
        this.first = first;
        this.last = last;

    }

    /**
     *
     * @return retorna el atributo first
     */
    public String getFirst() {
        return first;
    }

    /**
     *
     * @param first modifica el atributo first
     */
    public void setFirst(String first) {
        this.first = first;
    }

    /**
     *
     * @return retorna el atributo last
     */
    public String getLast() {
        return last;
    }

    /**
     *
     * @param last modifica el atributo last
     */
    public void setLast(String last) {
        this.last = last;
    }

    @Override
    public String toString() {
        return "Name{" + "first=" + first + ", last=" + last + '}';
    }

}
