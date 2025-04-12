package com.example.javafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.LightBase;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Event_ extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Label l1 = new Label("Button will be clicked");
        Button b1= new Button("Click me");

        //set creating event by anonymous inner class
        b1.setOnAction(new EventHandler<ActionEvent> () {
            @Override
            public void handle(ActionEvent actionEvent) {
                l1.setText("Button was clicked");
                l1.setFont(Font.font(20));
                l1.setTextFill(Color.RED);
            }
        });

        //set event with lambda expression.this event will start when your mouse enter on the button area.
        b1.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                l1.setText("I'm hovered");
                l1.setFont(Font.font(15));
                l1.setTextFill(Color.GREEN);
            }
        });

        VBox root = new VBox(15);
        root.getChildren().addAll(l1,b1);

        Scene scene = new Scene(root,300,300);
        stage.setScene(scene);
        stage.setTitle("Event Example");
        stage.show();
    }

    public static void main(String[] args) {
    launch();
    }
}
