package ec.edu.espol.grupo_07;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import javafx.scene.image.Image;


public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("menu"));     
        stage.setScene(scene);
        stage.setResizable(false);
        stage.getIcons().add(new Image(App.class.getResourceAsStream("images/icon.png"))); 
        stage.setTitle("Proyecto Tic Tac Toe - GRUPO #"); 
        stage.show();
    }
    
    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }
    
    // Function to change scene 1
    public static void setRoot(FXMLLoader fxmlloader) throws IOException {
        scene.setRoot(fxmlloader.load());
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }
    
    // Function to change scene 2
    public static FXMLLoader loadFXMLLoader(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader;
    }

    public static void main(String[] args) {
        launch();
    }
    
}