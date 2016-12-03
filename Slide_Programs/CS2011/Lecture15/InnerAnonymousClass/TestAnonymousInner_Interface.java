package CS2011.Lecture15.InnerAnonymousClass;

// Do not define interface class as public
interface Eatable {
	void eat();
}

public class TestAnonymousInner_Interface {

	public static void main(String[] args) {
		
		Eatable e = new Eatable() {
			
			@Override
			public void eat() {
				System.out.println("nice fruits");				
			}
			
		};

		e.eat();
		
	}

}