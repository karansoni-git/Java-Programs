package com.example.javafx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Line_ extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        Line l = new Line(50,200,300,200);

        //these all methods work is for positioning the line in scene which we can also do in constructor.
//        l.setStartX(100);
//        l.setStartY(100);
//        l.setEndX(300);
//        l.setEndY(100);

        l.setStroke(Color.RED); //set the line color
        l.setStrokeWidth(4); //set the line width.
        l.setOpacity(0.6); //set transparency of the line.

        Group root = new Group();
        root.getChildren().add(l);

        Scene scene = new Scene(root,400,400);
        stage.setScene(scene);
        stage.setTitle("Line Shape");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
