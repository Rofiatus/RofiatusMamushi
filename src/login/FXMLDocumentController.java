/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author LAB TIK
 */
public class FXMLDocumentController implements Initializable {

    String name, password;
    @FXML
    private Label label;
    @FXML
    private TextField txtUser;
    @FXML
    private PasswordField pass;
    @FXML
    private Button btnLogin;

    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        name = txtUser.getText();
        password = pass.getText();
        if (name.equals("admin") && password.equals("admin")) {
            try {
                // Hide this current window (if this is what you want)
                ((Node) (event.getSource())).getScene().getWindow().hide();

                // Load the new fxml
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("FXML_Latihan.fxml"));
                Scene scene = new Scene(fxmlLoader.load(), 600, 600);

                // Create new stage (window), then set the new Scene
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.show(); 

            } catch (IOException e) {
                System.out.println("Failed to create new Window." + e);
            }
        } else {
            label.setText("Login Gagal");
        }
    }

   @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 
}