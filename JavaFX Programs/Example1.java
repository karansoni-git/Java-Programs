package com.example.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Example1 extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        Pane root = new Pane();
        root.setOnMouseClicked(e -> {
            Circle c1 = new Circle(e.getX(), e.getY(), 10, Color.RED);
            c1.setStroke(Color.BLACK);
            c1.setStrokeWidth(3);
            root.getChildren().add(c1);
        });

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Example of Circle creation");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
