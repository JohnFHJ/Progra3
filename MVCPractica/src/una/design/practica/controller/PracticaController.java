/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package una.design.practica.controller;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.security.Provider.Service;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import una.design.practica.Constants;
import una.design.practica.service.PracticaService;

/**
 *
 * @author Estudiante
 */
public class PracticaController implements ActionListener, KeyListener {

    private JTextField searchTermTextField = new JTextField(26);
    private DefaultTableModel tableModel;
    private PracticaService personaService;
    private Object[][] personas;

    public PracticaController(JTextField searchTermTextField,
            DefaultTableModel tableModel) throws JsonGenerationException,
            JsonMappingException, IOException {
        super();

        personaService = new PracticaService();
        personas = personaService.loadPersonasObjWrapper();

        this.searchTermTextField = searchTermTextField;

        this.tableModel = tableModel;

        // Load the table with the list of students
        tableModel.setDataVector(personas, Constants.TABLE_HEADER);
        this.searchTermTextField.addKeyListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String searchTerm = searchTermTextField.getText();

        //Method to search items
        updateTableSearchTerms(searchTerm);
    }

    private void updateTableSearchTerms(String searchTerm) {
        if (searchTerm != null && !"".equals(searchTerm)
                && personas != null && personas.length > 0) {
            Object[][] newData = new Object[personas.length][];
            int idx = 0;
            for (Object[] obj : personas) {
                String fullText = obj[0].toString() + obj[1].toString()
                        + obj[2].toString() + obj[3].toString() + obj[4].toString();

                if (fullText.contains(searchTerm.trim())) {
                    newData[idx++] = obj;
                }
            }
            tableModel.setDataVector(newData, Constants.TABLE_HEADER);
        } else {
            JOptionPane.showMessageDialog(null,
                    "Search term is empty", "Error",
                    JOptionPane.ERROR_MESSAGE);
            tableModel.setDataVector(personas, Constants.TABLE_HEADER);
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
            String key = searchTermTextField.getText();
            updateTableSearchTerms(key);
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    @Override
    public void keyReleased(KeyEvent e) {

//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
