package com.example.javafx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Text_ extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        /*Text class is used to show a text in a scene by default text position is set to 0,0 x,y we manually have to set
        the position of the text in constructor and we give the text that we want to show in scene.*/
        Text t1 = new Text(10,50,"this is a sample text");
        t1.setFill(Color.GREEN); //set the color of the text.
        t1.setStroke(Color.RED); //set the border and the color of the border.
        t1.setStrokeWidth(0.4); //set the border width in pixels.
        t1.setFont(Font.font("magneto",40)); //set the font style and font size.
//        t1.setUnderline(true); //set under line to the text.
//        t1.setStrikethrough(true); //set the strike through effect to text.
        Group root = new Group();
        root.getChildren().add(t1);

        Scene scene = new Scene(root,500,400);
        stage.setScene(scene);
        stage.setTitle("Text Class");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
