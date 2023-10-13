module pack.project_2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;

    opens pack.project_2 to javafx.fxml;
    exports pack.project_2;
}