import java.text.DecimalFormat;

import javax.swing.*;
public class Example4 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat ("#,###.00");
		//2.input data from dialogbox
		
		String productName = JOptionPane.showInputDialog(";Input prouct name : ");
	/*	//input unit price from dialog box
		String strUnit = JOptionPane.showInputDialog("Input product unit : ");
		//convert string to int 
		int productUnit = Integer.parseInt(strUnit); */
		
		int productUnit = Integer.parseInt(
				JOptionPane.showInputDialog("Input product unit : "));
		
		
		//input price per unit from dialog box
		//String stePrice  = JOptionPane.showInputDialog("Input priceper unit : ");
		float pricePerUnit = Float.parseFloat( JOptionPane.showInputDialog("Input priceper unit : "));
		
		//calculate total price
		float totalPrice = productUnit * pricePerUnit;
		
		// JOptionPane.showInputDialog(null,"Total Price is "
				// +totalPrice );
		double vat = totalPrice + (totalPrice*7/100);
		JOptionPane.showMessageDialog(null,"Total price is "+frm.format(totalPrice)+" baht "+"\nAdd VaT 7% is "
		+frm.format(vat)+" baht ");
			//double vat = totalPrice + (totalPrice*7/100);
			//System.out.println("Add VaT 7% is "+vat+" baht ");
		
		 
		
	}

}
