package Quiz5;

public abstract class Vessel {	
	
	public double volume; // volume of the vessel
	public double amountPouredIn; // amount currently in the vessel
	public double amountSpilled;
	
	public abstract double getVolumeInML();

	public void consume(double amountConsumed) {
		if (amountConsumed > amountPouredIn) {
			System.out.println("You can only consume " + amountPouredIn + " MLs of your favorite beverage as only that much is available.");
			amountPouredIn = 0;	
		}
		else {
			System.out.println("You consume " + amountConsumed + " MLs of your favorite beverage");
			amountPouredIn = amountPouredIn - amountConsumed;			
		}
	}
	
	public double getAmountSpilled(double amountPouredIn) {
		this.amountSpilled = amountPouredIn - volume;
		if (this.amountSpilled > 0) {
			return this.amountSpilled;
		}
		else {
			return 0;
		}
	}
	
	public void pourIn(double amountPouredIn) {
		this.amountPouredIn = amountPouredIn - getAmountSpilled(amountPouredIn);
		if (getAmountSpilled(amountPouredIn) > 0) {
			System.out.println(this.amountPouredIn + " CCs poured into the vessel; " + getAmountSpilled(amountPouredIn) + " CCs spilled");
		}
		else {
			System.out.println(this.amountPouredIn + " CCs poured into the vessel");
		}	
	}
	
	public double getAmountPouredIn() {
		return amountPouredIn;
	}
	
}