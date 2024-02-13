import java.util.*;
import java.io.*;
public class SantenceText {

	public static void main(String[] args)throws IOException  {
		
		PrintStream wrietFile = new PrintStream ((new File("d://txtfile//sentence.txt")));
		
		Scanner input = new Scanner(System.in);
		int i = 1;
		while(true) {
			System.out.print("Sentence :");
			String word = input.next().toUpperCase();
			
			if(word.equalsIgnoreCase("stop")) {
				break;
	         }
			wrietFile.println(i+":"+word);
			i++;
			
		}
		System.out.println("File is save!!");
		wrietFile.close(); 

	}

}
