package Homework1.Lab5;

import java.util.ArrayList;

import javax.swing.JOptionPane;

// Aggregates data about attacks
// Methods in AttackMonitor will be instance, not static, methods.

public class AttackMonitor {
	
	private ArrayList<MonsterAttack> mAttack = new ArrayList<MonsterAttack>();
	
	public void monitor() {
		String[] choices = { "Quit", "List attacks", "Add attack", "Delete attack" };
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
		//for(MonsterAttack m : mAttack)
			if (attackToDelete == mAttack.get(i).getAttackId()) {
				mAttack.remove(i);
			}
			else{
				JOptionPane.showMessageDialog(null, "Invalid id entered. There is no such attack with this id.");
			}
	}
	
}