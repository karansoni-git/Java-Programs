package com.example.javafx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Rectangle_ extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        Rectangle r = new Rectangle(100,100,200,200);

        //these all methods is used to create a rectangle but we can give this value in constructor and create it
//        r.setX();
//        r.setY();
//        r.setWidth();
//        r.setHeight();

        r.setFill(Color.BLUE);//set color of the rect.
        r.setStroke(Color.BLACK); //set the border and color.
        r.setStrokeWidth(4);//set border width.
        r.setArcWidth(20);//set the radius of the rect of x axis.
        r.setArcHeight(20);//set the radius of the rect of y axis.

        Group root = new Group();
        root.getChildren().add(r);

        Scene scene = new Scene(root,400,400);
        stage.setScene(scene);
        stage.setTitle("Rectangle Shape");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
