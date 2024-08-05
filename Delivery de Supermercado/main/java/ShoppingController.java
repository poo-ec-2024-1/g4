package main.java;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.Scene;
import java.io.IOException;

public class ShoppingController {

    @FXML private TextField searchField;
    @FXML private ListView<String> productListView;
    @FXML private ListView<String> cartListView;

    @FXML
    private void initialize() {
        productListView.getItems().addAll("Produto 1", "Produto 2", "Produto 3");
    }

    @FXML
    private void handleAddToCartButtonAction() {
        String selectedItem = productListView.getSelectionModel().getSelectedItem();
        if (selectedItem != null) {
            cartListView.getItems().add(selectedItem);
        }
    }

    @FXML
    private void handleCheckoutButtonAction() throws IOException {
        VBox deliveryRoot = FXMLLoader.load(getClass().getResource("/main/resources/delivery.fxml"));
        Scene deliveryScene = new Scene(deliveryRoot, 800, 600);
        Stage currentStage = (Stage) cartListView.getScene().getWindow();
        currentStage.setScene(deliveryScene);
    }
}
