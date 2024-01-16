package ladSheet9;

public class TestCircle {

	public static void main(String[] args) {
		Circle c1 = new Circle(1.1,"blue");
		System.out.println(c1);
		
		Circle c2 = new Circle(2.2);
		System.out.println(c2);
		
		Circle c3 = new Circle();
		System.out.println(c3);
		
		// Test Setters and Getters
		c1.setRadius(3.3);
		c1.setColor("green");
		System.out.println("The redius is : "+c1.getRadius());//call toString()method
		System.out.println("The color is : "+c1.getColor());
		
		System.out.printf("The area is : %.2f%n",c1.getArea());
		System.out.printf("The circumference is : % 2f",c1.getCircumference());
	
		

	}

}
