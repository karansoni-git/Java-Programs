package com.example.javafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Grid_Pane extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        Button b1 = new Button("button 1");
        Button b2 = new Button("button 2");
        Button b3 = new Button("button 3");
        Button b4 = new Button("button 4");
        Button b5 = new Button("button 5");
        Button b6 = new Button("button 6");

        /*Arranges Nodes in a flexible grid layout with rows and columns.
        Nodes can span multiple rows or columns. */
        GridPane root = new GridPane();
      //root.add(element , column no , row no , columns span , rows span)
        root.add(b1,0,0 , 1  ,1);
        root.add(b2,1,0 , 1 , 1);
        root.add(b3,2,0 , 1 , 1);
        root.add(b4,0,1 , 1 , 1);
        root.add(b5,1,1 , 1 , 1);
        root.add(b6,2,1 , 1 , 1);

        root.setHgap(10); //set horizontal gap between cells
        root.setVgap(10); //set vertical gap between cells

        Scene scene = new Scene(root,500,500);
        stage.setScene(scene);
        stage.setTitle("GridPane");
        stage.show();
    }

}
