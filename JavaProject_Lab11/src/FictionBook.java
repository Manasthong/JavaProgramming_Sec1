import java.time.*;
public class FictionBook implements Book,Author {
	private String author_name;
	private String email;
	private String title;
	private int publicYear;
	private String firstname;
	private String lastname;
	private int thong;
	
	FictionBook(String title, int publicyear) {
		this.title = title;
		this.publicYear = publicYear;
	}
	public void setAuthorName(String name) {
		author_name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean checkFormatName() {
		 thong = author_name.indexOf(" ");
		firstname = author_name.substring(0,thong);
		lastname = author_name.substring(thong,author_name.length()-1);
		if(author_name.trim().indexOf(" ")!=-1){
			return true;
		}
		else {
			return false;
		}
				
	}
	@Override
	public String getLastName() {
		int space = this.author_name.trim().indexOf(" ");
		return this.author_name.substring(space+1).toUpperCase();
	}
	@Override
	public String getFistName() {
		int space = this.author_name.trim().indexOf(" ");
		return this.author_name.substring(0,space).toUpperCase();
	}
	@Override
	public boolean checkEmail() {
		this.email = this.email.toLowerCase();
		if(email.endsWith("@hotmail.com")||email.endsWith("@windowslive.com")) {
			return true;
		}else {
			return false;
		}
	}
	//@Override
	public String gettitle() {
		return title;
	}
	@Override
	public int  getPublicYear() {
		return publicYear;
	}
	public int totalPublicYear() {

		return Year.now().getValue()-publicYear;
	}
	public String toString() {
		return title + "write by " + lastname.toUpperCase().substring(thong,thong+1)+"."+firstname.toUpperCase()
		+"(" + this.email + ")Public for "+this.publicYear + "Years";
	}

	

	

}
