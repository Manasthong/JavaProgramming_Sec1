import java.text.DecimalFormat;

import javax.swing.*;
public class Example3 {

	public static void main(String[] args) {
		//input and convert weight and height(cm.) from string to double
		DecimalFormat frm = new DecimalFormat ("#,###.0");
		double weight = Double.parseDouble(
				JOptionPane.showInputDialog("Input Weight:"));
		double height = Double.parseDouble(
				JOptionPane.showInputDialog("Input Height"));
		//convert height from cm. to m.
		height = height/100;
		//caLculte BMI
		double bmi = weight/(height*height);
		String bmiCategory;
		if(bmi<18.5) bmiCategory = "Underweight";
		else if(bmi<25) bmiCategory = "Normal-weight";
		else if(bmi<30) bmiCategory = "Overweight";
		else bmiCategory = "Obesity";
		
		//display BMI from dialog box 
		/*JOptionPane.showMessageDialog(null, "BMI = "+frm.format(bmi)
				+"\nYou're"+bmiCategory,"BMI",
			JOptionPane.WARNING_MESSAGE); ใช้ได้สองแบบเลยในการใส่จุดทศนิยม*/  
		
		JOptionPane.showMessageDialog(null, "BMI = "+String.format("%.1f",bmi)
		+"\nYou're"+bmiCategory,"BMI",
	JOptionPane.WARNING_MESSAGE);
		

	}

}
