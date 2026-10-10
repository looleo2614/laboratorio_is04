package com.saludador;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        Label titulo = new Label("Sistema Saludador ദ്ദി(˵ •̀ ᴗ - ˵) ✧");
        titulo.setStyle(
            "-fx-text-fill: #cf3273;"+
            "-fx-font-size: 16px;"+
            "-fx-font-weight: bold;"
        );

        Label nombreLabel = new Label("Ingresa tu nombre:");
        nombreLabel.setStyle(
            "-fx-text-fill: #cf3273;"+
            "-fx-font-style: italic;"
        );
        TextField nombreField = new TextField();
        nombreField.setPromptText("Escribe tu nombre");

        Label edadLabel = new Label("Ingresa tu edad:");
        edadLabel.setStyle(
            "-fx-text-fill: #cf3273;"+
            "-fx-font-style: italic;"
        );
        TextField edadField = new TextField();
        edadField.setPromptText("Escribe tu edad");

        Label horarioLabel = new Label("Selecciona el horario:");
        horarioLabel.setStyle(
            "-fx-text-fill: #cf3273;"+
            "-fx-font-style: italic;"
        );
        ComboBox<String> horarioCombo = new ComboBox<>();
        horarioCombo.getItems().addAll("Mañana (AM)", "Tarde (PM)");
        horarioCombo.setValue("Mañana (AM)");
        horarioCombo.setMaxWidth(Double.MAX_VALUE);
        horarioCombo.setStyle(
             "-fx-background-color: #fffadd;" +
            "-fx-font-size: 14px;" +
            "-fx-font-style: italic;" +
            "-fx-font-weight: bold;" +
            "-fx-background-radius: 8px;"
        );

        Button saludoButton = new Button("Solicitar saludo ◝(ᵔᵕᵔ)◜");
        Label resultadoLabel = new Label();
        saludoButton.setStyle(
            "-fx-background-color: #cf3273;" +
            "-fx-text-fill: white;" +
            "-fx-font-size: 14px;" +
            "-fx-font-weight: bold;" +
            "-fx-background-radius: 10px;" +
            "-fx-padding: 10px 20px;" +
            "-fx-cursor: default;"
        );
        resultadoLabel.setStyle(
            "-fx-text-fill: #cc004e;"+
            "-fx-font-size: 14px;"+
            "-fx-font-style: italic;"
        );

        saludoButton.setOnAction(event -> {
            String nombre = nombreField.getText().trim();
            String edadTexto = edadField.getText().trim();
            String horario = horarioCombo.getValue();

            if (nombre.isEmpty()) {
                resultadoLabel.setText("Por favor, ingresa tu nombre.");
                return;
            }

            if (edadTexto.isEmpty()) {
                resultadoLabel.setText("Por favor, ingresa tu edad.");
                return;
            }

            int edad;

            try {
                edad = Integer.parseInt(edadTexto);
            } catch (NumberFormatException e) {
                resultadoLabel.setText("La edad debe ser un número entero.");
                return;
            }

            if (edad < 0) {
                resultadoLabel.setText("La edad no puede ser negativa.");
                return;
            }

            String saludo;

            if ("Mañana (AM)".equals(horario)) {
                saludo = "¡Buenos días, " + nombre + "!";
            } else {
                saludo = "¡Buenas tardes, " + nombre + "!";
            }

            resultadoLabel.setText(
                saludo + "\nTu edad es: " + edad + " años."
            );
        });

        VBox layout = new VBox(
            10,
            titulo,
            nombreLabel,
            nombreField,
            edadLabel,
            edadField,
            horarioLabel,
            horarioCombo,
            saludoButton,
            resultadoLabel
        );

        layout.setPadding(new Insets(20));
        layout.setStyle("-fx-background-color: #fbe8ff;");

        Scene scene = new Scene(layout, 350, 400);

        stage.setTitle("Sistema Saludador");
        stage.setScene(scene);
        stage.setMinWidth(350);
        stage.setMinHeight(400);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}