import java.util.Random;

public abstract class Animal {
	private int hungerUnits;
	private String name;
	private Random rand = new Random();
	private int hungerLevel;
	private String hungerLevelName;
	private String type;
	private Boolean sleep = false;
	private Boolean sick = false;

	public Animal(String name) {
		this.name = name;
		this.hungerUnits = rand.nextInt(25);
		this.hungerUnits = this.hungerUnits - (this.hungerUnits % 5);
		setHungerLevelName();

	}

	@Override
	public String toString() {
		if (sick != true) {
			return name + " the " + type + " is " + hungerLevelName + " and Healthy!";
		} else {
			return name + " the " + type + " is " + hungerLevelName + " and Sick!";
		}
	}

	public Boolean getSick() {
		return sick;
	}

	public void setSick(Boolean sick) {
		this.sick = sick;
	}

	public void feed() {
		if (sleep == false) {
			hungerUnits -= 5;
			if (hungerUnits < 0) {
				this.hungerUnits = 0;
			}
			setHungerLevelName();
			sleep();
			if (sick == true) {
				if (rand.nextInt(3) == 1) {
					sick = false;
				}
			}

		}
	}

	public void sleep() {
		int chance = rand.nextInt(10);
		if (chance == 5) {
			sleep = true;
		}
	}

	public void tick() {
		hungerUnits += 1;
		if (hungerUnits > 24) {
			this.hungerUnits = 24;
		}
		sick();
		setHungerLevelName();
	}

	public abstract String speak();

	public int getHungerUnits() {
		return hungerUnits;
	}

	public void setHungerUnits(int hungerUnits) {
		if (hungerUnits > 24) {
			this.hungerUnits = 24;
		} else if (hungerUnits < 0) {
			this.hungerUnits = 0;
		} else {
			this.hungerUnits = hungerUnits;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHungerLevel() {
		return hungerLevel;
	}

	public void setHungerLevel(int hungerLevel) {
		if (hungerLevel > 4) {
			this.hungerLevel = 4;
		} else if (hungerLevel < 0) {
			this.hungerLevel = 0;
		} else {
			this.hungerLevel = hungerLevel;
		}
	}

	public String getHungerLevelName() {
		return hungerLevelName;
	}

	public void setHungerLevelName() {
		int hungerLevelBefore = this.getHungerLevel();

		if (hungerUnits <= 4) {
			hungerLevel = 0;
			hungerLevelName = "Full";
		} else if (hungerUnits >= 5 && hungerUnits <= 9) {
			hungerLevel = 1;
			hungerLevelName = "Peckish";
		} else if (hungerUnits >= 10 && hungerUnits <= 14) {
			hungerLevel = 2;
			hungerLevelName = "Hungry";
		} else if (hungerUnits >= 15 && hungerUnits <= 19) {
			hungerLevel = 3;
			hungerLevelName = "Very Hungry";
		} else if (hungerUnits >= 20 && hungerUnits <= 24) {
			hungerLevel = 4;
			hungerLevelName = "Starving";
		}
		if (hungerLevelBefore != this.getHungerLevel()) {
			sleep = false;
		}
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Boolean getSleep() {
		return sleep;
	}

	public void setSleep(Boolean sleep) {
		this.sleep = sleep;
	}

	public void sick() {
		if (sick != true) {
			if (rand.nextInt(20) == 0) {
				sick = true;
			}
		} else {
			this.hungerUnits += 2;
		}

	}
}
