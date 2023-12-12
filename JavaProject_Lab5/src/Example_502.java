import javax.swing.*;
public class Example_502 {

	public static void main(String[] args) {
		//1.input email address//
		String yourEmail = JOptionPane.showInputDialog("Input your e-mail:");
		while(yourEmail.startsWith("@")||yourEmail.startsWith("  ")) {
		     yourEmail = JOptionPane.showInputDialog("Input your e-mail,again :");
		     
		}
		yourEmail= yourEmail.toLowerCase();
		if(yourEmail.endsWith("hotmail.com")||yourEmail.endsWith("gmail.com")) {
			JOptionPane.showConfirmDialog(null,"Your e-mail is "+yourEmail);
					
		
			
		}else {
			JOptionPane.showConfirmDialog(null, "Your e-mail is not hoymail or "
					+"gmail dot com");
		}

	}

}
