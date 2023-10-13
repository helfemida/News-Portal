package pack.project_2;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;

import java.util.Optional;

public class ForgetPassword {

    @FXML
    private TextField nPassTextField;

    @FXML
    private TextField usernameTextField;

    @FXML
    void changePassword(){
        String username = usernameTextField.getText();
        String newPassword = nPassTextField.getText();
        FileWorker worker = new FileWorker();
        if(!worker.validUsername(username)){
            noAccountAlert();
            return;
        }
        worker.updateInfo(username,newPassword);
        passwordChangedAlert();
    }
    void noAccountAlert(){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setHeaderText("Account with this username is not found");
        alert.setContentText("Try to log in into existing account or re-enter the username");

        Optional<ButtonType> button = alert.showAndWait();

        if (button.get() == ButtonType.CLOSE) {
            alert.close();
        } else if (button.get() == ButtonType.OK) {
            alert.close();
            usernameTextField.clear();
        }
    }
    void passwordChangedAlert(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Password change completed");
        alert.setHeaderText("You are password is changed successfully. Press OK button to go to the log in page.");

        Optional<ButtonType> button = alert.showAndWait();

        if(button.get() == ButtonType.OK) {
            alert.close();
            nPassTextField.getScene().getWindow().hide();
        }
    }


}
