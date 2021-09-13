package com.example.fxml;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import org.controlsfx.control.Notifications;

public class LoginControlador {

    @FXML
    private TextField campoEmail;

    @FXML
    private PasswordField campoSenha;

    public void entrar(){
        boolean emailValido = campoEmail.getText().equals("teste@teste.com.br");
        boolean senhaValida = campoSenha.getText().equals("123456");

        if(emailValido && senhaValida){
            Notifications.create()
                    .position(Pos.CENTER)
                    .title("Login FXML")
                    .text("Login efetuado com sucesso")
                    .showInformation();
        } else {
            Notifications.create()
                    .position(Pos.CENTER)
                    .title("Login FXML")
                    .text("Usuário/senha inválidos")
                    .showError();
        }

    }
}
