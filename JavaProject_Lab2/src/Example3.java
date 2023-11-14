import java.text.DecimalFormat;
import java.util.*;//1.import for input data from keyboard
public class Example3 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat ("#,###.00");
		
		Scanner input = new Scanner (System.in);
		System.out.print("Input product name : ");
		String prodcctName = input.nextLine(); 
		System.out.print("Input product unit :");
		int productUnit = input.nextInt();
		System.out.print("Input price per unit :");
		float priceperUnit = input.nextFloat();
		System.out.println();
		float totalPrice = productUnit * priceperUnit;
		System.out.println("Total price is "+frm.format(totalPrice)+" baht ");
		double vat = totalPrice + (totalPrice*7/100);
		System.out.println("Add VaT 7% is "+vat+" baht ");
		
		

	}

}
