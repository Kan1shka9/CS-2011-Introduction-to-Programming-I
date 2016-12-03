package CS2011.SampleMidTerm_revised;

public abstract class Building {
	
	private boolean isHaunted;
	private double size;
	
	public Building(double size, boolean isHaunted) {
		super();
		this.size = size;
		this.isHaunted = isHaunted;
	}
	
	public abstract void explore();	
	
	public void setishaunted(boolean isHaunted) {
		this.isHaunted = isHaunted;
	}
	
	public boolean getisHaunted() {
		return isHaunted;
	}
	
	public double getSize() {
		return size;
	}
	
	public void setSize(double size) {
		this.size = size;
	}
	
}