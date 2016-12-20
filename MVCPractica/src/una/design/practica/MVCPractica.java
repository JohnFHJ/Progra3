/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package una.design.practica;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.io.IOException;
import javax.swing.SwingUtilities;
import una.design.practica.view.PracticaView;

/**
 *
 * @author Estudiante
 */
public class MVCPractica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    createAndShowGUI();

                } catch (JsonGenerationException e) {
                    System.err.println(e);
                } catch (JsonMappingException e) {
                    System.err.println(e);
                } catch (IOException e) {
                    System.err.println(e);
                } catch (Exception e) {
                    System.err.println(e);
                }
            }
        });
    }
        public static void createAndShowGUI() throws Exception {
        PracticaView studentListView = new PracticaView();
    }
    
}
