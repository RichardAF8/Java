
public class Chicken extends Animal {

	public Chicken(String name) {
		super(name);
		setType("Chicken");
	}

	public String speak() {
		String speech = "";
		for (int x = 0; x < (getHungerLevel() + 1); x++) {
			if (getSleep() == false) {
				speech += "cluck ";
			} else {
				speech += "Snore ";
			}
		}
		return speech;
	}

}
