/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.restaurant.view;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javax.persistence.NamedQuery;
import org.restaurant.dao.AkunDao;
import org.restaurant.dao.impl.AkunDaoImpl;
import org.restaurant.model.Akun;

import java.sql.Connection;
import java.sql.ResultSet;
import org.hibernate.engine.spi.ExecuteUpdateResultCheckStyle;

/**
 * FXML Controller class
 *
 * @author Administrator
 */
public class LoginController implements Initializable {
    @FXML
    private TextField usernameTF;
    @FXML
    private TextField passwordTF;
    @FXML
    private Button loginB;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        // TODO
    }    
    
        ObservableList<Akun> data;
        
        AkunDao aDao;
        
        public LoginController()
    {
        aDao = new AkunDaoImpl();
    }
        
    @FXML
    private void loginB(ActionEvent event) 
    {
        //String a = usernameTF.getText();
        //String b = passwordTF.getText();
        //@NamedQuery(name = "Akun.User",query = "SELECT")
        //a.matches("Akun.User");
        //if(a.matches(Akun.))
    }
}
