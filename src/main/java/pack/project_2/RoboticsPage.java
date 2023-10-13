package pack.project_2;

import java.awt.*;
import java.io.FileInputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class RoboticsPage extends MenuBar{

    @FXML
    private Button aiButton;
    @FXML
    private Button exitButton;

    @FXML
    private Button metaverseButton;

    @FXML
    private ImageView robo1;


    @FXML
    private ImageView robo2;

    @FXML
    private ImageView robo3;

    @FXML
    private Button spaceButton;


    @FXML
    void initialize() {
        try {
            robo1.setImage(new javafx.scene.image.Image(new FileInputStream("src/main/java/pack/project_2/sources/Robo1.jpg")));
            robo2.setImage(new javafx.scene.image.Image(new FileInputStream("src/main/java/pack/project_2/sources/robo2.jpg")));
            robo3.setImage(new Image(new FileInputStream("src/main/java/pack/project_2/sources/robo3.jpg")));
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    @FXML
    void setRobo1HeadingAction(){
        try {
            Desktop.getDesktop().browse(new URL("https://www.therobotreport.com/german-robotics-industry-to-grow-9-in-2023/").toURI());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @FXML
    void setRobo2HeadingAction(){
        try {
            Desktop.getDesktop().browse(new URL("https://www.axios.com/2023/03/29/robots-jobs-chatgpt-generative-ai").toURI());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @FXML
    void setRobo3HeadingAction(){
        try {
            Desktop.getDesktop().browse(new URL("https://spectrum.ieee.org/elephant-robotics-educational-robots-2023").toURI());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @FXML
    void aiButton(){
        setAiButton(aiButton);
    }
    @FXML
    void setMetaverseButton(){
        super.setMetaverseButton(metaverseButton);
    }
    @FXML
    void setSpaceButton(){
        super.setSpaceButton(spaceButton);
    }
    @FXML
    void setContacts(){
        super.setContacts();
    }
    @FXML
    void setExitButton() {
        super.setExitButton(this.exitButton);
    }
}
