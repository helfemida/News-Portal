package pack.project_2;

import java.io.*;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Optional;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class LogInPage {

    @FXML
    private Button adminModeButton;
    @FXML
    private Button forgetButton;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button signupButton;

    @FXML
    private TextField usernameField;

    @FXML
    void logInButtonAction(){
        String username = usernameField.getText();
        String password = passwordField.getText();
        FileWorker worker = new FileWorker();
        if(!worker.validUsername(username)){
            alert();
            return;
        }
        if(!worker.checkPass(username,password)){
            incorrectPasswordAlert();
            return;
        }
        Stage stage = new Stage();
        Parent root = null;
        try {
            root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("infoPage.fxml")));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        signupButton.getScene().getWindow().hide();
        stage.setTitle("News application");
        stage.setScene(new Scene(root, 1000, 700));
        stage.show();
    }

    @FXML
    void signUpButtonAction()  {
        Stage stage = new Stage();
        Parent root = null;
        try {
            root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("signUp.fxml")));
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        signupButton.getScene().getWindow().hide();
        stage.setTitle("News application");
        stage.setScene(new Scene(root,1000,700));
        stage.show();
    }
    void alert(){
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Error");
        alert.setHeaderText("No account found");
        alert.setContentText("Account with this username is not found. Please try to sign up first.");
        Optional<ButtonType> button = alert.showAndWait();
        if(button.get() == ButtonType.OK){
            signUpButtonAction();
        }
    }
    void incorrectPasswordAlert(){
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Incorrect Data");
        alert.setHeaderText("An Error Occured");
        alert.setContentText("Incorrect password");
        Optional<ButtonType> button = alert.showAndWait();
        if(button.get() == ButtonType.CLOSE){
            alert.close();
        }
    }
    @FXML
    void setForgetButton(){
        Stage stage = new Stage();
        Parent root = null;
        try {
            new FXMLLoader();
            root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("forgetPassword.fxml")));
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }

        stage.setTitle("Forget Password");
        stage.setScene(new Scene(root,700,350));
        stage.show();
    }
    @FXML
    void setAdminModeButton(){
        Stage stage = new Stage();
        Parent root = null;
        try {
            new FXMLLoader();
            root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("adminMode.fxml")));
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        stage.setTitle("Admin Mode");
        stage.setScene(new Scene(root,700,350));
        stage.show();
    }

}
