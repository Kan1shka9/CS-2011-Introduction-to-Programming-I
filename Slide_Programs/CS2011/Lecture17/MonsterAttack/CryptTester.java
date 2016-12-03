package CS2011.Lecture17.MonsterAttack;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class CryptTester {

	@Test
	public void testCryptCreated() {
		String location = "Transylvania";
		Crypt c = new Crypt(location);
		assertNotNull(c);
	}
	
	@Test
	public void testToString() {
		String location = "Transylvania";
		Crypt c = new Crypt(location);
		assertNotNull(c.toString());
	}
	
	@Test
	public void testSetCryptLocation(){
		String firstLocation = "Transylvania";
		Crypt c = new Crypt(firstLocation);
		
		String secondLocation = "Wisborg";
		c.setLocation(secondLocation);
		
		assertEquals(c.getLocation(), secondLocation);		
	}

	@Test
	public void testCryptLocation(){
		String location = "Transylvania";
		Crypt c = new Crypt(location);
		assertEquals(c.getLocation(), location);		
	}
	
	
	@Test
	public void testLocation() {
		String name = "Orlok";
		String location = "Transylvania";
		Vampire v = new Vampire(name, location);
		assertEquals(v.getLocation(), location);		
	}

}