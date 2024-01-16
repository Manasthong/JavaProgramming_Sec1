package ladSheet9;
import java.util.*;
public class TestBook {

	public static void main(String[] args) {
		Book b1 = new Book();
		Scanner sacn = new Scanner(System.in);
		System.out.print("Input book title :");
		String title = sacn.nextLine();
		
		System.out.print("Input book price :");
		float price = sacn.nextFloat();
		
		System.out.print("Input publish year :");
		int publishyear =sacn.nextInt();
		
		b1.setTitle(title);
		b1.setPrice(price);
		b1.setPublishyear(publishyear);
		
		System.out.print(b1);
		
	}

}
