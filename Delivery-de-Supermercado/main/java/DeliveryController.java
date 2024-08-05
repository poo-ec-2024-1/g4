
package main.java;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class DeliveryController {

    @FXML private TextField addressField;

    @FXML
    private void handleSubmitButtonAction() {
        String address = addressField.getText();
        System.out.println("Endereço registrado: " + address);
        System.out.println("Seu pedido está a caminho.");
    }
}
