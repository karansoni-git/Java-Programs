package com.example.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Binding extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        TextField t1 = new TextField();
        Label l1 = new Label("this is a text");

        VBox root = new VBox(10);
        root.getChildren().addAll(t1,l1);

        /*bind() method bind one element property to another element property and these binded elements react according to
        each other. */
        l1.textProperty().bind(t1.textProperty());

        Scene scene = new Scene(root,400,400);
        stage.setScene(scene);
        stage.setTitle("single binding");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
