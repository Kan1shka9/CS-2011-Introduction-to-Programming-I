package CS2011.Lecture22.Recursion;

import java.util.ArrayList;
import java.util.List;

public class ListEx {
	
	public static void main(String[] args) {
		
		List<Integer> origList = new ArrayList<Integer>();
		
		for (int counter = 1; counter <= 10; counter++) 
			origList.add(counter);	
		
		System.out.println("Old List");
		for(Integer i: origList) 
			System.out.print(i + " ");
		
		ListEx r = new ListEx();
		
		List<Integer> newList = r.squareList(origList, null);
		
		System.out.println("\nNew List");
		for(Integer i: newList) 
			System.out.print(i + " ");
		
	}
	
	private List<Integer> squareList(List<Integer> oldList, List<Integer> newList) {
		
		int lastIndex = oldList.size() - 1;
		int base = oldList.get(lastIndex);
		
		oldList.remove(lastIndex);
		
		if(oldList.size() == 0) {
			newList = new ArrayList<Integer>();
		}
		else {
			newList = squareList(oldList, newList);
		}
		
		newList.add(base * base);
		return newList;
		
	}

}