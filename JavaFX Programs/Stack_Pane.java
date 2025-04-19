package com.example.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.util.Random;

public class Stack_Pane extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Rectangle r1 = new Rectangle(200,200, Color.RED);
        Rectangle r2 = new Rectangle(150,150, Color.BLUE);
        Rectangle r3 = new Rectangle(100,100, Color.YELLOW);
        Rectangle r4 = new Rectangle(50,50  , Color.GREEN);

        /*bydefault stackpane shows all elements in center.*/
        StackPane root = new StackPane();
        root.getChildren().addAll(r1,r2,r3,r4);

        Scene scene = new Scene(root,400,400);
        stage.setScene(scene);
        stage.setTitle("StackPane");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
