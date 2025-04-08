package com.example.javafx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.stage.Stage;

public class Arc_ extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        Arc a1 = new Arc(300,300,100,100,0,200);

        // Represents a portion of an ellipse.
        //use this method to create Arc or use constructor and pass all necessary values to it.
//        a1.setCenterX();
//        a1.setCenterY();
//        a1.setRadiusX();
//        a1.setRadiusY();
//        a1.setStartAngle();
//        a1.setLength();

        a1.setFill(Color.RED);
        a1.setStroke(Color.BLUE);
        a1.setStrokeWidth(4);

        Group root = new Group();
        root.getChildren().add(a1);

        Scene scene = new Scene(root,600,600);
        stage.setScene(scene);
        stage.setTitle("Arc Shape");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
