package myobj.Academy;

public class StunumGenerator {
	
	String academyName;
	int generateCount = 0;
	
	public StunumGenerator(String academyName) {
		this.academyName = academyName;
	}
	
	public String generator() {
		return String.format("%s%06d", academyName, generateCount++);
		
	}
}