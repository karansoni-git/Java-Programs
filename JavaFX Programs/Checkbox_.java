package com.example.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.awt.*;

public class Checkbox_ extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        CheckBox c1 = new CheckBox("Pizza");
//        c1.setText("pizza");
        c1.setFont(Font.font(16));
//        c1.isSelected(); //Returns true if the checkbox is selected.
//        c1.setSelected(true); //Sets the selected state of the checkbox.

//        c1.setIndeterminate(true); //Sets the checkbox to an indeterminate (mixed) state.
//        c1.isIndeterminate(); //returns if the checkbox is in the indeterminate state.

//        c1.setAllowIndeterminate(true); //Determines whether the checkbox can enter the indeterminate state.
//        c1.isAllowIndeterminate(); //returns if the checkbox can have // the indeterminate state.

//        c1.fire(); //Simulates a user click, toggling the checkbox's state

        VBox root = new VBox(20);
//        root.setSpacing(20);
        root.getChildren().add(c1);

        Scene scene = new Scene(root,300,300);
        stage.setScene(scene);
        stage.setTitle("Checkbox Control");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
