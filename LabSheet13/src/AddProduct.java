import java.util.*;
import java.io.*;
public class AddProduct {

	public static void main(String[] args) throws IOException{
	
		Scanner input = new Scanner(System.in);
		PrintWriter wrietFile = new PrintWriter (new FileWriter("d://txtfile//product.txt"));
		
		System.out.print("Product Id: ");
		String ProductId = input.next();
		System.out.print("Product Name: ");
		String ProductName = input.next();
		System.out.print("Product Unit: ");
		int ProductUnit = input.nextInt();
		System.out.print("Product Price");
		float ProductPrice = input.nextFloat();
		
		
		wrietFile.println(ProductId+","+ProductName+","+ProductUnit+","+ProductPrice);
		System.out.print("Write file already.....");
		
		
		wrietFile.close();
	}

}
