package pack.project_2;

import java.io.File;
import java.net.URL;
import java.util.*;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;


public class SignUpPage extends LogInPage{
    @FXML
    private RadioButton femaleButton;

    @FXML
    private RadioButton maleButton;

    @FXML
    private TextField nameField;

    @FXML
    private RadioButton nbButton;

    @FXML
    private PasswordField passwordField;
    @FXML
    private TextField signUpUsername;

    @FXML
    private Button signupButton;

    @FXML
    void initialize() {
        ToggleGroup tg = new ToggleGroup();
        maleButton.setToggleGroup(tg);
        femaleButton.setToggleGroup(tg);
        nbButton.setToggleGroup(tg);
    }
    @FXML
    void signUp(){
        String name = nameField.getText();
        String username = signUpUsername.getText();
        String password = passwordField.getText();
        String gender = getGender();
        FileWorker worker = new FileWorker();
        if(name.isEmpty() || username.isEmpty() || !validPass(password,name,username)){
            alert();
            return;
        }
        if(worker.validUsername(username)){
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Error");
            alert.setHeaderText("There already exists an account with this username. Choose another one");
            Optional<ButtonType> button = alert.showAndWait();
            if(button.get() == ButtonType.OK){
                alert.close();
                return;
            }
        }
        worker.addNewData(username,name,gender,password);
        signUpCompletedAlert();
    }
    private String getGender(){
        String res = "";
        if(maleButton.isSelected())
            res = "male";
        else if(femaleButton.isSelected())
            res = "female";
        else if(nbButton.isSelected())
            res = "non-binary gender";
        return res;
    }

    private boolean validPass(String p, String name, String username){
        if(p.length()>8)
            return false;
        else if(p.equalsIgnoreCase(name) || p.equalsIgnoreCase(username))
            return false;
        else{
            FileWorker worker = new FileWorker();
            for (int i = 0; i < p.length(); i++) {
                if(Character.isDigit(p.charAt(i)))
                    return true;
            }
        }
        return false;
    }
    void alert(){
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Error");
        alert.setHeaderText("Fields can not be empty, the name and username have to be different and password must be as required." +
                "Please re-try.");
        Optional<ButtonType> button = alert.showAndWait();
        if(button.get() == ButtonType.OK){
            alert.close();
        }
    }
    void accountIExists(){
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Error");
        alert.setHeaderText("There already exists an account with this usename. Please choose another.");
        Optional<ButtonType> button = alert.showAndWait();
        if(button.get() == ButtonType.OK){
            alert.close();
        }
    }
    void signUpCompletedAlert(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Sign up completed");
        alert.setHeaderText("You are signed up successfully");
        alert.setContentText("Press OK button to go to the log in page.");
        Optional<ButtonType> button = alert.showAndWait();
        if(button.get() == ButtonType.OK) {
            alert.close();
            Stage stage = new Stage();
            Parent root = null;
            try {
                root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("controller.fxml")));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            signupButton.getScene().getWindow().hide();
            stage.setTitle("News application");
            stage.setScene(new Scene(root, 1000, 700));
            stage.show();

        }
    }
}
