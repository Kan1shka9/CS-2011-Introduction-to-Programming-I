package Quiz5;

public class Driver_2 {

	public static void main(String[] args) {
		
		Vessel cup1 = new Cup(5);
		System.out.println("Volume of cup :- " + cup1.getVolumeInML());
		System.out.print("Amount poured in :- " );
		cup1.pourIn(100);
		System.out.println("Amount in vessel :- " + cup1.getAmountPouredIn());
		cup1.consume(150);
		System.out.println("Amount in vessel :- " + cup1.getAmountPouredIn());

		System.out.println();
		
		Vessel cup2 = new Cup(-5);
		System.out.println("Volume of cup :- " + cup2.getVolumeInML());
		
		System.out.println();
		
		Vessel cup3 = new Cup(5);
		System.out.println("Volume of cup :- " + cup3.getVolumeInML());
		System.out.print("Amount poured in :- " );
		cup3.pourIn(300);
		System.out.println("Amount in vessel :- " + cup3.getAmountPouredIn());
		cup1.consume(150);
		System.out.println("Amount in vessel :- " + cup3.getAmountPouredIn());
		
		System.out.println();
		
		Vessel glass1 = new Glass(5, 10);
		System.out.println("Volume of glass :- " + glass1.getVolumeInML());
		System.out.print("Amount poured in :- " );
		glass1.pourIn(100);
		System.out.println("Amount in vessel :- " + glass1.getAmountPouredIn());
		glass1.consume(150);
		System.out.println("Amount in vessel :- " + glass1.getAmountPouredIn());
		
		System.out.println();
		
		Vessel glass2 = new Glass(-5, -10);
		System.out.println("Volume of cup :- " + glass2.getVolumeInML());
		
		System.out.println();
		
		Vessel glass3 = new Glass(5, 10);
		System.out.println("Volume of glass :- " + glass3.getVolumeInML());
		System.out.print("Amount poured in :- " );
		glass3.pourIn(10000);
		System.out.println("Amount in vessel :- " + glass3.getAmountPouredIn());
		glass3.consume(90);
		System.out.println("Amount in vessel :- " + glass3.getAmountPouredIn());
		
	}

}