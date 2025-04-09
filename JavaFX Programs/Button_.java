package com.example.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Button_ extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        Button b1= new Button("Click Me");//single parameterized constructor.
        b1.setFont(Font.font(18));
        b1.setTextFill(Color.CADETBLUE);

        Button b2 = new Button(); //default constructor.
        b2.setText("Button 2"); //set the text of button using method.

        ImageView iv = new ImageView(new Image("C:/Users/karan/Downloads/close.png"));
        Button b3 = new Button("CLOSE",iv);  //double parameterized constructor.
//        b3.setText("CLOSE");
//        b3.setGraphic(iv);
//        b3.setDisable(true); //disable the button click functionality.

        HBox root = new HBox(10);
        root.getChildren().addAll(b1,b2,b3);

        Scene scene = new Scene(root,400,400);
        stage.setScene(scene);
        stage.setTitle("Button Control");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
