/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author 05011440214
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private JFXButton btnsoma;
    @FXML
    private JFXButton btnsub;
    @FXML
    private JFXButton btnmult;
    @FXML
    private JFXTextField n2;
    @FXML
    private JFXTextField result;
    @FXML
    private JFXTextField n1;
    @FXML
    private JFXButton btnlimpa;
    @FXML
    private JFXButton btndiv;
    
    @FXML
    private void soma(ActionEvent event) {
       Double numero1 = Double.parseDouble(n1.getText());
       Double numero2 = Double.parseDouble(n2.getText());
       Double resultado = numero1 + numero2;
       result.setText(resultado.toString());
    }
    @FXML
    private void subtrai(ActionEvent event) {
       Double numero1 = Double.parseDouble(n1.getText());
       Double numero2 = Double.parseDouble(n2.getText());
       Double resultado = numero1 - numero2;
       result.setText(resultado.toString());
    }
    @FXML
    private void multiplica(ActionEvent event) {
       Double numero1 = Double.parseDouble(n1.getText());
       Double numero2 = Double.parseDouble(n2.getText());
       Double resultado = numero1 * numero2;
       result.setText(resultado.toString());
    }
    @FXML
    private void divide(ActionEvent even) {
       Double numero1 = Double.parseDouble(n1.getText());
       Double numero2 = Double.parseDouble(n2.getText());
       Double resultado = numero1 / numero2;
       result.setText(resultado.toString());
    }
    
    @FXML
     private void limpa(ActionEvent even) {
      n1.setText("");
      n2.setText("");
      result.setText("");
      
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

   
}
