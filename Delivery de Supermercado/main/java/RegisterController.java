package main.java;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class RegisterController {

    @FXML
    private TextField usernameField;

    @FXML
    private TextField passwordField;

    @FXML
    private void handleRegisterButtonAction() {
        String username = usernameField.getText();
        String password = passwordField.getText();

        // Validações de entrada
        if (!username.isEmpty() && !password.isEmpty()) {
            boolean success = DatabaseManager.insertUser(username, password);
            if (success) {
                showAlert(AlertType.INFORMATION, "Registro bem-sucedido", "O Registro foi bem-sucedido!");
                usernameField.clear();
                passwordField.clear();
            } else {
                showAlert(AlertType.ERROR, "Erro no Registro", "Falha ao registrar o usuário.");
            }
        } else {
            showAlert(AlertType.WARNING, "Campos Inválidos", "Por favor, preencha todos os campos.");
        }
    }

    @FXML
    private void handleGoToShoppingButtonAction() throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/main/resources/shopping.fxml"));
        VBox shoppingRoot = loader.load();
        Scene shoppingScene = new Scene(shoppingRoot, 800, 600);
        Stage currentStage = (Stage) usernameField.getScene().getWindow();
        currentStage.setScene(shoppingScene);
    }

    private void showAlert(AlertType type, String title, String message) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}



















