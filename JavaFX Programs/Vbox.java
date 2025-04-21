package com.example.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Vbox extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Button b1 = new Button("Button 1");
        Button b2 = new Button("Button 2");
        Button b3 = new Button("Button 3");
        Button b4 = new Button("Button 4");
        Button b5 = new Button("Button 5");
        Button b6 = new Button("Button 6");

        b1.setPrefSize(100,100);
        b2.setPrefSize(100,100);
        b3.setPrefSize(100,100);
        b4.setPrefSize(100,100);
        b5.setPrefSize(100,100);
        b6.setPrefSize(100,100);


        b1.setMaxSize(Double.MAX_VALUE , Double.MAX_VALUE);
        b2.setMaxSize(Double.MAX_VALUE , Double.MAX_VALUE);
        b3.setMaxSize(Double.MAX_VALUE , Double.MAX_VALUE);
        b4.setMaxSize(Double.MAX_VALUE , Double.MAX_VALUE);
        b5.setMaxSize(Double.MAX_VALUE , Double.MAX_VALUE);
        b6.setMaxSize(Double.MAX_VALUE , Double.MAX_VALUE);

        b1.setMinSize(100,50);
        b2.setMinSize(100,50);
        b3.setMinSize(100,50);
        b4.setMinSize(100,50);
        b5.setMinSize(100,50);
        b6.setMinSize(100,50);

        VBox root = new VBox();
        root.getChildren().addAll(b1,b2,b3,b4,b5,b6);

        Scene scene = new Scene(root ,600 ,600);
        stage.setScene(scene);
        stage.setTitle("Vbox");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
