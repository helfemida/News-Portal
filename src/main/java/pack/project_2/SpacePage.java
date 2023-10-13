package pack.project_2;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.awt.*;
import java.io.FileInputStream;
import java.net.URL;

public class SpacePage extends MenuBar{

    @FXML
    private Button aiButton;
    @FXML
    private Button exitButton;

    @FXML
    private Button metaverseButton;

    @FXML
    private Button roboticsButton;

    @FXML
    private ImageView space1;

    @FXML
    private ImageView space2;

    @FXML
    private ImageView space3;

    @FXML
    void setContacts(){
        super.setContacts();
    }

    @FXML
    void setOnAiButton() {
        super.setAiButton(aiButton);
    }

    @FXML
    void setOnMetaverseButton() {
        super.setMetaverseButton(metaverseButton);
    }

    @FXML
    void setOnRoboticsButton() {
        super.setRoboticsButton(roboticsButton);
    }
    @FXML
    void setSpace1Heading() {
        try {
            Desktop.getDesktop().browse(new URL("https://spacenews.com/israel-ofek/").toURI());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void setSpace2Heading() {
        try {
            Desktop.getDesktop().browse(new URL("https://spacenews.com/spacex-experiencing-problems-with-first-upgraded-starlink-v2-satellites/").toURI());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void setSpace3Heading() {
        try {
            Desktop.getDesktop().browse(new URL("https://spacenews.com/china-loses-uae-as-partner-for-change-7-lunar-south-pole-mission/").toURI());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void initialize() {
        try {
            space1.setImage(new Image(new FileInputStream("src/main/java/pack/project_2/sources/space1.jpg")));
            space2.setImage(new Image(new FileInputStream("src/main/java/pack/project_2/sources/space2.jpg")));
            space3.setImage(new Image(new FileInputStream("src/main/java/pack/project_2/sources/space3.jpg")));
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    @FXML
    void setExitButton() {
        super.setExitButton(exitButton);
    }
}
