package pack.project_2;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

import java.awt.*;
import java.net.URL;
import java.util.Objects;
import java.util.Optional;

public abstract class MenuBar {

    @FXML
    void setMetaverseButton(Button metaverseButton){
        Stage stage = new Stage();
        Parent root = null;
        try {
            new FXMLLoader();
            root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("metaversePage.fxml")));
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        metaverseButton.getScene().getWindow().hide();
        stage.setTitle("News application");
        stage.setScene(new Scene(root,1000,700));
        stage.show();
    }
    @FXML
    void setSpaceButton(Button spaceButton){
        Stage stage = new Stage();
        Parent root = null;
        try {
            root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("spacePage.fxml")));
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        spaceButton.getScene().getWindow().hide();
        stage.setTitle("News application");
        stage.setScene(new Scene(root,1000,700));
        stage.show();
    }
    @FXML
    void setRoboticsButton(Button roboticsButton){
        Stage stage = new Stage();
        Parent root = null;
        try {
            root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("roboticsPage.fxml")));
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        roboticsButton.getScene().getWindow().hide();
        stage.setTitle("News application");
        stage.setScene(new Scene(root,1000,700));
        stage.show();
    }
    @FXML
    void setContacts(){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setHeaderText("Exit the page");
        alert.setTitle("CONFIRMATION");
        alert.setContentText("You'll be redirected to the web-page page.");
        Optional<ButtonType> button = alert.showAndWait();
        if(button.get() == ButtonType.OK){
            try {
                Desktop.getDesktop().browse(new URL("https://t.me/helfemida").toURI());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else{
            alert.close();
        }

    }
    @FXML
    void setAiButton(Button aiButton){
        Stage stage = new Stage();
        Parent root = null;
        try {
            root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("aiPage.fxml")));
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        aiButton.getScene().getWindow().hide();
        stage.setTitle("News application");
        stage.setScene(new Scene(root,1000,700));
        stage.show();
    }
    @FXML
    void setExitButton(Button exitButton){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setHeaderText("Exit the page");
        alert.setTitle("CONFIRMATION");
        alert.setContentText("You'll be redirected to the log in page.");
        Optional<ButtonType> button = alert.showAndWait();
        if(button.get() == ButtonType.OK){
            Stage stage = new Stage();
            Parent root = null;
            try {
                root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("controller.fxml")));
                exitButton.getScene().getWindow().hide();
                stage.setTitle("News application");
                stage.setScene(new Scene(root,1000,700));
                stage.show();
            }
            catch (Exception ex){
                System.out.println(ex.getMessage());
            }
        }
        else{
            alert.close();
        }

    }
}
