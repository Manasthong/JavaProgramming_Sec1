import javax.swing.*;
import java.text.*;
public class module_info {

	public static void main(String[] args) {
		final int BUFFET = 299;
		DecimalFormat frm = new DecimalFormat ("#,###.00");
		int numberofCustomer = Integer.parseInt(
				JOptionPane.showInputDialog("how many customer per bill"));
		double discount,totalPrice=0;
		totalPrice = BUFFET * numberofCustomer; 
		int member;
		do {
			member = JOptionPane.showConfirmDialog(null, "Total price is "
					+frm.format(totalPrice) + "bath."
					+"\nDo you have a member card?");
		}while(member==JOptionPane.CANCEL_OPTION);
		if(member == JOptionPane.YES_OPTION) {
			discount = totalPrice * 90/100 ;
			JOptionPane.showMessageDialog(null,
					"Amount tobe paid is "+frm.format (discount) + "bath");
		}
		else if(member == JOptionPane.NO_OPTION) {
			JOptionPane.showConfirmDialog(null,
					"Amount tobe paid is "+frm.format (totalPrice) + "bath");
		}
		
		}
	
	}


