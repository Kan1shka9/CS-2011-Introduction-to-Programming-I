package CS2011.Lecture17.BottomUp;

public class StoreDriver {
	
	public static void main(String[] args) {
		
		String testFirstName = "Joe";
		String testLastName = "Smith";
		
		Salesperson p = new Salesperson(testLastName, testFirstName);
		String testName = testLastName + ", " + testFirstName;

		if (!(p.getName().equals(testName)))
			System.out.println("name error");
		
		if (p.getYtdSales() >.001)
			System.out.println("Sales error");
		
		double testSaleAmount = 179.99;
		
		p.recordSale(testSaleAmount);
		
		if (Math.abs(p.getYtdSales() - (0+testSaleAmount)) > .001)
			System.out.println("Sales error");

		System.out.println(p.toString());
		
	}
	
}