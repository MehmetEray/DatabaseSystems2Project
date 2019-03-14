/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author mehmet eray
 */
public class JavaFXApplication1 extends Application {
    
    private StackPane signPane;
    @Override
    public void start(Stage primaryStage) {
        
        FXMLLoader loader = new FXMLLoader();
            loader.setLocation(JavaFXApplication1.class.getResource("view/FXML.fxml"));
        try {
            signPane = loader.load();
        } catch (IOException ex) {
            Logger.getLogger(JavaFXApplication1.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            // Show the scene containing the root layout.
            Scene scene = new Scene(signPane);
            primaryStage.setScene(scene);
            primaryStage.show();
        
            /*StackPane signPane = new StackPane();
        
        Scene scene = new Scene(signPane, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show(); */
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
