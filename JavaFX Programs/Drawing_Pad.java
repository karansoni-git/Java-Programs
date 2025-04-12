package com.example.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Drawing_Pad extends Application {

    private int radius_Size = 3;

    @Override
    public void start(Stage stage) throws Exception {

        Pane root = new Pane();

        root.setOnMouseDragged(e -> {
            Circle c1 = new Circle(e.getX(), e.getY(), radius_Size);
            c1.setStroke(Color.BLACK);
            root.getChildren().add(c1);
        });

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Drawing Pad");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}

