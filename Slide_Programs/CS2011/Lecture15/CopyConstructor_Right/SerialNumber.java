package CS2011.Lecture15.CopyConstructor_Right;

public class SerialNumber {
	
	private String prefix;
	private int number;
	
	public SerialNumber(String inString, int inInt){
		prefix = inString;
		number = inInt;
	}	
	
	// give SerialNumber a copy constructor too!
	public SerialNumber(SerialNumber s){
		// this.prefix = s.prefix would really still be OK due to String immutability
		this.prefix = new String(s.prefix);
		// this is OK because number is an int, which is a value type
		this.number = s.number;		
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
