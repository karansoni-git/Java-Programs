package com.example.javafx;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Slider_ extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        Slider s = new Slider();
        s.setMin(0); //Sets the minimum value of the slider
        s.setMax(100); //Sets the maximum value of the slider
        s.setValue(40); //Sets the current value of the slider
        s.setShowTickLabels(true); //shows the tick labels in slider
        s.setShowTickMarks(true); //shows the tick marks in slider

        s.setMajorTickUnit(10); //Sets the interval between major tick marks.
        s.setMinorTickCount(4); //Sets the number of minor tick marks between major tick marks.
        s.setSnapToTicks(true); //Sets whether the slider's value should snap to tick marks.
//        s.setOrientation(Orientation.VERTICAL); //Sets the orientation of the slider (horizontal or vertical).

//        s.setBlockIncrement(15);
//        s.increment();
//        s.decrement();

//        s.setDisable(true);
//        s.isDisabled();
//        s.setVisible(false);
//        s.isVisible();
//        s.requestFocus();

//        s.getMin(); //Returns the minimum value of the slider
//        s.getMax(); //Returns the maximum value of the slider
//        s.getValue(); //Returns the current value of the slider
//        s.isShowTickLabels(); //Returns whether tick labels are displayed.
//        s.isShowTickMarks(); //Returns whether tick marks are displayed.
//        s.getMajorTickUnit(); //Returns the interval between major tick marks
//        s.getMinorTickCount(); //Returns the number of minor tick marks between major tick marks.
//        s.isSnapToTicks(); //Returns whether the slider's value should snap to tick marks.
//        s.getOrientation(); //Returns the orientation of the slider.
        Label l = new Label();
        l.setText("Value: " + s.getValue());
        l.setFont(Font.font(20));

        Circle c = new Circle(20, Color.YELLOWGREEN);
        c.setTranslateX(350);
        c.setTranslateY(-100);

        s.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number oldval, Number newval) {
                l.setText("Value: " + s.getValue());
                c.setRadius(s.getValue());
            }
        });


        VBox root = new VBox(200);
        root.getChildren().addAll(l, s, c);
//        root.setTop(l);
//        root.setCenter(s);
//        root.setBottom(c);
        stage.setScene(new Scene(root, 800, 700));
        stage.setTitle("Slider Control");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
