package Homework1.Lab6;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

// Aggregates data about attacks
// Methods in AttackMonitor will be instance, not static, methods.

public class AttackMonitor {
	
	private ArrayList<MonsterAttack> mAttack = new ArrayList<MonsterAttack>();
	private static final String COMMA_DELIMITER = ",";
	private static final String NEW_LINE_SEPARATOR = "\n";
	private static final String DATE_SLASH = "/";
	
	public void monitor() {
		String[] choices = { "Quit", "List attacks", "Add attack", "Delete attack", "Save to CSV File", "Reload data from CSV" };
		int choice;
		do {
			// choice = JOptionPane.showOptionDialog(null, "Main Menu", "Main Menu", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, choices, "None of your business");  
			choice = JOptionPane.showOptionDialog(null, "Monster Attacks", "Main Menu", 0, JOptionPane.QUESTION_MESSAGE, null, choices, "null");
			switch (choice) {
			case 0:
				break;
			case 1:
				if (!(mAttack.isEmpty()))
					listAttacks();
				break;
			case 2:
				addAttack();
				break;
			case 3:
				deleteAttack();
				break;
			case 4:
				saveToCSV();
				break;
			case 5:
				reloadCSV();
				break;
			} // end switch

		} while (choice != 0); // end do
	}// end main
	
	private void addAttack() {
		int attackId = Integer.parseInt(JOptionPane.showInputDialog("Please enter the attack id."));
		String date = JOptionPane.showInputDialog("Please enter the date in the format MM/DD/YYYY (eg, 01/31/2010)");
		String monsterName = JOptionPane.showInputDialog("Please enter the monster's name");
		String attackLocation = JOptionPane.showInputDialog("Please enter the location of the attack");
		int victimCount = Integer.parseInt(JOptionPane.showInputDialog("Please enter the number of victims who were attacked"));
		mAttack.add(new MonsterAttack(attackId, date, monsterName, attackLocation, victimCount));
	}
	
	private void listAttacks() {
		StringBuilder sb = new StringBuilder();
		if ( !(mAttack.isEmpty()) ) {
			for(MonsterAttack m : mAttack)
				sb.append(m + "\n");
				JOptionPane.showMessageDialog(null, sb);
			}
		else {
			JOptionPane.showMessageDialog(null, "There are no such attacks reported.");
		}	
	}
	
	public void deleteAttack() {
		listAttacks();
		int attackToDelete = Integer.parseInt(JOptionPane.showInputDialog("Please enter the attack id which has to be deleted"));
		for (int i = 0; i <= mAttack.size() - 1; i++)
			if (attackToDelete == mAttack.get(i).getAttackId()) {
				mAttack.remove(i);
			}
			else{
				JOptionPane.showMessageDialog(null, "Invalid id entered. There is no such attack with this id.");
			}
	}
	
	public void saveToCSV() {
		// Take the file form the user
		String filepath = JOptionPane.showInputDialog("Enter the path of the csv file to which the entries have to be saved :- ");
		
		// FileWriter is used to write data to a file
		FileWriter fileWriter = null;
		
		try {
			fileWriter = new FileWriter(filepath);
			
			for (int i = 0; i < mAttack.size(); i++) {
				fileWriter.write(String.valueOf(mAttack.get(i).getAttackId()));
				fileWriter.write(COMMA_DELIMITER);

				fileWriter.write(String.valueOf(mAttack.get(i).getMonth()));
				fileWriter.write(DATE_SLASH);

				fileWriter.write(String.valueOf(mAttack.get(i).getDay()));
				fileWriter.write(DATE_SLASH);

				fileWriter.write(String.valueOf(mAttack.get(i).getYear()));
				fileWriter.write(COMMA_DELIMITER);

				fileWriter.write(String.valueOf(mAttack.get(i).getMonsterName()));
				fileWriter.write(COMMA_DELIMITER);

				fileWriter.write(String.valueOf(mAttack.get(i).getAttackLocation()));
				fileWriter.write(COMMA_DELIMITER);

				fileWriter.write(String.valueOf(mAttack.get(i).getVictimCount()));
				fileWriter.write(COMMA_DELIMITER);
				
				fileWriter.write(NEW_LINE_SEPARATOR);
			}
			fileWriter.flush();
			fileWriter.close();
			JOptionPane.showMessageDialog(null, "CSV file successfully created!");
		}
		catch (Exception e) {
			JOptionPane.showMessageDialog(null, "File creation failed!");
		}		
	}
	
	public void reloadCSV() {
		mAttack.removeAll(mAttack);
		listAttacks();
		JOptionPane.showMessageDialog(null, "The arraylist is emptied");
		try {
			String filepath = JOptionPane.showInputDialog("Enter the path and the file name from which the data is to be loaded :- ");
			File inFile = new File(filepath);
			Scanner freader = new Scanner(inFile);
			
			String line;
			String[] fields;
			int attackIdIn; 
			String date; 
			String monsterNameIn; 
			String attackLocationIn; 
			int victimCountIn;
			
			while (freader.hasNextLine()) {
				line = freader.nextLine();
				fields = line.split(",");
				attackIdIn = Integer.parseInt(fields[0]);
				date = fields[1];
				monsterNameIn = fields[2];
				attackLocationIn = fields[3];
				victimCountIn = Integer.parseInt(fields[4]);
				mAttack.add(new MonsterAttack(attackIdIn, date, monsterNameIn, attackLocationIn, victimCountIn));
			}
			freader.close(); // Close to unlock.
			listAttacks();
		} 
		catch (IOException e) {
			System.err.println(e);
			System.exit(1);
		}
	}	
}