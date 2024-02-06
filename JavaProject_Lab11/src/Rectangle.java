public class Rectangle extends Shape {

	private double width;
	private double leagth;
	
	Rectangle(double width,double leagth,String color){
		super(color);
		this.width = width;
		this.leagth = leagth;
		
	}
	@Override
	public double getArea() {
		return this.width * this.leagth;
	}
	@Override
	public String toString() {
		return "Rectang[width= "+this.width+ ",length= "+this.leagth
				+","+super.toString()+"]";
	}
	public double getWidth() {
		return this.width;
	}
	public double getleagth() {
		return this.leagth;
	}

}
