package pack.project_2;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.awt.*;
import java.io.FileInputStream;
import java.net.URL;

public class AiPage extends MenuBar{
    @FXML
    private Button exitButton;

    @FXML
    private ImageView ai1;

    @FXML
    private ImageView ai2;

    @FXML
    private ImageView ai3;

    @FXML
    private Button metaverseButton;

    @FXML
    private Button roboticsButton;

    @FXML
    private Button spaceButton;

    @FXML
    void initialize() {
        try {
            ai1.setImage(new Image(new FileInputStream("src/main/java/pack/project_2/sources/ai1.jpg")));
            ai2.setImage(new Image(new FileInputStream("src/main/java/pack/project_2/sources/ai2.jpg")));
            ai3.setImage(new Image(new FileInputStream("src/main/java/pack/project_2/sources/ai3.jpg")));
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
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
    void setRoboticsButton(){
        super.setRoboticsButton(roboticsButton);
    }
    @FXML
    void setContacts(){
        super.setContacts();
    }
    @FXML
    void setAi1Heading(){
        try {
            Desktop.getDesktop().browse(new URL("https://edition.cnn.com/2023/03/29/tech/chatgpt-ai-automation-jobs-impact-intl-hnk/index.html").toURI());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @FXML
    void setAi2Heading(){
        try {
            Desktop.getDesktop().browse(new URL("https://www.vox.com/technology/2023/3/30/23662292/ai-image-dalle-openai-midjourney-pope-jacket").toURI());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @FXML
    void setAi3Heading(){
        try {
            Desktop.getDesktop().browse(new URL("https://www.coindesk.com/business/2023/03/29/ai-focused-crypto-protocol-fetchai-raises-40m-to-deploy-decentralized-machine-learning/").toURI());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @FXML
    void setExitButton() {
        super.setExitButton(exitButton);
    }

}
