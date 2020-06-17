package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import py4j.GatewayServer;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("GUI");
        primaryStage.setScene(new Scene(root, 1400
                , 750));
        primaryStage.show();
    }


    public static void main(String[] args) {
        Controller controller = new Controller();
        GatewayServer gatewayServer =  new GatewayServer(controller);
        gatewayServer.start();
        launch(args);
    }
}
