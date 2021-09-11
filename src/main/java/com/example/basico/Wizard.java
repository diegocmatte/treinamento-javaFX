package com.example.basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Wizard extends Application {

    private Stage janela;
    private Scene passo1;
    private Scene passo2;
    private Scene passo3;

    @Override
    public void start(Stage stage) throws Exception {
        janela = stage;

        criarPasso1();
        criarPasso2();
        criarPasso3();

        janela.setScene(passo1);
        janela.setTitle("Wizard :: Passo 1");
        janela.show();
    }

    private void criarPasso1(){
        Button proximoPasso = new Button("Ir p/ Passo 2 >>");

        proximoPasso.setOnAction(actionEvent -> {
            janela.setScene(passo2);
            janela.setTitle("Wizard :: Passo 2");
        });

        HBox box = new HBox();
        box.setAlignment(Pos.CENTER);
        box.getChildren().add(proximoPasso);

        passo1 = new Scene(box, 400, 400);
    }

    private void criarPasso2(){
        Button passoAnterior = new Button("<< Ir p/ Passo 1");
        passoAnterior.setOnAction(actionEvent -> {
            janela.setTitle("Wizard :: Passo 1");
            janela.setScene(passo1);
        });

        Button proximoPasso = new Button("Ir p/ Passo 3 >>");
        proximoPasso.setOnAction(actionEvent -> {
            janela.setTitle("Wizard :: Passo 3");
            janela.setScene(passo3);
        });

        HBox box = new HBox();
        box.setAlignment(Pos.CENTER);
        box.getChildren().add(passoAnterior);
        box.getChildren().add(proximoPasso);

        passo2 = new Scene(box, 400, 400);
    }

    private void criarPasso3(){
        Button passoAnterior = new Button("<< Ir p/ Passo 2");
        passoAnterior.setOnAction(actionEvent -> {
            janela.setTitle("Wizard :: Passo 2");
            janela.setScene(passo2);
        });

        Button proximoPasso = new Button("Finalizar");
        proximoPasso.setOnAction(actionEvent -> {
            System.exit(0);
        });

        HBox box = new HBox();
        box.setAlignment(Pos.CENTER);
        box.getChildren().add(passoAnterior);
        box.getChildren().add(proximoPasso);

        passo3 = new Scene(box, 400, 400);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
