import java.text.*;
public class Example2 {

	public static void main(String[] args) {
		//.call Class DecimalFormet 
		DecimalFormat frm = new DecimalFormat ("#,###.00");
		final double BUFFET = 299;
		int numberofcustomer = 5;
		double netPrice = BUFFET * numberofcustomer;
		//3.apply format method to variable
		System.out.println("Buffet of "+numberofcustomer
				+"cooutomers is "+frm.format(netPrice));
		double serviceCharge = netPrice + (netPrice*3/100);
		System.out.println("Add Service Charge 3% is "
				+frm.format(serviceCharge)); 
		

	}

}
