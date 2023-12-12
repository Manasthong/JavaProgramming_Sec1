import java.util.*;
public class Lab501 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Full Name: ");
		String fullname = scan.nextLine();
		int space = fullname.trim().indexOf(" ");
		if(space==-1) {
			System.out.println("Incorrect Name");
			
		}else {
			String firstName = fullname.substring(0,space);
			String LastName =  fullname.substring(space+1); 
			System.out.println("First Name : " + firstName.toUpperCase());
			System.out.print("Last Name : "+LastName.toLowerCase() );
		}
		
}

	
}	