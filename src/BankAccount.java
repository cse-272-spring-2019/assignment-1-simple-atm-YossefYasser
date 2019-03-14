import java.util.ArrayList;
import java.util.Arrays;


public class BankAccount {
private long balance ;
int i =-1 ;
int j = 0 ;
int x = -1 ;
String y ;
public ArrayList<String> history = new ArrayList<>();
Homescreen screen;





 public boolean Withdraw(long balance) {
	//ha call it lma ados 3la zorar el withdraw
	 if (this.balance < balance || balance <= 0) {
		 return false ;
	 }
	 else { this.balance = this.balance - balance;
	if(history.size()==5)
	{
		history.remove(0);
		i-- ;
	}
	history.add("The operation was Withdrawing and the amount was " + balance);
	
	i++ ;
	return true ;
	 }	 
	 
}

public void Deposit(long balance) {
	
	this.balance = this.balance + balance;
	if(history.size()==5)
	{
		history.remove(0);
		i -- ;
	}
	history.add("The operation was depositing and the amount was "+balance);
	
	
	i++;
	
}
public long getBalance() {

	
	// TODO Auto-generated method stub
	if(history.size()==5)
	{
		history.remove(0);
		i--;
	}
	history.add("The operation was inquiring and the amount was " +balance);
	
	 i++;
	 
return balance ;
}

public String Previous(){
	
	  if(j<=i) {  
			 System.out.println("previous shghala"+j);
	  String y =  history.get(i-j) ;
	  j++;
	  return y ;
	    }
	  else {
			 y = "ERROR! NO OPERATIONS IN MY HISTORY ANYMORE " ;
			 x=0;
			
			
			 
    return y;
	  }
    
	}

public String Next () {
  
		
		
		
		if (j>1) {
			
			if (x==0)
			{ 			 System.out.println("awel next"+j);
			
				 y =  history.get(x) ;
				 x--;
				
				
				
				System.out.println("b3d ma 3mlt awel next el j b2a b = "+j);
				 return y;
			}
			else {
				  y =  history.get(i-j+2) ;
				    j--;
				 
				    return y ;
			}
			
		}
			else {
			y = null ;
			if ( j ==1)
				j--;
			
				return y;
			}
	
	
	
	
}
}





