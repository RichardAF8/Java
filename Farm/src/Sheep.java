
public class Sheep extends Animal {

	public Sheep(String name) {
		super(name);
		setType("Sheep");
	}

	public String speak() {
		String speech = "";
		for (int x = 0; x < (getHungerLevel() + 2); x++) {
			if (getSleep() == false) {
				speech += "bah ";
			} else {
				speech += "Snore ";
			}
		}
		return speech;
	}
}
