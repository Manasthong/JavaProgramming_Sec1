import java.io.*;
public class Lad1203 {

	public static void main(String[] args)throws IOException {
		BufferedReader readFile = new BufferedReader(new FileReader("d://txtFile//Bookdat"));
		String tmp=" ";
		int countBook=0 , i=1;
		
		while((tmp=readFile.readLine()) != null)  {
			String[] data = tmp.split("\t");
			System.out.println(i+"."+data[0]+" ("+data[1]+"), Reting "+data[2]+"pudlish on "+ data[5]);
			countBook++;
			i++;
			
		}
		System.out.println("=====================================");
		System.out.println("Total book = "+countBook );
		
		readFile.close();

	}

}
