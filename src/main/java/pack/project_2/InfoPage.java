package pack.project_2;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.awt.*;
import java.io.FileInputStream;
import java.net.URL;
import java.util.Objects;
import java.util.Optional;

public class InfoPage {

    @FXML
    private ImageView aiImage;

    @FXML
    private ImageView metaverseImage;

    @FXML
    private ImageView roboticsImage;

    @FXML
    private ImageView spaceImage;

    @FXML
    void initialize() {
        try {
            aiImage.setImage(new Image(new FileInputStream("src/main/java/pack/project_2/sources/AI.png")));
            metaverseImage.setImage(new Image(new FileInputStream("src/main/java/pack/project_2/sources/metaverse.png")));
            roboticsImage.setImage(new Image(new FileInputStream("src/main/java/pack/project_2/sources/robo.png")));
            spaceImage.setImage(new Image(new FileInputStream("src/main/java/pack/project_2/sources/space.png")));

        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
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
    void aiImageAction(){
        Stage stage = new Stage();
        Parent root = null;
        try {
            new FXMLLoader();
            root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("aiPage.fxml")));
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        aiImage.getScene().getWindow().hide();
        stage.setTitle("News application");
        stage.setScene(new Scene(root,1000,700));
        stage.show();
    }
    @FXML
    void RoboticsImageAction(){
        Stage stage = new Stage();
        Parent root = null;
        try {
            new FXMLLoader();
            root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("roboticsPage.fxml")));
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        roboticsImage.getScene().getWindow().hide();
        stage.setTitle("News application");
        stage.setScene(new Scene(root,1000,700));
        stage.show();
    }
    @FXML
    void MetaverseImageAction(){
        Stage stage = new Stage();
        Parent root = null;
        try {
            new FXMLLoader();
            root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("metaversePage.fxml")));
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        metaverseImage.getScene().getWindow().hide();
        stage.setTitle("News application");
        stage.setScene(new Scene(root,1000,700));
        stage.show();
    }
    @FXML
    void spaceImageAction(){
        Stage stage = new Stage();
        Parent root = null;
        try {
            new FXMLLoader();
            root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("spacePage.fxml")));
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        spaceImage.getScene().getWindow().hide();
        stage.setTitle("News application");
        stage.setScene(new Scene(root,1000,700));
        stage.show();
    }

}
