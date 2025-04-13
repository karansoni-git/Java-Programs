package com.example.javafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.concurrent.Flow;

public class Flow_Pane extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        Button  b1 = new Button("button 1");
        Button  b2 = new Button("button 2");
        Button  b3 = new Button("button 3");
        Button  b4 = new Button("button 4");
        Button  b5 = new Button("button 5");
        Button  b6 = new Button("button 6");

        b1.setMaxSize(100,100);
        b2.setMaxSize(100,100);
        b3.setMaxSize(100,100);
        b4.setMaxSize(100,100);
        b5.setMaxSize(100,100);
        b6.setMaxSize(100,100);

        FlowPane root = new FlowPane();
        root.getChildren().addAll(b1,b2,b3,b4,b5,b6);

        /*orientation decide in which manner new element will be arranged in layout if it is horizontal
        then new element will add on new line while if it is a vertical new element will be added to
         the new column.*/

        root.setOrientation(Orientation.HORIZONTAL);
//        root.setOrientation(Orientation.VERTICAL);

        root.setPadding(new Insets(10));//add padding to layout

        Scene scene = new Scene(root,300,400);
        stage.setScene(scene);
        stage.setTitle("FlowPane");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
