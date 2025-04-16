package com.example.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Mouse_Coordinates extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Button b1 = new Button("Hover Here");
        b1.setPrefSize(Double.MAX_VALUE , Double.MAX_VALUE);
        b1.setTextFill(Color.RED);
        b1.setFont(Font.font(12));

        b1.setOnMouseMoved(e -> {
            b1.setText("x: " + e.getX() + " y: " + e.getY());
         });

        b1.setOnMouseClicked(e -> {
            b1.setText("button clicked is : " + e.getButton());
//            b1.setText("click count : " + e.getClickCount());
        });


        StackPane root = new StackPane(b1);

        Scene scene = new Scene(root,600,600);
        stage.setScene(scene);
        stage.setTitle("show the coordinates");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
