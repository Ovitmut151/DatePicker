package com.example.datepicker;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.time.LocalDate;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) {

        DatePicker datePicker = new DatePicker(LocalDate.now());
        datePicker.setShowWeekNumbers(true);


        Label titulo = new Label("Selector de fechas");
        titulo.setStyle("-fx-font-size: 18px; -fx-font-weight: bold;");


        Label mensaje = new Label("Selecciona una fecha...");


        datePicker.setOnAction(e -> {
            LocalDate fecha = datePicker.getValue();
            mensaje.setText("Has seleccionado: " + fecha);
        });


        VBox centro = new VBox(10, datePicker, mensaje);
        centro.setAlignment(Pos.CENTER);

        BorderPane root = new BorderPane();
        root.setTop(titulo);
        BorderPane.setAlignment(titulo, Pos.CENTER);
        root.setCenter(centro);

        Scene scene = new Scene(root, 600, 400);
        stage.setScene(scene);
        stage.setTitle("DatePicker con evento");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
