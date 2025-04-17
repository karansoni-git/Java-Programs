package com.example.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Mouse_Enter_Exit extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        Rectangle r = new Rectangle(200,200,150,150);
        r.setFill(Color.TRANSPARENT);
        r.setStroke(Color.BLACK);
        r.setStrokeWidth(4);

        r.setOnMouseEntered(e -> {
            r.setFill(Color.RED);
        });

        r.setOnMouseExited(e -> {
            r.setFill(Color.TRANSPARENT);
        });
        r.setOnMouseClicked(e -> {
            r.setFill(Color.GREEN);
        });


        Pane root = new Pane(r);
        Scene scene = new Scene(root,600,600);
        stage.setScene(scene);
        stage.setTitle("mouse enter and exit");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
