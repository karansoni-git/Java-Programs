package com.example.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Border_Pane extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        Button b1 = new Button("button 1");
        Button b2 = new Button("button 2");
        Button b3 = new Button("button 3");
        Button b4 = new Button("button 4");
        Button b5 = new Button("button 5");
        b1.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);
        b2.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);
        b3.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);
        b4.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);
        b5.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);


        BorderPane root = new BorderPane();
        root.setTop(b1);
        root.setRight(b2);
        root.setBottom(b3);
        root.setLeft(b4);
        root.setCenter(b5);

        Scene scene  = new Scene(root,600,400);
        stage.setScene(scene);
        stage.setTitle("BorderPane");
        stage.show();
    }
}
