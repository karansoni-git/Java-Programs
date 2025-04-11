package com.example.javafx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.CubicCurve;
import javafx.stage.Stage;

public class CubicCurve_ extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        /*CubicCurve class is used to create a two curve in a line.you have to define 8 values for creating cubic curve
        provide that 8 values either in constructor or in separate methods.*/
        CubicCurve c1 = new CubicCurve(100,250,200,100,300,400,400,250);

//        c1.setStartX(100);
//        c1.setStartY(250);
//        c1.setControlX1(200);
//        c1.setControlY1(100);
//        c1.setControlX2(300);
//        c1.setControlY2(400);
//        c1.setEndX(400);
//        c1.setEndY(250);

        c1.setFill(Color.TRANSPARENT);
        c1.setStroke(Color.BLACK);
        c1.setStrokeWidth(5);

        Group root = new Group();
        root.getChildren().add(c1);

        Scene scene = new Scene(root,500,500);
        stage.setScene(scene);
        stage.setTitle("Cubic Curve");
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}
