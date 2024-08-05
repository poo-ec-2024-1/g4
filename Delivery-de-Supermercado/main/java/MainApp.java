package main.java;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Carregar o arquivo FXML
        Parent root = FXMLLoader.load(getClass().getResource("/main/resources/main.fxml"));
        
        // Configurar a cena e o estágio
        primaryStage.setTitle("App de Delivery");
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.show();
    }

    public static void main(String[] args) {
        // Inicializar o banco de dados
        DatabaseManager.initializeDatabase();
        launch(args);
    }
}


