package com.example.javafx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Circle_ extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        //                    x-axis , y-axis , radius
        Circle c1 = new Circle(300,300 ,100);

        /* these all methods are used to create circle in layout with values => position of
        circle in x and y axis and radius of circle */
//        c1.setCenterX();
//        c1.setCenterY();
//        c1.setRadius();
        c1.setFill(Color.YELLOWGREEN);
        c1.setStroke(Color.BROWN);
        c1.setStrokeWidth(6);

        Group root = new Group();
        root.getChildren().add(c1);

        Scene scene = new Scene(root,600,600);
        stage.setScene(scene);
        stage.setTitle("Circle Shape");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
