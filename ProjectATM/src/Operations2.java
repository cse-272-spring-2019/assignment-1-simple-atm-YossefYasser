import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
public class Operations2  {
	Stage stage ;
	Scene scene ;
	Homescreen home;
	int savedValue;
	BankAccount BankAccount ;
	public Operations2 ( Stage stage , BankAccount BankAccount) {
		this.stage = stage ;
		this.BankAccount = BankAccount;
	}
	public void drawing4 () {
		
		Button submit = new Button("Submit");
		TextField depos = new TextField();
		Button back= new Button("Back");
		
		
		GridPane grid = new GridPane();
		grid.add(depos, 0, 2);
		grid.setVgap(8);
		grid.setHgap(8);
		grid.add(submit, 0, 3);
		grid.add (back , 0 , 4);
		
		
		
		
		
		submit.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				  
				 savedValue = Integer.parseInt(depos.getText());
				long value2 = (long)savedValue;
				
				BankAccount.Deposit(value2);
				depos.setText("");
				
				stage.setScene(home.getScene()); 
				
				
			}
		});
	back.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				stage.setScene(home.getScene()); 
				depos.setText("");
			}
		});
		
		
	scene = new Scene(grid, 1000, 600);		
	}
	
	
	
	
	
	
	
	
	public Scene getScene() {
		return this.scene;
	}
	public void setHome(Homescreen home) {
		this.home = home;
	}
}
