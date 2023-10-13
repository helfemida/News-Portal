package pack.project_2;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;

import java.util.Objects;
import java.util.Optional;

public class AdminMode {

    @FXML
    private PasswordField keyWordField;
    @FXML
    private Button okButton;
    @FXML
    void checkKeyword() {
        if(keyWordField.getText().equals("alaskaspage1234")){
            Stage stage = new Stage();
            Parent root = null;
            try {
                new FXMLLoader();
                root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("roboticsPage.fxml")));
            }
            catch (Exception ex){
                System.out.println(ex.getMessage());
            }
            okButton.getScene().getWindow().hide();
            stage.setTitle("News application");
            stage.setScene(new Scene(root,1000,700));
            stage.show();
        }
        else{
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setHeaderText("Incorrect Key Word");
            alert.setTitle("An Error Occurred");
            Optional<ButtonType> button = alert.showAndWait();
            if(button.get() == ButtonType.OK){
                keyWordField.getScene().getWindow().hide();
                alert.close();
            }
        }
    }

}
