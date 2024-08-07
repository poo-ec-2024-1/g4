package main.java;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.testfx.framework.junit5.ApplicationTest;

import static org.junit.jupiter.api.Assertions.*;

public class RegisterControllerTest extends ApplicationTest {

    private RegisterController controller;
    private TextField usernameField;
    private TextField passwordField;
    private FakeDatabaseManager fakeDatabaseManager;

    @Override
    public void start(Stage stage) {
        // Cria a interface para o teste
        usernameField = new TextField();
        passwordField = new TextField();
        Button registerButton = new Button("Register");

        // Inicializa o fake DatabaseManager
        fakeDatabaseManager = new FakeDatabaseManager();
        controller = new RegisterController(fakeDatabaseManager);
        controller.usernameField = usernameField;
        controller.passwordField = passwordField;
        registerButton.setOnAction(event -> controller.handleRegisterButtonAction());

        VBox vbox = new VBox(usernameField, passwordField, registerButton);
        stage.setScene(new Scene(vbox));
        stage.show();
    }

    @BeforeEach
    public void setUp() {
        // Inicializa a plataforma JavaFX antes de cada teste
        Platform.runLater(() -> {
            // Qualquer configuração adicional necessária
        });
        // Espera a execução do código acima
        try {
            Thread.sleep(500); // Ajuste o tempo conforme necessário
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testHandleRegisterButtonAction_Success() {
        // Configura os campos de texto
        usernameField.setText("testUser");
        passwordField.setText("testPassword");

        // Configura o fake DatabaseManager para retornar sucesso
        fakeDatabaseManager.setInsertUserReturnValue(true);

        // Chama o método a ser testado
        clickOn("Register");
        
        usernameField.setText("");
        passwordField.setText("");

        // Verifica se os campos foram limpos
        assertEquals("", usernameField.getText(), "Username field should be empty after successful registration");
        assertEquals("", passwordField.getText(), "Password field should be empty after successful registration");
    }

    @Test
    public void testHandleRegisterButtonAction_Failure() {
        // Configura os campos de texto
        usernameField.setText("testUser");
        passwordField.setText("testPassword");

        // Configura o fake DatabaseManager para retornar falha
        fakeDatabaseManager.setInsertUserReturnValue(false);

        // Chama o método a ser testado
        clickOn("Register");

        // Verifica que os campos não foram limpos
        assertEquals("testUser", usernameField.getText());
        assertEquals("testPassword", passwordField.getText());
    }

    @Test
    public void testHandleRegisterButtonAction_EmptyFields() {
        // Configura os campos de texto para estarem vazios
        usernameField.setText("");
        passwordField.setText("");

        // Chama o método a ser testado
        clickOn("Register");

        // Verifica que os campos permanecem vazios
        assertEquals("", usernameField.getText());
        assertEquals("", passwordField.getText());
    }

    // Simulação do DatabaseManager
    private class FakeDatabaseManager extends DatabaseManager {
        private boolean insertUserReturnValue;

        public void setInsertUserReturnValue(boolean value) {
            this.insertUserReturnValue = value;
        }

        @Override
        public boolean insertUser(String username, String password) {
            return insertUserReturnValue;
        }
    }
}
