package com.example.javafx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

public class Ellipse_ extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        Ellipse e1 = new Ellipse(300,300,100,150);

        //these all methods are used to create ellipse shape in layout or do with help of constructor.
//        e1.setCenterX(300);
//        e1.setCenterY(300);
//        e1.setRadiusX(100);
//        e1.setRadiusY(150);

        e1.setFill(Color.CYAN);
        e1.setStroke(Color.YELLOW);
        e1.setStrokeWidth(5);

        Group root = new Group();
        root.getChildren().add(e1);

        Scene scene = new Scene(root,600,600);
        stage.setScene(scene);
        stage.setTitle("Ellipse Shape");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
