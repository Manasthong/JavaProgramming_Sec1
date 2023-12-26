import java.util.*;
public class Lab701 {

	public static void main(String[] args) {
		  int[] number = new int[7];
		  
		  Scanner scan = new Scanner(System.in);
		  for (int i=0;i<number.length;i++) {
			  System.out.println("Input number" + (i+1) + ":");
			  number[i] = scan.nextInt();		 
			  
		  }
		  System.out.println();
		  int odd =0;
		  for(int _number:number) {
			  if(_number %2==1) {
				  odd++; 
			  }
		  }
		  System.out.println("There are "+ odd +" of odd number ");
		  System.out.print("List of odd number : ");
		  for(int _number:number) {
			  if(_number %2==1) {
				  System.out.print(" "+_number);
			  }
		  }

	}

}
