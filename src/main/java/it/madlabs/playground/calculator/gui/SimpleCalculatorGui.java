package it.madlabs.playground.calculator.gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.geometry.Pos;


/**
 *
 * @author Gabriele
 */
public class SimpleCalculatorGui extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SimpleCalculatorGui simpleCalculatorGui = new SimpleCalculatorGui();
        SimpleCalculatorGui.launch(args);
    }

    private final Label labelX = new Label(" X: ");
    private final TextField fieldX = new TextField();
    private final Label labelY = new Label(" Y: ");
    private final TextField fieldY = new TextField();
    private final Button plus = new Button("+");
    private final Button minus = new Button("-");
    private final Button multiply = new Button("*");
    private final Button divide = new Button("/");
    private final Label labelResult = new Label("RESULT: ");

    @Override
    public void start(Stage scene) {

        //Setting an action for the plus button
        plus.setOnAction(new EventHandler<ActionEvent>() {
        @Override
            public void handle(ActionEvent e) {
                String result = "1.0";
                labelResult.setText("RESULT: " + result);
            }
        });
        //Setting an action for the minus button
        minus.setOnAction(new EventHandler<ActionEvent>() {
        @Override
            public void handle(ActionEvent e) {
                String result = "2.0";
                labelResult.setText("RESULT: " + result);
            }
        });
        //Setting an action for the multiply button
        multiply.setOnAction(new EventHandler<ActionEvent>() {
        @Override
            public void handle(ActionEvent e) {
                String result = "3.0";
                labelResult.setText("RESULT: " + result);
            }
        });
        //Setting an action for the divide button
        divide.setOnAction(new EventHandler<ActionEvent>() {
        @Override
            public void handle(ActionEvent e) {
                String result = "4.0";
                labelResult.setText("RESULT: " + result);
            }
        });

        scene.setTitle("SimpleCalculator");
        Scene layout = composeSceneLayout();
        scene.setScene(layout);
        scene.show();
    }

    private Scene composeSceneLayout(){
        HBox hbox1 = composeHorizontalLayout(labelX, fieldX);
        HBox hbox2 = composeHorizontalLayout(labelY, fieldY);
        HBox hbox3 = composeHorizontalLayout(plus, minus, multiply, divide);
        HBox hbox4 = composeHorizontalLayout(labelResult);
        VBox vbox = composeVerticalLayout(hbox1, hbox2, hbox3, hbox4);
        Scene scene = new Scene(vbox, 250, 200);
        return scene;
    }

    public HBox composeHorizontalLayout(Node... nodes){
        final HBox hbox = new HBox(10);
        for(int i = 0; i < nodes.length; i++){
            hbox.getChildren().add(nodes[i]);
            hbox.setAlignment(Pos.CENTER);
        }
        return hbox;
    }

    public VBox composeVerticalLayout(Node... nodes){
        final VBox vbox = new VBox(10);
        for(int i = 0; i < nodes.length; i++){
            vbox.getChildren().add(nodes[i]);
            vbox.setAlignment(Pos.CENTER);
        }
        return vbox;
    }

}