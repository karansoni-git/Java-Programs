package com.example.javafx;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class Tile_Pane extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Button b1 = new Button("Buttonn 1");
        Button b2 = new Button("Buttonn 2");
        Button b3 = new Button("Buttonn 3");
        Button b4 = new Button("Buttonn 4");
        Button b5 = new Button("Buttonn 5");
        Button b6 = new Button("Buttonn 6");

        //change the size of one cell will affect all cells of the layout.
        b1.setPrefSize(100,100);
//        b2.setPrefSize(150,150);
//        b3.setPrefSize(150,150);

        //set max size for all cells.
        b1.setMaxSize(100,100);
        b2.setMaxSize(100,100);
        b3.setMaxSize(100,100);
        b4.setMaxSize(100,100);
        b5.setMaxSize(100,100);
        b6.setMaxSize(100,100);


        /*TilePane is similar to FlowPane layout but the main difference between them is TilePane cells size
        is similar to all other cells it means if you change the size of one cell it will change all cells
        sizes*/

        TilePane root = new TilePane();
        root.getChildren().addAll(b1,b2,b3,b4,b5,b6);
        root.setOrientation(Orientation.VERTICAL);

        Scene scene = new Scene(root,400,400);
        stage.setScene(scene);
        stage.setTitle("TilePane");
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}
