package com.example.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Circle_Center_Bind extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Circle c1 = new Circle(200,200,100);

        Pane root = new Pane();
        root.getChildren().add(c1);

        c1.centerXProperty().bind(root.widthProperty().divide(2));
        c1.centerYProperty().bind(root.heightProperty().divide(2));

        Scene scene = new Scene(root,400,400);
        stage.setScene(scene);
        stage.setTitle("Center The Circle");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
