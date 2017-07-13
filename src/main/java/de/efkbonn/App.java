package de.efkbonn;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
/**
 * Hello world!
 *
 */
public class App extends Application {

    public static void main( String[] args ) {
        launch(args);
    }


    public void start(Stage primaryStage) throws Exception {


        GridPane grid =(GridPane) FXMLLoader.load(getClass().getResource("EFK_Login.fxml"));


        Scene scene = new Scene(grid);

        primaryStage.setScene(scene);

        primaryStage.show();
    }
}
