import java.util.Scanner;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
       
public  class GUI  {
	Validation autValidation;
	
	Homescreen home;
	Stage stage ;
	public GUI ( Stage stage) {
		this.stage = stage ;
	}
	
	
	
	Scene scene ;
	
	
	public void drawing() {
		autValidation = new Validation() ;
		


	//--------------------------------------------------------	

	
	Label passwordLabel = new Label("Card Number");
	Label validationLabel = new Label();
	
	PasswordField passwordfield = new PasswordField() ;
	Button submit = new Button("Login");
	
	GridPane grid = new GridPane() ;
	grid.setVgap(8);
	grid.setHgap(8);
	grid.add(passwordLabel, 0 , 1);
	
	grid.add(passwordfield, 1 , 1);
	grid.add(submit, 1 , 2);
	grid.add(validationLabel, 1 , 3);
	// --------------------------------------------------------
	submit.setOnAction(new EventHandler<ActionEvent>() {
		
		@Override
		public void handle(ActionEvent event) {
			// TODO Auto-generated method stub
			
			String password = passwordfield.getText();
			boolean valid =  autValidation.validate(password);
			if(valid == true) {
				
			stage.setScene(home.getScene());
				
				
				
				
			}
			else {
				validationLabel.setText("wrong");	
				}
		}
		
		
	
	});
	 scene = new Scene(grid, 600, 400);
	 
	
// --------------------------------------------------------
	
	 
}
	public Scene getScene() {
		return this.scene ;
	}
	public void setHome(Homescreen home) {
		this.home = home;
	}
	}

// --------------------------------------------------------