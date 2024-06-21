package myobj;

public class Reporter {
	String name;
	String company; //여기에 회사 리스트를 채워넣겠다
	String field;
	String email;
	
	public Reporter(String name, String company, String field, String email) {
		this.name = name;
		this.company = company;
		this.field = field;
		this.email = email; 
	}
	
	public String getCompany() {
		return this.company;
	}
	
	public String getField() {
		return this.field;
	}
	
	@Override
	public String toString() {
		return String.format("%s 기자/%s/%s/%s", name, company, field, email);
	}
	
}
