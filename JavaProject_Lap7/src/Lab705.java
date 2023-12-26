import javax.swing.*;
public class Lab705 {

	public static void main(String[] args) {
		int[] _num = new int[5];
		  for(int i=0;i<_num.length;i++) {
			 _num[i] = Integer.parseInt(JOptionPane.showInputDialog
			("Enter item number "+(i+1) + " : "));  
		  }

	}

}
