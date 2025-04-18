package com.example.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class RadioButton_ extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        ImageView iv = new ImageView(new Image("C:/Users/karan/Downloads/close.png"));

        //create three radio buttons
        RadioButton r1 = new RadioButton("Male");
        RadioButton r2 = new RadioButton("Female");
        RadioButton r3 = new RadioButton("Other");

//        r1.isSelected(); //Returns true if the radio button is selected
//        r1.setSelected(true); //Sets the selected state of the radio button
//        r1.fire(); //Simulates a user click, toggling the radio button's state
//        r1.getText(); //Gets the text displayed next to the radio button.
//        r1.setText("Gents"); //Sets the text displayed next to the radio button
//        r1.getGraphic(); //Gets the graphic displayed in the radio button
//        r1.setGraphic(iv); //Sets the graphic displayed in the radio button
//        r1.setDisable(true); //Sets whether this Node is disabled
//        r1.isDisabled(); //Sets whether this Node is disabled
//        r1.setVisible(false); //Sets whether this Node is visible
//        r1.isVisible(); //Returns whether this Node is visible

        r1.setFont(Font.font(16));
        r2.setFont(Font.font(16));
        r3.setFont(Font.font(16));

        //for select only one radio button create toggle group and set every radiobutton in toggle group.
        ToggleGroup tg = new ToggleGroup();
        r1.setToggleGroup(tg);
        r2.setToggleGroup(tg);
        r3.setToggleGroup(tg);

//        r1.getToggleGroup(); //Gets the ToggleGroup to which the radio button belongs

        VBox root = new VBox();
        root.getChildren().addAll(r1,r2,r3);

        Scene scene = new Scene(root,300,300);
        stage.setScene(scene);
        stage.setTitle("RadioButton Control");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
