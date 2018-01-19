package FromBook;

import javafx.application.*;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.*;
import javafx.scene.text.Font;
import javafx.stage.*;
import javafx.scene.layout.* ;
import javafx.scene.control.* ;
import javafx.geometry.*;
import javafx.scene.image.*;

import javax.swing.*;


public class JavaFX extends Application{

    private Label label, upLabel, downLabel;
    private CheckBox button1, button2, button3;
    private ToggleGroup tg;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("JavaFX");

        FlowPane rootNode = new FlowPane(10,10);
        rootNode.setAlignment(Pos.CENTER);

        Scene scene = new Scene(rootNode,220,150);

        primaryStage.setScene(scene);


        label = new Label("No transport type selected");

        ObservableList <String> list = FXCollections.observableArrayList("Car", "Byke", "Train","Bus","Plain","Truck");

        final ListView<String> view = new ListView<>(list);
        view.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

        view.setPrefSize(120,80);

        MultipleSelectionModel<String> model = view.getSelectionModel();

        model.selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                String items = "" ;
                ObservableList<String> list = view.getSelectionModel().getSelectedItems();

                for (int i = 0; i < list.size(); i++) {
                    items += "\n   " + list.get(i);
                }
                label.setText("Selected types: " + items);
            }
        });




        rootNode.getChildren().addAll(view,label);

        primaryStage.show();
    }


}



