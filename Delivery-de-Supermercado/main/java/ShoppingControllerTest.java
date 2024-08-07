package main.java;

import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.testfx.framework.junit5.ApplicationTest;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class ShoppingControllerTest extends ApplicationTest {

    private ShoppingController controller;
    private TextField searchField;
    private ListView<String> productListView;
    private ListView<String> cartListView;
    private Button addToCartButton;
    private Button checkoutButton;

    @Override
    public void start(Stage stage) {
        // Cria a interface para o teste
        searchField = new TextField();
        productListView = new ListView<>();
        cartListView = new ListView<>();
        addToCartButton = new Button("Add to Cart");
        checkoutButton = new Button("Checkout");

        // Adiciona alguns itens ao productListView
        productListView.getItems().addAll("Produto 1", "Produto 2", "Produto 3");

        // Inicializa o controller
        controller = new ShoppingController();
        controller.searchField = searchField;
        controller.productListView = productListView;
        controller.cartListView = cartListView;

        addToCartButton.setOnAction(event -> controller.handleAddToCartButtonAction());
        checkoutButton.setOnAction(event -> {
            try {
                controller.handleCheckoutButtonAction();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        VBox vbox = new VBox(searchField, productListView, cartListView, addToCartButton, checkoutButton);
        stage.setScene(new Scene(vbox));
        stage.show();
    }

    @BeforeEach
    public void setUp() {
        // Inicializa a plataforma JavaFX antes de cada teste
        Platform.runLater(() -> {
            // Configuração adicional necessária
            controller.initialize();
        });
        // Espera a execução do código acima
        try {
            Thread.sleep(500); // Ajuste o tempo conforme necessário
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testHandleAddToCartButtonAction() {
        Platform.runLater(() -> {
            productListView.getSelectionModel().select(0); // Seleciona o primeiro produto
        });
        
        // Espera um pouco para garantir que a seleção foi processada
        try {
            Thread.sleep(500); // Ajuste o tempo conforme necessário
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Platform.runLater(() -> {
            addToCartButton.fire(); // Use fire() ao invés de clickOn() para simular o clique
        });
        
        // Espera um pouco para garantir que o evento de clique foi processado
        try {
            Thread.sleep(500); // Ajuste o tempo conforme necessário
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Verifica se o item foi adicionado ao carrinho
        assertEquals(1, cartListView.getItems().size());
        assertEquals("Produto 1", cartListView.getItems().get(0));
    }

    @Test
    public void testHandleCheckoutButtonAction() {
        // Este teste pode ser mais complexo devido à mudança de cena
        // Você pode verificar se o método foi chamado corretamente
        // ou usar mocks para testar a troca de cenas
    }
}