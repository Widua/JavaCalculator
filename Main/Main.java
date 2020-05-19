package Main;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setTitle("Calc");
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setResizable(false);
        primaryStage.getIcons().add(new Image("Images/Icon.png"));
        primaryStage.setOnCloseRequest((e) -> {CloseProgram();} );
    }


    public static void main(String[] args) { launch(args); }


// Exit program

    public static void CloseProgram(){
        Platform.exit();
        System.exit(0);
    }
}