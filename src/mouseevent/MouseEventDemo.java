/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mouseevent;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author chris
 */
public class MouseEventDemo extends Application {
    Text texto = new Text();
    
    @Override
    public void start(Stage primaryStage) {
        
        texto.setText("Programming is fun");
        
       
        texto.setOnMouseDragged(new EventHandler<MouseEvent>(){
        public void handle(MouseEvent e) {
            texto.setX(e.getX());
            texto.setY(e.getY());
            }
        });
        
        Pane root = new Pane();
        root.getChildren().add(texto);
        
        Scene scene = new Scene(root, 300, 250);
        
        texto.setX(150);
        texto.setY(125);
        
        primaryStage.setTitle("Mouse Event");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    
    /*class ManejadorHandler implements EventHandler<MouseEvent>
    {
        @Override
        public void handle(MouseEvent e) {
            System.out.println("mouseevent.MouseEventDemo.ManejadorHandler.handle()");
            texto.setX(e.getX());
            texto.setY(e.getY());
        }
       
        
    }*/

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
