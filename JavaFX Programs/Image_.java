package com.example.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Image_ extends Application {

    @Override
    public void start(Stage primaryStage) {
        Image image = new Image("C:/Users/karan/Downloads/ff.png",400,400,true,true);

        // Create an ImageView
        ImageView imageView = new ImageView(image);

        Pane root = new Pane();
        root.getChildren().addLast(imageView);

        Scene scene = new Scene(root, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Image Example");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}