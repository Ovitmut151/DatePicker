package com.example.datepicker;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.time.LocalDate;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) {
        // Crear DatePicker
        DatePicker datePicker = new DatePicker(LocalDate.now());
        datePicker.setShowWeekNumbers(true);

        // Crear título
        Label titulo = new Label("Selector de fechas");
        titulo.setStyle("-fx-font-size: 18px; -fx-font-weight: bold;");

        // Layout principal
        BorderPane root = new BorderPane();
        root.setTop(titulo);
        BorderPane.setAlignment(titulo, Pos.CENTER); // Centrar título arriba
        root.setCenter(new StackPane(datePicker));

        Scene scene = new Scene(root, 600, 400);
        stage.setScene(scene);
        stage.setTitle("DatePicker con explicación");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
