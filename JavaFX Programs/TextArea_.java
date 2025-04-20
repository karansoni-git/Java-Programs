package com.example.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.awt.*;

public class TextArea_ extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        TextArea txt = new TextArea();
        txt.setPromptText("Enter Your Comment"); //Sets the hint text that appears when the text area is empty
        txt.setFocusTraversable(false);
        txt.setWrapText(true);  //Controls if the text automatically goes to the next line when it reaches the edge of the text area
        txt.setFont(Font.font("magneto",20));
        txt.getText(); //Retrieves the current text content of the text area.
//        txt.setText("this will be your comment section"); //Sets the text content of the text area
        txt.appendText("\nwrite from here"); //Adds the given text to the end of the current text
//        txt.clear(); //Removes all text from the text area.
//        txt.selectAll(); //Highlights all the text inside the text area
//        txt.setEditable(false); //Controls whether the user can type in the text area (true = editable, false = read-only)
//        txt.setScrollTop(); //Sets the vertical scroll position
//        txt.getScrollTop(); //Returns the vertical scroll position.

        VBox root = new VBox(txt);
        stage.setScene(new Scene(root,300,300));
        stage.setTitle("TextArea Control");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
