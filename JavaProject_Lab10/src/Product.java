
public class Product {
	private int Unit;
	
	public void setUnit(int unit) {
		this.Unit = unit;
		
	}
	public  int getUnit() {
		return this.Unit;
		
	}
	public  int getTotalprice() {
		return this.Unit * 100;
		
	}
	public  String toString() {
		return "You buy "+this.Unit+"units("+getTotalprice()+").";
	}


	

	

}
