
public class Horse extends Animal {

	public Horse(String name) {
		super(name);
		setType("Horse");
	}

	public String speak() {
		String speech = "";
		for (int x = 0; x < (getHungerLevel() * 3); x++) {
			if (getSleep() == false) {
				speech += "nay ";
			} else {
				speech += "Snore ";
			}
		}
		return speech;
	}

}
