package ladSheet9;

public class Date {

	private int year;
	private int month;
	private int day;
	
	Date(int year,int month, int day){
		this.year = year;
		this.month = month;
		this.day = day;
		
	}
	public int getYear() {
		return this.year;
	}
	public int getMonth() {
		return this.month;
		
	}
	public int getDay() {
		return this.day;
	
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void setMouth(int mouth) {
		this.month = mouth;
	}
	public void setDay(int day) {
		this.day= day;
	}
	public String toString() {
		return String.format("%20d/%02d/%4d" ,month, day,year );
	}
	public void setDate(int year,int mouth,int day) {
		this.year = year;
		this.month =mouth;
		this.day = day;
	}

}
