package Practice;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCases {

	@Test
	public void CheckForNotNull() {
		Person p1 = new Person("man", 12);
		assertNotNull(p1);
	}
	
	@Test
	public void CheckNull() {
		Person p1 = null;
		assertNull(p1);
	}
	
	@Test
	public void CheckForEquals() {
		Person p1 = new Person("man1", 12);
		Person p2 = new Person("man1", 12);
		assertEquals(p1.getName(), p2.getName()); // use getters
	}
	
	@Test
	public void CheckNotSame() throws CloneNotSupportedException {
		Person p1 = new Person("man1", 20);
		Person p2 = (Person) p1.clone(); // cloning
		assertNotSame(p1, p2);
	}
	
	@Test
	public void Checktrue() throws CloneNotSupportedException {
		Person p1 = new Person("Name", 15);
		Person p2 = (Person) p1.clone();
		assertTrue(p1.getName().equals(p2.getName()));
	}
	
	@Test
	public void CheckFalse() {
		Person p1 = new Person("Name", 15);
		Person p2 = new Person("Name22", 18);
		assertFalse(p1.getName().equals(p2.getName()));
	}
		
}