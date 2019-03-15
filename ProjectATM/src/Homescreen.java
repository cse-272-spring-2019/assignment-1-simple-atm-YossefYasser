import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Homescreen {
	Stage stage ;
Scene scene ;
GUI gui;
String y ;
Operations ope;
Operations2 opee;
BankAccount BankAccount ;
public Homescreen ( Stage stage , BankAccount BankAccount) {
	this.stage = stage ;
	this.BankAccount = BankAccount;
}
public void drawing2() {
	Label Welcome = new Label("Welcome");
	Label a = new Label(" ");
	Label b = new Label(" ");
	Label c = new Label(" ");
	Label d = new Label(" ");
	Label f = new Label(" ");
	
	
	Button Logout = new Button("Logout");
  Button Withdaraw = new Button("         Withdraw           ");
	Button Deposit = new Button("         Deposit              ");
	Button previous= new Button("         Previous             ");
	Button next= new Button( "              Next              ");
	Label currentbalance = new Label(); 
	Label prevhistory = new Label();
	Label nexthistory = new Label();
	Button Inquiry = new Button("Show Current Balance");
	Button log = new Button ("Logout");
	
	
	
	
	
	GridPane grid = new GridPane();
	
	
	
	grid.setVgap(8);
	grid.setHgap(8);
	grid.add(Welcome, 0, 0);
	grid.add(Withdaraw, 0, 1);
	grid.add(Deposit, 0, 2);
	grid.add(Inquiry, 0 , 3);
	grid.add(currentbalance, 2, 3);
	grid.add(prevhistory, 2, 4);
	grid.add(nexthistory, 2, 5);
	grid.add(previous, 0, 4);
	grid.add(next, 0,5);
	grid.add(log, 30, 10);

	
	
	
	
	scene = new Scene(grid, 1000, 600);
	
	log.setOnAction(new EventHandler<ActionEvent>() {
		
		@Override
		public void handle(ActionEvent event) {
			// TODO Auto-generated method stub
			stage.setScene(gui.getScene());	
			
			prevhistory.setText(" ");	

			nexthistory.setText(" ");	
			

			currentbalance.setText(" ");	
			
			BankAccount.setBalance();
			BankAccount.history.clear();
			BankAccount.i = -1 ;
			BankAccount.j = 0 ;
			BankAccount.x = -1 ;
			
			
		
			
			
		}
	});
	
	
	
	Withdaraw.setOnAction(new EventHandler<ActionEvent>() {
		
		@Override
		public void handle(ActionEvent event) {
			stage.setScene(ope.getScene()); 
			
			
		}
	});
	
	Inquiry.setOnAction(new EventHandler<ActionEvent>() {
		
		@Override
		public void handle(ActionEvent event) {
			// TODO Auto-generated method stub
			 long x = BankAccount.getBalance();
			 currentbalance.setText("Your current balance is :"+x);
			 System.out.println(x);
		
		}
	});
  previous.setOnAction(new EventHandler<ActionEvent>() {

	
	@Override
	public void handle(ActionEvent event) {
	
	prevhistory.setText(BankAccount.Previous());	
		
	  
	}
});
next.setOnAction(new EventHandler<ActionEvent>() {

	
	@Override
	public void handle(ActionEvent event) {
	
	nexthistory.setText(BankAccount.Next());	
		//history.setText();
	  
	}
});
Deposit.setOnAction(new EventHandler<ActionEvent>() {
	
	@Override
	public void handle(ActionEvent arg0) {
		// TODO Auto-generated method stub
		stage.setScene(opee.getScene()); 
		
	}
});


  }
public Scene getScene() {
	return this.scene;
}
public void setGui(GUI gui) {
	this.gui = gui;
}
public void setOpi(Operations ope) {
	this.ope = ope;
}
public void setOpii(Operations2 ope) {
	this.opee = ope;
}


}
