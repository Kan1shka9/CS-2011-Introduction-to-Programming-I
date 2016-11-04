package CS2011.Lecture17.TopDown;

public class StoreDriver {
	
	public static void main(String[] args) {
		
		Store store = new Store();
		store.setName("Viking Furniture");
		store.hireStaffPerson();
		System.out.println(store.toString());
		System.out.println(store.listStaff());
		
	}
	
}