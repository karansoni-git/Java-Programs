package com.example.javafx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;

public class Polyline_ extends Application {
    @Override
    public void start(Stage stage) throws Exception {
    /*Polyline is very similar to the polygon but in polyline we explicitly have to connect the last line to starting point
    otherwise it's remain unconnected.*/

        Polyline p = new Polyline(100,200,300,400,50,400);
        p.setFill(Color.RED);
        p.setStroke(Color.BLACK);
        p.setStrokeWidth(5);

        Group root = new Group();
        root.getChildren().add(p);

        Scene scene = new Scene(root,600,600);
        stage.setScene(scene);
        stage.setTitle("Polyline Shape");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
