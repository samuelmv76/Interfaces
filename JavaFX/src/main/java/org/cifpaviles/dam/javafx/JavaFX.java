package org.cifpaviles.dam.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.paint.Color;

public class JavaFX extends Application {

    @Override
    public void start(Stage primaryStage) {
        Label lblNombre = new Label("Nombre:");
        TextField txtNombre = new TextField("Samuel");

        Label lblApellidos = new Label("Apellidos:");
        TextField txtApellidos = new TextField("Martínez Vega");

        VBox vbox = new VBox(10, lblNombre, txtNombre, lblApellidos, txtApellidos);
        vbox.setAlignment(Pos.CENTER);
        vbox.setStyle("-fx-background-color: lightblue; -fx-padding: 20;");

        Scene scene = new Scene(vbox, 400, 200, Color.LIGHTBLUE);
        primaryStage.setTitle("Datos Personales");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // ⚠️ ESTE MÉTODO ES OBLIGATORIO
    public static void main(String[] args) {
        launch(args);
    }
}
