package Homework1.Lab5;

// Represents one monster attack
// Methods in MonsterAttack will be instance, not static, methods.

public class MonsterAttack {
	
	// private variables
	private int attackId;
	private int month;
	private int day;
	private int year;
	private String monsterName;
	private String attackLocation;
	private int victimCount;
	
	// public methods
	// Constructor
	public MonsterAttack(int attackIdIn, String date, String monsterNameIn, String attackLocationIn, int victimCountIn){
		attackId = attackIdIn;
		
		// Parsing the date
		String[] tokens = date.split("/", 0);
		month = Integer.parseInt(tokens[0]);
		day = Integer.parseInt(tokens[1]);
		year = Integer.parseInt(tokens[2]);
		
		monsterName = monsterNameIn;
		attackLocation = attackLocationIn;
		victimCount = victimCountIn;
	}

	public int getAttackId() {
		return attackId;
	}

	public void setAttackId(int attackId) {
		this.attackId = attackId;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getMonsterName() {
		return monsterName;
	}

	public void setMonsterName(String monsterName) {
		this.monsterName = monsterName;
	}

	public String getAttackLocation() {
		return attackLocation;
	}

	public void setAttackLocation(String attackLocation) {
		this.attackLocation = attackLocation;
	}

	public int getVictimCount() {
		return victimCount;
	}

	public void setVictimCount(int victimCount) {
		this.victimCount = victimCount;
	}
	
	public String toString(){
		// Attack # 125 occurred on 6/25/2009. Mothra attacked Tokyo, resulting in 301 tragic fatalities.
		return "Attack # " + attackId + " occurred on  " + month + "/" + day + "/" + year + ". " + monsterName + " attacked " + attackLocation + ", resulting in " + victimCount + " tragic fatalities.";
	}

}