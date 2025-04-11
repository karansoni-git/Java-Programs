package com.example.javafx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Drag_Event extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        Circle c1 = new Circle(100,100,50);
        c1.setFill(Color.BLUE);
        c1.setStroke(Color.BLACK);
        c1.setStrokeWidth(4);

        c1.setOnMouseDragged(event -> {
            c1.setCenterX(event.getX());
            c1.setCenterY(event.getY());
        });

        Group root = new Group(c1);
        Scene scene = new Scene(root,500,500);
        stage.setScene(scene);
        stage.setTitle("Drag And Drop Example");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
