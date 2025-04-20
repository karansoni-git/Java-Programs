package com.example.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class TextField_ extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        TextField t1 = new TextField();
        t1.setFont(Font.font(18));

        t1.setPromptText("enter your name");
        t1.setFocusTraversable(false);
//        t1.getText(); //Returns the current text content of the text field
        t1.setText("karan soni"); //Sets the text content of the text field
//        t1.replaceSelection("karan parekh");
//        t1.replaceText(6,10,"parekh");
//        t1.positionCaret(6);
//        t1.selectRange(6,10);
//        t1.appendText(" sanjaybhai");
//        t1.getCaretPosition();
//        t1.selectAll(); //Selects all the text in the text field.
//        t1.clear(); //Clears the text content of the text field.
//        t1.setEditable(false); //Sets whether this Node is disabled.
//        t1.isEditable(); //is editable or not.
//        t1.getSelectedText(); //Returns the currently selected text
//        t1.setDisable(true);  //Sets whether this Node is disabled
//        t1.isDisabled(); //Returns whether this Node is disabled
//        t1.setVisible(false); //Sets whether this Node is visible.
//        t1.isVisible(); //is visible or not.
//        t1.requestFocus(); //Requests that this Node get input focus


//        TextField t2 = new TextField("enter your name");
//        t2.setFocusTraversable(false);


        VBox root = new VBox(10);
        root.getChildren().addAll(t1);


        Scene scene = new Scene(root,300,300);
        stage.setScene(scene);
        stage.setTitle("TextField Control");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
