package com.example.javafx;

import com.sun.source.util.ParameterNameProvider;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Animation extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        Circle c = new Circle(200,200,60);
        c.setFill(Color.YELLOWGREEN);
        c.setStroke(Color.BLACK);
        c.setStrokeWidth(4);

        Pane root = new Pane(c);

        TranslateTransition t = new TranslateTransition(); //create translate animation.l
        t.setDuration(Duration.seconds(0.7)); //set the completion time for animation.
        t.setNode(c); //set the animation on c node.
        t.setByY(140); //during animation the ball will move 140 px in y axis.
        t.setAutoReverse(true); //set animation reverse.
        t.setCycleCount(TranslateTransition.INDEFINITE); //set animation for infinite time.
        t.play(); //start the animation.

        Scene scene = new Scene(root,400,400);
        stage.setScene(scene);
        stage.setTitle("Animation of bouncing ball");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
