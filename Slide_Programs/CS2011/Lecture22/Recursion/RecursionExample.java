package CS2011.Lecture22.Recursion;

import java.util.ArrayList;
import java.util.List;

public class RecursionExample {

	public static void main(String[] args) {
		
		String[] sleeplessArray = { "ant", "frog", "goose", "weasel", "child" };
		List<String> sleeplessList = new ArrayList<String>();
		
		for (String s : sleeplessArray)
			sleeplessList.add(s);
		
		RecursionExample r = new RecursionExample(sleeplessList);
		
	}

	public RecursionExample(List<String> animals) {
		
		System.out.print("There was a ");
		tellStory(animals);
		
	}
	
	private void tellStory(List<String> sleeplessList) {
		
		int last = sleeplessList.size() - 1;
		String animal = sleeplessList.get(last);
		
		if(sleeplessList.size() == 1) 
			System.out.println("little " + animal + " who went to sleep");
		else {
			System.out.println("little " + animal + " who couldn't go to sleep, so his mother read him a story about a ");
			sleeplessList.remove(last);
			tellStory(sleeplessList);
		}
		
		System.out.println("so the little " + animal + " went to sleep" );
		
	}

}