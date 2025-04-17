package com.example.javafx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class Polygon_ extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        /*Polygon class is used to draw any shape in layout. we do not need to joint last line to start position it will
        automatically do*/
        Polygon shape = new Polygon(100,200,300,400,50,400);
        shape.setFill(Color.RED);
        shape.setStroke(Color.BLUE);
        shape.setStrokeWidth(4);

        Group root = new Group();
        root.getChildren().add(shape);

        Scene scene = new Scene(root,600,600);
        stage.setScene(scene);
        stage.setTitle("Polygon Shape");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
