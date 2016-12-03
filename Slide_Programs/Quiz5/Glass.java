package Quiz5;

public class Glass extends Vessel{
	
	private int radius;
	private int height;
	
	public Glass(int radius, int height) {
		this.radius = radius;
		this.height = height;
	}

	@Override
	public double getVolumeInML() {
		
		double v = Math.PI * Math.pow(radius, 2) * height;
		
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