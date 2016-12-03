package Quiz5;

public class Cup extends Vessel {
	
	private int radius;
	
	public Cup (int radius) {
		this.radius = radius;
	}

	@Override
	public double getVolumeInML() {
		
		double v = (0.5 * Math.PI * Math.pow(radius, 3) * 4) / 3;
		
		if (v < 0) {
			System.out.println("Invalid Volume");
			this.volume = 0;
			return volume; 
		}
		else {
			this.volume = v;
			return volume;
		}
		
	}

}