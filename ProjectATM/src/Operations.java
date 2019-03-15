import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class Operations {
	Stage stage ;
	Scene scene ;
	Homescreen home;
	int savedValue1;
	BankAccount BankAccount ;
	public Operations ( Stage stage , BankAccount BankAccount) {
		this.stage = stage ;
		this.BankAccount = BankAccount;
	}
	
	public void drawing3 () {
Button with= new Button("Withdraw");
		
		
		
		
		TextField withd = new TextField();
		Button submit = new Button("Submit");
		Label error = new Label();
		Button back = new Button ("Back");
		
		
		
		
		
		
		GridPane grid = new GridPane();
		grid.add(withd, 0, 1);
		grid.setVgap(8);
		grid.setHgap(8);
		grid.add(submit, 0, 2);
		grid.add(back, 0, 3);
		grid.add(error, 0,4);
		
		System.out.println();
		
		
		
		submit.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
			
				
				
					savedValue1 = Integer.parseInt(withd.getText());
					long value2 = (long)savedValue1;
					
					 boolean x = BankAccount.Withdraw(value2);
					if (x == false ) {
						error.setText("INVALID AMOUNT");
						
						
					}
					else {
						withd.setText("");
						
						error.setText("");
					stage.setScene(home.getScene()); 
					
				
				}
			}
		});
		
		
		back.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				error.setText("");
				withd.setText("");
				stage.setScene(home.getScene()); 
				
			}
		});
		scene = new Scene(grid, 1000, 600);	}
	public Scene getScene() {
		return this.scene;
	}
	public void setHome(Homescreen home) {
		this.home = home;
	}
}
