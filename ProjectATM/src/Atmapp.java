import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Atmapp extends Application {
	public static void main ( String args[]) {
		launch(args);
		
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
	    primaryStage.setTitle("ATM");
	    //***********************
	   //***********************
	    BankAccount ban = new BankAccount() ;
	    GUI gui = new GUI(primaryStage );
	    Homescreen home = new Homescreen(primaryStage,ban) ;
	    Operations ope = new Operations(primaryStage,ban);
	    Operations2 opee = new Operations2(primaryStage,ban);
	    
	    
	  //***********************
	  //***********************
	   gui.setHome(home);
	   home.setGui(gui);
	   home.setOpi(ope);
	  ope.setHome(home);
	  home.setOpi(ope);
	  ope.setHome(home);
	  opee.setHome(home);
	  home.setOpii(opee);
	  opee.setHome(home);
	  home.setOpii(opee);
	  
	;
	 //***********************
	 //***********************
	    gui.drawing();
	    home.drawing2();
	    ope.drawing3();
	    opee.drawing4 ();
	  //***********************
	  //***********************
	    // banady method ele btrsm el scene 3amel ezay
		primaryStage.setScene(gui.getScene());
		primaryStage.show();
	}

}
