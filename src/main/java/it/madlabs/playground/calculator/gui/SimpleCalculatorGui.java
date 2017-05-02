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


/**
 *
 * @author Cristina
 */
public class SimpleCalculatorGui extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage scena) {
                
        Label et1 = new Label(" X: ");
        TextField nr1 = new TextField();
        
        Label et2 = new Label(" Y: ");
        TextField nr2 = new TextField();

        Button plus = new Button();
        plus.setText("+");

        Button minus = new Button();
        minus.setText("-");

        Button multiply = new Button();
        multiply.setText("*");

        Button divide = new Button();
        divide.setText("/");
        
        Label et4 = new Label("RESULT: 0.0");

        scena.setTitle("SimpleCalculator");
        FlowPane root = new FlowPane();
        
        final HBox hbox1 = new HBox();
        hbox1.setSpacing(5);
    
        final HBox hbox2 = new HBox();
        hbox2.setSpacing(5);

        final HBox hbox3 = new HBox();
        hbox3.setSpacing(5);

        final HBox hbox4 = new HBox();
        hbox4.setSpacing(5);

        final HBox hbox5 = new HBox();
        hbox5.setSpacing(5);

        final VBox vbox1 = new VBox();
        vbox1.setSpacing(5);

        hbox1.getChildren().add(et1);
        hbox1.getChildren().add(nr1);
        
        hbox2.getChildren().add(et2);
        hbox2.getChildren().add(nr2);
                
        hbox3.getChildren().add(plus);
        hbox3.getChildren().add(minus);
        hbox3.getChildren().add(multiply);
        hbox3.getChildren().add(divide);
        
        hbox4.getChildren().add(et4);


        vbox1.getChildren().add(hbox1);
        vbox1.getChildren().add(hbox2);
        vbox1.getChildren().add(hbox3);
        vbox1.getChildren().add(hbox4);

        root.getChildren().add(vbox1);

        //Setting an action for the Submit button
        plus.setOnAction(new EventHandler<ActionEvent>() {

        @Override
            public void handle(ActionEvent e) {
                et4.setText("RESULT: 1.1");
            }
        });

        scena.setScene(new Scene(root, 250, 150));
        scena.show();
    }

}