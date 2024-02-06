import java.util.Scanner;
import java.io.*;
public class Example1 {

	public static void main(String[] args)throws IOException {
		//Using Scanner Class for read data from file
		Scanner readFile = new Scanner(new File("d://txtFile//MemberLogin.txt"));
		
		while(readFile.hasNext()) {
			//read name from file
			String fname = readFile.next();//read name from file
			//String lname = readFile.next();
			readFile.next();
			readFile.next();
			String email = readFile.next().toUpperCase();//read email from file
			System.out.println(fname+" "+"("+email+")" );
		}
		//close File
		readFile.close();

	}

}
