package Quiz10;

public class Complex implements Cloneable {
	
	// Private Variables
	private double r;
	private double i;
	
	// Constructors
	public Complex() {
		r = 0;
		i = 0;
	}
	
	public Complex(double r) {
		this.r = r;
	}
	
	public Complex(double r, double i) {
		this.r = r;
		this.i = i;
	}
	
	// Getters and Setters
	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	public double getI() {
		return i;
	}

	public void setI(double i) {
		this.i = i;
	}

	// Complex Number Operations
	public Complex addition(Complex a) {
		Complex n = new Complex();
		n.r = this.r + a.r;
		n.i = this.i + a.i;
		return n;
	}
	
	public Complex subtraction(Complex a) {
		Complex n = new Complex();
		n.r = this.r - a.r;
		n.i = this.i - a.i;
		return n;
	}
	
	public Complex multiplication(Complex a) {
		Complex n = new Complex();
		n.r = this.r*a.r - i*a.i;
		n.i = this.r*a.i + i*a.r;
		return n;
	}
	
	public Complex division(Complex a) {
		double mag, maga, angle, anglea;
		mag = Math.sqrt(this.r*this.r + this.i*this.i);
		maga = Math.sqrt(a.r*a.r + a.i*a.i);
		angle = Math.atan(this.i / this.r);
		anglea = Math.atan(a.i / a.r);
		mag /= maga;
		angle -= anglea;
		Complex n = new Complex();
		n.r = mag*(Math.cos(angle));
		n.i = mag*(Math.sin(angle));
		return n;
	}
	
	@Override
	public String toString() {
		return r + " + " + "i" + i;
	}
	
	// Cloneable
	public Complex clone() throws CloneNotSupportedException {
		return (Complex)super.clone();
	}
	
}