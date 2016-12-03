package Homework1.Lab8;

import static org.junit.Assert.*;

import org.junit.Test;

public class MySetTest {

	@Test
	public void testMySet() {
		int[] inArray = {10, 11, 2, 3, 4, 45, 78};
		MySet set1 = new MySet(inArray);
		assertNotNull(set1);
	}
	
	@Test
	public void testForAdd() {
		int[] intArr1 = {10, 11, 12, 13, 14};
		int[] intArr2 = {13, 14, 15, 16, 17};
		int[] intArr3 = {10, 11, 12, 13, 14, 15, 16, 17};
		
		MySet set1 = new MySet(intArr1);
		MySet set2 = new MySet(intArr2);
		MySet set3 = new MySet(intArr3);
		
		MySet out = set1.add(set2);
		
		assertEquals(set3.toString(),out.toString());
	}
	
	@Test
	public void testForSubtract() {
		int[] intArr1 = {1, 2, 3};
		int[] intArr2 = {2, 3, 4};
		int[] intArr3 = {1};
		
		MySet set1 = new MySet(intArr1);
		MySet set2 = new MySet(intArr2);
		MySet set3 = new MySet(intArr3);
		
		MySet out = set1.subtract(set2);
		
		assertEquals(set3.toString(),out.toString());
	}
	
	@Test
	public void testForDivide() {
		int[] intArr1 = {1, 2, 3};
		int[] intArr2 = {2, 3, 4};
		int[] intArr3 = {2, 3};
		
		MySet set1 = new MySet(intArr1);
		MySet set2 = new MySet(intArr2);
		MySet set3 = new MySet(intArr3);
		
		MySet out = set1.divide(set2);
		
		assertEquals(set3.toString(),out.toString());
	}
	
	@Test
	public void testForMultiply() {
		int[] intArr1 = {1, 2, 3};
		int[] intArr2 = {3, 4};
		int[] intArr3 = {1, 2, 4};
		
		MySet set1 = new MySet(intArr1);
		MySet set2 = new MySet(intArr2);
		MySet set3 = new MySet(intArr3);
		
		MySet out = set1.multiply(set2);
		
		assertEquals(set3.toString(),out.toString());
	}

}