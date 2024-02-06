import java.util.Scanner;

public class Lab101 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Input product name : ");
		String prodcctName = input.nextLine(); 
		System.out.print("Input product unit :");
		int productUnit = input.nextInt();
		System.out.print("Input price per unit :");
		float priceperUnit = input.nextFloat();
		System.out.println();
		System.out.println("-------------------------------------");
	}

}
