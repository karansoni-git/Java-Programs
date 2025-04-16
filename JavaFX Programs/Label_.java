package com.example.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Label_ extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        Label l1 = new Label();//default constructor.
        l1.setText("this is text");
        l1.setFont(Font.font(18));
        l1.setUnderline(true);

        Label l2 = new Label("this is second label"); //single parameterized constructor.
        l2.setTextFill(Color.CYAN);

        ImageView iv = new ImageView(new Image("C:/Users/karan/Downloads/close.png"));
        Label l3 = new Label("Close",iv); //double parameterized constructor.
        l3.setFont(Font.font(15));
//        Label l3 = new Label();
//        l3.setText("CLOSE");
//        l3.setGraphic(iv);

        VBox root = new VBox(8);
        root.getChildren().addAll(l1,l2,l3);

        Scene scene = new Scene(root,300,300);
        stage.setScene(scene);
        stage.setTitle("Label Control");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
