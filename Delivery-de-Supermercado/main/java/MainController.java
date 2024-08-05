
package main.java;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainController {

    @FXML
    private void showRegister() throws Exception {
        Stage stage = new Stage();
        VBox root = FXMLLoader.load(getClass().getResource("/main/resources/register.fxml"));
        stage.setScene(new Scene(root));
        stage.setTitle("Registro");
        stage.show();
    }

    @FXML
    private void showShopping() throws Exception {
        Stage stage = new Stage();
        VBox root = FXMLLoader.load(getClass().getResource("/main/resources/shopping.fxml"));
        stage.setScene(new Scene(root));
        stage.setTitle("Carrinho");
        stage.show();
    }

    @FXML
    private void showDelivery() throws Exception {
        Stage stage = new Stage();
        VBox root = FXMLLoader.load(getClass().getResource("/main/resources/delivery.fxml"));
        stage.setScene(new Scene(root));
        stage.setTitle("Delivery");
        stage.show();
    }
}
