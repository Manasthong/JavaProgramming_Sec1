public class Invoice {
	private int id;
	private Customer customer;
	private double amount;
	
	public Invoice(int id, Customer customer , double amount) {
		this.id = id;
		this.customer = customer;
		this.amount = amount;
	}
	public int getID() {
		return this.id;
	}
	public Customer getCustomer() {
		return this.customer;
		
	}
	public void setCustomer(){
		 this.customer = customer;
	}
	public double getAmount(){
		return this.amount;
	}
	public void setAmount(){
		this.amount = amount;
	}
	public int getCustomerID(){
		return getCustomer().getID();
	}
	public String getCustomerName(){
		return getCustomer().getName();

	}
	public int getCustomerDiscount(){
		return getCustomer().getDiscount();
	}
	public double getAmountDiscount(){
		return getAmount()-getAmount()*getAmountDiscount()/100;
	}
	public String toString() {
		return "Invoice id="+id+"cudtomer"+customer.toString()+"amount"+amount;
	}
	
}
