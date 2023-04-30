package edu.guilford;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class HowSociallyVulnerable extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        //Instantiate a Vbox();
        VBox root = new VBox();
        //Instantiate a svidata object
        svidata svi = new svidata("John Doe", "123 Main St", "123-456-7890");

        //Instantiate a sviPane pane
        root.getChildren().add(new sviPane(svi));
        scene = new Scene(root, 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    // static void setRoot(String fxml) throws IOException {
    //     scene.setRoot(loadFXML(fxml));
    // }

    // private static Parent loadFXML(String fxml) throws IOException {
    //     FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
    //     return fxmlLoader.load();
    // }

    public static void main(String[] args) {
        launch();
    }

}