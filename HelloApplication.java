package com.example.holamunfojavafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
        import javafx.scene.layout.*;
        import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    @Override
    public void start(Stage primaryStage) {

        TextField txtNombre = new TextField();
        TextField txtEdad = new TextField();

        ComboBox<String> comboRol = new ComboBox<>();
        comboRol.getItems().addAll("estudiante", "profesor", "admin");

        Button btnCrear = new Button("Crear");
        Label lblResultado = new Label();


        GridPane form = new GridPane();
        form.setPadding(new Insets(10));
        form.setVgap(10);
        form.setHgap(10);

        form.add(new Label("Nombre:"), 0, 0);
        form.add(txtNombre, 1, 0);

        form.add(new Label("Edad:"), 0, 1);
        form.add(txtEdad, 1, 1);

        form.add(new Label("Rol:"), 0, 2);
        form.add(comboRol, 1, 2);

        form.add(btnCrear, 1, 3);
        form.add(lblResultado, 1, 4);


        btnCrear.setOnAction(e -> {
            String nombre = txtNombre.getText();
            String edad = txtEdad.getText();
            String rol = comboRol.getValue();

            if (nombre.isEmpty() || edad.isEmpty() || rol == null) {
                lblResultado.setText("Por favor, completa todos los campos.");
                lblResultado.setTextFill(Color.RED);
                form.setStyle("");
            } else {

                form.setStyle("-fx-background-color: lightgreen;");
                lblResultado.setTextFill(Color.GREEN);


                lblResultado.setText("Nombre: " + nombre + ", Edad: " + edad + ", Rol: " + rol);
            }
        });


        Scene scene = new Scene(form, 400, 250);
        primaryStage.setTitle("Formulario con JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}