
public class Rectangle2 implements Shape2{
	private double width,length;
	
	Rectangle2(double width,double length){
		this.width=width;
		this.length=length;
	}
	
	@Override
	public double getArea() {
		return this.width * this.length;
	}
	@Override
	public String toString() {
		return "Rectang[width= "+this.width+ ",length= "+this.length
				+","+super.toString()+"]";
	}
	public double getWidth() {
		return this.width;
	}
	public double getleagth() {
		return this.length;
	}

	
}
