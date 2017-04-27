/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.restaurant.view;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.TableView;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import org.restaurant.dao.AkunDao;
import org.restaurant.dao.impl.AkunDaoImpl;
import org.restaurant.model.Akun;
import org.restaurant.model.Pegawai;

/**
 * FXML Controller class
 *
 * @author Administrator
 */
public class AdminController implements Initializable {
    @FXML
    private TableColumn<Akun, String> namaInTC;
    @FXML
    private TableColumn<Akun, String> kategoriInTC;
    @FXML
    private TableColumn<Akun, String> userInTC;
    @FXML
    private TextField idPekerja;
    @FXML
    private TextField username;
    @FXML
    private TextField nama;
    @FXML
    private TextField password;
    @FXML
    private Button addButton;
    @FXML
    private ComboBox tipePekerjaanCB;
    @FXML
    private TableView<Akun> itemTV;
    @FXML
    private Label gagalLabel;
    @FXML
    private Image imagePG;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        tipePekerjaanCB.setItems(tipe);
        loadData();
    }    
    ObservableList<Akun> data;
    
    AkunDao aDao;
    
    ObservableList<String> tipe = FXCollections.observableArrayList("Meja","Koki","Inventory");

    public AdminController()
    {
        aDao = new AkunDaoImpl();
        itemTV = new TableView<>();
    }
    
    @FXML
    private void Add(ActionEvent event) 
    {
        try
        {
            Akun akun = new Akun();
            akun.setNama(nama.getText());
            akun.setUsername(username.getText());
            akun.setPassword(password.getText());
            if (tipePekerjaanCB.getValue().toString().matches("Meja")) {
                akun.setCategory("Meja");
            } else if (tipePekerjaanCB.getValue().toString().matches("Koki")) {
                akun.setCategory("Koki");
            } else if (tipePekerjaanCB.getValue().toString().matches("Inventory")) {
                akun.setCategory("Inventory");
            }
            aDao.saveDataAkun(akun);
            data.add(akun);
            inisialisasiAwalInputanAkun();
            gagalLabel.setVisible(false);
        }
        catch(Exception ae)
        {
            gagalLabel.setVisible(true);
            inisialisasiAwalInputanAkun();
        }
    }
    
    @FXML
    private void AddPekerja(ActionEvent event)
    {
        
    }
    
    
    private void inisialisasiAwalInputanAkun()
    {
        username.setText("");
        password.setText("");
        nama.setText("");
    }
    
    public void loadData()
    {
        
        List<Akun> akuns = aDao.getAllAkun();
        for(Akun m : akuns)
        {
            System.out.println("nama : " + m.getUsername());
        }
        data = FXCollections.observableArrayList(akuns);
        namaInTC.setCellValueFactory(
                new PropertyValueFactory<Akun, String>("nama"));
        userInTC.setCellValueFactory(
                new PropertyValueFactory<Akun, String>("username"));
        kategoriInTC.setCellValueFactory(
                new PropertyValueFactory<Akun, String>("category"));     
        itemTV.setItems(data);
    }
    
    @FXML
    public void openHome(ActionEvent event) throws IOException 
    {
        try 
            {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/org/restaurant/view/Login.fxml"));
                Parent root1 = fxmlLoader.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(root1));
                stage.show();
                
            } 
        catch (IOException e)
            {
            
            }
    
    
    }
    
}
