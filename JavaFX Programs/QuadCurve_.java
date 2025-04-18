package com.example.javafx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.QuadCurve;
import javafx.stage.Stage;

public class QuadCurve_ extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        /*QudeCurve class is used to set curve in line we have to 6 value in constructor to create curve or
        you can do it by specifying the method for each value. */
        QuadCurve q1 = new QuadCurve(100,200,200,50,300,200);

//        q1.setStartX(100);
//        q1.setStartY(200);
//        q1.setControlX(200);
//        q1.setControlY(50);
//        q1.setEndX(300);
//        q1.setEndY(200);

        q1.setFill(Color.TRANSPARENT);
        q1.setStroke(Color.BLUE);
        q1.setStrokeWidth(3);

        Group root = new Group();
        root.getChildren().add(q1);

        Scene scene = new Scene(root,400,400);
        stage.setScene(scene);
        stage.setTitle("QuadCurve");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
