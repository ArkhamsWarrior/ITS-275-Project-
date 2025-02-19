package application;

import javafx.application.Application;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.shape.*;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class alertBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void display(String title, String message)
	{
		//Set the stage of the alert box
		Stage window = new Stage();
		
		window.initModality(Modality.APPLICATION_MODAL);//Blocks the user from accessing the screen prior to this
		//Set the layout as a VBox
		VBox layout = new VBox(30);
		//The message that the user can input for the alert 
		Label label1 = new Label(message);
		//The button that allows the user to close the window
		Button closeButton = new Button("Close the window.");
		//Sets the action for the button
		closeButton.setOnAction(e -> window.close());
		//Assigns the label and button to the scene 
		layout.getChildren().addAll(label1, closeButton );
		//Aligns the layout to the center of the scene
		layout.setAlignment(Pos.CENTER);
		
		
		Scene scene1 = new Scene(layout,350,200);
		window.setTitle(title);
		window.setScene(scene1);
		//Displays the window, and needs to be closed before it can return. Refutes user interaction 
		window.showAndWait();
		
		
	}

}
