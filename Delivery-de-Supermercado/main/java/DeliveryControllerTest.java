package main.java;

import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.testfx.framework.junit5.ApplicationTest;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class DeliveryControllerTest extends ApplicationTest {

    private DeliveryController controller;
    private TextField addressField;

    @Override
    public void start(Stage stage) {
        // Cria a interface para o teste
        addressField = new TextField();
        Button submitButton = new Button("Submit");

        // Inicializa o controller
        controller = new DeliveryController();
        controller.addressField = addressField;
        submitButton.setOnAction(event -> controller.handleSubmitButtonAction());

        VBox vbox = new VBox(addressField, submitButton);
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
    public void testHandleSubmitButtonAction() {
        // Configura o campo de texto
        addressField.setText("Setor Oeste, Rua 9");

        // Redireciona a saída padrão para um ByteArrayOutputStream para capturar a saída do console
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        // Chama o método a ser testado
        clickOn("Submit");

        // Espera um pouco para garantir que o evento de clique foi processado
        try {
            Thread.sleep(500); // Ajuste o tempo conforme necessário
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Verifica a saída do console
        String expectedOutput = "Endereço registrado: Setor Oeste, Rua 9\nSeu pedido está a caminho.";
        String actualOutput = outContent.toString().replace("\r\n", "\n").trim();

        assertEquals(expectedOutput, actualOutput);

        // Restaura a saída padrão
        System.setOut(originalOut);
    }
}
