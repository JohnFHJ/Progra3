/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package una.design.practica.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;

/**
 *
 * @author John Herrera
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

    /**
     *Constructo Vacio
     */
    public Personas() {
    }

    /**
     *
     * @param name parametro name se asocia cn la clase Name
     * @param tags parametro tags optiene las etiquetas de la persona
     * @param email parametro email contiende el email de la persona
     * @param friend Vector de la clase Fiend
     */
    public Personas(Name name, String[] tags, String email, Friends[] friend) {
        this.name = name;
        this.tags = tags;
        this.email = email;
        this.friends = friend;
    }

    /**
     *
     * @return retorna atributo name
     */
    public Name getName() {
        return name;
    }

    /**
     *
     * @param name modifica atributo name
     */
    public void setName(Name name) {
        this.name = name;
    }

    /**
     *
     * @return retorna atributo tags
     */
    public String[] getTags() {
        return tags;
    }

    /**
     *
     * @param tags midifica atributo tags
     */
    public void setTags(String[] tags) {
        this.tags = tags;
    }

    /**
     *
     * @return retorna atributo email
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @param email modifica atributo name
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     *
     * @return retorna atributo friends
     */
    public Friends[] getFriend() {
        return friends;
    }

    /**
     *
     * @param friend modifica atributo friends
     */
    public void setFriend(Friends[] friend) {
        this.friends = friend;
    }

    /**
     *
     * @return retorna unaconcatenacion de Friend para mostra mas de uno
     */
    public String getPartnersNames() {
        String names = "";
        for (Friends friend : this.friends) {
            names = names + friend.getName() + "-";
        }
        return names;
    }

    /**
     *
     * @return retorna una concatenacion de tag para mostrar mas de uno
     */
    public String getTag() {
        String tag = "";
        for (String tagsAux : this.tags) {
            tag = Arrays.toString(this.tags);
        }
        return tag;
    }

    @Override
    public String toString() {

        return "Personas{" + "name=" + name + ", tags=" + tags + ", email=" + email + ", friend=" + friends + '}';
    }

}
