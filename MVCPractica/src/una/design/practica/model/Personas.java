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
public class Personas {

    @JsonProperty("name")
    Name name;
    @JsonProperty("tags")
    String[] tags;
    @JsonProperty("email")
    String email;
    @JsonProperty("friends")
    Friends[] friends;

    public Personas() {
    }

    public Personas(Name name, String[] tags, String email, Friends[] friend) {
        this.name = name;
        this.tags = tags;
        this.email = email;
        this.friends = friend;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Friends[] getFriend() {
        return friends;
    }

    public void setFriend(Friends[] friend) {
        this.friends = friend;
    }

    public String getPartnersNames() {
        String names = "";
        for (Friends friend : this.friends) {
            names = names + friend.getName() + "-";
        }
        return names;
    }
    
 

    @Override
    public String toString() {

        return "Personas{" + "name=" + name + ", tags=" + tags + ", email=" + email + ", friend=" + getPartnersNames() + '}';
    }

}
