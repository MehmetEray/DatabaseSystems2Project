/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javafx.application.ConditionalFeature.FXML;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author mehmet eray
 */
public class FXMLController implements Initializable {

    /*
    @FXML private Button btn;
    @FXML private Button textField;
    private Connection con = null;
    private PreparedStatement statement = null;
    @FXML
    void handle(ActionEvent event) throws ClassNotFoundException, SQLException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://DESKTOP-543P5LQ;databaseName=exa;user=sa;password=123456789;integratedSecurity = true";
        con = DriverManager.getConnection(url);
        String sql = "insert into table2(surname) values ('surmeli')";
        PreparedStatement pst = con.prepareStatement(sql);
        //pst.setString(1,textField.getText());
        ResultSet rs = pst.executeQuery();
        if(rs.next()){
            JOptionPane.showMessageDialog(null, "match");
        }
        else{
            JOptionPane.showMessageDialog(null,"Not correct");
            textField.setText(" ");
        }
        
            pst.close();
            con.close();
        
    }  */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //con = db.db.con();
    }    
    
}
