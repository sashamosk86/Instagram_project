package FromBook;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.scene.control.*;



public class JavaFX extends Application{

    Label response;

    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("My Program");
        FlowPane rootNode = new FlowPane(10,10);
        rootNode.setAlignment(Pos.CENTER);
        Scene myScene = new Scene(rootNode,300,100);
        primaryStage.setScene(myScene);

        response = new Label("Push the button");
        Button enterButton = new Button("Enter");
        Button exitButton = new Button("Exit");

        enterButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                response.setText("Enter pressed");
            }
        });

        exitButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                response.setText("Exit pressed");
            }
        });

        rootNode.getChildren().addAll(enterButton,exitButton,response);

        primaryStage.show();
    }


}
