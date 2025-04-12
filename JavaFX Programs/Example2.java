package com.example.javafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Example2 extends Application implements EventHandler <ActionEvent> {

    private Label l1,l2;
    private CheckBox c1,c2,c3;
    @Override
    public void start(Stage stage) throws Exception {

        l1 = new Label("Select Items:");
        l1.setFont(Font.font(15));

        c1 = new CheckBox("Pizza");
        c2 = new CheckBox("Burger");
        c3 = new CheckBox("Sandwich");

        c1.setFont(Font.font(16));
        c2.setFont(Font.font(16));
        c3.setFont(Font.font(16));

        l2 = new Label("Your Selected Items:");
        l2.setFont(Font.font(15));

        c1.setOnAction(this);
        c2.setOnAction(this);
        c3.setOnAction(this);

        VBox root = new VBox(15);
        root.getChildren().addAll(l1,c1,c2,c3,l2);

        Scene scene = new Scene(root,400,400);
        stage.setScene(scene);
        stage.setTitle("Checkbox Exercise");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void handle(ActionEvent actionEvent) {

        String str = "Your Selected Items:\n";
        if(c1.isSelected())
        {
            str += "Pizza is selected\n";
        }
        if(c2.isSelected())
        {
            str += "Burger is selected\n";
        }
        if(c3.isSelected())
        {
            str += "Sandwich is selected\n";
        }
        l2.setText(str);
    }
}
