package com.example.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Anchor_Pane extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        Button b1 = new Button("button 1");
        Button b2 = new Button("button 2");
        Button b3 = new Button("button 3");
        Button b4 = new Button("button 4");
        Button b5 = new Button("button 5");

        /*AnchorPane is layout which is used when you want to poistion any elements based on the edges distance
        from the pane than you can use this layout called AnchorPane
        to set element position in pane use its edges like Top,Right,Bottom,Left.
        */
        AnchorPane root = new AnchorPane();
        //these all sides anchor mathods is static that why we use it with class name.
        AnchorPane.setTopAnchor(b1,10.0);
        AnchorPane.setLeftAnchor(b1,10.0);

        AnchorPane.setTopAnchor(b2,10.0);
        AnchorPane.setRightAnchor(b2,10.0);

        AnchorPane.setBottomAnchor(b3,10.0);
        AnchorPane.setLeftAnchor(b3,10.0);

        AnchorPane.setBottomAnchor(b4,10.0);
        AnchorPane.setRightAnchor(b4,10.0);

        AnchorPane.setTopAnchor(b5,180.0);
        AnchorPane.setLeftAnchor(b5,170.0);

        root.getChildren().addAll(b1,b2,b3,b4,b5);

        Scene scene = new Scene(root,400,400);
        stage.setScene(scene);
        stage.setTitle("AnchorPane");
        stage.show();

    }

    public static void main(String[] args) {
    launch();
    }
}
