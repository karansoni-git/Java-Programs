package com.example.javafx;

import javafx.application.Application;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.SingleSelectionModel;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ComboBox_ extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        StackPane root = new StackPane();

        ObservableList <String> games = FXCollections.observableArrayList("Pubg","Free Fire","Call Of Duty","Game For Piece",
                "Mini Military","Zombie catcher");
        ComboBox <String> gname = new ComboBox<>(games);
        gname.setEditable(true); //Sets whether the ComboBox is editable, allowing users to type in a value.
        gname.setPromptText("Favourite Game");  //Sets the prompt text displayed when no item is selected.
        gname.setFocusTraversable(false);
        gname.setVisibleRowCount(3);

//        gname.getValue(); //Returns the currently selected item.
//        gname.setValue("Beach Buggy"); //Sets the currently selected item
//        gname.setVisible(false);
//        gname.getSelectionModel(); //Provides access to the selection model, which allows for more advanced selection operations
//        gname.getItems(); //Returns the observable list of items in the ComboBox.
//        gname.setItems(); //Sets the observable list of items in the ComboBox
//        gname.setDisable(true); //Sets whether this Node is disabled.
//        gname.isDisabled(); //Returns whether this Node is disabled
//        gname.setVisible(false); //Sets whether this Node is visible
//        gname.isVisible(); //Returns whether this Node is visible
//        gname.requestFocus(); //Requests that this Node get input focus

//        ComboBox gname = new ComboBox<>(FXCollections.observableArrayList("ram","shyam","jay","laxman"));
//        gname.getItems().add("naman");

        root.getChildren().addAll(gname);
        stage.setScene(new Scene(root,400,400));
        stage.setTitle("ComboBox Control");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
