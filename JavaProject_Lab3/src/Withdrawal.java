import javax.swing.*;

import java.text.DecimalFormat;
import java.util.*;
public class Withdrawal {

	public static void main(String[] args) {
	DecimalFormat frm = new DecimalFormat ("#,###.00");
	Random rand = new Random();
	int belance = rand.nextInt(9) * 100000;
	 
	int withdrawMoney = Integer.parseInt(
			JOptionPane.showInputDialog("Your balance :"+frm.format(belance)
			+"\nInput money to withdra: "));
	if(withdrawMoney> belance) {
		JOptionPane.showMessageDialog(null, "Error:Cannot withdraw more than balance"
				+ "ERROR"+JOptionPane.ERROR_MESSAGE);
	}
	else if (withdrawMoney > 20000) {
		JOptionPane.showMessageDialog(null, "Error:Cannot withdraw more than 20,000"
				+ "ERROR"+JOptionPane.ERROR_MESSAGE);
	}
	else if (withdrawMoney % 100!=0) {
    JOptionPane.showMessageDialog(null, "Error:Cannot withdraw 15 baht."
    		+ "ERROR"+JOptionPane.ERROR_MESSAGE);
		
	}
		int num1000 = withdrawMoney /1000;
		int num500 = (withdrawMoney %1000) / 500;
		int num100 = (withdrawMoney %500)/100 ;
		JOptionPane.showMessageDialog(null, "You");

}


}