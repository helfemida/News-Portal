package pack.project_2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

import java.awt.*;
import java.io.FileInputStream;
import java.net.URL;

public class MetaversePage extends MenuBar{

    @FXML
    private Button aiButton;

    @FXML
    private ImageView metaverse1;

    @FXML
    private ImageView metaverse2;

    @FXML
    private ImageView metaverse3;

    @FXML
    private Button roboticsButton;

    @FXML
    private Button spaceButton;
    @FXML
    private Button exitButton;
    @FXML
    void setAiButton() {
        super.setAiButton(aiButton);
    }

    @FXML
    void setContact(){
        super.setContacts();
    }

    @FXML
    void setMv1Heading() {
        try {
            Desktop.getDesktop().browse(new URL("https://www.bbc.com/news/newsbeat-64862006").toURI());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void setMv2Heading() {
        try {
            Desktop.getDesktop().browse(new URL("https://beincrypto.com/metaverse-fashion-future-industry/").toURI());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void setMv3Heading() {
        try {
            Desktop.getDesktop().browse(new URL("https://cointelegraph.com/news/south-korea-launches-metaverse-fund-to-expedite-domestic-initiatives").toURI());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void setRoboticsButton() {
        super.setRoboticsButton(roboticsButton);
    }

    @FXML
    void setSpaceButton() {
        super.setSpaceButton(spaceButton);
    }
    @FXML
    void setExitButton() {
        super.setExitButton(exitButton);
    }

    @FXML
    void initialize() {
        try {
            metaverse1.setImage(new Image(new FileInputStream("src/main/java/pack/project_2/sources/mv1.jpg")));
            metaverse2.setImage(new Image(new FileInputStream("src/main/java/pack/project_2/sources/mv2.jpg")));
            metaverse3.setImage(new Image(new FileInputStream("src/main/java/pack/project_2/sources/mv3.png")));
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

}
