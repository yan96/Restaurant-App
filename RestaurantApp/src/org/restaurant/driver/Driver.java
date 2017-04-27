/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.restaurant.driver;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Administrator
 */
public class Driver extends Application
{

    @Override
    public void start(Stage primaryStage) throws Exception 
    {
     Parent parent =
        FXMLLoader.load(getClass().getResource("/org/restaurant/view/Admin.fxml"));
        Scene scene = new Scene(parent, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
}
