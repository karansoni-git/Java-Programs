package com.example.javafx;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ListView_ extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        StackPane root = new StackPane();

        ListView <String> names= new ListView<>
                (FXCollections.observableArrayList("karan","krish","nishit","dhruvil","tirth","vedant","anant"));
        names.getItems().add("somya");
//        names.setItems();
//        names.getSelectionModel();
//        names.getCellFactory();
//        names.setCellFactory();
//        names.setEditable(true);
//        names.scrollTo();
//        names.isEditable();
//        names.setVisible(false);
//        names.isVisible();
//        names.setDisable(true);
//        names.isDisabled();
        names.scrollTo(4);

        root.getChildren().addAll(names);
        stage.setScene(new Scene(root,400,400));
        stage.setTitle("ComboBox Control");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
