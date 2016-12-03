package CS2011.Lecture15.CopyConstructor_Wrong;

public class SerialNumber {
	
	private String prefix;
	private int number;
	
	public SerialNumber(String inString, int inInt){
		prefix = inString;
		number = inInt;
	}	
	
	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public String toString(){
		return prefix + "-" + number;
	}

}