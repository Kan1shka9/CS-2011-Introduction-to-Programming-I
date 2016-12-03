package CS2011.Lecture14.Abstract;

public class Direction {
	
	private double bearing, z;

	public Direction() {
	}

	public Direction(double bearingIn, double zIn){
		setDirection(bearing, z);
	}

	public void setDirection(double bearingIn, double zIn){
		bearing = bearingIn;
		z = zIn;
	}

	public double getBearing() {
		return bearing;
	}

	public double getZ() {
		return z;
	}	
	
	public String toString(){
		return "bearing: " + bearing + ": z: " + z;
	}
	
}