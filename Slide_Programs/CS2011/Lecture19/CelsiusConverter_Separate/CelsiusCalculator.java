package CS2011.Lecture19.CelsiusConverter_Separate;

public class CelsiusCalculator {
	
	private final double CONVFACTOR = 5.0/9.0;
	private final int FSTART = 32;
		
	public double fToC(double f) {
		return  (f-FSTART) * CONVFACTOR;
	}
	
}