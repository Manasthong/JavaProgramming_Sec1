import java.util.*;
import java.io.*;
public class SaveandOpan extends Empoloyee{
	private String name;
	private String dept;
	int i = 1;

	public  void insert()throws IOException {
		Scanner input = new Scanner(System.in);
		String answer;
		PrintStream writeFile = new PrintStream((new File("d://txtFile//employee.txt")));
		
		do {
			header();
			System.out.print("Enter name:");
			name = input.next();
			System.out.print("Enter department");
			dept = input.next();
			System.out.print("Enter data again");
			answer = input.next();
			writeFile.println(name+"\t"+dept);
			
			
		}while(answer.equalsIgnoreCase("y"));
		writeFile.close();
		
	}
	public void read()throws IOException{
		try {
			Scanner readFile = new Scanner(new File("d://txtFile//employee.txt"));
			Boolean check = false;
			header();
			while(readFile.hasNext()) {
				name = readFile.next();
				dept = readFile.next();
				if(dept.equalsIgnoreCase(super.getDept())) {
					System.out.println((i+1)+")"+name);
					check = true;
					i++;
					
				}
				if(check) {
					header();
					System.out.print("Employee in dept : "+getDept()+" is "+i+" person.");
				}
				else {
					System.out.print("\nSorry, no dept : "+getDept()+" in file.");
				}
			}
		}catch(IOException e) {
			System.out.println("Sorry,file not fount");
		}
	}

}
