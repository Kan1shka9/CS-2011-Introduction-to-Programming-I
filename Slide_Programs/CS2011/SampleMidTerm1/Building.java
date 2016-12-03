package CS2011.SampleMidTerm1;

public abstract class Building {
	
	private double size;
	private boolean isHaunted;
	protected int count = 0;

	public Building(double size, boolean isHaunted) {
		super();
		this.size = size;
		this.isHaunted = isHaunted;
	}
	
	public abstract void explore();

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public boolean isHaunted() {
		return isHaunted;
	}

	public void setHaunted(boolean isHaunted) {
		this.isHaunted = isHaunted;
	}
	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
}