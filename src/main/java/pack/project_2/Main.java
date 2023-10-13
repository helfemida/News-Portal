package pack.project_2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.util.Objects;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        new FXMLLoader();
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("controller.fxml")));
        stage.setTitle("News application");
        Pane pane = new Pane();
        pane.getChildren().addAll(root);
        stage.setScene(new Scene(pane,1000,700));
        stage.setResizable(false);
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}
