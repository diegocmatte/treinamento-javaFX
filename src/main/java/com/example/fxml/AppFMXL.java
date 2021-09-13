package com.example.fxml;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.net.URL;

public class AppFMXL extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        String arquivoCSS = getClass().getResource("/Login.css").toExternalForm();
        URL arquivoFXML = getClass().getResource("/Login.fxml");
        //FXMLLoader fxmlLoader = new FXMLLoader(AppFMXL.class.getResource("Login.fxml"));
        GridPane raiz = FXMLLoader.load(arquivoFXML);

        Scene cena = new Scene(raiz,350,350);
        cena.getStylesheets().add(arquivoCSS);

        stage.setResizable(false);
        stage.setScene(cena);
        stage.setTitle("Tela de Login");
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
